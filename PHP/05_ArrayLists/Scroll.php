<?php

    // Una dimensión.
    $numeros = [1, "dos", 3, '5', 6, "siete"];

    foreach ($numeros as $numero) 
    {
        echo "$numero<br>";
    }

    for ($i = 0; $i < count($numeros); $i++) 
    {
        echo "$numeros[$i]<br>";
    }

    // Clave-valor.
    $arrayPersonas = array(
        "1111B" => "Juan Vera Ochoa",
        "1c12A" => "Maria Mesa Cabeza",
        "11a3A" => "Ana Puertas Peral"
    );

    foreach ($arrayPersonas as $clave => $valor) 
    {
        echo $valor . "<br>";
    }

    // No se puede recorrer debido a que no podemos determinar los valores mediante claves numéricas.
    /*
    for ($i = 0; $i < count($arrayPersonas); $i++) 
    {
        echo $arrayPersonas[$i];
    }
    */

    // Dos dimensiones.
    foreach ($animal as $anim1) 
    {
        foreach ($anim1 as $valor) 
        {
            echo "$valor <br>";
        }
    }

    for ($i = 0; $i < count($animal); $i++) 
    {
        for ($j = 0; $j < count($animal[$i]); $j++) 
        {
            echo $animal[$i][$j] . "<br>";
        }
    }

    // Tres dimensiones.
    foreach ($animal3 as $dim1) 
    {
        foreach ($dim1 as $dim2) 
        {
            foreach ($dim2 as $valor) 
            {
                echo "$valor <br>";
            }
        }
    }

?>