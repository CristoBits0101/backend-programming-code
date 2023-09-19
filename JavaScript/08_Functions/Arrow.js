// 1.1. Las funciones flecha se tienen que guardar en una variable.
const funcionFlecha1 = (parametro1, parametro2) => {console.log(parametro1, parametro2);}
 
/**
 *  - Si solo tiene un parametro en los parentesis y los corchetes de puede obtimir los () {}
 */

// 2.1. Parámetro y 1 instrucción.
const funcionFlecha2 = parametro1 => console.log(parametro1)

// 2.2. Parámetros y 1 instrucción.
const funcionFlecha3 = (parametro1, parametro2) => parametro1 + parametro2

// 2.3. Parámetros y 2 instrucción.
const funcionFlecha4 = (parametro1, parametro2) => {console.log(parametro1, parametro2);}
const funcionFlecha5 = parametro1 => {console.log(parametro1); let x = 1+1}

/**
 *  - Cuando no tiene parámetros es obligatorio los parentesis.
 */

// 3.1. Parámetros 0 y 2 instrucción.
const funcionFlecha6 = () => {console.log(parametro1); let x = 1+1}

// 3.2. Si hay un objeto dentro de las llaves, hay que encerrar las llaves entre parentesis.
const funcionFlecha7 = parametro1 => ({name: Carlos})

/**
 *  - Error: const copiaFuncion8 = funcionFlecha8(). 
 */

// 5.1. No se pueden llamar sin haberse declarado primero.
const funcionFlecha8 = parametro1 => ({name: Cristo})

// 6.1. Los mapas se utilizan a menudo con funciones de flecha para modificar los valores de la matriz.
const array3 = array.map(nameVariable => 
{
    return nameVariable * 2;
});

// 7.1. Las funciones de flecha, a diferencia de las normales, deben definirse antes.
const array4 = array.map(nameVariable => nameVariable * 2);

// 8.1. Las funciones anónimas no tienen nombre y puedes pasar el código de una función a un valor.
const array = [1, 2, 3];
const dobleValor = (valor => valor * 2);
const miValorDoble = array.map(dobleValor);