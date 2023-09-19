<?php

    // Las cookies pueden contener una matriz de elementos.
    $matriz["primeraClave"] = "Primer elemento";
    $matriz["segundaClave"] = 1;
    $matriz["terceraClave"] = true;

    setcookie("matrizElementos", serialize($matriz), 0);

    // Nos dará error al no tratarse de un texto.
    echo $_COOKIE["matrizElementos"];

    var_dump($data);

?>