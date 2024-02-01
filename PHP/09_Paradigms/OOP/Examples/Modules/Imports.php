<?php

    /**
     *  - Cuando ocurre un error, avisa y continúa ejecutándose.
     *  - Se usa cuando el archivo no es necesario para la ejecución del programa.  
     */
    include "ArchivoRequerido.php"; // Indica necesita el archivo.

    /**
     *  - Cuando ocurre un error, avisa y no continúa ejecutándose.
     *  - Se usa cuando el archivo es necesario para la ejecución del programa.
     *  - Esto incluye los archivos de las bases de datos específicamente.
     */
    require "ArchivoRequerido.php"; // Indica necesita el archivo.

    /**
     *  - A veces el código es muy largo y llama los archivos varias veces.
     *  - Con esto nos aseguramos que las llamadas a los archivos sea una sola vez. 
     */
    include_once "ArchivoRequerido.php"; // Indica necesita el archivo una vez.
    require_once "ArchivoRequerido.php"; // Indica necesita el archivo una vez.

    $a = "Variable del principal";

?>