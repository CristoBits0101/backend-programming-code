/**
 *  - Si llama a un elemento que no existe, tendrá un tipo de fecha nulo.
 *  - Leer. 
 */
sessionlStorage.getItem();

/**
 *  - Leer una matriz u objeto.
 *  - JSON.parse convierte el resultado de JSON.stringify en objeto de JS.
 */
console.log(JSON.parse(sessionStorage.getItem("persona")));