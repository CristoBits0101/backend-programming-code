<?php

/* comprueba que el usuario haya abierto sesión o redirige */
require_once 'sesiones.php';
require_once 'bd.php';
comprobar_sesion();

$codigosLibros = array_keys($_SESSION['carrito']);
$libros = cargar_libros_carrito($codigosLibros);

// añadir las unidades de los libros

foreach ($libros as $indice => $libro) {
    foreach ($codigosLibros as $codigoLibro) {
        if ($libro["isbn"] == $codigoLibro){
            $libros[$indice]["unidades"] = $_SESSION['carrito'][$codigoLibro];
        }
    }
}

$libros_json = json_encode($libros, true);
echo $libros_json;
