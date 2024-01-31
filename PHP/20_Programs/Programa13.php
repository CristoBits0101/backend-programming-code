<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa13</title>
</head>
<body>
    <h2 style="color:Red">Introduzca dos cantidades a multiplicar</h2>
    <form action="Programa13.php" method="post">
        <label for="valor1">Introduzca el primer valor:</label>
        <input type="text" name="valor1"><br><br>
        <label for="valor2">Introduzca el segundo valor:</label>
        <input type="text" name="valor2"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "El resultado de la multipicacion es: ", $_POST['valor1'] * $_POST['valor2'];
    ?>
</body>
</html>
