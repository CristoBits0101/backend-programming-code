<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Ejemplo simple de login con PHP</title>

</head>

<body>

    <!-- Se va a procesar en login.php mediante post -->
    <form action="login.php" method="post">

        <!-- 
            Nota: El atributo name es importante, pues lo vamos a recibir de esa manera en PHP.
         -->
        <input name="usuario" type="text" placeholder="Escribe tu nombre de usuario">

        <br><br>

        <input name="password" type="password" placeholder="Contraseña">

        <br><br>

        <!-- Lo siguiente envía el formulario -->
        <input type="submit" value="Iniciar sesión">

    </form>

</body>

</html>