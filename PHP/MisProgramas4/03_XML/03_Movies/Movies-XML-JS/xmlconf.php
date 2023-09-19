<?php

    if (isset($_POST['idPelicula'])) 
    {
        $idPelicula     = $_POST['idPelicula'];
        $datosPeliculas = simplexml_load_file("peliculas.xml");
        $peliculas      = $datosPeliculas->xpath("//pelicula");

        for ($i = 0; $i < count($peliculas); $i++) 
        {
            if ($peliculas[$i]->id == $idPelicula) 
            {
                echo json_encode($peliculas[$i]);
            }
        }
        
        return null;
    }

?>