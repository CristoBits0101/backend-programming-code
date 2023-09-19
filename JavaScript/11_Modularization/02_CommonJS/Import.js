// Importar con CommonJS opción 1.
const dameLasFunciones = require("./Modules/ExportClass");
let   sumarDatos1      = dameLasFunciones.sumarDos(1, 2);

console.log(sumarDatos1);

/**
 *  - Importar con CommonJS opción 2.
 *  - Const + {nombre_función} + variable require. 
 */
const dameLasFunciones = require("./Modules/ExportClass");
const {sumarDos}       = dameLasFunciones;
const sumarDatos2      = sumarDos(3,4);

console.log(sumarDatos2);

// Importar con CommonJS opción 3.
const {sumarDos} = require("./Modules/ExportClass");
const sumarDatos3 = sumarDos(3,4);

console.log(sumarDatos3);