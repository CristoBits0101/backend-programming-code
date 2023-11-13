<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cristo Suárez UT1</title>
    </head>
    <body>
        <?php                          
            if (file_exists("./estructura_formulario.cfg") == true && ($_file = fopen("./estructura_formulario.cfg", "r")) !== false) 
            {
                while (($_line = fgets($_file)) !== false)
                {
                    $_text = explode(';', $_line);

                    foreach ($_text as $_value)
                    {
                        if (str_contains($_value, 'get') || str_contains($_value, 'post')) 
                        {
                            $_action = trim($_text[0]); 
                            $_method = trim($_text[1]);
                            echo "<form action='$_action' method='$_method' enctype='multipart/form-data'>\n";
                        }
                        
                        elseif (str_contains($_value, 'text') || str_contains($_value, 'password') || str_contains($_value, 'email') || str_contains($_value, 'file'))
                        {
                            $_field_data = trim($_text[0]);
                            $_field_name = trim($_text[1]);
                            $_field_type = trim($_text[2]);
                            echo "$_field_data: </br> <input name='$_field_name' type='$_field_type'/> <br/><br/>";
                        }

                        elseif (str_contains($_value, 'checkbox'))
                        {
                            $_field_data = trim($_text[0]);
                            $_field_name = trim($_text[1]);
                            $_field_type = trim($_text[2]);

                            $_field_name = $_field_name . '[]';

                            $_value_checkbox = explode(',', $_text[3]);
                            
                            echo $_field_data . '<br/><br/>';

                            foreach($_value_checkbox as $_data)
                            {
                                $_purified_data = trim($_data);
                                echo "<input name='$_field_name' type='$_field_type' value='$_purified_data'/> $_data <br/><br/>";
                            }
                        }

                        elseif (str_contains($_value, 'radio'))
                        {
                            $_field_data = trim($_text[0]);
                            $_field_name = trim($_text[1]);
                            $_field_type = trim($_text[2]);

                            $_value_checkbox = explode(',', $_text[3]);

                            echo $_field_data . '<br/><br/>';

                            foreach($_value_checkbox as $_data)
                            {
                                $_purified_data = trim($_data);
                                echo "<input name='$_field_name' type='$_field_type' value='$_purified_data'/> $_data <br/><br/>";
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
