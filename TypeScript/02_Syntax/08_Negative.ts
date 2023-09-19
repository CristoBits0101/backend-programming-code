/**
 *  - Ellos siempre son tratados como valores falsos:   
 *      1. 0         (Tipo de dato numérico   ).
 *      2. false     (Tipo de dato booleano   ).
 *      3. null      (Tipo de dato nulo       ).
 *      4. empty     (Carácter vacío          ).
 *      5. undefined (Variable no inicializada).
 */

let error3 = 0;

if (error3) 
{
    console.log('Hay error');
}

else 
{
    console.log('No hay error');
}