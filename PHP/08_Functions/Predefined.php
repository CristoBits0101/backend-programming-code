<?php

    $var1 = 4;
    $var2 = null;
    $var3 = false;
    $var4 = 0;
    $var5= "";

    echo "var 1";

    var_dump(isset($var1));          // True.
    var_dump(is_null($var1));        // False.
    var_dump(empty($var1));          // False.

    echo "var 2";

    var_dump(isset($var2));          // False.
    var_dump(is_null($var2));        // True.
    var_dump(empty($var2));          // True.

    echo "var 3";

    var_dump(isset($var3));          // True.
    var_dump(is_null($var3));        // False.
    var_dump(empty($var3));          // True.

    echo "var 4";
    
    var_dump(empty($var4));          // True, El 0 como boolean es false.
    echo "unset";
    unset($var1);
    var_dump(isset($var1));          // False.

    $var5 = "inicializada";
    echo "Contenido de variable: " . 
    $var5 . 
    "<br>";
    unset($var5);                    // Elimi.nar el contenido de $var5
    echo "Contenido de variable: " . 
    $var5 . 
    "<br>";

    $varInt = 5;
    var_dump(is_int($varInt));       // True.
    var_dump(is_float($varInt));     // False.
    var_dump(is_bool($varInt));      // False.
    var_dump(is_array($varInt));     // False.
    var_dump(is_string($varInt));    // False.
    var_dump(is_double($varInt));    // False.
?>