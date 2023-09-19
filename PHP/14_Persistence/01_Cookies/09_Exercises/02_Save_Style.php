<?php
if (isset($_REQUEST['radio'])) {
    //la cookie dura un día
    if ($_REQUEST['radio'] == "rojo") {
        setcookie("estilo", "estilo_rojo.css", time() + 60 * 60 * 24);
    } elseif ($_REQUEST['radio'] == "verde") {
        setcookie("estilo", "estilo_verde.css", time() + 60 * 60 * 24);
    } elseif ($_REQUEST['radio'] == "azul") {
        setcookie("estilo", "estilo_azul.css", time() + 60 * 60 * 24);
    }
}
?>
<html>
    <head>
        <title>Selección de estilo</title>
    </head>
    <body>
        Se creó la cookie.
        <br>
        <a href="estilos.php">Ir a la otra página</a>
    </body>
</html> 