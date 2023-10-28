<?php

    // Paso 4)

    /**
     * - 04_user-registration -> Comprueba si el usuario está registrado, en caso contrario lo almacena.
     */
    include_once "./04_user-registration.php";

    // Paso 5)

    /**
     * - Los campos del formulario no pueden venir vacios.
     * - Los campos del formulario no pueden tener un valor nulo.
     * - Los campos del formulario deben haber sido declarados.
     * - Las contaseñas deben tener el mismo valor y tipo.
     */

    function validate_registration_form()
    {
        if
        (
            !isset($_REQUEST['nombre'])           || empty($_REQUEST['nombre'])           ||
            !isset($_REQUEST['apellidos'])        || empty($_REQUEST['apellidos'])        ||
            !isset($_REQUEST['role'])             || empty($_REQUEST['role'])             ||
            !isset($_REQUEST['contrasena'])       || empty($_REQUEST['contrasena'])       ||
            !isset($_REQUEST['repitaContrasena']) || empty($_REQUEST['repitaContrasena']) ||
            !isset($_REQUEST['telefono'])         || empty($_REQUEST['telefono'])         ||
            !isset($_REQUEST['email'])            || empty($_REQUEST['email'])            ||
            $_REQUEST['contrasena'] !== $_REQUEST['repitaContrasena']
        )
        {
            throw new Exception("¡ERROR! (verifique los datos y vuelva a intentarlo).");
        }

        else
        {
            return true;
        }
    }

    // Paso 6)

    /**
     * - Se comprueba el formato de la foto.
     * - Se comprueba el tamaño de la foto.
     * - Si cumple todos los requisitos devolvemos un true.
     */
    function validate_form_file()
    {
        /**
         * - Foto es el valor de name en el input de tipo archivo.
         */
        $_fileName    = $_FILES['foto']['name'];     // Capturamos el nombre del archivo a través de la propiedad name.
        $_filePath    = $_FILES['foto']['tmp_name']; // Capturamos la ruta temporal del archivo a través de la propiedad tpm_name.
        $_fileError   = $_FILES['foto']['error'];    // Capturamos el valor boolean que nos da la propiedad error si no se ha enviado nada.
        $_fileSize    = $_FILES['foto']['size'];     // Capturamos el tamaño del archivo mediante la propiedad size.
        $_fileMaxSize = 1024 * 1024 * 1;             // Establece un tamaño máximo para el archivo, en concreto 1 Mb.

        /**
         * - Si se produce un error ejecutamos una salida controlada mediante throw.
         */
        if 
        (
            $_fileError === true       ||
            $_fileSize > $_fileMaxSize
        ) 
        {
            throw new Exception("¡ERROR! (hay un fallo con el archivo enviado o su tamaño).");
        }

        // Guardamos en un array los formatos permitidos.
        $allowed_formats = array('jpg','png','gif');

        // Capturamos las extensión del archivo.
        $extension = pathinfo($_fileName, PATHINFO_EXTENSION);

        // Comprobamos que la extensión del archivo está permitida según el array.
        if(!in_array($extension, $allowed_formats)) 
        {
            throw new Exception("¡ERROR! (hay un fallo con el archivo enviado, verifique si el formato es de tipo .gif .png .jpg).");
        }

        else
        {
            /**
             * - Añadimos la ruta donde queremos que se guarde el fichero enviado.
             * - $_newPath = "C:/xampp/htdocs/03_Task_UT2/1_sistema_ventas/fotos\"
             * - Con la barra invertida al final podemos añadir prefijo a las fotos.
             */
            $_newPath = "C:/xampp/htdocs/03_Task_UT2/1_sistema_ventas/images/".$_fileName;

            // Traspasamos de la ruta temporal a la ruta local el archivo.
            move_uploaded_file($_filePath, "$_newPath");

            // Retornamos true porque la foto se guardo correctamente.
            return true;
        }
    }

    // Paso 7)

    /**
     * - Comprobamos si el usuario está registrado.
     * - Si está registrado lanzamos un error controlado.
     * - Si no está registrado retornamos falso para almacenamos.
     * - Retornamos true si no está registrado porque es unregistered.
     */
    function unregistered_user()
    {
        if (check_user() === false)
        {
            return true;
        }

        else 
        {
            throw new Exception("¡ERROR! (ya hay un usuario registrado con ese email.).");
        }
    }

?>