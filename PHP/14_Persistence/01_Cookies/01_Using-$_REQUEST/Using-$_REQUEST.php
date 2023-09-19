<?php
    
    /**
     *  - $_REQUEST es un array asociativo que permite recoger datos enviados al servidor.
     *  - Da igual de la fuente que provengan los datos.
     *  - Con $_REQUEST se puede recoger tanto peticiones GET como POST.
     */

    // Datos almacenados en $_REQUEST.
    echo "REQUEST:";
    print_r($_REQUEST);

    echo "<br/><br/>";

    // Datos almacenados en $_POST.
    echo "POST:";
    print_r($_POST);
    
    echo "<br/><br/>";
    
    // Datos almacenados en $_GET.
    echo "GET:";
    print_r($_GET);
    
    echo "<br/><br/>";

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

    <!-- F O R M 1 -->
    <form action="#" method="GET">
        <h1> Formulario GET: </h1>
        <input type="text" name="nombre" value="" />
        <input type="submit" name="boton" value="Enviar" />
    </form>

    <br />

    <!-- F O R M 2 -->
    <form action="#" method="POST">
        <h1> Formulario POST: </h1>
        <input type="text" name="nombre2" value="" />
        <input type="submit" name="boton2" value="Enviar" />
    </form>

</body>

</html>