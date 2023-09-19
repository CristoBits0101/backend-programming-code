<?php

    /* comprueba que el usuario haya abierto sesión o redirige */
    require 'sesiones.php';
    require_once 'bd.php';

    comprobar_sesion();

?>	

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>
    
</head>

<body>

    <?php

        require 'cabecera.php';

        if (empty($_SESSION['carrito'])) 
        {
            echo "El pedido no se puede realizar. El carrito está vacío...";
        } 
        
        else
        {
            echo "Pedido realizado con éxito. Se enviará un correo de confirmación";
        }

        // Vaciar carrito.	
        $_SESSION['carrito'] = [];
    ?>		

</body>

</html>