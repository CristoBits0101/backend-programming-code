<?php

   // Funciones lista.

    // Declaramos un array de números.
    $arrayNumeros = [1, 2, 3, 4, 5];

    // Usamos la función list() para asignar los valores del array a las variables a, b y c.
    list($a, $b, $c) = $arrayNumeros;

                // Imprimimos los valores de las variables a y b.
    echo $a;    // Imprime 1.
    echo $b;    // Imprime 2.

    // Explode, crea un array nuevo a partir de una string, mediante el uso de un separador definido.
    $frase1 = "Hola que tal como va eso";
    $arrayPalabras1 = explode(" ", $frase1);
    var_dump($arrayPalabras1);

    $frase2 = "Hola,que,tal,como,va,eso";
    $arrayPalabras2 = explode(",", $frase2);
    var_dump($arrayPalabras2);

    echo "<hr>";

    // Implode, crea una string a partir de un array de strings, mediante el uso de un separador.
    $arrayPalabras3 = ['hola', 'que', "tal", 'como', 'va', "eso"];
    $unionPalabras3 = implode(":", $arrayPalabras3);
    var_dump($unionPalabras3);

    echo "<hr>";

    // Encontrar una string dentro de un array.
    if (in_array("tal", $arrayPalabras3)) 
    {
        echo "La palabra 'tal' se encuentra dentro del array";
    } 
    
    else 
    {
        echo "La palabra 'tal' no se encuentra dentro del array";
    }

    if (in_array("juan", $arrayPalabras3)) 
    {
        echo "La palabra 'juan' se encuentra dentro del array";
    } 
    
    else 
    {
        echo "La palabra 'juan' no se encuentra dentro del array";
    }

    echo "<hr>";

    // Eliminar un elemento dentro de un array.
    $arrayPalabras4 = ['hola', 'que', "tal", 'como', 'va', "eso"];

    // Eliminamos el elemento 'que'.
    unset($arrayPalabras4[1]); 

    print_r($arrayPalabras4);

    // Cuidado con no poner un indice o clave porque se borra por completo el array.
    // unset($arrayPalabras4); 

    print_r($arrayPalabras4);

    echo "<hr>";

    // Función random, nos da un valor entre 1 y 100.
    $random1 = rand(1, 100);
    echo $random1;

    echo "<hr>";

    // Función max, da el valor más alto entre $dato1 y $dato2.
    $numeros = [1,2,4,44,55,0,23,-1,-5,-75];
    $dato1=5;
    $dato2=3;
    echo max($dato1,$dato2);
    echo max($numeros);

    echo min($dato1, $dato2);
    echo min($numeros);

    echo "<hr>";

    // Longitud de una string.
    $palabra = "Hola";
    $longitudPalabra = strlen($palabra);
    echo $longitudPalabra;

    echo "<hr>";

    // Convierte un string a minúsculas.
    $fraseMayusculasMinusculas = "HoLA Que TAL como va ESO";

    echo strtolower($fraseMayusculasMinusculas);

    echo "<hr>";

    // Convierte un string a mayúsculas.
    echo strtoupper($fraseMayusculasMinusculas);

    echo "<hr>";
    
?>