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

    <!-- 1. Ejecuta un JavaScript cuando un usuario cambia la opción seleccionada de un elemento -->
    onChange 
    <select id="selectBox" onChange="Func('onchange')">
        <option>select</option>
        <option value="1">Option #1</option>
        <option value="2">Option #2</option>
    </select>

    <br/><br/>

    <!-- 2. Ejecuta un JavaScript cuando un usuario cambia el valor del input -->
    onchange  
    <input onchange="Func('onchange')" type="number">
    
    <br/><br/>

    <!-- Zona de inyección del script -->
    <div id="mensaje"></div>

    <!-- 3. Ejecuta un JavaScript cuando un usuario cambia el valor del input -->
    Select Fruit:
    <select id="ddlFruits" onchange="GetSelectedTextValue(this)">
        <option value=""></option>
        <option value="1">Apple</option>
        <option value="2">Mango</option>
        <option value="3">Orange</option>
    </select>

    <script type="text/javascript">
        function GetSelectedTextValue(ddlFruits) 
        {
            var selectedText  = ddlFruits.options[ddlFruits.selectedIndex].innerHTML;
            var selectedValue = ddlFruits.value;

            alert("Selected Text: " + selectedText + " Value: " + selectedValue);
        }
    </script>

</body>

</html>