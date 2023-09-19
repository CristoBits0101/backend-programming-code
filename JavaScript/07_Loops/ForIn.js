// Variable de soporte.
let objeto_a_iterar = 
[
    {
        name1:'Cristo', 
        name2:'Rubén', 
        apellido1:'Pérez', 
        apellido2:'Suárez'
    }
]

// Variable de soporte.
let objeto_a_iterar2 = 
{
    name1:'Cristo', 
    name2:'Rubén', 
    apellido1:'Pérez', 
    apellido2:'Suárez'
}

for (const key in objeto_a_iterar2) {
    console.log(key)
}

// let array_a_iterar = 
// [
//     'Hola', 
//     1, 
//     null, 
//     NaN, 
//     undefined, 
//     0, 
//     '3 como carácter'
// ]

/**
 *  - Muestra la posición del elemento que esta recorriendo o la clave del objeto.
 *  - El posición del objeto se almacena en la variable que hemos declarado propiedadDelObjeto.
 *  - Object.keys devuelve el objeto de la posición 0 en un array el cual luego podemos recorrer.
 *  - For in itera sobre objetos no arrays.
 */
// let propiedades = Object.keys(objeto_a_iterar[0]);

// for (let propiedad in propiedades) {
//     console.log('Soy el for in');
//     console.log(propiedad, "\n");
// }
