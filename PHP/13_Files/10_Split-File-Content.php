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

        // 5. Como el usuario existe, recorremos las posiciones del array.
        foreach ($vectorContent as $contentLine)
        {

            // 6. Solo si el usuario existe en la String de la línea.
            if (str_contains($contentLine, $_REQUEST('userName')))
            {

                // 7. Dividimos la línea en un array a partir de cada ;
                $userData = explode(';', $contentLine);

                // 8. Creamos una instancia del objeto subUsuario para normalizar el usuario del archivo.
                $EstandarizarUsuario = new SubUser();

                // 9. Recorremos el array para obtener los datos del usuario.
                foreach($userData as $data)
                {
                    // 10. Si un dato coincide con el valor del campo lo cargamos.
                    switch ($data) 
                    {
                        case $_REQUEST['userName']:
                            $EstandarizarUsuario->setNombre($data);
                            break;
                        
                        default:
                            echo "¡ERROR! (no se ha podido cargar al usuario)";
                            break;
                    }
                }
            }
        }
    }
    
?>