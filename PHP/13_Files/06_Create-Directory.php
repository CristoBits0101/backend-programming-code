<?php

    if (!file_exists($directoryPath)) 
    {
        $create = mkdir($directoryPath, 0777, true);

        $create                                                       ? 
        '¡Directorio creado correctamente!'                           : 
        throw new Exception('¡ERROR! (al intentar crear directorio).');
    }

    else 
    {
        echo "¡El directorio ya existe!";
    }
    
?>