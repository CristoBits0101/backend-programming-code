<?php

    function validate_files()
    {
        // Array con los formatos permitidos y tamaños máximos.
        $validations =
        [
            // File 1, 1 MB.
            [   'name'     => 'fichero1',
                'formats'  => ['txt', 'pdf', 'docx', 'xlsx', 'pptx', 'odt'],
                'max_size' => 1024 * 1024 * 1
            ],
            // File 2, 1 MB.
            [
                'name'     => 'fichero2',
                'formats'  => ['txt', 'pdf', 'docx', 'xlsx', 'pptx', 'odt'],
                'max_size' => 1024 * 1024 * 1
            ],
            // Foto 1, 1 MB.
            [
                'name' => 'foto', 
                'formats' => ['jpg', 'png', 'gif'], 
                'max_size' => 1024 * 1024 * 1
            ],
        ];

        // Iteramos a través de las validaciones para cada archivo.
        foreach ($validations as $validation)
        {
            $field = $validation['name'];

            // Verificamos si el archivo está definido y no está vacío.
            if (!isset($_FILES[$field]) || empty($_FILES[$field])) 
            {
                throw new Exception("Archivo '$field' no encontrado.");
            }

            // Obtenemos información sobre el archivo.
            $fileInfo = $_FILES[$field];
            $fileName = $fileInfo['name'];
            $fileError = $fileInfo['error'];
            $fileSize = $fileInfo['size'];

            // Verificamos si hubo un error al cargar el archivo.
            if ($fileError !== UPLOAD_ERR_OK) 
            {
                throw new Exception("Error al cargar el archivo '$field'. Código de error: $fileError");
            }

            // Verificamos si el archivo está vacío o es demasiado pequeño.
            if ($fileSize < 1024) 
            {
                throw new Exception("El archivo '$field' está vacío o es demasiado pequeño.");
            }

            // Obtenemos la extensión del archivo.
            $fileExtension = pathinfo($fileName, PATHINFO_EXTENSION);

            // Verificamos si la extensión del archivo no es válida.
            if (!in_array($fileExtension, $validation['formats'])) 
            {
                throw new Exception("El archivo '$field' tiene una extensión no válida.");
            }

            // Verificamos si el tamaño del archivo excede el tamaño máximo permitido.
            if ($fileSize > $validation['max_size']) 
            {
                throw new Exception("El archivo '$field' excede el tamaño máximo permitido.");
            }
        }

        // Si todas las validaciones son exitosas, mostramos un mensaje de éxito.
        echo '¡Contenido del formulario! ✅<br/><br/>';

        return true;
    }

?>
