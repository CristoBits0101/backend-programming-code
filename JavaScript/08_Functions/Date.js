// Fecha y hora actual.
// Crea dos objetos Date, `ahora` y `ahora2`, que representan la fecha y hora actuales.
const ahora = new Date();
const ahora2 = new Date();

// Usando los milisegundos desde 1970.
// Crea un objeto Date que representa una fecha con 10 milisegundos desde el 1 de enero de 1970.
const diezMiliSeconds = new Date(10);

// Desde x Dias.
// Crea dos objetos Date que representan fechas específicas.
const initialDate1 = new Date("february 11 2021");
const initialDate2 = new Date(2022, 8, 7);

// Obtener datos de fecha individualmente, no puede pasar parámetros.
// Utiliza los métodos `getDay()`, `getMonth()`, `getFullYear()`, `getDate()`, `getHours()`, `getMinutes()` y `getSeconds()` para obtener datos de fecha individualmente.
const tiempo = null;

console.log(ahora.getDay());        // Devuelve el número del día de la semana, en formato numérico: 0 (Domingo), 1 (Lunes), 2 (Martes), 3 (Miércoles), 4 (Jueves), 5 (Viernes) y 6 (Sábado).
console.log(ahora.getDate());       // Devuelve el día del mes                , en formato numérico.
console.log(ahora.getMonth());      // Devuelve el número del mes             , en formato numérico: 0 (enero), 1 (febrero), 2 (marzo), 3 (abril), 4 (mayo), 5 (junio), 6 (julio), 7 (agosto), 8 (septiembre), 9 (octubre), 10 (noviembre) y 11 (diciembre).
console.log(ahora.getFullYear());   // Devuelve el año                        , en formato numérico de 4 dígitos.

console.log(ahora.getHours());      // Devuelve la hora                       , en formato numérico de 2 dígitos.
console.log(ahora.getMinutes());    // Devuelve los minutos                   , en formato numérico de 2 dígitos.
console.log(ahora.getSeconds());    // Devuelve los segundos                  , en formato numérico de 2 dígitos.

// Comparar fechas haciendo conversión a milisegundos que es obligatorio.
// Utiliza el método `getTime()` para convertir las fechas a milisegundos.
// Utiliza el operador de igualdad `==` para comparar las fechas en milisegundos.
console.log(ahora.getTime() === ahora2.getTime()); // Imprime `true` si las dos fechas son iguales.

// Fecha por país por ejemplo inglaterra.
// Utiliza el método `toLocaleDateString()` para devolver una cadena de texto que representa la fecha en el formato especificado.
console.log(ahora.toLocaleDateString("en-GB")); // Imprime la fecha en el formato inglés de Gran Bretaña.
