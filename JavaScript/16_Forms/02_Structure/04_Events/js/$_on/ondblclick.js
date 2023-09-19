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
            let div = document.getElementById('mensaje');

            div.innerHTML = name;
        }
        
    </script>

</head>

<body>

    <!-- Ejecute un JavaScript cuando se haga doble clic en un elemento -->
    <p ondblclick="Func('ondblclick')">Double-click this!</p>
    
    <br/>

    <!-- Zona de inyección del script -->
    <div id="mensaje"></div>

</body>

</html>