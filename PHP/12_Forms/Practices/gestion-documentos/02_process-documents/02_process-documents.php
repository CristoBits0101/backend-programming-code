<?php

    // Paso 2.1) Importar los archivos para poder hacer uso de sus funciones.
    include_once './03_string-validation.php';
    include_once './04_document-validation.php';
    include_once './05_save-documents.php';
    include_once './06_register-data.php';

    // Paso 2.2) Comprobar que el input hidden declarado llega al servidor.
    if (isset($_REQUEST['formulario'])) 
    {
        try 
        {

            // Paso 2.3) Si el input llega al servidor, comprobamos los datos enviados.
            check_text_fields();
            check_files();

            // Paso 2.4) Si los datos están correctos, los almacenamos en nuestro servidor.
            // Los datos se guardan en archivos o bases de datos.
            // Los documentos en un directorio del servidor.
            if 
            (
                check_text_fields() == true &&
                check_files() == true
            ) 
            {
                save_documents ();
                register_data();
            }
            
        } 

        catch (Exception $e) 
        {
            /**
             * - throw new Exception se almacena en la e cuando generamos un error controlado.
             * - Con el método getMessage obtenemos la instrucción del error controlado.
             */
            echo '<p style="color:red">Excepción: ' . $e->getMessage() . "</p><br>";
        }
    }
    
?>