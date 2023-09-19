// Declaración.
const objectList = 
[
    {nombre: Crista, edad: 31},
    {nombre: Criste, edad: 32},
    {nombre: Cristi, edad: 33}
]

/**
 *  - Todas las variables almacenan la lista u objeto.
 *  - Se pueden combinar para hacer una lista u objeto final. 
 */
const personasMayores2 = objectList.reduce(
    (value1, value2, value3, value4) => 
    {
        return value1 + value2
    }
);