<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa21</title>
</head>
<body>
    <h3 style="color:blue">Calculadora de Kb a Mb</h3>  
    <form action="Programa21.php" method="post">
        <label for="Kb">Kb:</label>
        <input type="text" name="Kb"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "<br>" . ($_POST['Kb'] / 1024), ".";
    ?>
</body>
</html>
