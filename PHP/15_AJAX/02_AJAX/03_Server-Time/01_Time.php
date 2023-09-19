<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Hora en el servidor</title>

    <script>
        
        function loadDoc() 
        {
            var xhttp = new XMLHttpRequest();

            xhttp.onreadystatechange = function () 
            {
                if (this.readyState == 4 && this.status == 200) 
                {
                    document.getElementById("hora").innerHTML = "Hora en el servidor:" + this.response;
                }
            };

            xhttp.open("GET", "hora_servidor.php", true);
            
            xhttp.send();
            
            return false;
        }
        
        // 5000 son 5 segundos de intervalo.
        setInterval(loadDoc, 5000);
    
    </script>

</head>

<body>

    <h1>Hora en el servidor</h1>

    <section id="hora"></section>
    
</body>

</html>