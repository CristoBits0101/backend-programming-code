// Crear un conjunto
const miSet = new Set();

// Agregar elementos al conjunto
miSet.add(1);
miSet.add(2);
miSet.add(3);
miSet.add(2); // No se agregarán duplicados

console.log(miSet); // Resultado: Set { 1, 2, 3 }

// Verificar si un elemento existe en el conjunto
console.log(miSet.has(2)); // Resultado: true
console.log(miSet.has(4)); // Resultado: false

// Eliminar un elemento del conjunto
miSet.delete(3);
console.log(miSet); // Resultado: Set { 1, 2 }

// Obtener el tamaño del conjunto
console.log(miSet.size); // Resultado: 2

// Iterar a través de los elementos del conjunto
miSet.forEach((valor) => {
  console.log(valor);
});

// Resultado:
// 1
// 2
