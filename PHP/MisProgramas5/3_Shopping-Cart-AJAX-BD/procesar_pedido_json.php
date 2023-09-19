<?php

require_once 'bd.php';

/* comprueba que el usuario haya abierto sesión o devuelve */
require 'sesiones_json.php';

if (!comprobar_sesion())
    return;

$resul = insertar_pedido($_SESSION['carrito'], $_SESSION['usuario']['codRes']);
if ($resul === FALSE) {
    echo "FALSE";
} else {
    //vaciar carrito	
    $_SESSION['carrito'] = [];
    echo "TRUE";
}
?>
	