<?php
    
    $edad = 20;
    
    /**
     *  1. Condición a evaluar.
     *  2. La interrogación indica condicional ?
     *  3. If true acción : Else false acción.
     */

    // Ternaries type if else.
    echo ($edad >= 20) ? 'Pasa' : 'Fuera';

    // Ternaries type if else ++
    echo ($edad >= 20 ? 'Pasa' : 'Fuera') ?  'Bien' : 'Mal';

    // Ternaries type switch 1.
        $a  ==  1 ? 'uno' :  
        ( 
            $a  ==  2 ? 'dos' :  
            ( 
                $a  ==  3 ? 'tres' :  
                ( 
                    $a  ==  4 ? 'cuatro' :  
                    'otro' 
                ) 
            ) 
        );
    
    // Ternaries type switch 2.
    ( ( ( $a  ==  1   ? 'uno' 
       :  $a  ==  2 ) ? 'dos' 
       :  $a  ==  3 ) ? 'tres' 
       :  $a  ==  4 ) ? 'cuatro' 
       :  'otro'      ;

    /**
     *  - PHP 7.4 
     */

    // Ternarios anidados sin paréntesis explícitos.
    ( 1 ? 2  :  3 ) ? 4  :  5 ; // Bien.
    1 ? 2  :  ( 3 ? 4  :  5 ) ; // Ok.

    // Ternaria corta y larga.
    ( 1 ? :  2 ) ? 3  :  4 ;    // Bien.
    1 ? :  ( 2 ? 3  :  4 ) ;    // Ok.

    ( 1 ? 2  :  3 ) ? :  4 ;    // Bien.
    1? 2  :  ( 3 ? :  4 ) ;     // Ok.

    // Combinar dos ternarios cortos.
    1 ? :  2 ? :  3 ;           // Bien. 
    ( 1 ? :  2 ) ? :  3 ;       // Bien. 
    1 ? :  ( 2 ? :  3 ) ;       // Ok.

?>