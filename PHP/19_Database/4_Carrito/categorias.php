<?php

    // Comprueba que el usuario haya abierto sesión o redirige.
    require 'sesiones.php';
    require_once 'bd.php';

    comprobar_sesion();

?>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">	

    <title>Lista de categorías</title>

</head>

    <body>

        <?php require 'cabecera.php'; ?>

        <h1>Lista de categorías</h1>

        <!--lista de vínculos con la forma productos.php?categoria=1-->
        <?php
            $categorias = cargar_categorias();

            if ($categorias === false) 
            {
                echo "<p class='error'>Error al conectar con la base datos</p>";
            } 
            
            else 
            {
                // Abrir la lista.
                echo "<ul>"; 

                foreach ($categorias as $cat) 
                {
                    // $cat['nombre] $cat['codCat']

                    $url = "productos.php?categoria=" . $cat['codCat'];

                    echo "<li><a href='$url'>" . $cat['nombre'] . "</a></li>";
                }

                echo "</ul>";
            }
        ?>

    </body>

</html>