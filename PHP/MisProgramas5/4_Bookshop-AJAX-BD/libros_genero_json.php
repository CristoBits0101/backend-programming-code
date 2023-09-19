<?php
require_once 'bd.php';

$libros = cargar_libros_genero($_GET['genero']);
$libros_json = json_encode(iterator_to_array($libros), true);
echo $libros_json;