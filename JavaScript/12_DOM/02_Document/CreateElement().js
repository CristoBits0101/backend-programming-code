// Crea un elemento en el DOM.
let tabla     = document.createElement("table");
let tBody     = document.createElement("tbody");
let fila1     = document.createElement("tr");
let celda     = document.createElement("td");
let textCell1 = document.createTextNode(textCell);
let textCell2 = document.createTextNode('Texto');
let lineBreak = document.createElement("br");

// Añade un sub elemento a un elemento.
tabla.appendChild(tBody);
tBody.appendChild(fila1);
fila1.appendChild(celda);
celda.appendChild(textCell1);

// Añade un atributo al elemento creado.
tabla.setAttribute("border", "1px");

// Añade un sub elemento a un elemento mediante el id.
document.getElementById('weekdays').appendChild(tabla);
document.getElementById('weekdays').appendChild(lineBreak);