// Itera sobre el objeto y llama a la función de callback especificada para cada propiedad del objeto.

/**
 *  - ForEach no retorna nada, simplemente recorre las posiciones. 
 *  - Podemos añadir una función anonima para que ejecute instrucciones.
 *  - La instrucciones se ejecuta sobre los elementos de la posición.
 *  - Hay que añadir un párametro en la función para capturar el valor del elemento.
 *  - Ha esté valor se le ejecuta una acción. 
 */

// Objeto.
const objeto = {
    name: 'Cristo',
    age: 30
};

objeto.forEach((propiedad, indice) => {
    console.log(propiedad, indice);
});

const objeto2 = {
    name: 'Cristo',
    age: 30
};

objeto2.forEach((elemento, indice) => {
    console.log(elemento.name);
});


// Array.
const array = ['hola', 'mundo', '!'];

array.forEach((elemento, indice) => {
    console.log(elemento, indice);
});


// const student = 
// {
//     name: 'Cristo',
//     courseJoined: ['Node.js', 'React'],

//     showCourses: function() 
//     {
//         this.courseJoined.forEach( course => 
//         {
//             /**
//              *  - La última posición de los ArrayList esta undefined.
//              *  - Por ese motivo hay que descontarle 1 impresión.
//              *  - Los elementos se van almacenando en course.
//              *  - Course va aumentando su logitud y cuando le falte 1.length se para.  
//              */
//             if (this.courseJoined.length !== course.length -1) 
//             {
//                 console.log(this.name + ' Joined ' + course);
//             }
//         })
//     }
// }

// student.showCourses();