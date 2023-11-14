<?php

    // 1. Configuración.
    $server   = "localhost";
    $database = "ieselrincon";
    $user     = "ouliden";
    $password = "1234";

    // 2. Conexión.
    try
    {
        $connection = new PDO("mysql:host=$servername; dbname=$dbname", $username, $password);
        $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }

    catch (PDOException $e)
    {
        echo "Error de conexión: " . $e->getMessage();
    }

    // 3. Consulta.
    $result = $connection->query
    (
        "SELECT
            iniciales, nombre_completo
        FROM
            modulos"
    );

    // 4. Recopilación.
    while ($row = $result->fetch())
        $modulos[$row['iniciales']] = $row['nombre_completo'];

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
        <form action="">
            <select name="" id="">

            </select>
        </form>
        
    </body>
</html>