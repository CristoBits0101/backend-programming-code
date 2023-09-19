// Declaración.
let array = [1, 2, 3, 4, 6, 7];

/**
 *  - La matriz se almacena por igual en las variables a y b y desde allí se manipula el orden.
 *  - El arreglo se almacena por igual en las variables a y b ya partir de ahí se manipula el orden.
 *  - Funciona para listas y objetos. 
 */
array.sort((a, b)=>
{
    return a -1;
});

array.sort((a, b) => 
{
    if      (a > b) {return -1}
    else if (a > b) {return +1}

    // a === b
    else {return 0}
});

array.sort((a, b) => a - b);
array.sort((a, b) => b - a);