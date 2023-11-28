<?php

    function validate_data()
    {
        $errors = "";                                                                                   // Recoge los errores.

        foreach ($_REQUEST as $field => $value)                                                         // Validación de campos.
            if (!isset($value) || empty($value))
                $errors = "<p>'Error en campo $field no almacenado.</p><br/>";
    
        foreach ($_FILES as $key => $file)                                                              // Validación de ficheros.
        {
            $allowed_types = array("image/jpeg", "image/png", "image/gif", "text/plain", "application/pdf", "application/msword");
    
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

        return  $errors;
    }
