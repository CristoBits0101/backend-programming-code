<?php

    // Comienzo de la sesión.
    session_start();

    // Guardar datos de sesión.
    $_SESSION["usuario"] = "Prueba";

    // Continuamos la sesión, esto puede verse desde otra página.
    session_start();

    // Devolver los valores de sesión.
    echo "Nombre de usuario: " . $_SESSION["usuario"] . "<br>";

    /**
     *  - Se puede Eliminar un dato guardado mediante unset,
     *  - En este punto la sesión sigue iniciada todavía.
     */
    unset($_SESSION["usuario"]);

    /**
     *  - La clave dentro de la sesión ya no existe, dará error:
     *    echo $_SESSION["usuario"];
     */
    $_SESSION["usuarioNuevo"] = "Prueba2";

    // Creamos un nombre nuevo de usuario.
    echo "Nombre de usuario Nuevo: " . $_SESSION["usuarioNuevo"] . "<br>";
  
    /**
     *  - Elimina todos los valores de la sesión a la vez.
     *  - Ambas acciones anteriores sólo afectan a los valores guardados en la sesión.
     *  - ¡No a la propia sesión!, todavía se pueden guardar nuevos valores en $_SESSION.
     *  - Si se quiere dejar de utilizar por completo la sesión:
     *  - Cuando el usuario hace logout, se utiliza session_destroy().
     */
    session_unset();

    var_dump($_SESSION);

    // Terminar la sesión.
    session_destroy();

?>