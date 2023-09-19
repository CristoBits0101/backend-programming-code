// Declara un objeto.
const object_name1 = 
{
    ojos: "blues",
    pelo: `short`,
    edad: 17
}

// Copia un objeto con referencia = en memoria.
const object_name2 = object_name1;

// Objeto dentro de objeto con diferente referencia en memoria.
object_name2 = {...object_name1}