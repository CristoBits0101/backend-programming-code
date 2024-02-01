<?php
    // 1. Si encuentra un múltiplo, imprímelo / multiplícalo por sí mismo 2 y 3 veces e imprímelos.
    // 2. Los if se usan para espaciar según la longitud de los dígitos obtenidos.
    for ($i=0; $i <= 100 ; $i++) {
        if ($i % 5 == 0 && $i > 0 && $i < 6) {
            echo $i .      "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"; 
            echo $i * $i . "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"; 
            echo $i * $i * $i;
            echo "<br>";
        }
        if ($i % 5 == 0 && $i > 5 && $i < 35) {
            echo $i .      "&nbsp&nbsp&nbsp&nbsp"; 
            echo $i * $i . "&nbsp&nbsp&nbsp&nbsp&nbsp"; 
            echo $i * $i * $i;
            echo "<br>";
        }
        if ($i % 5 == 0 && $i > 5 && $i > 34 && $i < 100) {
            echo $i .      "&nbsp&nbsp&nbsp&nbsp"; 
            echo $i * $i . "&nbsp&nbsp&nbsp"; 
            echo $i * $i * $i;
            echo "<br>";
        }
        if ($i % 5 == 0 && $i > 5 && $i == 100) {
            echo $i .      "&nbsp&nbsp"; 
            echo $i * $i . "&nbsp"; 
            echo $i * $i * $i;
            echo "<br>";
        }
    }
?>
