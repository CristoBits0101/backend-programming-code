<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>JavaScript Eliminación de un detector de eventos</title>

</head>

<body>

    <button id="btn">Click Here</button>

    <script>

        // 1. Obtener el id del elemento.
        var btn = document.getElementById("btn");

        // 2. Si se remueve el evento al final ya no se puede ejecutar.
        btn.addEventListener("click", removeFunction);
        btn.removeEventListener("click", removeFunction);

        // 3. Evento.
        function removeFunction() 
        {
            alert("Function will be removed here");
        }

    </script>

    <p>

        <strong>Note:</strong> 

        Aunque intente hacer clic en el botón, no se activará ningún evento ya que hemos eliminado el evento de clic mediante removeEventListener.

    </p>

</body>

</html>