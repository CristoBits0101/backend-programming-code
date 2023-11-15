<?php

    // Intenta conectarse a la base de datos.
    /**
     * @return PDO
     */
    function connect_to_database()
    {
        $servername = "localhost";
        $username = "mitiendaonline";
        $password = "1234";

        try 
        {
            $conn = new PDO("mysql:host=$servername;dbname=mitiendaonline", $username, $password);
    
            // set the PDO error mode to exception
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    
            // echo "<script>alert('Connected successfully')</script>";

            // Devuelve la conexión PDO.
            return $conn;
<<<<<<< HEAD:PHP/MisProgramas7/Activities/a3.1/configuration.php
        }
=======
        } 
>>>>>>> 57fef1bcb4939472e6865c9d42bc0098319788ab:PHP/MisProgramas7/a3.1/configuration.php
    
        catch(PDOException $e) 
        {
            echo '<script>alert("Connection failed: ' . $e->getMessage() . '")</script>';

            // En caso de error, puedes devolver null o manejar el error de otra manera.
            return null;
        }
    }

?>
