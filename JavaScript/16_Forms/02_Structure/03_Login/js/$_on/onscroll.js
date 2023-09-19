<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>#scroll {border: 1px solid black; width: 200px; height: 150px; overflow: scroll;}</style>

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

    <!-- Ejecute un JavaScript cuando se desplaza un elemento -->
    <div id="scroll" onscroll="Func('onscroll')"> 
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
        Scroll the element.
    </div>
    
    <br/>

    <!-- Zona de inyección del script -->
    <div id="mensaje"></div>

</body>

</html>