<?php

    // Parámetros de conexión para la base de datos local.
    $servername = "localhost";
    $database = "ut4_exam";
    $username = "root";
    $password = "";

    // Driver -> Host -> Database.
    $dns = "mysql:host=" . $servername . ";dbname=" . $database;

    try
    {
        // Crea una conexión a la base de datos ut4_exam en un servidor localhost.
        $connection = new PDO(
            $dns,
            $username,
            $password
        );

        // Establece el modo de error de PDO como excepción.
        $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        // Notifica conexión exitosa.
        echo "<script>alert('Connected successfully')</script>";

        // Devuelve la conexión PDO.
        return $connection;
    } 

    catch(PDOException $e)
    {
        // Notifica conexión errónea.
        echo '<script>alert("Connection failed: ' . $e->getMessage() . '")</script>';

        // Cierra conexión errónea.
        return null;
    }
    