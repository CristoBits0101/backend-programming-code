<?php

    // Datos conexión.
    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario        = 'admin';
    $clave          = '1234';

    try 
    {
        // Conectar.
        $bd = new PDO($cadenaConexion, $usuario, $clave);

        echo "Conexión realizada con éxito<br>";

        // Borrar.
        $borrarQuery = "delete from usuarios where nombre = 'cambio_prueba'";
        $resul = $bd->query($borrarQuery);

        // Comprobar errores.
        if ($resul) 
        {
            echo "delete correcto <br>";
            echo "Filas borradas: " . $resul->rowCount() . "<br>";
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