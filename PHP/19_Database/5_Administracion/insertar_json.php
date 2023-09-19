<?php

    require_once 'sesiones_json.php';
    require_once 'bd.php';

    if (!comprobar_sesion())
        return;

    if ($_SERVER["REQUEST_METHOD"] == "POST") 
    {
        $nombre    = $_POST['nombre'];
        $apellidos = $_POST['apellidos'];
        $usuario   = $_POST['usuario'];
        $clave     = $_POST['clave'];

        $resultado = insertar_usuario($usuario, $nombre, $apellidos, $clave);

        echo $resultado;
    }

?>