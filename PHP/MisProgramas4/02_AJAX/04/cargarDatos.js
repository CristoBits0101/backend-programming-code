function cargarCategorias() 
{
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () 
    {
        if (this.readyState == 4 && this.status == 200) 
        {
            var cats = JSON.parse(this.responseText);
            var lista = document.createElement("ul");

            for (var i = 0; i < cats.length; i++) 
            {
                var elem = document.createElement("li");

                vinculo = crearVinculoCategorias(cats[i].nombre, cats[i].cod);

                elem.appendChild(vinculo);

                lista.appendChild(elem);
            }

            var contenido = document.getElementById("contenido");

            contenido.innerHTML = "";

            var titulo = document.getElementById("titulo");

            titulo.innerHTML = "Categorías";

            contenido.appendChild(lista);
        }
    };

    xhttp.open("GET", "categorias_json.php", true);

    xhttp.send();

    return false;
}

function crearVinculoCategorias(nom, cod) 
{
    var vinculo = document.createElement("a");
    var ruta    = "productos_json.php?categoria=" + cod;

    vinculo.href      = ruta;
    vinculo.innerHTML = nom;
    vinculo.onclick   = function () 
    {
        return cargarProductos(this);
    }

    return vinculo;
}