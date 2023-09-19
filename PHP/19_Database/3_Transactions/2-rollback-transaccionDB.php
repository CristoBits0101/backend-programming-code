<?php

    function verificarTransaccion($bd, $resul) 
    {
        if (!$resul) 
        {
            echo "Error: " . print_r($bd->errorinfo());

            // Deshace los cambios efectuados.
            $bd->rollback();

            echo "<br>Transacción anulada<br>";

        } 
        
        else 
        {
            // Si hubiera ido bien realiza el commit..
            $bd->commit();
        }
    }

    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario        = 'admin';
    $clave          = '1234';

    try 
    {
        $bd = new PDO($cadenaConexion, $usuario, $clave);

        echo "Conexión realizada con éxito<br>";

        // Comenzar la transacción.
        $bd->beginTransaction();

        $insertarQuery1 = "insert into usuarios(nombre, clave, rol) values('prueba1', 'prueba1', '1')";
        $insertarQuery2 = "insert into usuarios(nombre, clave, rol) values('prueba1', 'prueba1', '1')";
        $insertarQuery3 = "insert into usuarios(nombre, clave, rol) values('prueba1', 'prueba1', '2')";

        $resul = $bd->query($insertarQuery1);

        var_dump($resul);
        echo "<br>Primera query: <br>";

        $resul = $bd->query($insertarQuery2);

        var_dump($resul);
        echo "<br>Segunda query: <br>";

        $resul = $bd->query($insertarQuery3);

        var_dump($resul);
        echo "<br>Tercera query: <br>";

        verificarTransaccion($bd, $resul);

    } 
    
    catch (PDOException $e) 
    {
        $bd->rollback();
        echo 'Error al conectar: ' . $e->getMessage();
    }

?>