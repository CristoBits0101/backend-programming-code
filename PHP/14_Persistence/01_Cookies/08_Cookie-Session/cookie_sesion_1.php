<?php
/* 
    Para crear una cookie que sólo tenga existencia mientras no cerremos la ventana del navegador,
    pasaremos como fecha de expiración de la cookie, el valor cero.

    Una vez que la instancia del navegador se cierra, dicha cookie desaparecerá.

    Este tipo de cookie puede ser muy útil para validar un usuario en un conjunto de páginas, 
    si previamente ingresó correctamente su nombre de usuario y clave.

    Es decir, una vez validado el usuario, se verifica en páginas sucesivas si existe la cookie.

    Una vez que el usuario cierra el navegador, no hay posibilidad de solicitar las páginas
    recorridas sin previa validación nuevamente de clave y usuario.

    Entonces la sintaxis es: setcookie(,,0)
    
    Veamos un pequeño ejemplo para crear y verificar si existe una cookie de sesión.
 */
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
        if (isset($_COOKIE['usuario']))
            echo "Cookie de sesión creada. Su valor es $_COOKIE[usuario]";
        else
            echo "No existe cookie de sesión";
            // echo <a href="cookie_sesion_2.php">Crear cookie de sesión</a>;
    ?>

    <br>

    <a href="cookie_sesion_2.php">Crear cookie de sesión</a>
    
</body>

</html>