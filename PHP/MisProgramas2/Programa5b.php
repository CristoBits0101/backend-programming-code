<?php
    $x = $_REQUEST['a'];
    $y = $_REQUEST['b'];
    if ($y > $x) {
        $r = ( -$x * 2 ) / $y;
    }
    if ($x > $y) {
        $r = ( -$y * 2 ) / $x;
    }
    echo "Resultado: $r";
?>
