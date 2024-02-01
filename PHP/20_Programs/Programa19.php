<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa19</title>
</head>
<body>
    <h3 style="color:blue">Calculadora de salario semanal</h3>
    <form action="Programa19.php" method="post">
        <label for="horas">Horas:   </label>
        <input type="text" name="horas"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "<br>El salario semanal es: ", ($_POST['horas'] * 12), " euros.";
    ?>
</body>
</html>
