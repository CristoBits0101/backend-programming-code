function mostrarContenido(numPagina) 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            document.getElementById("contenido").innerHTML = this.response;
        }
    };

    var pagina = "pagina" + numPagina + ".php";

    xhttp.open("GET", pagina, true);

    xhttp.send();
}