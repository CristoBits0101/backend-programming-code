// Importar un método desde "URL".
import { sumThree } from "./Modules/ExportES6";
const sumando3 = sumThree(1, 2, 3);
console.log(sumando3);

// Importar todo en variable_name (módulos).
import * as modules from "./Modules/ExportES6";
const sum3 = modules.sumThree(3, 2 ,9);
console.log(sum3);

// Importar variable o función de flecha.
import variableName1 from "./Modules/ExportES6";
import variableName1, {book} from "./Modules/ExportES6";
console.log(variableName1, book);