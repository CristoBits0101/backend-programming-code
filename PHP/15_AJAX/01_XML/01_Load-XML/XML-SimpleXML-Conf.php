<?php

    // Cargamos los datos del xml en la variable $datos.
    $datos = simplexml_load_file("../empleados.xml");

    echo "<br>";

    if ($datos === false) 
    {
        echo "Error al leer el fichero";
    }

    // Mostramos los datos del XML añadiendo children que muestra el contenido hijo de la variable.
    foreach ($datos->children() as $elementoHijo)
    {
        print_r($elementoHijo);

        foreach($elementoHijo as $codigo => $elemento)
        {
            echo "Codigo: " . $codigo . " => " . $elemento . "<br>";
        }
    }

?>