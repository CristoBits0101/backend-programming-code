// Opción 1: TODAS LAS VERSIONES DE NODE.
const obj = {
    name: 'John',
    age: 30,
    profession: 'Developer'
};

const values = Object.values(obj);

console.log(values); // Array con todos los valores del objeto.


// Opción 2: VERSIÓN 19 DE NODE EN ADELANTE.
let objeto = {
    name: 'Cristo',
    age: 30
};

// console.log(Object.value(objeto, 'name', 'default'));       // Cristo.
// console.log(Object.value(objeto, 'age', 'default'));        // 30.
// console.log(Object.value(objeto, 'email', 'default'));      // Si la propiedad no existe, devuelve el valor por defecto.
