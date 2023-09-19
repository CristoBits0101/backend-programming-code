<?php

function leerXmlConfiguracion($nombre, $esquema) 
{
    $config = new DOMDocument();
    $config->load($nombre);
    $res = $config->schemaValidate($esquema);
    if ($res === FALSE) {
        throw new InvalidArgumentException("Revise fichero de configuración");
    }
    $datos  = simplexml_load_file($nombre);
    $ip     = $datos->xpath("//ip");
    $puerto = $datos->xpath("//puerto");
    $nombre = $datos->xpath("//nombre");
    $usu    = $datos->xpath("//usuario");
    $clave  = $datos->xpath("//clave");

    //$cadenaConexion = "mysql:dbname=" . $nombre[0] . ";host=" . $ip[0] . ";port=" . $puerto[0]; 
    $cadenaConexion = sprintf("mysql:dbname=%s;host=%s;port=%s", $nombre[0], $ip[0], $puerto[0]);

    $resul = [];
    $resul[] = $cadenaConexion;
    $resul[] = $usu[0];
    $resul[] = $clave[0];
    return $resul;
}

function conectarBD() {
    $res = leerXmlConfiguracion(dirname(__FILE__) . "/configuracion.xml", dirname(__FILE__) . "/configuracion.xsd");
    $bd = new PDO($res[0], $res[1], $res[2]);
    return $bd;
}

function comprobar_usuario($nombre, $clave) {
    $bd = conectarBD();
    $sql = "select codRes, correo from usuarios where correo = '$nombre' 
			and clave = '$clave'";
    $resul = $bd->query($sql);
    if ($resul->rowCount() === 1) {
        return $resul->fetch();
    } else {
        return FALSE;
    }
}

function cargar_generos() {
    $bd = conectarBD();
    $sql = "select cod, nombre from generos";
    $resul = $bd->query($sql);

    if (!$resul) {
        return FALSE;
    }
    if ($resul->rowCount() === 0) {
        return FALSE;
    }
    //si hay 1 o más
    return $resul;
}

function cargar_libros_genero($generoId) {
    $bd = conectarBD();
    $sql = "select * from libros where genero=$generoId";
    $resul = $bd->query($sql);

    if (!$resul) {
        return FALSE;
    }
    if ($resul->rowCount() === 0) {
        return FALSE;
    }
    //si hay 1 o más
    return $resul;
}

function cargar_libros() {
    $bd = conectarBD();
    $sql = "select * from libros";
    $resul = $bd->query($sql);

    if (!$resul) {
        return FALSE;
    }
    if ($resul->rowCount() === 0) {
        return FALSE;
    }
    //si hay 1 o más
    return $resul;
}

// recibe un array de códigos de productos
// devuelve un cursor con los datos de esos productos
function cargar_libros_carrito($codigosLibros) {

    $libros = iterator_to_array(cargar_libros());

    $librosSeleccionados = [];
    
    foreach ($libros as $indice => $libro) {
        foreach ($codigosLibros as $idLibro) {
            if ($libro["isbn"] == $idLibro) {
                $librosSeleccionados[] = $libro;
            }
        }
    }

    return $librosSeleccionados;
}
