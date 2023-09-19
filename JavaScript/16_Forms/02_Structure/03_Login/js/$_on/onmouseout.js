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

    <!-- Ejecute un JavaScript cuando mueva el puntero del mouse fuera de una imagen -->
    <div onmouseout="Func('onmouseout')"> 
        <h2>Mouse out h2 tag</h2> 
    </div>
    
    <br/>

    <!-- Zona de inyección del script -->
    <div id="mensaje"></div>

</body>

</html>

<!-- Ejemplo 2 -->
<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Este es un ejemplo para eventos de ratón.</title>

</head>

<body>

    <p>Pase el mouse sobre el botón y obtenga las coordenadas del puntero del mouse.</p>

    <!-- Ejecute un JavaScript al mover el puntero del mouse sobre una imagen -->
    <!-- Ejecute un JavaScript cuando mueva el puntero del mouse fuera de una imagen -->
    <button id="bid" 
        onmouseover="funOver(event)" 
        onmouseout="funOut(event)"
    >
        Muévase aquí para generar un evento de movimiento del mouse.
    </button>

    <h3 id="hid"></h3>

    <script>

        function funHandler(mens) 
        {
            document.getElementById("divid").innerHTML="El evento Mouse " + mens + " es generado y manejado.";
        }

        function funOver(e) 
        {
            px  = e.clientX;
            py  = e.clientY;
            pxy = "Coordenadas x e y = (" + px + "," + py + ")";

            document.getElementById("hid").innerHTML = pxy
        }

        function funOut() 
        {
            document.getElementById("hid").innerHTML = "";
        }

    </script>

    <div id="divid" style="color: #0900C4"></div>

</body>

</html>