<?php

    $texto = "Hola soy Cristo Rubén Pérez Suárez, estudiante de programación.";

    echo strlen($texto);        // 67  -> Cantidad de caracteres en la variable.
    
    echo "\n";
    
    echo substr($texto, 53, 3); // pro -> Letras desde la posición 53 hasta la 56.
    
    echo "\n";

    echo strpos($texto, "i");   // 9   -> Posición de la primera i en la variable.

    echo "\n";

    echo strtoupper($texto);    // HOLA SOY CRISTO RUBéN PéREZ SUáREZ, ESTUDIANTE DE PROGRAMACIóN.

    echo "\n";

    echo strtolower($texto);    // hola soy cristo rubén pérez suárez, estudiante de programación.

    echo "\n";

    echo trim($texto);          // Elimina los espacios iniciales y finales.

    echo "\n";

    echo strrev($texto);        // Devuelve el texto invertido.

    echo "\n";

    echo str_replace(           // Remplaza todos los Cristo por Carmen en el texto.
        "Cristo",
        "Carmen",
        $texto
    );

    echo "\n";

    echo str_contains(          // Devuelve 1 que es igual a true porque el texto contiene Rubén, en caso contrario no devuelve nada.
        $texto, "Jose"
    );

    echo "\n";

    echo ltrim(                 // Elimina Cristo del texto.
        $texto, "Cristo"
    );

?>