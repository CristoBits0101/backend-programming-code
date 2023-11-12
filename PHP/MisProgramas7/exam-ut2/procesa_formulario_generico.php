<?php

<<<<<<< HEAD
    $directory = "./files/";                                            // Carpeta que va a almacenar los ficheros.

    $data = "";                                                         // Variable que recoge los datos del formulario.
    
    foreach ($_REQUEST as $field => $value)                             // Recorremos los datos del formulario.
    {
        if (isset($value) && !empty($value) && !is_array($field))       // Recogemos los campos que pasen las validaciones.
            $data .= "$field: $value\n";

        elseif (isset($value) && !empty($value) && is_array($field))    // Si una de las claves es un array cambiamos el formato de concatenación.
        {
            $data .= "$field: " . implode(', ', $value) . "\n";         // Convierte el array a una cadena y lo añade al archivo.
        }

        else                                                            // Alertamos al usuario de los erróneos en los campos.
            echo "
                <script>
                    alert('Error en campo $field no almacenado.')
                </script>";
    }

    foreach ($_FILES as $key => $file)                                  // Recorremos los datos de los ficheros.
    {
        $allowed_types = array("image/jpeg", "image/png", "image/gif"); // Validación del formato.

        if (!in_array($file['type'], $allowed_types)) 
        {
            echo "
                <script>
                    alert('
                        Error en campo $key: 
                            Tipo de archivo no permitido.
                    ')
                </script>";

            continue;                                                   // Salta a la siguiente iteración del bucle.
        }

        $max_size = 2 * 1024 * 1024;                                    // Validación del tamaño del archivo (máximo 2 MB)

        if ($file['size'] > $max_size)                                  // Validación del tamaño. 
        {
            echo "
                <script>
                    alert('
                        Error en campo $key: 
                            El archivo supera el tamaño permitido.
                    ')
                </script>";

            continue;                                                   // Salta a la siguiente iteración del bucle.
        }

        $file_name = $file["name"];                                     // Obtenemos el nombre de cada fichero.

        $data .= "$key: $directory$file_name\n";                        // Registramos la clave del campo y su ruta de almacenamiento.

        move_uploaded_file(                                             // Movemos el fichero de la ruta temporal a la ruta de ./$directory/$file_name
            $file["tmp_name"],                      
            $directory . $file_name
        );
    }                              

    $data .= "\n";

    file_put_contents("formulario_recibido.txt", $data, FILE_APPEND);   // Almacenamos los datos recibidos en el fichero de destinado.

=======
$directory = "./files/";                                            // Carpeta que va almacenar los ficheros.

$data = "";                                                         // Variable que recoge los datos del formulario.

foreach ($_REQUEST as $field => $value)                             // Recorremos los datos del formulario.

    if (isset($value) && !empty($value))                            // Recogemos los campos que pasen las validaciones.
        $data .= "$field: $value\n";
    else                                                            // Alertamos al usuario de los erróneos en los campos.
        echo "
            <script>
                alert('Error en campo $field no almacenado.')
            </script>";


// // Recorremos todos los ficheros
// foreach ($_FILES as $campo => $archivo) {
//     $nombre_archivo = $archivo["name"];
    
//     // Registramos el nombre del campo tipo file y su ubicación
//     $datos_formulario .= "$campo - $directorio$nombre_archivo\n";
//     // Movemos el fichero
//     move_uploaded_file($archivo["tmp_name"], $directorio.$nombre_archivo);
// }

// $datos_formulario .= "\n";

// // Almacenamos toda la información en el fichero
// file_put_contents("formulario_recibido.txt", $datos_formulario, FILE_APPEND);

>>>>>>> 0f1bba906fe1567462b3b47bff1714e5e8f26017
?>
