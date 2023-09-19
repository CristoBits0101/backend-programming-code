<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body>

    <h2>Oyente de eventos de JavaScript.</h2>

    <h3>Este evento mostrará el evento 'clic' de un botón.</h3>

    <button id="btn">¡Haga clic aquí!</button>

    <script>

        /*
         *  - Parametro 1: Al hacer click con el ratón en el área del id.
         *  - Parametro 2: Función a ejecutar.
         */
        document.getElementById("btn").addEventListener("click", () =>
        {
            document.write("<p>Hola, este es el detector de eventos de clic en JavaScript.</p>");
        });

    </script>

</body>

</html>