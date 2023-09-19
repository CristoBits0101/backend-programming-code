<?php

    $arr2 = array(                        // Array de 1 dimensión.
        "1111A" => "Juan Vera Ochoa",     // Definido con clave => valor manualmente.
        "1112A" => "Maria Mesa Cabeza",
        "1113A" => "Ana Puertas Peral"
    );
                                          // Recorrer un array de clave      => valor con foreach.
    foreach ($arr2 as $clave => $valor)   // nombre_array as $clave_variable => $valor_variable.
    { 
        echo $clave." - ".$valor."<br>";  // Las variables declaradas afectan al valor del array.
    }

    $arr2["1113A"] = "Ana P. Segundo";    // Cambio de valor del array especificando la clave.

?>