<?php 

    require_once "../files/write_file.php";                                 // Importamos el script de escritura en ficheros.
    require_once "../files/save_file.php";                                  // Importamos el script de almacenamiento de ficheros.

    function process_file()
    {
        $data = "";                                                         // Recoge los datos.
        $destinationData = "../files/form_data.txt";                        // Fichero donde se va a escribir los datos.
        $uploadDirectory = "..\\files\\form_files\\";

        foreach ($_REQUEST as $field => $value)                             // Recorremos los datos de los campos.
        {
            if (isset($value) && !empty($value) && !is_array($value))       // Si se puede obtener los datos se almacenan en la variable temporal.
                $data .= "$field: $value\n";
    
            elseif (isset($value) && !empty($value) && is_array($value))    // Si se puede obtener los datos se almacenan en la variable temporal.
                $data .= "$field: " . implode(', ', $value) . "\n";
        }
    
        foreach ($_FILES as $key => $file)                                  // Recorremos los datos de los ficheros.
        {
            $data .= $key . ': ' . '/files/' . $file["name"] . "\n";        // Si se puede obtener los datos se almacenan en la variable temporal.

            $temporalDirectory = $file["tmp_name"];                         // Directorio temporal.
            $finalDirectory = $uploadDirectory . $file["name"];             // Directorio final.
            save_file($temporalDirectory, $finalDirectory);                 // Mueve el archivo del directorio temporal al directorio final.
        }
    
        $data .= "\n";                                                      // Añade un salto de línea en el fichero entre diferentes formularios.
    
        write_file($destinationData, $data);                                // Almacenamiento de datos.
    }
