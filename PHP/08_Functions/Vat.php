<?php

    $iva = true;
    $precio = 10;

    // precioConIva(); Esta línea dará error, coméntala.

    if ($iva) 
    {
        function precioConIva() 
        {
            // Podemos usar también $precio = $GLOBALS["precio"];
            global $precio;

            $precioIva = $precio * 1.18;

            echo "El precio con IVA es " . $precioIva;
        }
    }

    precioConIva(); // Aquí ya no da error.

    // Otra forma, podemos utilizar la función antes de implementarla.
    if ($iva) 
    {
        /**
         *  - Podemos hacer uso de la función.
         *  - Antes de implementarla. 
         */
        precioConIva2();
    }

    function precioConIva2() 
    {
        $precio    = $GLOBALS["precio"];
        $precioIva = $precio * 1.18;
        
        echo "El precio con IVA es " . $precioIva;
    }

?>