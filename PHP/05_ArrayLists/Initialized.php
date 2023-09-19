<?php

    $arr1 = array(10, 20, 30, 40); // Inicialización manual de valores.
    print_r($arr1);                // Impresión de valores.
    echo "<br>";                   // Salto de línea.

    $arr1[] = 5;                   // Asignación de valor sin indicar posición se añade al final.
    print_r($arr1);                // Impresión de valores.
    echo "<br>";                   // Salto de línea.

    $arr1[10] = 6;                 // Asignación de valor indicando la posición.
    $arr1[11] = 5;                 // Asignación de valor indicando la posición.
    print_r($arr1);                // Impresión de valores.
    echo "<br>";                   // Salto de línea.

?>