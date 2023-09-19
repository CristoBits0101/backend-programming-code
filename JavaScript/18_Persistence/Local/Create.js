/**
 *  - Crear un nuevo almacenamiento local.
 *  - La columna uno tiene la clave y la columna dos tiene el valor.
 *  - Crear. 
 */
localStorage.setItem("nombre","Cristo");
localStorage.setItem("nombre","Rubén");

console.log("nombre");

/**
 *  - Crear nuevos registros con arreglos u objetos.
 *  - JSON.stringify convierte una matriz u objeto en una cadena.
 */
localStorage.setItem("persona", JSON.stringify({nombre:"Cristo", apellido: Suárez}));