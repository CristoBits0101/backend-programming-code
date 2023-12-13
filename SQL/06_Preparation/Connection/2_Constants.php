<?php

    // Parámetros de conexión para la base de datos local.
    const SERVERNAME = "localhost";
    const DATABASE = "ut4_exam";
    const USERNAME = "mitiendaonline";
    const PASSWORD = "1234";

    try
    {
        // Crea una conexión a la base de datos ut4_exam en un servidor localhost.
        $connection = new PDO("
            mysql:host=" . SERVERNAME . ";
            dbname=" . DATABASE,
            USERNAME,
            PASSWORD
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
