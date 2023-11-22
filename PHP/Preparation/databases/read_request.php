<?php

    // Importar las dependencias.
    require_once "./connect_database.php";
    require_once "./disconnect_database.php";

    function read_database()
    {
        // Read en peticiones que envian el id.
        if ($_SERVER['REQUEST_METHOD'] === 'GET' && isset($_REQUEST['id']) && !empty($_REQUEST['id']))
        {
            // 1. Obtener el ID del producto a leer.
            $id = $_REQUEST['id'];

            // 2. Conectar a la base de datos.
            $connection = connect_database();

            // 3. Preparar la consulta SELECT.
            $stmt = $connection->prepare(
                "SELECT
                    *
                FROM
                    productos
                WHERE
                    id = :id"
            );

            // 4. Sincronización de parámetros.
            $stmt->bindParam(':id', $id);

            // 5. Ejecutar la consulta.
            $stmt->execute();

            // 6. Cerrar la conexión a la base de datos.
            $connection = disconnect_database();

            // 7. Retornamos la consulta.
            return $stmt;
        }

        // Read en peticiones que no envian el id. 
        elseif($_SERVER['REQUEST_METHOD'] === 'GET' && !isset($_REQUEST['id']) || empty($_REQUEST['id']))
        {
            // 1. Conectar a la base de datos.
            $connection = connect_database();

            // 2. Preparar la consulta SELECT.
            $stmt = $connection->prepare(
                "SELECT
                    *
                FROM
                    productos"
            );

            // 3. Sincronización de parámetros.
            $stmt->bindParam(':id', $id);

            // 4. Ejecutar la consulta.
            $stmt->execute();

            // 5. Cerrar la conexión a la base de datos.
            $connection = disconnect_database();

            // 6. Retornamos la consulta.
            return $stmt;
        } 
    }
