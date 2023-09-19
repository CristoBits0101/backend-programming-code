<html>
    <head>
        <meta charset="UTF-8">
        <title>Actividad</title>
        <style>
            td {padding: 5px; width: 50px; height: 25px;}
            td:nth-child(even) {background-color: #E11E01;}
            td:nth-child(odd)  {background-color: #008094;}
        </style>
    </head>
    <body>
        <?php
           $numero; $cuadrado; $cubo;
          // Inicializacion del Array numero.
          for ($i = 0; $i < 20; $i++) {$numero[$i] = rand(0, 100);}
          // Inicializacion del Array Cuadrado.
          for ($i = 0; $i < 20; $i++) {$cuadrado[$i] = $numero[$i] * $numero[$i];}
          // Inicializacion del Array Cubo.
          for ($i = 0; $i < 20; $i++) {$cubo[$i] = $numero[$i] * $numero[$i] * $numero[$i];}
        ?>
        <table border="1">
            <tr>
                <td>Numero</td>
                <?php 
                // Imprimimos los Array dentro de Table.
                for ($i = 0; $i < 20; $i++) {echo "<td>", $numero[$i] ,"</td>";}
                ?> 
            </tr>
            <tr>
                <td>Cuadrado</td>
                <?php 
                  // Imprimimos los Array dentro de Table.
                  for ($i = 0; $i < 20; $i++) {echo "<td>", $cuadrado[$i] ,"</td>";}
                ?> 
            </tr>
            <tr>
                <td>Cubo</td>
                <?php 
                  // Imprimimos los Array dentro de Table.
                  for ($i = 0; $i < 20; $i++) {echo "<td>", $cubo[$i] ,"</td>";}
                ?> 
            </tr>
        </table>
    </body>
</html>