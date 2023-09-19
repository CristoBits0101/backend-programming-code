function obtenerPelicula(id) 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            var pelicula  = JSON.parse(this.responseText);
            var titulo    = document.getElementById("titulo");
            var director  = document.getElementById("director");
            var actores   = document.getElementById("actores");
            var genero    = document.getElementById("genero");
            var duracion  = document.getElementById("duracion");
            var argumento = document.getElementById("argumento");

            titulo.value    = pelicula["titulo"][0];
            director.value  = pelicula["director"][0];
            actores.value   = pelicula["actores"][0];
            genero.value    = pelicula["genero"][0];
            duracion.value  = pelicula["duracion"][0];
            argumento.value = pelicula["argumento"][0];
        }
    };

    xhttp.open("POST", "xmlconf.php", true);

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send("idPelicula=" + id);
}