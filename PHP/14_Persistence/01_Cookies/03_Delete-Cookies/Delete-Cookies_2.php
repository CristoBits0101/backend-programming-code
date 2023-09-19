<?php

    if ($_REQUEST['opcion'] == "recordar")
        setcookie("mail", $_REQUEST['mailusuario'], time() + (60 * 60 * 24 * 365), "/");
        
    elseif ($_REQUEST['opcion'] == "norecordar")
        setcookie("mail", "", time() - 1, "/");

?>

<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Borrar cookie</title>
</head>

<body>

    <?php

        if ($_REQUEST['opcion'] == "recordar")
            echo "cookie creada";
            
        elseif ($_REQUEST['opcion'] == "norecordar")
            echo "cookie eliminada";

    ?>

    <br>

    <a href="borrar_cookie_1.php">Ir a la otra página</a>

</body>

</html>