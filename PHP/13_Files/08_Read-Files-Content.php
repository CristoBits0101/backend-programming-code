<?php

    $fichero = fopen($ruta, "r");

    if ($fichero)
    {
        while ($linea = fgets($fichero))
        {
            if (feof($fichero)) 
            {
                break;
            }
    
            echo $linea . "<br/>";
        }
    }
    
    else 
    {
        echo "No se encuentra el fichero '" . $ruta . "'<br>";
    }
    
?>