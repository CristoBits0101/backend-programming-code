<?php

    require_once "../validations/validate_data.php";    // Valida los datos.
    require_once "./process_file.php";                  // Procesa los ficheros.

    $errors = validate_data();                          // Llama a la función validate_data y guarda los errores en la variable $errors.

    if (empty($errors) && isset($_REQUEST['fileForm'])) // Comprobación de errores.
        process_file();                                 // Almacena los datos en el archivo si no hay errores.
    else
        echo $errors;                                   // Comunicación de errores.
