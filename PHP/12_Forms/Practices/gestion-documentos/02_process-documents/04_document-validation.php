<?php

    // Paso 4.1) Comprueba los archivos que nos llegan al servidor.
    function check_files ()
    {
        /**
         * VALIDACIÓN DE CANTIDAD DE FICHEROS.
         */

        // Paso 4.2) Comprueba que se ha enviado un archivo como mínimo.
        if 
        (
            $_FILES['fichero1']['size'] < 1 &&
            $_FILES['fichero2']['size'] < 1 &&
            $_FILES['fichero3']['size'] < 1 
        ) 
        {
            throw new Exception("¡ERROR! (Se debe enviar un archivo al menos).");
        }

        else 
        {
            echo '¡Cantidad de archivos enviados al menos uno! ✅<br/><br/>';
        }

        /**
         * VALIDACIÓN DE CANTIDAD DE EXTENSIONES SELECCIONADAS MEDIANTE EL VALOR DE UN NAME TIPO ARRAY.
         */

        // Paso 4.3) Comprobar que se ha seleccionado alguna extensión mediante un arreglo que guarda las respuestas.
        if 
        (
            !isset($_REQUEST['extensiones'])
        ) 
        {
            throw new Exception("¡ERROR! (se debe seleccionar una extensión al menos).");
        }

        else 
        {
            echo '¡Extensión de archivos al menos una seleccionada! ✅<br/><br/>';
        }

        /**
         * VALIDACIÓN DEL FORMATO DE LOS ARCHIVOS.
         */

        // Paso 4.4) Guardamos en un array los formatos permitidos.
        $allowed_formats = array('txt','pdf','docx','xlsx','pptx','odt');

        // Paso 4.5) Comprobar que los archivos cumplen un estándar de almacenamiento.
        for ($index = 1; $index < 3; $index++) 
        {
            if ($_FILES['fichero'.$index]['size'] > 0) 
            {
                // Paso 4.6) Capturamos la extensión de los archivos enviados.
                $extension = pathinfo($_FILES['fichero'.$index]['name'], PATHINFO_EXTENSION);

                // Paso 4.7) Comprobamos que la extensión del archivo está permitida según el array.
                if(!in_array($extension, $allowed_formats)) 
                {
                    throw new Exception("¡ERROR! (hay un fallo con el archivo enviado, verifique si el formato es de tipo 'txt','pdf','docx','xlsx','pptx','odt').");
                }

                // Paso 4.8) Comprobamos si los archivos vienen con errores o con un tamaño superior al permitido.
                if 
                (
                    $_FILES['fichero'.$index]['error'] === true            ||
                    $_FILES['fichero'.$index]['size']   >  1024 * 1024 * 1          
                )
                {
                    throw new Exception("¡ERROR! (el archivo contiene un error o el tamaño es superior al permitido).");
                }
            }
        }

        echo '¡El formato de los archivos está correcto! ✅<br/><br/>';

        echo '¡El tamaño de archivo está correcto! ✅<br/><br/>';

        /**
         * 
         */
        // Paso 4.9) Si una de las ext almacenadas no es incluida al menos por uno de los archivos, lanzamos un error.
        $extension1 = pathinfo($_FILES['fichero1']['name'], PATHINFO_EXTENSION);
        $extension2 = pathinfo($_FILES['fichero2']['name'], PATHINFO_EXTENSION);
        $extension3 = pathinfo($_FILES['fichero3']['name'], PATHINFO_EXTENSION);
        foreach ($_REQUEST['extensiones'] as $comparar) 
        {
            if 
            (
                $comparar != $extension1 &&
                $comparar != $extension2 &&
                $comparar != $extension3
            ) 
            {
                throw new Exception("¡ERROR! (hay un error con la extensión seleccionada y el archivo enviado).");
            }
        }

        echo '¡Las extensiones seleccionadas coinciden con los archivos enviados! ✅<br/><br/>';

        // Paso 4.10) Retornamos true si todas las comprobaciones están correctas.
        return true;
    }

?>