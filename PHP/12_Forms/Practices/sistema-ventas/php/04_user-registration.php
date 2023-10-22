<?php

    // Paso 9)

    /**
     * - Importar la clase usuario para almacenar los datos en atributos.
     * - 05_user-class.php -> Estandariza el estado del usuario antes de almacenarlo.
     */
    include_once "./05_user-class.php";
    include_once "./06_user_serialization.php";

    // Paso 10)

    /**
     * - Creamos un array para almacenar los usuarios.
     * - Se crea fuera de las funciones para poder llamarlo en ambas.
     */
    $list_users_sales_system = array();

    // Paso 11)

    /**
     * - Se comprueba si la variable está vacía(Undefined), en caso verdadero se añade al usuario.
     * - Si no está vacia se comprueba si el usuario existe en la lista de objetos.
     * - Retornamos false cuando la lista está vacía o no incluye al usuario.
     */
    function check_user()
    {
        if 
        (
            isset($list_users_sales_system) || 
            empty($list_users_sales_system)
        )
        {
            return false;
        }

        else if (!empty($list_users_sales_system))
        {
            foreach ($list_users_sales_system as $userEmail)
            {
                $userEmail->email === $_REQUEST['email'];
                return true;
            }
        }

        else 
        {
            return false;
        }
    }

    // Paso 12)

    /** 
     * - Si todo ha ido correcto hay que almacenar los datos del usuario y la foto.
     */
    function sabe_user()
    {
        $list_users_sales_system = array();

        /**
         *  - Copiamos la ruta del archivo 03_validate-form.php
         *  - Con esto tenemos identificado donde se guardó la foto del usuario.
         */ 
        $_fileName = $_FILES['foto']['name'];

        $_newPath  = "http://localhost/03_Task_UT2/1_sistema_ventas/images/".$_fileName ;

        // Construimos un nuevo usuario para que tenga una estructura válida de almacenamiento.
        $receivedUser = new UserSalesSystem
        (
            $_REQUEST['nombre'],
            $_REQUEST['apellidos'],
            $_REQUEST['role'],
            $_REQUEST['contrasena'],
            $_REQUEST['telefono'],
            $_REQUEST['email'],
            $_newPath,
        );

        $list_users_sales_system[] = $receivedUser;

        /**
         *  - Incluimos al usuario en la lista de datos.
         *  - Enviamos el usuario a la función serializar para pintarlo en el navegador. 
         */
        user_serialization($list_users_sales_system);
    }

?>