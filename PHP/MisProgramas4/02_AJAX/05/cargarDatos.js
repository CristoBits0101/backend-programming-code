function cargarProductos() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("principal").style.display = "block";
            var contenido = document.getElementById("contenido");
            var titulo = document.getElementById("titulo");
            titulo.innerHTML = "Listado de Productos";
            try {
                var productos = JSON.parse(this.responseText);
                var tabla = crearTablaProductos(productos);
                contenido.innerHTML = "";
                contenido.appendChild(tabla);
            } catch (e) {
                var mensaje = document.createElement("p");
                mensaje.innerHTML = "Error en productos";
                contenido.innerHTML = "";
                contenido.appendChild(mensaje);
            }
        }
    };
    xhttp.open("GET", "productos_json.php", true);
    xhttp.send();
    return false;
}

function crearTablaProductos(productos) {
    var tabla = document.createElement("table");
    var cabecera = crearFila(["ID", "Nombre", "Descripción", "Peso(Kg)", "Stock", "Imagen"], "th");
    tabla.appendChild(cabecera);
    for (var i = 0; i < productos.length; i++) {
        var imagen = "<img src='" + productos[i]['Imagen'] + "'  width='60' height='90' />";
        fila = crearFila([productos[i]['CodProd'], productos[i]['Nombre'], productos[i]['Descripcion'], productos[i]['Peso'], productos[i]['Stock'], imagen], "td");

        tabla.appendChild(fila);
    }
    return tabla;
}

function crearFila(campos, tipo) {
    var fila = document.createElement("tr");
    for (var i = 0; i < campos.length; i++) {
        var celda = document.createElement(tipo);
        celda.innerHTML = campos[i];
        fila.appendChild(celda);
    }
    return fila;
}
