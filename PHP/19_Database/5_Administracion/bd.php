<?php

    function leerXmlConfiguracion($nombre, $esquema) 
    {
        $config = new DOMDocument();

        $config->load($nombre);

        $res = $config->schemaValidate($esquema);

        if ($res === FALSE) 
        {
            throw new InvalidArgumentException("Revise fichero de configuración");
        }

        $datos  = simplexml_load_file($nombre);
        $ip     = $datos->xpath("//ip");
        $puerto = $datos->xpath("//puerto");
        $nombre = $datos->xpath("//nombre");
        $usu    = $datos->xpath("//usuario");
        $clave  = $datos->xpath("//clave");

        // $cadenaConexion = "mysql:dbname=" . $nombre[0] . ";host=" . $ip[0] . ";port=" . $puerto[0]; 
        $cadenaConexion = sprintf("mysql:dbname=%s;host=%s;port=%s", $nombre[0], $ip[0], $puerto[0]);

        $resul   = [];
        $resul[] = $cadenaConexion;
        $resul[] = $usu[0];
        $resul[] = $clave[0];

        return $resul;
    }

    function conectarBD() 
    {
        $res = leerXmlConfiguracion(dirname(__FILE__) . "/configuracion.xml", dirname(__FILE__) . "/configuracion.xsd");
        $bd  = new PDO($res[0], $res[1], $res[2]);

        return $bd;
    }

    function comprobar_usuario($nombre, $clave) 
    {
        $bd    = conectarBD();
        $sql   = "select * from usuarios where usuario = '$nombre' and clave = '$clave'";
        $resul = $bd->query($sql);

        if ($resul->rowCount() === 1) 
        {
            return $resul->fetch();
        } 
        
        else 
        {
            return FALSE;
        }
    }

    function cargar_usuarios() 
    {
        $bd    = conectarBD();
        $sql   = "select * from usuarios";
        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return FALSE;
        }

        if ($resul->rowCount() === 0) 
        {
            return FALSE;
        }

        return $resul;
    }

    function insertar_usuario($nombre, $apellidos, $usuario, $clave) 
    {
        $bd = conectarBD();

        // Insertar el usuario.
        $sql   = "insert into usuarios(nombre, apellidos, usuario, clave) values('$nombre','$apellidos', '$usuario', '$clave')";
        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return "FALSE";
        }

        return "TRUE";
    }

    function eliminar_usuario($id) 
    {
        $bd = conectarBD();

        // Borrar.
        $query = "delete from usuarios where id = '$id'";
        $resul = $bd->query($query);

        // Comprobar errores.
        if (!$resul) 
        {
            return "FALSE";
        }
        
        return "TRUE";
    }

?>