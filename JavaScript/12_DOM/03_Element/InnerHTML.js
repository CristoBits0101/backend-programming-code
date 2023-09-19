// Creamos una tabla mediante una cadena.
let table = "<Table class='table table-dark table-striped'>";

// Añadimos contenido dinámico.
table += "<tr><td>" + paises[index] + "</td></tr>";
table += "</Table>";

// La inyectamos en una zona del DOM mediante un id.
document.getElementById("pintarPaises").innerHTML = table;