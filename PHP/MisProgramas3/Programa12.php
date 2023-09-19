<?php
    $numeroIntroducido = 0;
    $numeroDeElementos = 0 ;
    $sumaImpares = 0 ;
    $numeroDeElementosImpares = 0 ;
    $maximoPar = 0 ;
    do {
        $numeroIntroducido = readline ("Por favor, vaya introduciendo numeros enteros:");
	echo "Puede terminar mediante la introducción de un número negativo.";
        if ( $numeroIntroducido >= 0 ) {
            $numeroDeElementos ++;
            if (( $numeroIntroducido % 2 ) == 1 ) {
                $sumaImpares += $numeroIntroducido ;
                $numeroDeElementosImpares ++;
            } 
            else { // número par
                if ( $numeroIntroducido > $maximoPar )
                $maximoPar = $numeroIntroducido ;
            }
        }
    } while ( $numeroIntroducido >= 0 );
    echo "Ha introducido " . $numeroDeElementos . " numeros positivos.";
    echo "La media de los impares es";
    echo $sumaImpares / $numeroDeElementosImpares . ".";
    echo "El maximo de los pares es " . $maximoPar . ".";
?>