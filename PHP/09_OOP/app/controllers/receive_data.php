<?php

    // Importamos el script que contiene las funciones.
    require_once __DIR__ . "/serialize_result.php";

    // Si nos llega una petición GET recorremos los campos de la petición para saber qué función ejecutar según el campo oculto.
    if ($_SERVER['REQUEST_METHOD'] === 'GET')
        foreach ($_REQUEST as $field => $value) 
        {
        foreach ($_REQUEST as $field => $value) 
            if ($value === 'circle')
                serialize_circle_result();

            elseif ($value === 'rectangle')
                serialize_rectangle_result();

            elseif ($value === 'square')
                serialize_square_result();

            elseif ($value === 'triangle')
                serialize_triangle_result();
        }