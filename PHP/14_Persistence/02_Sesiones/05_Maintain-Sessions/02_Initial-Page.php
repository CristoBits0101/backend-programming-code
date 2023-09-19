<?php

    // Se define el salto de línea.
    define("salto", "<br>n");

    session_start();

    // Los dos campos del formulario son asignados a las variables de sesión.
    $_SESSION["nombre"] = $_POST["nombreDeUsuario"];
    $_SESSION["color"] = $_POST["colorElegido"];

?>

<!DOCTYPE html>

<html lang="es">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>

    <link href="css/style.css" rel="stylesheet">

    <script language="javascript" type="text/javascript">

        /**
         *  - La siguiente función, que se ejecuta a la carga de la página.
         *  - Llama a la primera página de contenidos. 
         *  - pasándole, como campo oculto la constante de id de la sesión.
         */
        function mandar() 
        {
            location.href = "pagina_uno.php";
        }
        
    </script>

<head>

<body onLoad="javascript:mandar();">

</body>

</html>