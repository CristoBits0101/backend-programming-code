<?php

    function comprobar_sesion() 
    {
        // Se activa la variable de session.
        session_start();

        // Se comprueba si la clave usuario no está declara y no es diferente de null.
        if (!isset($_SESSION['usuario'])) 
        {
            // Le invitamos a iniciar sesión para poder usar el carrito.
            header("Location: login.php?redirigido=true");
        }
    }

?>