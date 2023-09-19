// Const checkErrors = código-función.
const checkErrors = value => 
{
    if (typeof value === "number") 
    {
        return 2 * value
    }

    /**
     *  - Más.
     *  - Error controlado.
     */
    throw new Error("El valor tiene que ser un numero.")
}

// Almacena el valor en un nombre constante.
const valueFinal = checkErrors("letter");

// Error porque tiene un tipo de cadena y no un número de tipo.
console.log(valueFinal);

// Opción 2.
const number = "8";

try 
{
    // Almacenar el valor en un nombre constante.
    const valueFinal = checkErrors("8");
    console.log("valueFinal");
} 

catch (e)
{
    // Aparece el mensaje Throw al imprimir el e.
    console.error(e);
    console.error("error!");
} 

finally 
{
    console.log("If you have a error try again");
}

/**
 *  - InternalError: when there are internal problems, such as when a recursive function overflows.
 *  - SyntaxError: misspelled syntax.
 *  - TypeError: when expected types are not compatible.
 *  - RangeError: it happens when accessing a position to which we do not have scope.
 *  - ReferenceError: access a data type that does not exist. 
 */