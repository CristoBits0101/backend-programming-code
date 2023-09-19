<?php

/* comprueba que el usuario haya abierto sesión o devuelve */
require 'sesiones.php';

comprobar_sesion();

$isbn = $_POST['isbn'];
$unidades = (int) $_POST['unidades'];
/* si existe el código sumamos las unidades */
if (isset($_SESSION['carrito'][$isbn])) {
    $_SESSION['carrito'][$isbn] += $unidades;
} else {
    $_SESSION['carrito'][$isbn] = $unidades;
}
?>