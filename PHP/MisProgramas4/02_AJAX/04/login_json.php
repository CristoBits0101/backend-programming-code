<?php

    require_once 'bd.php';

    /**
     *  - Formulario de login habitual.
     *  - Si va bien abre sesión, guarda el nombre de usuario y redirige a principal.php.
     *  - Si va mal, mensaje de error.
     */
    if ($_SERVER["REQUEST_METHOD"] == "POST") 
    {
        $usu = comprobar_usuario($_POST['usuario'], $_POST['clave']);

        if ($usu === FALSE) 
        {
            echo "FALSE";
        } 
        
        else 
        {
            session_start(); 

            $_SESSION['usuario'] = $usu;
            $_SESSION['carrito'] = [];

            echo "TRUE";
        }
    }

?>