<?php

    include_once "./02_validate-form.php";
    include_once "./03_process-data.php";

    // Main.
    if 
    (
        isset($_REQUEST['formulario'])
    )
    {

        try 
        {
            if 
            (
                validate_form() === true
            ) 
            {
                process_data();
            }
            else 
            {
                throw new Exception("¡ERROR! (no se ha podido procesar el contenido del formulario).");
            }
        } 

        catch (Exception $e) 
        {
            echo '<p style="color:red">Excepción: ' . $e->getMessage() . "</p><br>";
        }

    }

?>