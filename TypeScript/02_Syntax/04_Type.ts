// Tipos de TypeScript.
type Producto = 
{
    precio: number,
    nombre: string,
}

// Coche implementa el tipo producto.
let coche1: Producto = 
{
    nombre: "Audi" ,
    precio: 45000,
}

console.log (`Coche: ${coche1.nombre}`) ;