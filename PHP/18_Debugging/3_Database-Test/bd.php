<?php

    function leer_config($nombre, $esquema) 
    {
        $config = new DOMDocument();
        $config->load($nombre);

        // Se valida el esquema del fichero XML.
        $res = $config->schemaValidate($esquema);

        if ($res === FALSE) 
        {
            throw new InvalidArgumentException("Revise fichero de configuración");
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

    function cargar_categorias() 
    {
        // Datos de las categorías, en el futuro se cargarán desde la BD.
        $cat1 = array("cod" => 1, "nombre" => "Alimentación", "descripcion" => "Descripción categoría Alimentación");
        $cat2 = array("cod" => 2, "nombre" => "Bebidas", "descripcion" => "Descripción categoría Bebidas");
        $cat3 = array("cod" => 3, "nombre" => "Congelados", "descripcion" => "Descripción categoría Congelados");
        $cat4 = array("cod" => 4, "nombre" => "Frescos", "descripcion" => "Descripción categoría Frescos");
        $cat5 = array("cod" => 5, "nombre" => "Mascotas", "descripcion" => "Descripción categoría Mascotas");

        $arrayCategorias = array($cat1, $cat2, $cat3, $cat4, $cat5);
        
        return $arrayCategorias;
    }

?>