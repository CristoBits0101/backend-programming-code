function cerrarSesion() 
{
    // Cerrar sesión.
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            /*cambiar visibilidades de las secciones*/
            document.getElementById("principal").style.display = "none";
            document.getElementById("insertar").style.display  = "none";
            document.getElementById("login").style.display     = "block";
            document.getElementById("contenido").innerHTML     = "";

            alert("Sesion cerrada con éxito");
        }
    };

    xhttp.open("GET", "logout_json.php", true);

    xhttp.send();

    return false;
}

function login() 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            // alert(this.responseText);

            if (this.responseText === "FALSE") 
            {
                alert("Revise usuario y contraseña");
            } 
            
            else 
            {
                document.getElementById("principal").style.display = "block";
                document.getElementById("login").style.display     = "none";
                document.getElementById("cab_usuario").innerHTML   = "Usuario: " + usuario;

                cargarListaUsuarios();
            }
        }
    }

    var usuario = document.getElementById("usuario").value;
    var clave   = document.getElementById("clave").value;
    var params  = "usuario=" + usuario + "&clave=" + clave;

    xhttp.open("POST", "login_json.php", true);

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send(params);

    return false;
}