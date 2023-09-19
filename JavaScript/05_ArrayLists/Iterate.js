// Iterar la lista usando for.
for (let index = 0; index < array.length; index++) 
{
    const element = array[index];
}

// Iterar la lista usando foreach.
array.forEach(element => {});

// Iterar la lista de objetos.
const objectList = 
[
    {nombre: Crista, edad: 31},
    {nombre: Criste, edad: 32},
    {nombre: Cristi, edad: 33}
]

const option1 = objectList.find(nombreVariable => 
{
        if (nombreVariable.nombre === "Crista") {return true;}
});

const option2 = objectList.find(nombreVariable => 
{
        return nombreVariable.nombre === "Crista";
});

const option3 = objectList.find(nombreVariable => nombreVariable.nombre === "Crista");

// Busque el valor de un atributo por el valor de otro atributo.
const {edad} = objectList.find(nombreVariable => nombreVariable.nombre === "Crista"); 