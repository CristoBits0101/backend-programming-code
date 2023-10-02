// Declaración.
const array = [1, 3, "a"];

const objectList = 
[
    {nombre: Crista, edad: 31},
    {nombre: Criste, edad: 32},
    {nombre: Cristi, edad: 33}
]

// El método some() del array recorre el array y llama a la función de prueba especificada como argumento para cada elemento del array. 
// Si la función de prueba devuelve true para al menos un elemento del array, el método some() devuelve true. En caso contrario, el método some() devuelve false.
const resultado1 = array.some(valor => valor.nombre === "Crista");
const resultado2 = objectList.some(valor => valor === "a");