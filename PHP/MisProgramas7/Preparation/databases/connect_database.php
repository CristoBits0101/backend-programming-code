<?php

    define("server", "localhost");                                                          // Servidor al que se va a conectar.
    define("database", "mitiendaonline");                                                   // Base de datos que va a utilizar.
    define("user", "mitiendaonline");                                                       // Nombre de la cuenta de administrador.
    define("password", "1234");                                                             // Contraseña de la cuenta de administrador.

    /**
     * @return PDO
     */
    function connect_database()
    {
        global $server, $database, $user, $password;

        try 
        {
            $conn = new PDO("mysql:host=$server;dbname=$database", $user, $password);       // Intenta establecer conexión con la base de datos.
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);                 // Configura el modo de error PDO a excepción
            echo "<script>alert('Conexión exitosa')</script>";                              // Informa que la conexión a la base de datos a sido exitosa.
            return $conn;                                                                   // Devuelve la conexión PDO.
        } 
        
        catch (PDOException $e) 
        {
            echo '<script>alert("Error de conexión: ' . $e->getMessage() . '")</script>';   // Informa que la conexión a la base de datos a sido no exitosa.
            return null;                                                                    // En caso de error, puedes devolver null o manejar el error de otra manera.
        }
    }
