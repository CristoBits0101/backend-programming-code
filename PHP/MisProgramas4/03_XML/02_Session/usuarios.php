<?php

    require_once("xmlconf.php");

    session_start();

    if (isset($_SESSION['usuario'])) 
    {
        $aliasUsuarios = obtener_datos_usuarios_alias();
    } 
    
    else 
    {
        if (isset($_POST['usuario']) && isset($_POST['password'])) 
        {
            $usuario  = $_POST['usuario'];
            $password = $_POST['password'];

            if (comprobar_usuario($usuario, $password)) 
            {
                $_SESSION['usuario'] = $usuario;
                $aliasUsuarios = obtener_datos_usuarios_alias();
            } 
            
            else 
            {
                echo "Usuario o password incorrecto";
                header("Location: login.html");
            }
        } 
        
        else 
        {
            header("Location: login.html");
        }
    }

?>

<!DOCTYPE html>

<html>

    <head>

        <title>Información de Usuario</title>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>

    <body>

        <form action="datos_usuario.php" method="POST">

            <label class='etiqueta' for='aliasUsuario'>Usuarios:</label>
            
            <br/>

            <select name='aliasUsuario' id='aliasUsuario'>
                <?php
                    crear_opciones($aliasUsuarios, $_SESSION['aliasUsuario']);
                ?>
            </select>

            <input type = "submit" value="Mostrar Información">

        </form>

    </body>

</html>