<?php

    $arr1 = array(
        "Viernes" => 22,
        "Sábado" => 34
    );

    // No modifica el array.
    foreach ($arr1 as $cantidad) 
    {
        $cantidad = $cantidad * 2;
        
    }

    echo $cantidad."<br>";

    print_r($arr1);

    echo "<br>";

    /**
     *  - Modifica el array.
     *  - Al multiplicar por 2 el valor de: &$cantidad que almacena la clave => valor.
     *  - Como esta copiando la dirección de memoria del original se modifica los valores originales.
     *  - Seguiera afectandole todo lo que le hayas hecho por el camino pero con los nuevos valores.
     *  - Cambiamos el valor con el que se inicializa.  
     */
    foreach ($arr1 as &$cantidad) 
    {
        $cantidad = $cantidad * 2;
    }
    
    echo $cantidad."<br>";
    
    print_r($arr1);
    
?>