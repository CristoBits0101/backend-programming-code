<?php

/* comprueba que el usuario haya abierto sesión */
require_once 'sesiones.php';

comprobar_sesion();

$isbn = $_POST['isbn'];
$unidades = $_POST['unidades'];
/* si existe el código restamos las unidades, con mínimo de 0 */
if (isset($_SESSION['carrito'][$isbn])) {
    $_SESSION['carrito'][$isbn] -= $unidades;
    if ($_SESSION['carrito'][$isbn] <= 0) {
        unset($_SESSION['carrito'][$isbn]);
    }
}
?>

