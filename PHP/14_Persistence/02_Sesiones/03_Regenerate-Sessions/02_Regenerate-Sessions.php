<?php

    /**
     *  - Regenerar el Session ID. 
     *  - La función _session_regenerateid(): 
     *    crea un nuevo ID único para representar la sesión actual del usuario.
     *  - Esto se debe utilizar, cuando se realizan acciones importantes como:
     *    Iniciar sesión o modificar los datos del usuario.
     *  - Darle a las sesiones un nuevo ID reduce la probabilidad de ataques.
     */
    session_start();

    // sha1() codifica el password mediante el algoritmo de cifrado sha1.
    $password = sha1("1234");

    if ($_POST["usuario"] === "admin" && sha1($_POST["password"]) === $password) 
    {
        $_SESSION["autorizado"] = true;

        session_regenerate_id();

        echo "Bienvenido/a al sistema";
    }

    else 
    {
        echo "Sesión Eliminada";
        
        session_destroy();
    }

?>