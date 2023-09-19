<?php

    // Comprueba que el usuario haya abierto sesión o redirige.
    require_once 'sesiones.php';

    comprobar_sesion();
    
    if (!isset($_POST['cod']))
    {
        echo "<p>Código no proporcinado</p>";

        exit;
    }

    $cod = $_POST['cod'];

    $unidades = (int) $_POST['unidades'];

    // Si existe el código sumamos las unidades.
    if (isset($_SESSION['carrito'][$cod])) 
    {
        $_SESSION['carrito'][$cod] += $unidades;
    }

    else 
    {
        $_SESSION['carrito'][$cod] = $unidades;
    }

    header("Location: carrito.php");

?>