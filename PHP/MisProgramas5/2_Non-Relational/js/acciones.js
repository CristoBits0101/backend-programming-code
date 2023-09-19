function obtenerPelicula(id) 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            var pelicula    = JSON.parse(this.responseText);
            var titulo      = document.getElementById("titulo");
            var director    = document.getElementById("director");
            var actores     = document.getElementById("actores");
            var genero      = document.getElementById("genero");
            var duracion    = document.getElementById("duracion");
            var argumento   = document.getElementById("argumento");

            titulo.value    = pelicula["titulo"];
            director.value  = pelicula["director"];
            actores.value   = pelicula["actores"];
            genero.value    = pelicula["genero"];
            duracion.value  = pelicula["duracion"];
            argumento.value = pelicula["argumento"];
        }
    };

    xhttp.open("POST", "./datos/xmlconf.php", true);

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send("idPelicula=" + id);
}