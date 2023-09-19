/**
 *  - Crea un nuevo almacenamiento local.
 *  - La columna uno tiene la clave y la columna dos tiene el valor.
 *  - Crear.
 */
sessionStorage.setItem("nombre","Cristo");
sessionStorage.setItem("nombre","Rubén");

console.log("nombre");

/**
 *  - Crea nuevos registros con arreglos u objetos.
 *  - JSON.stringify convierte una matriz u objeto en una cadena.
 */
sessionStorage.setItem("persona", JSON.stringify({nombre:"Cristo", apellido: Suárez}));