<?php
    
    $a = 5;           // Entero.
    echo gettype($a); // Imprime el tipo de dato de a.

    echo "<br>";

    $a = "Hola";      // Cambia a cadena.
    echo gettype($a); // Se comprueba que ha cambiado.

    echo "<br>";

    $valorNulo = null; // Valor nulo.
    echo $valorNulo;   // El valor nulo se muestra como vacío.
    
?>