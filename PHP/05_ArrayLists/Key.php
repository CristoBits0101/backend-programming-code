<?php

    $arr1 =         // Array de 1 dimensión.
    [               
        0 => 444,   // Definido con clave => valor manualmente.
        1 => 222,
        2 => 333,
    ];

    $arr1[0] = 555; // Cambio de valor del array especificando la clave.

    print_r($arr1); // Impresión del array mendiante la función print_r.

    echo            // Impresión del array añadiendole etiquetas HTML.
        "<br>"    .
        "pos 0: " .
        $arr1[0]  .
        "<br>"    ;

?>