<?php

include('ao1.1.php');

$result = 0;


function sumar($a, $b) {
    return $a + $b;
}


function restar($a, $b) {
    return $a - $b;
}


function multiplicar($a, $b) {
    global $result;
    for ($cont = 0; $cont < $b; $cont++) {
        $result += $a;
    }

    return $result;
}


function main() {
    $continua = true;

    while ($continua) {
        echo "Seleccione una opción:\n";
        echo "1. Suma\n";
        echo "2. Resta\n";
        echo "3. Multiplicación\n";
        echo "4. Concatenar Strings\n";
        echo "5. Buscar Substring\n";
        echo "6. Reemplazar Substring\n";
        echo "7. Salir\n";

        $opcion = readline("Introduzca un número del 1 al 7: ");

        switch ($opcion) {
            case 1:
                $a = readline("Introduzca un número: ");
                $b = readline("Introduzca otro número: ");
                $result = sumar($a, $b);
                echo "El resultado de la suma es: $result\n";
                break;
            
            case 2:
                $a = readline("Introduzca un número: ");
                $b = readline("Introduzca otro número: ");
                $result = restar($a, $b);
                echo "El resultado de la resta es: $result\n";
                break;
            
            case 3:
                $a = readline("Introduzca un número: ");
                $b = readline("Introduzca otro número: ");
                $result = multiplicar($a, $b);
                echo "El resultado de la multiplicación es: $result\n";
                break;
            case 4:
                $str1 = readline("Introduzca la primera string: ");
                $str2 = readline("Introduzca la segunda string: ");
                $resultado = concatenar($str1, $str2);
                echo "$resultado\n";
                break;
            case 5:
                $str1 = readline("Introduzca la substring: ");
                $str2 = readline("Introduzca la string: ");
                $resultado = buscar($str1, $str2);
                echo "$resultado\n";
                break;
            case 6:
                $str1 = readline("Introduzca la substring de búsqueda: ");
                $str2re = readline("Introduzca la substring de reemplazo: ");
                $str2 = readline("Introduzca la string general: ");
                $resultado = reemplazar($str1, $str2re, $str2);
                echo "La string final es: $resultado\n";
                break;
            
            case 7:
                $continua = false;
                break;
            
            default:
                echo "Opción inválida.\nIntroduzca un valor válido.\n";
                break;
        }
    }

    echo "Apagando programa.\n";
}

main();

?>
