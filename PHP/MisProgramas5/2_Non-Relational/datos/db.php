<?php

    require '../vendor/autoload.php';
    require "../clases/pelicula.php";

    function cargarDatosXMLDB()
    {
        $datosDB = simplexml_load_file("configuracion.xml");
        $datos   = 
        [
            'ip'      => (string)$datosDB->xpath("//ip")[0],
            'puerto'  => (string)$datosDB->xpath("//puerto")[0],
            'nombre'  => (string)$datosDB->xpath("//nombre")[0],
            'usuario' => (string)$datosDB->xpath("//usuario")[0],
            'clave'   => (string)$datosDB->xpath("//clave")[0]
        ];

        return $datos;
    }

    function conectarDBNoRelacional()
    {
        $datosDB = cargarDatosXMLDB();
        $usuario = $datosDB["usuario"];
        $clave   = $datosDB["clave"];
        $cadenaConexion = "mongodb://" . $datosDB["ip"] . ":" . $datosDB["puerto"];
        $cliente        = new MongoDB\Client($cadenaConexion);
        $nombreDB       = $datosDB['nombre'];
        $bd             = $cliente->$nombreDB;

        return $bd;
    }

    function cargarPelicula($idPelicula)
    {
        try 
        {
            $bd = conectarDBNoRelacional();

            $pelicula = $bd->peliculas->find(['id' => (int)$idPelicula]);
        
            if ($pelicula == false) 
            {
                return false;
            }
            
            return new Pelicula($pelicula);
        } 
        
        catch (Exception $e) 
        {
            echo 'Error con la base de datos: ' . $e->getMessage();
        }
    }
?>