<?php

    function leer_config($nombre, $esquema) 
    {
        $config = new DOMDocument();

        $config->load($nombre);

        // Se valida el esquema del fichero XML.
        $respuesta = $config->schemaValidate($esquema);

        if ($respuesta === FALSE) 
        {
            throw new Exception("Error: Revise fichero de configuración");
        }

        // Se cargan los datos del fichero XML.
        $datos = simplexml_load_file($nombre);
        $usu   = $datos->xpath("//usuario");
        $clave = $datos->xpath("//clave");
        
        // Guardamos el resultado del usuario y la clave.
        $resultados = [];
        $resultados["usuario"] = $usu[0];
        $resultados["clave"] = $clave[0];

        return $resultados;
    }

    function comprobar_usuario($nombre, $clave) 
    {
        $respuesta = leer_config(dirname(__FILE__)  . 
        "/configuracion.xml", dirname(__FILE__)     . 
        "/configuracion.xsd");
        
        return ($nombre == $respuesta["usuario"] && $clave == $respuesta["clave"]);
    }

    function cargar_categorias() 
    {
        $cat1 = array("cod" => 1, "nombre" => "Comida", "descripcion" => "Descripción categoría: Comida");
        $cat2 = array("cod" => 2, "nombre" => "Bebida", "descripcion" => "Descripción categoría: Bebida");
        
        $arrayCategorias = array($cat1, $cat2);
        
        return $arrayCategorias;
    }

    function cargar_categoria($codCat) 
    {
        $categorias = cargar_categorias();

        foreach ($categorias as $indice => $valor) 
        {
            if ($valor["cod"] == $codCat) 
            {
                return $valor;
            }
        }

        return null;
    }

    function cargar_todos_productos() 
    {
        $producto1 = array("CodProd" => 1, "Nombre" => 'Harina', "Descripcion" => '8 paquetes de 1kg de harina cada uno', "Peso" => 8, "Stock" => 100, "CodCat" => 1);
        $producto2 = array("CodProd" => 2, "Nombre" => 'Azúcar', "Descripcion" => '20 paquetes de 1kg cada uno', "Peso" => 20, "Stock" => 3, "CodCat" => 1);
        $producto3 = array("CodProd" => 3, "Nombre" => 'Agua 1.5', "Descripcion" => '20 botellas de 1.5 litros cada una', "Peso" => 31, "Stock" => 50, "CodCat" => 2);
        $producto4 = array("CodProd" => 4, "Nombre" => 'Cerveza Alhambra tercio', "Descripcion" => '24 botellas de 33cl', "Peso" => 10, "Stock" => 0, "CodCat" => 3);

        return array($producto1, $producto2, $producto3, $producto4);
    }

    function cargar_productos_categoria($codCat) 
    {
        $productos = cargar_todos_productos();

        $productosCategoria = [];

        foreach ($productos as $indice => $valor) 
        {
            if ($valor["CodCat"] == $codCat) 
            {
                $productosCategoria[] = $valor;
            }
        }

        return $productosCategoria;
    }

    /**
     *  - Recibe un array de códigos de productos.
     *  - Devuelve un cursor con los datos de esos productos.
     */
    function cargar_productos($codigosProductos) 
    {

        $productos = cargar_todos_productos();

        $productosSeleccionados = [];

        foreach ($productos as $indice => $producto) 
        {
            foreach ($codigosProductos as $idProducto) 
            {
                if ($producto["CodProd"] == $idProducto) 
                {
                    $productosSeleccionados[] = $producto;
                }
            }
        }

        return $productosSeleccionados;
    }

?>