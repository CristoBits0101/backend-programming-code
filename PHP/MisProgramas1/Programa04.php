<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programa04</title>
</head>
<body>
    <?php echo "<table>", "<tbody>";?>
    <tr>
        <td></td>
        <td bgcolor="#008094">Lunes</td>
        <td bgcolor="#008094">Martes</td>
        <td bgcolor="#008094">Miercoles</td>
        <td bgcolor="#008094">Jueves</td>
        <td bgcolor="#008094">Viernes</td>
    </tr>
    <tr>
        <td bgcolor="#008094">1ª</td>
        <td rowspan="2" bgcolor="blue">LND</td>
        <td bgcolor="purple">ETS</td>
        <td rowspan="2" bgcolor="orange">LNT</td>
        <td rowspan="2" bgcolor="blue">LND</td>
        <td rowspan="2" bgcolor="green">SSF</td>
    </tr>
    <tr>
        <td bgcolor="#008094">2ª</td>
        <td rowspan="2" bgcolor="pink"> FOL</td>
    </tr>
    <tr>
        <td bgcolor="#008094">3ª</td>
        <td bgcolor="green">SSF</td>
        <td bgcolor="purple" >ETS</td>
        <td bgcolor="green">SSF</td>
        <td bgcolor="red">PRO</td>
    </tr>
    <tr>
        <td colspan="6" bgcolor="#008094">Descanso</td>
    </tr>
    <tr>
        <td bgcolor="#008094">4ª</td>
        <td colspan="2" rowspan="3" bgcolor="red">PRO</td>
        <td bgcolor="purple">ETS</td>>
        <td bgcolor="green"> SSF</td>
        <td rowspan="2" bgcolor="yellow"> BAE</td>
    </tr>
    <tr>
        <td bgcolor="#008094">5ª</td>
        <td colspan="2" rowspan="2" bgcolor="yellow">BAE</td>
    </tr>
    <tr>
        <td bgcolor="#008094">6ª</td>
        <td bgcolor="pink">FOL</td>
    </tr>
    <?php echo "</tbody>","</table>"; ?>
</body>
</html>
