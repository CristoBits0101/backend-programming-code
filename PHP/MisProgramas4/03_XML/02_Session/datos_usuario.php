<?php

    require_once("xmlconf.php");

    session_start();

    if (!isset($_SESSION['usuario'])) 
    {
        header("Location: login.html");
    } 
    
    else 
    {
        if (!isset($_POST['aliasUsuario'])) 
        {
            header("Location: login.html");
        } 
        
        else 
        {
            $_SESSION['aliasUsuario'] = $_POST['aliasUsuario'];

            $datosUsuario = obtener_datos_usuario($_SESSION['aliasUsuario']);
        }
    }

?>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Información de Usuario</title>

    <meta charset="UTF-8">

</head>

<body>

    <form>

        <label for="alias">Alias:</label>
        <input id="alias" name="alias" type="text" value="<?php
                                                                if (isset($datosUsuario)) 
                                                                {
                                                                    echo $datosUsuario[0]->alias;
                                                                }
                                                            ?>">
        <br>
        <label for="apellidos">Apellidos:</label>
        <input id="apellidos" name="apellidos" type="text" value="<?php
                                                                        if (isset($datosUsuario)) 
                                                                        {
                                                                            echo $datosUsuario[0]->apellidos;
                                                                        }
                                                                    ?>">
        <br>
        <label for="direccion">Direccion:</label>
        <input id="direccion" name="direccion" type="text" value="<?php
                                                                        if (isset($datosUsuario)) 
                                                                        {
                                                                            echo $datosUsuario[0]->direccion;
                                                                        }
                                                                    ?>">
        <br>
        <label for="rol">Rol:</label>
        <input id="rol" name="rol" type="text" value="<?php
                                                            if (isset($datosUsuario)) 
                                                            {
                                                                echo $datosUsuario[0]->rol;
                                                            }
                                                        ?>">
    </form>

    <a href="usuarios.php"><button>Volver</button></a>
    
</body>

</html>