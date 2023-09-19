<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Obtiene como parámetro el nombre del evento realizado -->
    <script type="text/JavaScript" >
        function Func(name) 
        {
            alert(name)
        }
    </script>

</head>

<!-- Ejecute un JavaScript cuando se cambie el tamaño de la ventana del navegador -->
<body onresize="Func('onresize')"></body>

</html>