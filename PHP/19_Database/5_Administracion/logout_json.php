<?php

    session_start();

    $_SESSION = array();

    session_destroy(); // Eliminar la sesión.

    setcookie(session_name(), 123, time() - 1000); // eliminar la cookie

?>