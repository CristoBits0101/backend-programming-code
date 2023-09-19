<?php

    //  Comprueba que el usuario haya abierto sesión o redirige.
    require_once 'sesiones.php';

    comprobar_sesion();

    if (!isset($_POST['cod'])) 
    {
        echo "<p>Código no proporcinado</p>";

        exit;
    }

    $cod = $_POST['cod'];

    $unidades = $_POST['unidades'];

    // Si existe el código restamos las unidades, con mínimo de 0.
    if (isset($_SESSION['carrito'][$cod])) 
    {
        $_SESSION['carrito'][$cod] -= $unidades;

        if ($_SESSION['carrito'][$cod] <= 0) 
        {
            unset($_SESSION['carrito'][$cod]);
        }
    }

    header("Location: carrito.php");

?>