<?php

require_once 'bd.php';

$generos = cargar_generos();

$generos_json = json_encode(iterator_to_array($generos), true);
echo $generos_json;
?>