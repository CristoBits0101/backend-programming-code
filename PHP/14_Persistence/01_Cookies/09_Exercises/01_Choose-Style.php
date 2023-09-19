<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Ejercicio 1: Elegir estilos web</title>
        <link href="estilos/<?php
        if (isset($_COOKIE['estilo'])) {
            echo $_COOKIE['estilo'];
        }
        ?>" rel="stylesheet" type="text/css">
    </head>
    <body>
        
    </body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Ejercicio 1: Elegir estilos web</title>
        <link href="estilos/<?php
            if (isset($_COOKIE['estilo'])) 
            {
                echo $_COOKIE['estilo'];
            }
        ?>" rel="stylesheet" type="text/css">

</head>

<body>

    <div id='estilos'>

        <form action='guardar_estilo.php' method='post'>
            <fieldset >

                <legend></legend>

                <legend>Preferencias de estilo</legend>

                <div class='campo'>
                    <input type="radio" value="rojo" name="radio">Estilo Rojo<br>
                </div>

                <div class='campo'>
                    <input type="radio" value="verde" name="radio">Estilo Verde<br>
                </div>

                <div class='campo'>
                    <input type="radio" value="azul" name="radio">Estilo Azul<br>
                </div>

                <div>
                    <br/>
                </div>

                <input type="submit" value="Guardar Estilo">

            </fieldset>
        </form>

    </div>

</body>

</html>