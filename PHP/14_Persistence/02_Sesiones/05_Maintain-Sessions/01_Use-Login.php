<?php

    /**
     *  - Se inicia la sesión.
     *  - Como no hay ninguna sesión activa, PHP la se crea en este momento.
     *  - Asignándole como session_id, una cadena alfanumérica formada por guarismos aleatorios.
     *  - El nombre del fichero de sesión en el servidor será sess_, seguido de dicha cadena.
     */
    session_start();

    /**
     *  - Se indica que variables van a formar parte del archivo de la sesión.
     *  - Aunque, de momento, no tienen valor alguno asignado.
     */
    $_SESSION["nombre"] = "";
    $_SESSION["color"] = "";

?>

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

    <!-- 
        - Se crea un formulario donde se van a grabar dos datos:
        - El nombre del usuario y el color que elige de una lista.
        - Se envía al script que almacena los valores de los campos en las variables de sesión.
        - Este script es transparente al usuario.
     -->
    <form action="pagina_inicial.php" method="POST">

        Nombre de usuario:
        <input type="text" name="nombreDeUsuario" id="nombreDeUsuario" value="">

        <br/>

        Color:
        <select name="colorElegido" id="colorElegido">
            <option value="#FF0000">Rojo</option>
            <option value="#00FF00">Verde</option>
            <option value="#0000FF">Azul</option>
        </select>

        <br>

        <input type="submit" value="Aceptar">
        
    </form>

</body>

</html>