// Obtén una referencia al formulario y al botón de envío.
var form = document.getElementById('formulario');
var submitButton = document.getElementById('enviar');

// Añade un controlador de eventos para el botón de envío
submitButton.addEventListener('click', (event) =>
    {
        // Valida cada uno de los campos del formulario
        if (validateForm()) 
        {
            // Si todos los campos son válidos, envía el formulario
            form.submit();
        }
    }
);

const validateForm = () =>
{
    // Almacena el estado de las validaciones.
    var success = true

    // Almacena expresiones regulares válidas en España.
    let RegExp = ''

    // Almacena los inputs que son obligatorios rellenar.
    const inputData = document.getElementsByClassName('obligatorio')

    // Comprueba si hay valores false.
    for (let index = 0; index < inputData.length; index++)
    {
        if (!Boolean(inputData[index].value))
        {
            inputData[index].placeholder = '¡Datos incorrectos!';
            success = false
        }
    }
    
    // Comprueba si el formulario paso el primer filtro.
    if (success === false)
    {
        alert('Check the form...')
    }

    // Comprueba si los caracteres introducidos en los inputs están permitidos.
    // else
    // {
    //     for (let index = 0; index < inputData.length; index++)
    //     {
    //         switch (inputData[index].id)
    //         {
    //             case 'dni':

    //                 RegExp = /^[0-9]{8}[A-Za-z]$/

    //                 if (RegExp.test(inputData[index].value))
    //                 {
    //                     inputData[index].value = ''
    //                     break
    //                 }

    //                 else
    //                 {
    //                     inputData[index].value = ''
    //                     inputData[index].placeholder = '¡Datos incorrectos!';
    //                     success = false
    //                     break
    //                 }

    //             case 'firstName':

    //                 RegExp = /^[A-Za-zÁáÉéÍíÓóÚúÜüÑñ\s]*$/

    //                 if (RegExp.test(inputData[index].value))
    //                 {
    //                     inputData[index].value = ''
    //                     break
    //                 }

    //                 else
    //                 {
    //                     inputData[index].value = ''
    //                     inputData[index].placeholder = '¡Datos incorrectos!';
    //                     success = false
    //                     break
    //                 }

    //             case 'lastName':

    //                 if (RegExp.test(inputData[index].value))
    //                 {
    //                     inputData[index].value = ''
    //                     break
    //                 }

    //                 else
    //                 {
    //                     inputData[index].value = ''
    //                     inputData[index].placeholder = '¡Datos incorrectos!';
    //                     success = false
    //                     break
    //                 }

    //             case 'email':

    //                 RegExp = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/

    //                 if (RegExp.test(inputData[index].value))
    //                 {
    //                     inputData[index].value = ''
    //                     break
    //                 }

    //                 else
    //                 {
    //                     inputData[index].value = ''
    //                     inputData[index].placeholder = '¡Datos incorrectos!';
    //                     success = false
    //                     break
    //                 }

    //             case 'tel':
                
    //                 RegExp = /^[0-9]{3}-[0-9]{7}$/

    //                 if (RegExp.test(inputData[index].value))
    //                 {
    //                     inputData[index].value = ''
    //                     break
    //                 }

    //                 else
    //                 {
    //                     inputData[index].value = ''
    //                     inputData[index].placeholder = '¡Datos incorrectos!';
    //                     success = false
    //                     break
    //                 }

    //             default:

    //                 alert('Oops! An error has occurred');
    //                 break
    //         }
    //     }
    // }

    // Retorna si el formulario ha pasado todas las validaciones.
    return success;
}