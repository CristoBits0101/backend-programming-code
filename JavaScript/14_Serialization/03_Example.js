// 4. Llamar los datos de la BD y ordenarlos.
function getPaisesDB()
{
    // Guardamos los datos de la BD en un ArrayList.
    let paises = ['España', 'Alemania', 'Portugal'];

    // Retornamos los datos ordenados alfabéticamente.
    return  paises.sort();
};

// 5. Crear el código que se va a devolver.
function getPaises()
{
    // Llamamos a la función getPaisesBD para importar datos de la BD en un ArrayList.
    let paises = getPaisesDB();

    // Creamos la variable que se va a retornar con un elemento HTML de inicio de código.
    let table = "<Table class='table table-dark table-striped'>";

    // Concatenamos elementos HTML junto a los datos de BD en la variable a retornar.
    for (let index = 0; index < paises.length; index++) 
    {
        table += "<tr><td>" + paises[index] + "</td></tr>";
    }

    // Añadimos el elemento de cierre fuera del bucle porque tiene que ser irrepetible.
    table += "</Table>";

    // Llamamos a la función pintar pasandole los valores que queremos pintar.
    pintar(table);
};

// 6. Serialización pintar los datos que se quieren retornar en un HTML.
function pintar(table)
{
    /**
     *  - Obtenemos el identificar del elemento en la memoria donde queremos pintar-pasar los datos.
     *  - Insertamos los datos obtenidos. 
     */
    document.getElementById("pintarPaises").innerHTML = table;
}