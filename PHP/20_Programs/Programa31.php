<?php
    $contador = 0;
    $b = 0;
    do {
        $a = readline("Introduzca un número:");
        if ($a > 0) {
            $b += $a;
            $contador += 1;
        }
    } while ($a > 0);
    echo "La media es: " . $b / $contador;
?>