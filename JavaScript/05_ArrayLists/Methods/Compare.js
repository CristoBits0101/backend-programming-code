// Declaración.
const array = [1, "1", null, undefined, false];
 
/**
 *  - El metodo every comprueba si se cumple la condición introducida en los parámetros.
 *  - La comprobación se realiza sobre la variable, objeto etc... que le pasemos.
 *  - Devuelve true or false.
 */

// Comparar tipos.
const variable1 = array.every(valor => 
{
    if (typeof array === null) {return true;}

    else {return false}
});

const variable2 = array.every(valor => valor > 0);

// Comparar 2 listas.
const arrayA = [1, "1", null, undefined, false];
const arrayB = [1, "1", null, undefined, false];

// Función flecha a la cual le pasamos como parámetros 2 arrays a comparar.
const compareArrays = ((arrayA, arrayB) => 
{
    // Si los arrays son diferentes no lo confirmamos con true si no lo negamos con false.
    if (arrayA.length !== arrayB.length) return false

    const resultado = arrayA.every((valor, i) => 
    {
        if (valor === arrayB[i]) {return true}
        else {return false}
    });

});

console.log(compareArrays(arrayA, arrayB));