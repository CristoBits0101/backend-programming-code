<?php

    // 1. Configuración.
    define("server",   "localhost");
    define("database", "ieselrincon");
    define("user",     "ouliden");
    define("password", "1234");

    // 2. Conexión.
    try
    {
        $connection = new PDO("mysql:host=$server; dbname=$database", $user, $password);
        $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }

    catch (PDOException $e)
    {
        echo "Error de conexión: " . $e->getMessage();
    }

    // 3. Consulta.
    $connection_result = $connection->query("SELECT iniciales, nombre_completo FROM modulos");

    // 4. Recopilación.
    while ($row_data = $connection_result->fetch())
        $modulos[$row_data['iniciales']] = $row_data['nombre_completo'];

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Exam UT3</title>
    </head>
    <body>

        <!-- 5. Serialización -->
        <h1>Editar Módulo.</h1>
        <form>
            <select name="modulo" id="modulo">
                <?php
                    foreach($modulos as $clave => $valor)
                        echo "<option value='".$clave."'>".$valor."</option>";
                ?>
            </select>
        </form>
        
    </body>
</html>