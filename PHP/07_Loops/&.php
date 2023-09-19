<?php
    
    $arr3 = array(1, 2, 3, 4);   // Modificar valores del array mendiante & (referencia).

    foreach ($arr3 as &$valor) 
    { 
        $valor = $valor * 2;
    }

    print_r($arr3);
    
?>