<?php
    if ($_POST['horas'] < 41 && $_POST['horas'] > 0) {
            echo "Su salario es de: " + $_POST['horas'] * 12;
    }
    else if ($_POST['horas'] > 40) {
        $extra = $_POST['horas'] - 40;
        $salario = (40 * 12) + ($extra * 16);
        echo "Su salario es de: $salario euros.";
    }
    else {
        echo '¡A ver si damos palo al agua colega!';
    }
?>
