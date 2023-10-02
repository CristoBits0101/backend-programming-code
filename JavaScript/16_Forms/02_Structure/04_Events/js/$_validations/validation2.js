function validateInput(input, type) 
{
    switch (type) 
    {
        case 'dni':
            return input.value.match(/^(\d{8})([A-Z])$/) !== null;
        case 'firstName':
            return input.value.match /^[a-zA-ZÀ-ÿ\s]{1,40}$/ !== null;
        case 'lastName':
            return input.value.match /^[a-zA-ZÀ-ÿ\s]{1,40}$/ !== null;
        case 'email':
            return input.value.match /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/ !== null;
        case 'tel':
            return input.value.match /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/ !== null;
        case 'country':
            return input.value !== 'x';
        case 'occupation':
            return input.value !== 'x';
        case 'animal':
            return input.value !== 'x';
        case 'race':
            return input.value !== 'x';
        case 'language':
            return input.value !== 'x';
        default:
            return false;
    }
}
  
function validateForm() 
{
    const inputData = document.getElementsByClassName('obligatorio');

    let success = true;

    for (let index = 0; index < inputData.length; index++) 
    {
        const input = inputData[index];

        if (!validateInput(input, input.id)) 
        {
            success = false;
            input.placeholder = '¡Datos incorrectos!';
        }
    }

    if (!success) 
    {
        alert('Check the form...');
    }
}