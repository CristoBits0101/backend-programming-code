// Declaración.
const array = [1, 3, "a"];
const objectList = 
[
    {nombre: Crista, edad: 31},
    {nombre: Criste, edad: 32},
    {nombre: Cristi, edad: 33}
]

// Comprobar si existe con some.
const resultado1 = array.some(valor => valor.nombre === "Crista");
const resultado2 = objectList.some(valor => valor === "a");