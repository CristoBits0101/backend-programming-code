<?php

/* comprueba que el usuario haya abierto sesión o redirige */
require 'sesiones.php';
require_once 'bd.php';
comprobar_sesion();
?>	
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <title>Procesar Pedido</title>	
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">	
        <script type = "text/javascript" src = "cargarDatos.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="col-md-12 order-md-1">
                <h4>Librería</h4>
                <?php
                if (empty($_SESSION['carrito'])) {
                    echo "El pedido no se puede realizar. El carrito está vacío...";
                } else {
                    echo "Pedido realizado con éxito. Se enviará un correo de confirmación";
                }
                //vaciar carrito	
                $_SESSION['carrito'] = [];
                ?>
                <hr>
                <a href="principal.php">Volver</a>
            </div>
        </div>
    </body>
</html>

?>