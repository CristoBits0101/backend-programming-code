<?php
    // Se verifica que sean distintos.
    if($_REQUEST['primerNumero'] == $_REQUEST['segundoNumero']) {
        echo "Los números introducidos no son válidos, deben ser distintos.";
    }
    // Si el primer número es mayor que el segundo, se intercambian los valores
    if ($_REQUEST['primerNumero'] > $_REQUEST['segundoNumero']) {
        $aux = $_REQUEST['primerNumero'];
        $_REQUEST['primerNumero'] = $_REQUEST['segundoNumero'];
        $_REQUEST['segundoNumero'] = $aux;
    }
    for($i = $_REQUEST['primerNumero']; $i <= $_REQUEST['segundoNumero']; $i += 7) {
        echo $i . "\n";
    }
    echo "\n";
?>