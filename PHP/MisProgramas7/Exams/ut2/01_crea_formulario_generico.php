<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cristo Suárez UT1</title>
    </head>
    <body>
        <?php
            // Paso 1) Se comprueba si existe el archivo y si se puede abrir.
            if (file_exists("./estructura_formulario.cfg") == true && ($_file = fopen("./estructura_formulario.cfg", "r")) !== false)
            {
                // Paso 2) Se comprueba si se puede leer las líneas sin errores.
                while (($_line = fgets($_file)) !== false)
                {
                    // Paso 3) Se divide la línea a partir del caracter ; y se guarda como array en la variable text.
                    $text = explode(';', $_line);

                    // Paso 4) Se Recorre los datos de la línea para ver a qué tipo de input pertenece.
                    foreach ($text as $_value)
                    {
                        // Paso 5) Se imprime los valores de la línea según su contenido.
                        if (str_contains($_value, 'get') || str_contains($_value, 'post'))
                        {
                            $action = trim($text[0]);
                            $method = trim($text[1]);
                            echo "<form action='$action' method='$method' enctype='multipart/form-data'>\n";
                        }
                        
                        elseif (str_contains($_value, 'text') || str_contains($_value, 'password') || str_contains($_value, 'email') || str_contains($_value, 'file'))
                        {
                            $field_data = trim($text[0]);
                            $field_name = trim($text[1]);
                            $field_type = trim($text[2]);
                            echo "$field_data: </br> <input name='$field_name' type='$field_type'/> <br/><br/>";
                        }

                        elseif (str_contains($_value, 'checkbox'))
                        {
                            $field_data = trim($text[0]);
                            $field_name = trim($text[1]);
                            $field_type = trim($text[2]);

                            $field_name = $field_name . '[]';
                            
                            // Paso 6) Se divide la String de la posición 3 del array text en un nuevo array para obtener los valores de cada checkbox.
                            $value_checkbox = explode(',', $text[3]);
                            
                            echo $field_data . '<br/><br/>';

                            // Paso 7) Se recorre los valores del nuevo array para imprimirlos en el checkbox.
                            foreach($value_checkbox as $_data)
                            {
                                $purified_data = trim($_data);
                                echo "<input name='$field_name' type='$field_type' value='$purified_data'/> $_data <br/><br/>";
                            }
                        }

                        elseif (str_contains($_value, 'radio'))
                        {
                            $field_data = trim($text[0]);
                            $field_name = trim($text[1]);
                            $field_type = trim($text[2]);

                            // Paso 6) Se divide la String de la posición 3 del array text en un nuevo array para obtener los valores de cada checkbox.
                            $value_radio = explode(',', $text[3]);

                            echo $field_data . '<br/><br/>';

                            // Paso 7) Se recorre los valores del nuevo array para imprimirlos en el checkbox.
                            foreach($value_radio as $_data)
                            {
                                $purified_data = trim($_data);
                                echo "<input name='$field_name' type='$field_type' value='$purified_data'/> $_data <br/><br/>";
                            }
                        }
                    }
                }

                echo "<input type='submit' value='Submit'/>";
                echo "</form>";
                
                fclose($_file);                                                
            }
            
            else echo "<script> alert('No se puedo leer el fichero.') </script>";
        ?>
    </body>
</html>
