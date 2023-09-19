// Declaración.
const lista1 = [1, "1", null, undefined, false];
const lista2 = new Array(1, "1", null, undefined, false);
const lista3 = new Array();

// Unir con concat.
lista3 = lista1.concat(lista2);

// Unir listas utilizando el factor de dispersión.
let lista4 = [...lista1, ...lista2];

// Unir listas en dos posiciones diferentes en una matriz.
let lista5 = [lista1, lista2];

const array1 = [1, 234, 'nbdsfxg3'];

// Concatenar un valor a posiciones.
const array2 = array.map( nameVariable => 
{
    return array.concat(" l");
});

// Agregando un valor como prefijo.
const array3 = array.map( nameVariable => 
{
    return `1 - ${nameVariable}`;
});

// Agregar un valor como prefijo con index.
const array4 = array.map((nameVariable, index) => {return `${index} - ${nameVariable}`;});
const array5 = array.map((nameVariable, index) => `${index + 1} - ${nameVariable}`);