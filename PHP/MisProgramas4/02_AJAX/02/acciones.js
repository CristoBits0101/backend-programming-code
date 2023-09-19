var idAccion = null;

function accionIniciar()
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function ()
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            document.getElementById("noticias").innerHTML = this.response;
        }
    };

    xhttp.open("GET", "genera_contenidos.php", true);

    xhttp.send();
}

function accionSeleccion(accion) 
{
    if (accion == "Iniciar")
    {
        //genera una petición GET cada 1 segundo de intervalo.
        this.idAccion = setInterval(accionIniciar, 1000);
    } 

    else 
    {
        // Interrumpe el intervalo de las peticiones mediante un ID petición
        clearInterval(this.idAccion);
    }
}