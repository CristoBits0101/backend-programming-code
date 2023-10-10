<?php
    while(true){
        print "\nSumar\nRestar\nMultiplicar\nDividir\nResto\nPotencia\nSalir\n\nElige una opción: ";
        $elec = readline();

        if($elec == "Sumar"){
            $n1 = num1();
            $n2 = num2();
            sumar($n1, $n2);
        }else if($elec == "Restar"){
            $n1 = num1();
            $n2 = num2();
            restar();
        }else if($elec == "Multiplicar"){
            $n1 = num1();
            $n2 = num2();
            multiplicar($n1, $n2);
        }else if($elec == "Dividir"){
            $n1 = num1();
            $n2 = num2();
            dividir();
        }else if($elec == "Resto"){
            $n1 = num1();
            $n2 = num2();
            modulo($n1, $n2);
        }else if($elec == "Potencia"){
            $n1 = num1();
            $n2 = num2();
            $result = $n1;
            potencia($result);
            print "\nLa potencia de $n1 elevado a $n2 es: " . $result . "\n\n";
        }else if($elec == "Salir"){
            break;
        }
    }

    //                FUNCIONES

    function num1(){
        return readline("Introduce el primer número: ");
    }

    function num2(){
        return readline("Introduce el segundo número: ");
    }

    function sumar($n1, $n2){
        print "\nLa suma de $n1 y $n2 es: " . $n1+$n2 . "\n\n";
    }

    function restar(){
        global $n1, $n2;
        print "\nLa resta de $n1 y $n2 es: " . $n1-$n2 . "\n\n";
    }

    function multiplicar($n1, $n2){
        $result=0;
        for($i=0;$i<$n2;$i++){
            $result+=$n1;
        }
        print "\nLa multiplicación de $n1 por $n2 es: " . $result . "\n\n";
    }

    function dividir(){
        global $n1, $n2;
        print "\nLa división de $n1 entre $n2 es: " . $n1/$n2 . "\n\n";
    }

    function modulo($n1, $n2){
        print "\nEl resto de $n1 entre $n2 es: " . $n1%$n2 . "\n\n";
    }

    function potencia(&$x){
        global $n1, $n2;
        for($i=1;$i<$n2;$i++){
            $x*=$n1;
        }
    }
?>