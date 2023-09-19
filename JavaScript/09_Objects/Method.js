// Los set son array que no pueden tener elementos repetidos.
const array = [1, 3, 2];

// Valores únicos que no están ordenados.
const mySet = new Set(array);

// Añadir.
mySet.add(3);

// Borrar.
mySet.delete("pepa")

// Borrar todos los datos.
mySet.clear();

// Saber si incluir un dato y devolver un verdadero o falso.
mySet.has(3);

// Conocer la longitud del conjunto y devolver un verdadero o falso.
mySet.size();

// Conjunto de impresión.
for (let index = 0; index < array.length; index++) {const element = array[dex];}

array.forEach(element => {});

const mySet2 = mySet.values();

// Convertir el conjunto en matriz.
const array2 = [...mySet];