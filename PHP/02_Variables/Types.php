<?php

    // Las constantes de PHP deben ser valores escalares, es decir, valores que no son objetos, arreglos o funciones. 
    // En este caso, el valor de la constante es una cadena de caracteres con espacios, lo que la convierte en un objeto.
    define("LIMITE", 1000);  // Constantes.
    echo "<p>El limite es: " . LIMITE . "</p>";

    $bool = True;            // Tipo booleano.
    
    $_entero = 3;            // Tipo integer.
    $numeroEntero = 4;       // Tipo integer.
    $numero = 4.5;           // Tipo coma flotante.
    $cadena = "cadena";      // Tipo cadena de caracteres.

    echo "<p>";              // Abrimos un párrafo.
    echo $numeroEntero;      // Imprimimos la variable numeroEntero.
    echo "<br />";           // Salto de línea en HTML.
    echo $numero . "<br />"; // Añadimos un salto de línea a la variable numero.
    print($cadena);          // Imprimimos la variable con el comando print.
    echo "<br />";           // Salto de línea en HTML.

    echo                     // Combinación de cadenas de caracteres.
    ' '
    . $cadena .
    " otra cadena $cadena"
    . $numero .
    "<br />";
    
    echo "</p>";             // Fin de párrafo.

?>