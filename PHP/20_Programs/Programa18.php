<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa18</title>
</head>
<body>
    <h3 style="color:blue">Calculadora del área del triángulo</h3>
    <form action="Programa18.php" method="post">
        <label for="altura">Altura:   </label>
        <input type="text" name="altura"><br><br>
        <label for="base">Base: </label>
        <input type="text" name="base"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
       echo "<br>El area del triangulo es: ", ($_POST['altura'] * $_POST['base'] / 2)," cm2.";
    ?>
</body>
</html>
