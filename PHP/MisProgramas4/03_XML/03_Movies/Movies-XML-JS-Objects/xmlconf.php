<?php

    require "pelicula.php";

    if (isset($_POST['idPelicula']))
    {
        $idPelicula     = $_POST['idPelicula'];
        $datosPeliculas = simplexml_load_file("peliculas.xml");
        $peliculas      = $datosPeliculas->xpath("//pelicula");

        for ($i = 0; $i < count($peliculas); $i++) 
        {
            if ($peliculas[$i]->id == $idPelicula) 
            {
                // Creamos el objeto Pelicula.
                $pelicula = new Pelicula($peliculas[$i]);

                // Hacemos cosas con el Objeto...

                // Y luego lo transformamos en formato JSON.
                echo json_encode($pelicula);
            }
        }

        return null;
    }

?>