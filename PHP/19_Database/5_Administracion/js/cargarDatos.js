function cargarListaUsuarios() 
{
    var xhttp = new XMLHttpRequest();

    document.getElementById("login").style.display    = "none";
    document.getElementById("insertar").style.display = "none";

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            var prod         = document.getElementById("contenido");
            var titulo       = document.getElementById("titulo");

            titulo.innerHTML = "Administrar Usuarios";

            try 
            {
                var filas = JSON.parse(this.responseText);
                var tabla = crearTablaUsuarios(filas);
                prod.innerHTML = "";
                prod.appendChild(tabla);
            } 
            
            catch (e) 
            {
                var mensaje       = document.createElement("p");
                mensaje.innerHTML = "No existen usuarios";
                prod.innerHTML    = "";

                prod.appendChild(mensaje);
            }
        }
    };

    xhttp.open("GET", "usuarios_json.php", true);

    xhttp.send();

    return false;
}

function crear_fila(campos, tipo) 
{
    var fila = document.createElement("tr");

    for (var i = 0; i < campos.length; i++) 
    {
        var celda       = document.createElement(tipo);
        celda.innerHTML = campos[i];

        fila.appendChild(celda);
    }

    return fila;
}

function crearTablaUsuarios(usuarios) 
{
    var tabla = document.createElement("table");
    var cabecera = crear_fila(["Código", "Nombre", "Apellidos", "Usuario"], "th");

    tabla.appendChild(cabecera);

    for (var i = 0; i < usuarios.length; i++) 
    {
        fila       = crear_fila([usuarios[i]['id'], usuarios[i]['nombre'], usuarios[i]['apellidos'], usuarios[i]['usuario']], "td");
        vinculo    = crearVinculoEliminarUsuario("Eliminar", usuarios[i]['id']);
        celda_form = document.createElement("td");

        fila.appendChild(celda_form);
        fila.appendChild(vinculo);
        tabla.appendChild(fila);
    }

    return tabla;
}

function crearVinculoEliminarUsuario(nom, id) 
{
    var vinculo = document.createElement("a");
    var ruta = "eliminar_json.php?id=" + id;

    vinculo.href      = ruta;
    vinculo.innerHTML = nom;
    vinculo.onclick   = function () 
    {
        return eliminarUsuario(vinculo.href);
    }

    return vinculo;
}

function insertarUsuario() 
{
    // Cambiar visibilidades de las secciones.
    document.getElementById("principal").style.display = "block";
    document.getElementById("login").style.display     = "none";
    document.getElementById("insertar").style.display  = "block";
}

function insertarNuevoUsuario() 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            try 
            {
                if (this.responseText == "TRUE") 
                {
                    alert("El usuario se ha insertado correctamente");

                    cargarListaUsuarios();
                } 
                
                else 
                {
                    alert("El usuario no se ha podido insertar, se produjo un error");
                }
            } 
            
            catch (e) 
            {
                var mensaje       = document.createElement("p");
                mensaje.innerHTML = "No se ha podido insertar";
                prod.innerHTML    = "";

                prod.appendChild(mensaje);
            }
        }
    };

    var nombre    = document.getElementById("nombreUsu").value;
    var apellidos = document.getElementById("apellidosUsu").value;
    var usuario   = document.getElementById("usuarioUsu").value;
    var clave     = document.getElementById("claveUsu").value;
    var params    = "nombre=" + nombre + "&apellidos=" + apellidos + "&usuario=" + usuario + "&clave=" + clave;

    xhttp.open("POST", "insertar_json.php", true);

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send(params);

    return false;
}

function eliminarUsuario(destino, id) 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            try 
            {
                if (this.responseText == "TRUE") 
                {
                    alert("El usuario se ha eliminado correctamente");

                    cargarListaUsuarios();

                } 
                
                else 
                {
                    alert("El usuario no se ha podido eliminar, se produjo un error");
                }

            } 
            
            catch (e) 
            {
                var mensaje = document.createElement("p");

                mensaje.innerHTML = "No se ha podido eliminar";
            }
        }
    };

    xhttp.open("GET", destino, true);

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send();
    
    return false;
}