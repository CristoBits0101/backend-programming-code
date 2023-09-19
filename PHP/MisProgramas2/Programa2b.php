<?php
    if ($_POST['hora'] >= 6 && $_REQUEST['hora'] <= 12) {
        echo "¡Buenos días!";
    }
    else if ($_POST['hora'] >= 13 && $_REQUEST['hora'] <= 20) {
        echo "¡Buenos tardes!";
    }
    else {
        echo '¡Buenas noches!';
    }
?>