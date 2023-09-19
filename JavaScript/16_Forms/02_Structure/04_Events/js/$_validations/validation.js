const validation = () => 
{
    const validateForm  = () =>
    {
        // let   success   = true
        // let   RegExp    = ''
        const inputData = document.getElementsByClassName('obligatorio')

        for (let index = 0; index < inputData.length; index++)
        {
            if (Boolean(inputData[index].value) === false) {inputData[index].placeholder = '¡Datos incorrectos!'; success = false}

            else
            {
                switch (inputData[index].id)
                {
                    case 'dni'       : RegExp = /^(\d{8})([A-Z])$/

                                    if     (RegExp.test(inputData[index].value) === false) {inputData[index].value = ''  }
                                    else   {inputData[index].placeholder = '¡Datos incorrectos!'; success = false        } break
                        
                    case 'firstName' : RegExp = /^[a-zA-ZÀ-ÿ\s]{1,40}$/

                                    if     (RegExp.test(inputData[index].value) === false) {inputData[index].value = ''  }
                                    else   {inputData[index].placeholder = '¡Datos incorrectos!'; success = false        } break

                    case 'lastName'  : RegExp = /^[a-zA-ZÀ-ÿ\s]{1,40}$/

                                    if     (RegExp.test(inputData[index].value) === false) {inputData[index].value = ''  }
                                    else   {inputData[index].placeholder = '¡Datos incorrectos!'; success = false        } break


                    case 'email'     : RegExp = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/

                                    if     (RegExp.test(inputData[index].value) === false) {inputData[index].value = ''  }
                                    else   {inputData[index].placeholder = '¡Datos incorrectos!'; success = false        } break

                    case 'tel'       : RegExp = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/

                                    if     (RegExp.test(inputData[index].value) === false) {inputData[index].value = ''  }
                                    else   {inputData[index].placeholder = '¡Datos incorrectos!'; success = false        } break

                    case 'country'   : if     (inputData[index].value !== 'x') {alert('Country not selected'              )}; break
                    case 'country'   : if     (inputData[index].value !== 'x') {alert('Country not selected'              )}; break
                    case 'occupation': if     (inputData[index].value !== 'x') {alert('Occupation not selected'           )}; break
                    case 'animal'    : if     (inputData[index].value !== 'x') {alert('Animal not selected'               )}; break
                    case 'race'      : if     (inputData[index].value !== 'x') {alert('Race not selected'                 )}; break
                    case 'language'  : if     (inputData[index].value !== 'x') {alert('Language not selected'             )}; break
                
                    default: alert('Oops! An error has occurred'); break
                }
            }
        }

        if (success === false) {alert('Check the form...')}
    }
}