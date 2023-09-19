<?php

    session_start();

    if (!isset($_SESSION['cliente'])) 
    {
        if (isset($_POST['dni'])) 
        {
            $_SESSION['dni'] = $_POST['dni'];
        }

        if (isset($_POST['nombre'])) 
        {
            $_SESSION['nombre'] = $_POST['nombre'];
        }

        if (isset($_POST['apellido'])) 
        {
            $_SESSION['apellido'] = $_POST['apellido'];
        }

        if (isset($_POST['saldo'])) 
        {
            $_SESSION['saldo'] = $_POST['saldo'];
        }

        echo "Cliente registrado en la sesión: ";

        print_r($_SESSION);

        echo "<br>";
        echo "<a href='index.php'><button>Volver</button></a>";
    }

?>