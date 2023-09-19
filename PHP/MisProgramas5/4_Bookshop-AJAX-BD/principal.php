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
        <title>Proyecto Librería</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">	
        <script type = "text/javascript" src = "cargarDatos.js"></script>	
    </head>
    <body>
        <div class="container-fluid">
            <div class="col-md-12 order-md-1">
                <h4>Librería</h4>
                <?php require 'cabecera.php'; ?>
                <section id = "principal">
                    <h2 id = "titulo"></h2>
                    <section id = "contenido"></section>
                    <section id = "libros" style="display:none"></section>
                    <hr>
                    <a href = "procesar_pedido.php" id="procesar" style="display:none">Realizar pedido</a>
                </section>
            </div>
        </div>
    </body>
</html>