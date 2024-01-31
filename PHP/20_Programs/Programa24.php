<html>
    <head>
        <meta charset="UTF-8">
        <title>Actividad 14</title>
    </head>
    <body>
        <h3>Ver el maximo y el minimo</h3>
        <form action="Programa14.php" method="post">
            <label for="numero">Introduce 10 números:</label>
            <input type="number" name="numero" placeholder="0" autofocus checked>
            <input type="submit" id="enviar" name="submit" value="Enviar">
            <?php
                $numero; $contador = 0; $numeroTexto = ""; 
                if (isset($_POST['numero'])) {
                    $numero = $_POST['numero'];
                    if ($numero == "") {$numero = 0;}
                    if (isset($_POST['numeroTexto'])) {$numeroTexto = $_POST['numeroTexto'];}
                    $numeroTexto .= $numero; $numeroTexto .= " ";
                    if (isset($_POST['contador'])) {$contador = $_POST['contador'];}
                    $contador++;
                    echo '<input type="hidden" name="numeroTexto" value="', $numeroTexto ,'">';
                    echo '<input type="hidden" name="contador"    value="', $contador ,'">';
                }
            ?>
        </form>
        <?php
        if ($contador >= 10) {
            echo '<script>document.getElementById("enviar").disabled=true</script>';
            $numeroTexto = substr($numeroTexto, 0, -1); $numero = explode(" ", $numeroTexto); $arrayLength = count($numero);
            $maximo = max($numero); $minimo = min($numero);
            for ($i = 0; $i < $arrayLength; $i++) {
                if($numero[$i] == $maximo) {echo $numero[$i], " Maximo <br>";} 
                else if ($numero[$i] == $minimo) {echo $numero[$i], " Minimo <br>";} 
                else {echo $numero[$i], "<br>";}
            }
        }
        ?>
    </body>
</html>