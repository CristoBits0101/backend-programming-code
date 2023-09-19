<!-- P H P -->
<?php 
    session_start(); 
?>

<!DOCTYPE html>

<html lang="es">

<head>
    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Ejemplo simple de login con PHP</title>

    <link href="css/style.css" rel="stylesheet">

</head>

<body>

    <!-- Se va a procesar en login.php mediante POST -->
    <form action="regenerar_sesion.php" method="POST">

        <input name="usuario" type="text" placeholder="Escribe tu nombre de usuario">

        <br><br>

        <input name="password" type="password" placeholder="Contraseña">

        <br><br>

        <!--Lo siguiente envía el formulario-->
        <input type="submit" value="Iniciar sesión">
        
    </form>

</body>

</html>