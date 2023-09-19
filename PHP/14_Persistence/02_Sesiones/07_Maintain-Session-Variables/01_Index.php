<?php

    session_start();

    print_r($_SESSION);

?>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Registrar Cliente manteniendo el estado de las variables</title>

</head>

<body>
    
    <form action="registrar.php" method="post">

        <p>DNI:</p>
        <input type="text" name="dni" value="<?php 
            if (isset($_SESSION['dni'])){ echo $_SESSION['dni']; }  
        ?>" />
        
        <br/>
        
        <p>Nombre:</p>
        <input type="text" name="nombre" value="<?php 
            if (isset($_SESSION['nombre'])){ echo $_SESSION['nombre']; } 
        ?>" />
        
        <br/>

        <p>Apellido:</p>
        <input type="text" name="apellido" value="<?php 
            if (isset($_SESSION['apellido'])){ echo $_SESSION['apellido']; } 
        ?>"/>
        
        <br/>
        
        <p>Saldo:</p>
        <input type="text" name="saldo" value="<?php 
            if (isset($_SESSION['saldo'])){ echo $_SESSION['saldo']; } 
        ?>"/>
        
        <br/>

        <input type="submit" name="enviar"/>

    </form>

</body>

</html>