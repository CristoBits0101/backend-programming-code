<?php

    /* 
        - Activity: AO.1.1
        - Author: Cristo Rubén Pérez Suárez
    */

    // Variables globales para contar operaciones realizadas
    $totalOperaciones = 0;

    // Paso 1) Declaramos las operaciones aritméticas permitidas.
    function addition($numOne, $numTwo)
    {
        // Incrementar el contador de operaciones globales
        global $totalOperaciones;
        $totalOperaciones++;

        return $numOne + $numTwo;
    }

    // Cualquier modificación dentro de la función afecta a las que están fuera por el paso por referencia.
    function subtraction(&$result, $numOne, $numTwo)
    {
        // Utilizar el paso de parámetros por referencia
        $result = $numOne - $numTwo;
    }

    function multiplication($numOne, $numTwo)
    {
        // Incrementar el contador de operaciones globales
        global $totalOperaciones;
        $totalOperaciones++;

        return $numOne * $numTwo;
    }

    function concatenar($string1, $string2)
    {
        return $string1 . $string2;
    }

    function buscar($string1, $string2)
    {
        $contains = str_contains($string1, $string2);
        return $contains ? 'La cadena contiene la subcadena.' : 'La cadena no contiene la subcadena.';
    }

    function remplazar($_substring_busqueda, $_substring_reemplazo, $_string_general)
    {
        $string_reemplazada = str_replace($_substring_busqueda, $_substring_reemplazo, $_string_general);

        return $string_reemplazada;
    }

    // Paso 2) Creamos una condición de salida del bucle while para cuando el usuario no quiera volver a realizar un cálculo.
    $exit_program = false;

    // Paso 3) Creamos un bucle while que se va a ejecutar mientras el usuario quiera realizar operaciones.
    while ($exit_program === false) 
    {
        // Paso 4) Preguntamos qué operación quiere realizar el usuario y le hacemos repetir si selecciona una no permitida.
        do {
            echo "
            Seleccione qué operación desea realizar:
                1) Sumar.
                2) Restar.
                3) Multiplicar.
                4) Concatenar.
                5) Buscar.
                6) Reemplazar.
                ";

            $_selection = trim(fgets(STDIN));

            if 
            (
                $_selection != 1 && 
                $_selection != 2 && 
                $_selection != 3 && 
                $_selection != 4 && 
                $_selection != 5 && 
                $_selection != 6                         
          
            )
            {
                echo "La elección de la operación no puede ser diferente a las introducidas en el menú.\n";
            }

        } while 
        (
            $_selection != 1 && 
            $_selection != 2 && 
            $_selection != 3 && 
            $_selection != 4 && 
            $_selection != 5 && 
            $_selection != 6  
        );

        // Paso 5) Dependiendo de la selección, llamamos a la función que tiene que hacer el cálculo correspondiente.
        switch ($_selection) 
        {
            // Suma.
            case 1:
                $value1 = readline('Introduzca el primer número: ');
                $value2 = readline('Introduzca el segundo número: ');

                echo 'La suma es: ' . addition($value1, $value2);
                echo "\n"."\n";

                break;

            // Resta.
            case 2:
                $value1 = readline('Introduzca el primer número: ');
                $value2 = readline('Introduzca el segundo número: ');

                subtraction($result, $value1, $value2);
                echo 'La resta es: ' . $result;
                echo "\n"."\n";

                break;

            // Multiplicación.
            case 3:
                $value1 = readline('Introduzca el primer número: ');
                $value2 = readline('Introduzca el segundo número: ');

                echo 'La multiplicación es: ' . multiplication($value1, $value2);
                echo "\n"."\n";

                break;

            // Concatenar.
            case 4:
                $string1 = readline('Introduzca la string: ');
                $string2 = readline('Introduzca la substring: ');

                echo 'El resultado de la concatenación es: ' . concatenar($string1, $string2);
                echo "\n"."\n";

                break;

            // Buscar.
            case 5:
                $string1 = readline('Introduzca la primera cadena de texto: ');
                $string2 = readline('Introduzca la segunda cadena de texto: ');

                echo 'El resultado de la busqueda es: ' . buscar($string1, $string2);
                echo "\n"."\n";

                break;

            // Reemplazar.
            case 6:
                $_substring_busqueda = readline('Introduzca una substring de búsqueda: ');
                $_substring_reemplazo = readline('Introduzca una substring de reemplazo: ');
                $_string_general = readline('Introduzca una string general: ');

                echo 'El resultado del remplazo es: ' . remplazar($_substring_busqueda, $_substring_reemplazo, $_string_general);
                echo "\n"."\n";
                break;
                
            default:
                echo "Error de ejecución, vuelva a intentarlo.";
                echo "\n"."\n";
                break;
        }

        // Paso 6) Verificamos si desea continuar realizando cálculos.
        echo "¿Desea continuar realizando operaciones? (Si o No): ";
        $_selection = trim(fgets(STDIN));
        echo "\n";

        if (strtolower($_selection) == 'no') 
        {
            echo 'Recibido, finalizando ejecución del programa...';
            $exit_program = true;
        }
    }

    // Mostrar el total de operaciones realizadas
    echo "Total de operaciones realizadas: $totalOperaciones\n";

?>
