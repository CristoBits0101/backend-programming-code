<?php

    /*
        Asignación de valor por copia:
            - Cuando se modifica el valor de una variable se crea una copia en memoria.
            - La copia se guarda con el mismo nombre que la original con diferente asignación de memoria.
            - Cuando llamamos a la variable se llama a la última que se copia.
            - Tambien es una copia declarar una variable con un nombre nuevo.
                $var01 = 3      (inicialización);
                $var01 = 4;     (copia con nueva dirección de memoria);
                $var01 = var02; (copia con nueva dirección de memoria);

        Asignación de valor por referencia.
            - Modificar $var04 también modifica &var01 porque apuntan a la misma dirección de memoria.
                $var04 = &$var1 (Accede la zona de memoria de inicialización);

    */
    $var1 = 100;      // Inicialización.
                    
    $var2 = &$var1;   // Asignación por referencia hace que tengan la misma dirección de memoria.
    echo "$var2<br>"; // Muestra 100.
    
    $var2 = 300;      // Cambia el valor de $var2.
    echo "$var1<br>"; // $var1 también cambia.

    $var3 = $var1;    // Asignación por copia.
    
    $var3 = 400;      // Este cambio no afecta a $var1.
    echo $var1;

?>