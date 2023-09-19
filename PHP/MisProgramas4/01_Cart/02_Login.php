<?php

    require_once 'bd.php';

    /**
     *  - Formulario de login habitual.
     *  - Si va bien abre sesión, guarda el nombre de usuario y redirige a principal.php
     *  - Si va mal, mensaje de error.
     */
    if ($_SERVER["REQUEST_METHOD"] == "POST") 
    {
        // Función que comprueba si el usuario se encuentra en el fichero XML.
        $usuario = comprobar_usuario($_POST['usuario'], $_POST['clave']);

        if ($usuario === false) 
        {
            $error = true;
            $usuario = $_POST['usuario'];
        } 
        
        else 
        {
            session_start();

            $_SESSION['usuario'] = $_POST['usuario'];
            $_SESSION['carrito'] = [];

            header("Location: categorias.php");

            return;
        }
    }

?>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>

</head>

<body>

    <?php
        if (isset($_GET["redirigido"])) 
        {
            echo "<p>Haga login para continuar</p>";
        }
        if (isset($error) and $error == true) 
        {
            echo "<p> Revise usuario y contraseña</p>";
        }
    ?>

    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="POST">
        <label for="usuario">Usuario</label>
        <input value="<?php if (isset($usuario)) echo $usuario; ?>" id="usuario" name="usuario" type="text">
        
        <label for="clave">Clave</label>
        <input id="clave" name="clave" type="password">
        
        <input type="submit">
    </form>

</body>

</html>