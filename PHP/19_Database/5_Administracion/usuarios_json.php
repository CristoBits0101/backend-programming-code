<?php

    require_once 'sesiones_json.php';
    require_once 'bd.php';

    if (!comprobar_sesion())
        return;

    $usuarios     = cargar_usuarios();
    $usuariosJson = json_encode(iterator_to_array($usuarios), true);	
    
    echo $usuariosJson;

?>