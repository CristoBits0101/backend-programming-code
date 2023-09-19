<?php

    // 1. Cargar la clase usuario.
    require "./02_SubUser-Class.php";

    // 2. Coger el contenido del fichero.
    $getFileContent = file_get_contents($ruta);             

    // 3. Dividir el contenido en un array a partir de cada #
    $vectorContent = explode('#', $getFileContent);

    // 4. Comprobar si el usuario existe en el array.
    if(in_array($vectorContent, $_REQUEST('userName')))
    {
        // 5. Si el usuario existe en el array contamos la longitud del array.
        $arrayLength = count($vectorContent);

        // 6. Recorremos el array.
        for ($i = 0; $i < $arrayLength; $i++) 
        {
            // 7. Comprobamos si el usuario existe en la String de la línea.
            if (str_contains($contentLine[$i], $_REQUEST('userName')))
            {
                // 8. Como el usuario existe en la posición del array eliminamos los datos de la posición.
                unset($vectorContent[$i]);
            }
        }
    }

    // 9. Abrimos el fichero para rescribir el resto de elementos.
    $file = fopen($filePath, $a);

    // 10. Convertimos el array en una cadena y lo volvemos a guardar en el archivo.
    foreach($vectorContent as $vectorLine)
    {
        // 11. Escribimos la línea de contenido en el archivo y añadimos el futuro símbolo de separación.
        fwrite($filePath, $vectorLine.'#');
    }

    // 12. Cerramos el archivo.
    fclose($file);
    
?>