<?php

    $data = "";                                                                                     // Recoge los datos.
    $errors = "";                                                                                   // Recoge los errores.

    foreach ($_REQUEST as $field => $value)                                                         // Validación de campos.
        if (!isset($value) || empty($value))
            $errors = "<p>'Error en campo $field no almacenado.</p><br/>";

    foreach ($_FILES as $key => $file)                                                              // Validación de ficheros.
    {
         // Tipos.
         $allowed_types = array(
            "image/jpeg",                                                               // JPEG
            "image/png",                                                                // PNG
            "image/gif",                                                                // GIF
            "application/pdf",                                                          // PDF
            "text/plain",                                                               // TXT
            "application/octet-stream",                                                 // CFG
            "application/msword",                                                       // DOC
            "application/vnd.openxmlformats-officedocument.wordprocessingml.document"   // DOCX
        );

        if (!in_array($file['type'], $allowed_types))                                               // Validación del formato.
        {
            $errors .= "<p>Error en campo $key: Tipo de archivo no permitido.</p><br/>";
            continue;
        }

        $max_size = 2 * 1024 * 1024;

        if ($file['size'] > $max_size)                                                              // Validación del tamaño.
        {
            $errors .= "<p>Error en campo $key: El archivo supera el tamaño permitido.</p><br/>";
            continue;
        }
    }

    if (empty($errors))                                                                             // Comprobación de errores.
    {
        foreach ($_REQUEST as $field => $value)
        {
            if (isset($value) && !empty($value) && !is_array($value))
                $data .= "$field: $value\n";

            elseif (isset($value) && !empty($value) && is_array($value))
                $data .= "$field: " . implode(', ', $value) . "\n";
        }

        foreach ($_FILES as $key => $file)
        {
            $data .= $key . ': ' . '/files/' . $file["name"] . "\n";
            move_uploaded_file($file["tmp_name"], "./files/" . $file["name"]);                      // Almacenamiento de ficheros.
        }

        $data .= "\n";

        file_put_contents("formulario_recibido.txt", $data, FILE_APPEND);                           // Almacenamiento de datos.
    }

    else
        echo $errors;                                                                               // Comunicación de errores.

?>
