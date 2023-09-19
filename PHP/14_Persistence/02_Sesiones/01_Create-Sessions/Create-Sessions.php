<?php

    /**
     *  - Una sesión es un mecanismo de programación de las tecnologías de web.
     *  - Scripting que permite conservar información sobre un usuario al pasar de una página a otra.
     *  - A diferencia de una cookie, los datos asociados a una sesión se almacenan en el servidor.
     *  - Nunca se almacenan en el cliente.
     */

    // 1. Creamos una sessión.
    session_start();

    // 2. Mostramos la id de la sessión.
    echo 'session_id(): ' . session_id();

    // 3. Salto de línea.
    echo "<br/> \n";

    // 4. ID de la sesión.
    $_SESSION["ID"] = session_id();

    // 5. Mostramos el nombre de la sesión.
    echo 'session_name(): ' . session_name();

    // 6. Asignamos el nombre de la sesión a la variable NOMBRE.
    $_SESSION["NOMBRE"] = session_name();

    // 7. Salto de línea.
    echo "<br />\n";

    // 8. Mostramos los datos que contiene la sesión.
    print_r($_SESSION);

    // 9. Elimina elementos de una sesión.
    unset($_SESSION['NOMBRE']);

    // 10. Mostramos los datos que contiene la sesión.
    print_r($_SESSION);

?>