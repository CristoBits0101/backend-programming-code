<?php
    $contador = 0;
    if (isset($_COOKIE['contador'])) {
        if ($_REQUEST['cajero'] == 2012 && $_COOKIE['contador'] < 4) {
            echo "La caja fuerte se ha abierto satisfactoriamente.";
            $_COOKIE['contador'] = 5;
        } else if ($_COOKIE['contador'] == 4) {
            echo "La caja se ha bloqueado, se requiere de llave maestra para abrirla.";
        } else {
            $_COOKIE['contador'] += 1;
            echo "Lo siento, esa no es la combinación. <br>";
            echo "Te quedan " . (4 - $_COOKIE['contador']) . " intentos.<br>";
        }
    } else {
        setcookie('contador', $contador);
    }
?>
