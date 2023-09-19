<!DOCTYPE html>

<html lang="es">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Uso de sesiones</title>

    <link href="css/style.css" rel="stylesheet">

</head>

<body>

    <?php

        // Se define el salto de línea.
        define("salto", "<br>");

        // Se abre la sesión.
        session_start();
        
        /**
         *  - Se muestra el nombre del usuario.
         *  - Se muestra en el color elegido, la página en la que estamos.
         */
        echo "El nombre de usuario es: " . $_SESSION["nombre"] . salto;

        echo    "El color elegido es: 
                <h1>
                    <font color='".$_SESSION["color"]."'>
                        P&Aacute;GINA TRESS
                    </font>
                </h1>" . salto;
        
    ?>

    <a href="pagina_uno.php">Ir a p&aacute;gina 1</a>

    <br>

    <a href="pagina_dos.php">Ir a p&aacute;gina 2</a>

    <br>

    <a href="uso_sesiones_inicio.php"> Ir a inicio </a>

</body>

</html>