// Declaración.
let array = new Array();

// Añadir un valor al final.
array.push('I am the new value');

// Agregar un valor inicial.
array.unshift('I am the new value');

// Eliminar un valor al final.
array.pop();

// Borra un valor el inicial.
array.shift();

// Eliminar datos con splice1. donde inicio, 2 valores para eliminar.
array.shift(2, 1);

// Agregar datos con splice1. donde inicio, 2 -> 0, 3 valor.
array.shift(2, 0, "add");

// Reemplazar datos con splice1. donde inicio, 2 -> 0, 3 posición a reemplazar, 4 datos.
array.shift(2, 0, 1, "replace");

// Búsqueda.
let part1 = array.slice(2, 3); 
console.log(part1);