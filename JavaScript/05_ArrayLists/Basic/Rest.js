// Permite pasar diferente cantidad de parámetros a la función y lo guarda en un array, el tamaño depende de la memoria del navegador.
function sum(...numbers) {
  return numbers.reduce((a, b) => a + b, 0);
}

const numbers = [1, 2, 3, 4, 5];

console.log(sum(...numbers)); // output: 15
