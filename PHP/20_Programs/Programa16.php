<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa16</title>
</head>
<body>
    <form action="Programa16.php" method="post">
        <label for="Num1"></label>
        <input type="text" name="Num1"><br><br>
        <label for="Num2"></label>
        <input type="text" name="Num2"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "S = ", $_POST['Num1'] + $_POST['Num2'] , "<br>";
        echo "R = ", $_POST['Num1'] - $_POST['Num2'] , "<br>";
        echo "M = ", $_POST['Num1'] * $_POST['Num2'] , "<br>";
        echo "D = ", $_POST['Num1'] / $_POST['Num2'] , "<br>";
    ?>
</body>
</html>
