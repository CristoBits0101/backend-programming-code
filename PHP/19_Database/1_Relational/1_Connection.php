<?php

    /**
     *  - En la cadena de conexión por defecto se establece el puerto 3306.
     *  - Si hemos especificado otro puerto, debemos añadir a la cadena de conexión (port='').
     */
    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario        = 'admin';
    $clave          = '1234';

    try 
    {
        $bd = new PDO($cadenaConexion, $usuario, $clave);
        
        var_dump($bd);
    }

    catch (PDOException $e) 
    {
        echo 'Error con la base de datos: ' . $e->getMessage();
    } 

?>