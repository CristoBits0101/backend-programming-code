<?php

    require_once("db.php");

    if (isset($_POST['idPelicula'])) 
    {
        $idPelicula = $_POST['idPelicula'];
        
        echo json_encode(cargarPelicula($idPelicula));
    }

?>