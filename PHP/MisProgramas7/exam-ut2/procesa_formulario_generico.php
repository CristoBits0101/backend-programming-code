<?php

$directory = "./files/";                                            // Carpeta que va almacenar los ficheros.

$data = "";                                                         // Variable que recoge los datos del formulario.
print_r($_REQUEST);
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

?>
