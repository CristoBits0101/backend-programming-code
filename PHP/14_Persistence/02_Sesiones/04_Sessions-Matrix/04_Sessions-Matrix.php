<?php

    // Iniciamos una sesión.
    session_start();

    // Definición de Arrays en Cookies y Sesiones.
    $matrizSesion["primeraClave"] = "Primer elemento";
    $matrizSesion["segundaClave"] = "Segundo elemento";
    $matrizSesion["terceraClave"] = "Tercer elemento";

    $matrizCookie["primeraClave"] = "Primer elemento";
    $matrizCookie["segundaClave"] = 1;
    $matrizCookie["terceraClave"] = true;

    // Inicializar matriz de elementos en una sesión.
    $_SESSION["matrizSesion"] = $matrizSesion;

    // Inicializar matriz de elementos en una cookie.
    setcookie("matrizCookie", serialize($matrizCookie), 0);

    // Podemos mostrar directamente el elemento en la matriz.
    echo $_SESSION["matrizSesion"]["primeraClave"];

    // En una Cookie debemos deserializar los datos:
    $datosCookie = unserialize($_COOKIE['matrizCookie']);

    echo $datosCookie["primeraClave"];

    // Eliminamos la sesión.
    session_destroy();

?>