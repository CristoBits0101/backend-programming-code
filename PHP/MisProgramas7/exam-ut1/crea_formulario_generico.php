<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cristo Suárez UT1</title>
    </head>
    <body>
        <?php                          

            $_route = "./estructura_formulario.cfg";                                // 1. Obtener la ruta del fichero que queremos manipular.

            if (file_exists($_route))                                               // 2. Comprobar que el fichero existe en la ruta que nos han facilitado.

                if (($_file = fopen( $_route, "r")) !== false)                      // 3. Comprobar si el fichero se puede abrir y manipular sin errores.
                {
                    while (($_line = fgets($_file)) !== false)                      // 4. Leemos las líneas del fichero mientras no contengan un valor falso.
                    {
                        $_text = explode(';', $_line);                              // 5. Dividimos la línea para organizar en posiciones.

                        foreach ($_text as $_value)                                 // 6. Comprobamos los valores del array para saber el tipo de input.
                        {
                            if                                                          
                            (
                                str_contains($_value, 'get') ||
                                str_contains($_value, 'post')
                            )
                            {
                                $_action = trim($_text[0]);
                                $_method = trim($_text[1]);

                                echo "
                                    <form 
                                        action='$_action' 
                                        method='$_method' 
                                        enctype='multipart/form-data'
                                    >
                                \n";
                            }
                            
                            elseif 
                            (
                                str_contains($_value, 'text')     ||
                                str_contains($_value, 'password') ||
                                str_contains($_value, 'email')    ||
                                str_contains($_value, 'file')
                            )
                            {
                                $_field_data = trim($_text[0]);
                                $_field_name = trim($_text[1]);
                                $_field_type = trim($_text[2]);

                                echo "
                                    $_field_data:

                                    </br>

                                    <input 
                                        name='$_field_name'
                                        type='$_field_type'  
                                    />
                                    
                                    <br/>
                                    <br/>";
                            }

                            elseif
                            (
                                str_contains($_value, 'checkbox')
                            )
                            {
                                $_field_data = trim($_text[0]);
                                $_field_name = trim($_text[1]);
                                $_field_type = trim($_text[2]);

                                $_field_name = $_field_name . '[]';                 // Convertimos el name de input en un array.

                                $_value_checkbox = explode(',', $_text[3]);

                                echo $_field_data . '<br/><br/>';

                                foreach($_value_checkbox as $_data)
                                {
                                    $_purified_data = trim($_data);

                                    echo "
                                        <input 
                                            name='$_field_name'
                                            type='$_field_type'
                                            value='$_purified_data' 
                                        />

                                        $_data
                                        
                                        <br/>
                                        <br/>";
                                }
                            }

                            elseif
                            (
                                str_contains($_value, 'radio')
                            )
                            {
                                $_field_data = trim($_text[0]);
                                $_field_name = trim($_text[1]);
                                $_field_type = trim($_text[2]);

                                print_r($_field_name);

                                $_value_checkbox = explode(',', $_text[3]);

                                echo $_field_data . '<br/><br/>';

                                foreach($_value_checkbox as $_data)
                                {
                                    $_purified_data = trim($_data);

                                    echo "
                                        <input 
                                            name='$_field_name'
                                            type='$_field_type'
                                            value='$_purified_data' 
                                        />

                                        $_data
                                        
                                        <br/>
                                        <br/>";
                                }
                            }
                        }
                    }

                    echo "
                        <input 
                            type='submit' 
                            value='Submit' 
                        />";

                    echo "</form>";

                    fclose($_file);                                                 // Después de serializar el archivo lo cerramos.
                }
                
                else                                                                // Indicar que el fichero no se puede abrir correctamente.
                    echo "
                        <script>
                            alert('No se puedo leer el fichero.')
                        </script>";
            else                                                                    // Indicar que el fichero no existe en la ruta facilitada.
                echo "
                    <script>
                        alert('El fichero no existe.')
                    </script>";
        ?>
    </body>
</html>
