<?php

    // Paso 1) Importar la clase.
    require_once('Clase.php');

    // Paso 2) Instanciar la clase.
    $builder = new Clase_Nombre("Cristo", 34);

    // Paso 3) acceso a los atributos de la clase.
    echo $builder->nombre . ' ';
    
    echo 'print_r ';
    print_r($builder);

    echo 'var_dump ';
    var_dump($builder->nombre);

?>
