let a = 1;                      // Declaración.
let b = 0.111111;               // Declaración.
let c = 9.2323;                 // Declaración.

console.log(Math.round(a + b)); // Redondear operaciones con decimales.

console.log(Math.round(a - b)); // Cantidad de ceros que imprimen falla.

console.log(c.toPrecision(3));  // Limitar recuento por longitud de cadena de tipo de números.

console.log(c.toFixed(2));      // Limita a 2 decimales o los añade y convierte todo a cadena.