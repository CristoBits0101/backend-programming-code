<html>
    <head>
        <meta charset="UTF-8">
        <title>Cambiar valores en array</title>
    </head>
    <body>
        <h3>Actividad 15</h3>
        <h4>Introduce dos numeros, se cambiaran los numeros del primer campo por los del segundo</h4>
        <?php
            $numero;
            $numeroTexto = "";
            for ($i = 0; $i < 100; $i++) {
                $numero[$i] = rand(0, 20);
                $numeroTexto .= $numero[$i];
                $numeroTexto .= " ";
            }
        ?>
        <form action="index.php" method="post">
            Introduce un numero:  <input type="number" name="primerCampo" placeholder="0" autofocus><br>
            Introduce otro numero:  <input type="number" name="segundoCampo" placeholder="0"><br>
            <input type="submit" name="submit" id="enviar" value="¡Enviar!">
            <?php
                echo '<p><input type="hidden" name="numeroTexto" value="', $numeroTexto,'"></p>';
            ?>
        </form>
        <?php
        if (isset($_POST['numeroTexto'])) {
            $primeraOcurrencia = $_POST['primerCampo'];
            $segundaOcurrencia = $_POST['segundoCampo'];
            $numeroTexto = $_POST['numeroTexto'];
            $numeroTexto = substr($numeroTexto, 0, -1);
            $numero = explode(" ", $numeroTexto);
            $arrayLength = count($numero);
            for ($i = 0; $i < $arrayLength; $i++) {
                if ($numero[$i] == $primeraOcurrencia){$numero[$i] = $segundaOcurrencia;}
                echo $numero[$i], ' ';
            }
        }
        else {echo $numeroTexto;}
        ?>
    </body>
</html>
