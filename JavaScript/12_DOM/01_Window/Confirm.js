/**
 *  - Se solicita mediante el prompt el número de valores a sumar.
 *  - Validar si son números cada uno de los elementos que introduce.
 *  - Hacer la suma si todo es correcto.
 *  - Se solicita mediante el promt 10 números y nos indique cual es el mayor. 
 */
function saludar()
{
    alert("Hello");                                     // 1. Alerta hola.

    let age = prompt ('¿Cuántos años tienes?', 100);    // 2. Pregunta los años y almacena 100.
    alert(`Tienes ${age} años!`);                       // 3. Tienes 100 años!

    let isBoss = confirm("¿Eres el jefe?");
    alert(isBoss);                                      // 4. Alerta true si se pulsa ok.
}