function myAsynchronous(params) {
    // Código de la función.
}

/**
 *  - Necesita 2 parámetros que respeten el orden de colocación. 
 *  - Cada parámetro es una función. 
 *  - Siempre devuelve una resolución.
 *  - De lo contrario, siempre devuelve un rechazo.
 *  - Decide si un valor ingresado es válido o no.
 */
const myPromise = new Promise((resolve, reject) => {

    const i = Math.floor(Math.random() * 2);
    
    if (i !== 0) {
        resolve();
    } else {
        reject();
    }
    
});

// Se ejecuta cuando es verdadero, atrapa cuando es falso y siempre se ejecuta.
myPromise
    .then(() => console.log("Ejecución correcta"))
    .catch(() => console.log("Error en la ejecución"))
    .finally(() => console.log("Siempre se ejecuta"));