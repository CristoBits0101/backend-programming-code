<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa20</title>
</head>
<body>
    <h3 style="color:blue">Calculadora de Mb a Kb</h3>
    <form action="Programa20.php" method="post">
        <label for="Mb">Mb:</label>
        <input type="text" name="Mb"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "<br>" . ($_POST['Mb'] * 1024), ".";
    ?>
</body>
</html>
