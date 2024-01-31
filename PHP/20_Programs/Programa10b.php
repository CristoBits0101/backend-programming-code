<?php
    $time             = $_REQUEST['time'];
    $min              = $_REQUEST['min'];
    $hora_segundos    = 3600;
    $minuto_segundos  = 60;
    $segundos_pasados = ($time * $hora_segundos) + ($min * $minuto_segundos);
    $finalsegundos    = (24 * $hora_segundos) - $segundos_pasados;
    echo "La hora introducida es: " . 
        $time .":". $min . " quedan " . $finalsegundos. 
        " segundos para llegar a la media noche."
?>