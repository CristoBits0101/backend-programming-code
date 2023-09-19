<?php

    $idiomaUsuario = $_GET["idiomaUsuario"];

    // Se graba una cookie con una validez de 24 horas.
    setcookie("idiomaUsuario", $idiomaUsuario, time() + 86400);

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

    <script language="javascript" type="text/javascript">
        // Se regresa a la página principal.
        location.href = "./Use-Cookies.php";
    </script>

</body>

</html>