<?php

require_once 'bd.php';

$productos = cargar_productos();
$productos_json = json_encode($productos);
echo $productos_json;
