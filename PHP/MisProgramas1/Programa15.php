<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa15</title>
</head>
<body>
    <form action="Programa15.php" method="post">
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
    $moneda = "euros";
    // Definimos el tipo de cambio.
    $tasacambios = 1.19;
    // Imprimimos el dinero ingresado.
    echo "<b>".cantidad." libra esterlina </b> equivale a ";                                                
    // Calculamos el cambio
    $cambio=$tasacambios*cantidad;
    // Imprimos el resultado con el formato de moneda.
    echo   $cambio . " ";
    // Imprimimos el cambio.
    echo "$moneda" . ".";
   ?>
</body>
</html>
