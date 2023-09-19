<?php

    require_once 'bd.php';

    if ($_SERVER["REQUEST_METHOD"] == "GET") 
    {
        $eliminado = eliminar_usuario($_GET['id']);

        if ($eliminado === FALSE) 
        {
            echo "FALSE";
        }

        echo "TRUE";
    }
    
?>