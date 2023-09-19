<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa14</title>
</head>
<body>
    <form action="Programa14.php" method="post">
        <input type="text" size="30" name="monto" />
        <input type="submit" name="submit" value="convertir" />
   </form>
   <?php        
    // Averiguamos si se ingresó una cantidad.
    if (isset($_POST['monto'])) {
      define ("cantidad", $_POST['monto']);
    } else {
      define ("cantidad", 0);
    }
    // Indicamos el valor de la conversión.
    $moneda = "libra esterlina";
    // Definimos el tipo de cambio.
    $tasacambios = 0.84;
    // Imprimimos el dinero ingresado.
    echo "<b>".cantidad." euros</b> equivale a ";                                                
    // Calculamos el cambio
    $cambio=$tasacambios*cantidad;
    // Imprimos el resultado con el formato de moneda.
    echo   $cambio . " ";
    // Imprimimos el cambio.
    echo "$moneda" . ".";
   ?>
</body>
</html>
