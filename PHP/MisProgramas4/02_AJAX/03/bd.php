<?php

    function leer_config($nombre, $esquema) 
    {
        $config = new DOMDocument();

        $config->load($nombre);

        // Se valida el esquema del archivo XML.
        $res = $config->schemaValidate($esquema);

        if ($res === FALSE) 
        {
            throw new Exception("Error: Revise fichero de configuración");
        }

        // Se cargan los datos del fichero XML.
        $datos   = simplexml_load_file($nombre);
        $usu     = $datos->xpath("//usuario");
        $clave   = $datos->xpath("//clave");
        $resul   = [];
        $resul[] = $usu[0];
        $resul[] = $clave[0];

        return $resul;
    }

    function comprobar_usuario($nombre, $clave) 
    {
        $res = leer_config(dirname(__FILE__) . "/configuracion.xml", dirname(__FILE__) . "/configuracion.xsd");

        return $nombre == $res[0] && $clave == $res[1];
    }

?>