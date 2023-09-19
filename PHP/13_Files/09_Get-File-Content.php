<?php

    $fichero = fopen($ruta, "r");

    if ($fichero === false) 
    {
        echo "No se encuentra el fichero '" . $ruta . "'<br>";
    } 
    
    else 
    {
        echo "El fichero '" . $ruta . "' se abrió correctamente <br>";

        $contenidoFicheroTexto = file_get_contents($ruta);
    }

    fclose($fichero);

    return $contenidoFicheroTexto;
    
?>