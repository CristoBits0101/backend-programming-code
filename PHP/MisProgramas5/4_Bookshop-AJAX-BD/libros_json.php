<?php

require_once 'bd.php';

$libros = cargar_libros();

$libros_json = json_encode(iterator_to_array($libros), true);
echo $libros_json;
