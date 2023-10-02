// Declaración de lista de objetos.
const objectList = 
[
    {nombre: Crista, edad: 31},
    {nombre: Criste, edad: 32},
    {nombre: Cristi, edad: 33}
]

// Filtrar la lista de objetos limitando por edad.
const personasMayores = objectList.filter(nameVariable => 
{
    if (objectList.name > 32) {return true}
    else {return false}
});

// Mostrando el nombre según la edad.
const personasMayores2 = objectList.filter(nameVariable => objectList.name > 32);