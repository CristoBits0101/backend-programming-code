<?php

    // Datos de conexión.
    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario        = 'admin';
    $clave          = '1234';

    try 
    {
        // Conectar.
        $bd = new PDO($cadenaConexion, $usuario, $clave);
        
        echo "Conexión realizada con éxito<br>";
        
        // Actualizar.
        $actualizarQuery = "update usuarios set nombre='cambio_prueba' where nombre='prueba'";
        $resul           = $bd->query($actualizarQuery);
        
        // Comprobar errores.
        if ($resul) 
        {
            echo "update correcto <br>";
            echo "Filas actualizadas: " . $resul->rowCount() . "<br>";
        } 
        
        else 
        {
            print_r($bd->errorinfo());
        }
    } 

    catch (PDOException $e) 
    {
        echo 'Error con la base de datos: ' . $e->getMessage();
    } 

?>