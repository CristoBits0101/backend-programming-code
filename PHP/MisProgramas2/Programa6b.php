<?php
    $h = $_REQUEST['h'];
    $g = 9.81;
    $o = 2 * $h / $g;
    $s = sqrt($o);
    echo "Dicho objeto tardara caer unos " . round($s , $d = 2). " segundos";
?>
