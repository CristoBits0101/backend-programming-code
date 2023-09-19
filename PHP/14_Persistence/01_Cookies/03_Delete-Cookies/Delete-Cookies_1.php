<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Borrar cookie</title>
</head>

<body>
    <form action="borrar_cookie_2.php" method="post">
        
        <h3>Ingrese su mail:</h3>
        <input 
            type="text" 
            name="mailusuario" 
            value="<?php if (isset($_COOKIE['mail'])) echo $_COOKIE['mail']; ?>"
        >

        <br>

        <h3>Recordar en esta cliente el mail ingresado.</h3>
        <input type="radio" name="opcion" value="recordar">

        <br>

        <h3>No recordar en esta cliente el mail ingresado.</h3>
        <input type="radio" name="opcion" value="norecordar">

        <br>

        <input type="submit" value="confirmar">
        
    </form>
</body>

</html>