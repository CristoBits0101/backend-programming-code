<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Este es un ejemplo para eventos de ratón.</title>

</head>

<body>

    <!-- Ejecute un JavaScript al presionar un botón del mouse sobre un párrafo -->
    <button onmousedown="funHandler('onmousedown')" style="color:#FF0000">Haga clic aquí para generar un evento de mouse hacia abajo.</button></br>

    <p>Pase el mouse sobre el botón y obtenga las coordenadas del puntero del mouse.</p>

    <h3 id="hid"></h3>

    <script>

        function funHandler(mens) 
        {
            document.getElementById("divid").innerHTML="El evento Mouse " + mens + " es generado y manejado.";
        }

    </script>

    <div id="divid" style="color: #0900C4"></div>

</body>

</html>