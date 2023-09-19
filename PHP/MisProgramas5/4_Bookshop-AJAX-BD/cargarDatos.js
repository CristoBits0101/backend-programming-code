function cargarGeneros() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var gens = JSON.parse(this.responseText);
            var lista = document.createElement("ul");
            for (var i = 0; i < gens.length; i++) {
                var elem = document.createElement("li");
                vinculo = crearVinculoGenero(gens[i].nombre, gens[i].cod);
                elem.appendChild(vinculo);
                lista.appendChild(elem);
            }
            var contenido = document.getElementById("contenido");
            contenido.innerHTML = "";
            var titulo = document.getElementById("titulo");
            titulo.innerHTML = "Géneros de Libros";
            contenido.appendChild(lista);
        }
    };
    xhttp.open("GET", "generos_json.php", true);
    xhttp.send();
    return false;
}

function crearVinculoGenero(nombre, cod) {
    var vinculo = document.createElement("a");
    var ruta = "libros_genero_json.php?genero=" + cod;

    vinculo.href = ruta;
    vinculo.innerHTML = nombre;
    vinculo.onclick = function () {
        return cargarGeneroLibros(this);
    }
    return vinculo;
}

function cargarGeneroLibros(destino) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var prod = document.getElementById("contenido");
            var titulo = document.getElementById("titulo");
            titulo.innerHTML = "Libros";
            try {
                var libros = JSON.parse(this.responseText);
                var tabla = crearTablaLibros(libros);
                prod.innerHTML = "";
                prod.appendChild(tabla);
            } catch (e) {
                var mensaje = document.createElement("p");
                mensaje.innerHTML = "Genero sin libros";
                prod.innerHTML = "";
                prod.appendChild(mensaje);
            }
        }
    };
    xhttp.open("GET", destino, true);
    xhttp.send();
    return false;
}

function cargarLibros() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var prod = document.getElementById("contenido");
            var titulo = document.getElementById("titulo");
            titulo.innerHTML = "Libros";
            try {
                var libros = JSON.parse(this.responseText);
                var tabla = crearTablaLibros(libros);
                prod.innerHTML = "";
                prod.appendChild(tabla);
            } catch (e) {
                var mensaje = document.createElement("p");
                mensaje.innerHTML = "Genero sin libros";
                prod.innerHTML = "";
                prod.appendChild(mensaje);
            }
        }
    };
    xhttp.open("GET", "libros_json.php", true);
    xhttp.send();
    return false;
}

function crearTablaLibros(libros) {
    var tabla = document.createElement("table");
    var cabecera = crear_fila(["ISBN", "Titulo", "Escritores", "Género", "Páginas", "Imagen"], "th");
    tabla.appendChild(cabecera);
    // se crean las filas de libros que podremos añadir al carrito
    for (var i = 0; i < libros.length; i++) {
        var imagen = "<img src='" + libros[i]['imagen'] + "'  width='60' height='90' />";
        fila = crear_fila([libros[i]['isbn'], libros[i]['titulo'], libros[i]['escritores'], libros[i]['genero'], libros[i]['numpaginas'], imagen], "td");
        formu = crearFormulario("Añadir", libros[i]['isbn'], anadirLibros);
        celda_form = document.createElement("td");
        celda_form.appendChild(formu);
        fila.appendChild(celda_form);
        tabla.appendChild(fila);
    }
    return tabla;
}

function crear_fila(campos, tipo) {
    var fila = document.createElement("tr");
    for (var i = 0; i < campos.length; i++) {
        var celda = document.createElement(tipo);
        celda.innerHTML = campos[i];
        fila.appendChild(celda);
    }
    return fila;
}

function crearFormulario(texto, cod, funcion) {
    var formu = document.createElement("form");
    var unidades = document.createElement("input");
    unidades.value = 1;
    unidades.name = "unidades";
    var codigo = document.createElement("input");
    codigo.value = cod;
    codigo.type = "hidden";
    codigo.name = "isbn";
    var bsubmit = document.createElement("input");
    bsubmit.type = "submit";
    bsubmit.value = texto;
    formu.onsubmit = function () {
        return funcion(this);
    }
    formu.appendChild(unidades);
    formu.appendChild(codigo);
    formu.appendChild(bsubmit);
    return formu;
}

function anadirLibros(formulario) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            alert("Producto añadido con éxito");
            cargarCarrito();
        }
    };
    var params = "isbn=" + formulario.elements['isbn'].value + "&unidades=" + formulario.elements['unidades'].value;
    xhttp.open("POST", "anadir_json.php", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(params);
    return false;
}

function eliminarLibros(formulario) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            alert("Producto eliminado con éxito");
            cargarCarrito();
        }
    };
    var params = "isbn=" + formulario.elements['isbn'].value + "&unidades=" + formulario.elements['unidades'].value;
    xhttp.open("POST", "eliminar_json.php", true);
    //Send the proper header information along with the request
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(params);
    return false;
}

function crearTablaCarritoLibros(libros) {
    var tabla = document.createElement("table");
    var cabecera = crear_fila(["ISBN", "Titulo", "Escritores", "Género", "Páginas", "Imagen", "Unidades"], "th");
    tabla.appendChild(cabecera);
    // se crean las filas de libros que podremos añadir al carrito
    for (var i = 0; i < libros.length; i++) {
        var imagen = "<img src='" + libros[i]['imagen'] + "'  width='60' height='90' />";
        fila = crear_fila([libros[i]['isbn'], libros[i]['titulo'], libros[i]['escritores'], libros[i]['genero'], libros[i]['numpaginas'], imagen, libros[i]['unidades']], "td");
        formu = crearFormulario("Eliminar", libros[i]['isbn'], eliminarLibros);
        celda_form = document.createElement("td");
        celda_form.appendChild(formu);
        fila.appendChild(celda_form);
        tabla.appendChild(fila);
    }
    return tabla;
}

function cargarCarrito() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var prod = document.getElementById("contenido");
            var titulo = document.getElementById("titulo");
            titulo.innerHTML = "Carrito de Libros";

            try {
                var libros = JSON.parse(this.responseText);
                var tabla = crearTablaCarritoLibros(libros);
                prod.innerHTML = "";
                var procesar = document.getElementById("procesar");
                procesar.style.display = "block";
                prod.appendChild(tabla);

            } catch (e) {
                var mensaje = document.createElement("p");
                mensaje.innerHTML = "Carrito sin libros";
                prod.innerHTML = "";
                prod.appendChild(mensaje);
            }
        }
    };
    xhttp.open("GET", "carrito_json.php", true);
    xhttp.send();
    return false;
}

function logout() {
    location.href = "logout.php";
    return false;
}
