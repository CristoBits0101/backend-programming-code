<?php
    print "La nota media es: " . 
    round(($_REQUEST['N1'] + $_REQUEST['N2'] + $_REQUEST['N3']) / 3 , $decimal = 2);
    $boletin = round(($_REQUEST['N1'] + $_REQUEST['N2'] + $_REQUEST['N3']) / 3 , $decimal = 2);
    echo "<br> La nota final es: ";
    if ($boletin <5){
        echo "Insuficiente";
    }
    if (($boletin >=5) && ($boletin <6)){
            echo "Suficiente";
    }
    if (($boletin >=6) && ($boletin <7)){
            echo "Bien";
    }
    if (($boletin >=7) && ($boletin <9)){
            echo "Notable";
    }
    if ($boletin >=9){
            echo "Sobresaliente";
    }
?>
