<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa17</title>
</head>
<body>
    <h3 style="color:blue">Calculadora de área de rectángulos</h3>
    <form action="Programa17.php" method="post">
        <label for="Altura">Altura:   </label>
        <input type="text" name="Altura"><br><br>
        <label for="Anchura">Anchura: </label>
        <input type="text" name="Anchura"><br><br>
        <input type="submit" value="Resultado"><br><br>
    </form>
    <?php
        echo "<br>El area del rectangulo es: ", round($_POST['Altura'] * $_POST['Anchura']), ".";
    ?>
</body>
</html>
