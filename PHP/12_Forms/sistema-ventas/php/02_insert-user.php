<?php

    // Paso 1)

    /**
     * - Importamos los script para poder llamar a sus funciones y clases.
     * - 03_validate-form: Válida los campos del formulario y el archivo adjunto.
     * - 04_user-registration: Se utiliza en esté documento para hacer la llamada a guardar datos.
     */
    include_once "./03_validate-form.php";
    include_once "./04_user-registration.php";
    
    // Paso 2)

    /**
     * - Verificamos que el formulario se ha enviado.
     */
    if(isset($_REQUEST['formulario']))
    {
        // Paso final.

        /**
         * - Pintamos una tabla en el frontend con los datos de los usuarios registrados.
         */
        function print_user($table)
        {
            echo $table;
        }

        try
        {
            // Paso 3)

            /**
             * - Si el formulario ha sido enviado, verificamos los campos.
             * - Si los datos no están correctos se dispara un error controlado.
             */
            validate_registration_form();
            validate_form_file();
            unregistered_user();

            // Paso 8)

            /**
             * - Si los campos están correctos, verificamos si el usuario existe en la base de datos.
             * - Si el usuario no existe en nuestra base de datos o ficheros, lo almacenamos.
             * - Pintamos una tabla en el frontend con los datos de los usuarios registrados.
             */
            if
            (
                validate_registration_form() === true &&
                validate_form_file()         === true &&
                unregistered_user()          === true
            )
            {
                sabe_user();
            }
        }

        catch (Exception $e)
        {
            /**
             * - throw new Exception se almacena en la e cuando generamos un error controlado.
             * - Con el método getMessage obtenemos la instrucción del error controlado.
             */
        }
    }

    else
    {
        echo '¡No hemos recibido el formulario!';
    }

?>