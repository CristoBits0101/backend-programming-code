/**
 *  4.1. El evento onclick ejecuta la siguiente función.
 *  4.2. Esta función llama a otra para que le pase los datos de la BD.
 *  4.3. Los datos de la BD se los tranfiere a una función que genera la tabla.
 */
function getDays() 
{
    let days = getDaysDB();

    generateTable(days);
}

/**
 *  5.1. Función que le pide al backend los días que hay en una semana desde la base de datos.
 *  5.2. @return una lista con los días de la semana obtenidos de la base de datos.
 */
function getDaysDB()
{
    let getDays =
    [
        'Lunes',
        'Martes',
        'Miércoles',
        'Jueves',
        'Viernes',
        'Sábado',
        'Domingo',
    ];
    
    // Retornamos los datos.
    return getDays;
}

// 6. Función principal que ejecuta las instrucciones necesarias para realizar el evento.
function generateTable(days) 
{
    // Creamos el elemento html table que va a almacenar las filas y columnas con los datos de los días de la semana.
    let tabla = document.createElement("table");

    // Creamos el elemento semántico tbody que donde se almacena el cuerpo de la tabla y de los datos de la semana.
    var tBody = document.createElement("tbody");

    // Creamos un bucle de tipo for of para recorrer la lista.
    for(let item of days) 
    {
        // Creamos una fila y una columna cada vuelta del bucle donde se va a almacenar los datos.
        var celda = document.createElement("td");
        var fila  = document.createElement("tr");

        // Obtenemos el valor del item y lo almacenamos como texto en textCell.
        var textCell = document.createTextNode(item);
        
        // Le pasamos el texto a la celda, la celda a la columna, la columna a la fila.
        celda.appendChild(textCell);
        fila.appendChild(celda);
        tBody.appendChild(fila);
    }

    // Pasamos el cuerpo de la tabla a la tabla.
    tabla.appendChild(tBody);

    // Enviamos el elemento a la función que lo va a serializar.
    elementSerialization(tabla);
}

// 7. Llamamos a la función que va a pintar el elemento que le pasen dentro de un div especifico.
function elementSerialization(tabla) 
{
    // Si es una tabla se le aplican estos estilos.
    tabla.setAttribute("border", "1px");
    tabla.setAttribute("border-radius", "5px");
    tabla.setAttribute("style", "background-color: #d3cce3");
    tabla.setAttribute("width", "25%");

    // Añadimos un salto de línea entre tablas.
    let lineBreak = document.createElement("br");

    // Enviamos los elemento hacía el HTML, appendChild no se puede combinar innerHTML.

    // Opción 1: createElement -> setAttribute -> appendChild -> .getElementById('weekdays').append(tabla);
    document.getElementById('weekdays').appendChild(tabla);
    document.getElementById('weekdays').appendChild(lineBreak);

    // Opción 2: document.getElementById.innerHTML = 'Sintaxis + Valores';
    // document.getElementById('weekdays').innerHTML(tabla_string);
}