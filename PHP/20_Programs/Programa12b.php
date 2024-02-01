<?php
    $N1 = $_POST['N1'];
    $N2 = $_POST['N2'];
    $N3 = $_POST['N3'];

    for ($i = 0; $i < 3; $i++) {
        if ($N3 > $N2) {
            $aux = $N2;
            $N2  = $N3;
            $N3  = $aux;
        }
        else if ($N2 > $N1) {
            $aux = $N1;
            $N1  = $N2;
            $N2  = $aux;
        }
    }

echo "Resultado: " . $N1 . ", " . $N2 . ", " . $N3;

?>