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
        $bd  = conectarBD();
        $sql = "select codRes, correo from usuarios where correo = '$nombre' and clave = '$clave'";

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

    function cargar_categorias() 
    {
        $bd    = conectarBD();
        $sql   = "select codCat, nombre from categoria";
        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return FALSE;
        }

        if ($resul->rowCount() === 0) 
        {
            return FALSE;
        }

        // Si hay 1 o más.
        return $resul;
    }

    function cargar_categoria($codCat) 
    {
        $bd    = conectarBD();
        $sql   = "select * from categoria where codcat = $codCat";
        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return FALSE;
        }

        if ($resul->rowCount() === 0) 
        {
            return FALSE;
        }

        // Si hay 1 o más.
        return $resul->fetch();
    }

    function cargar_productos_categoria($codCat) 
    {
        $bd    = conectarBD();
        $sql   = "select * from productos where codCat  = $codCat";
        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return FALSE;
        }

        if ($resul->rowCount() === 0) 
        {
            return FALSE;
        }

        // Si hay 1 o más.
        return $resul;
    }

    /**
     *  - Recibe un array de códigos de productos.
     *  - Devuelve un cursor con los datos de esos productos. 
     */
    function cargar_productos($codigosProductos) 
    {
        $resul = FALSE;
        $bd    = conectarBD();

        // Función que nos permite realizar una string separada por algún elemento, en este ejemplo los elementos del array se separan por ",".
        if (count($codigosProductos) != 0)
        {
            $texto_in = implode(",", $codigosProductos);
            $sql      = "select * from productos where codProd in($texto_in)";
            $resul    = $bd->query($sql);
        }

        if (!$resul) 
        {
            return FALSE;
        }

        return $resul;
    }

    function insertar_pedido($carrito, $codRes) 
    {
        $bd = conectarBD();

        $bd->beginTransaction();

        $hora = date("Y-m-d H:i:s", time());

        // Insertar el pedido.
        $sql = "insert into pedidos(Fecha, Enviado, usuarios) values('$hora',0, $codRes)";

        $resul = $bd->query($sql);

        if (!$resul) 
        {
            return FALSE;
        }

        // Coger el id del nuevo pedido para las filas detalle.
        $pedido = $bd->lastInsertId();

        // Insertar las filas en pedido productos.
        foreach ($carrito as $codProd => $unidades) 
        {
            $sql   = "insert into pedidosproductos(CodPed, CodProd, Unidades) values( $pedido, $codProd, $unidades)";
            $resul = $bd->query($sql);

            if (!$resul) 
            {
                $bd->rollback();

                return FALSE;
            }
        }

        $bd->commit();
        
        return $pedido;
    }

?>