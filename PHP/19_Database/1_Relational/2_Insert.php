<?php

    // Datos conexión.
    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario = 'admin';
    $clave = '1234';
    
    try 
    {
        // Conectar.
        $bd = new PDO($cadenaConexion, $usuario, $clave);

        echo "Conexión realizada con éxito<br>";
        
        // Insertar nuevo usuario.
        $passwordEncriptado = hash('sha256','prueba1234');
        $insertarQuery      = "insert into usuarios(nombre, clave, rol) values('prueba','$passwordEncriptado', '1');";
        $resul              = $bd->query($insertarQuery);
        
        // Comprobar errores.
        if ($resul) 
        {
            echo "insert correcto <br>";
            echo "Filas insertadas: " . $resul->rowCount() . "<br>";
        }

        else 
        {
            print_r($bd->errorinfo());
        }

        // Para los autoincrementos, si es autoincremental no hace falta ponerlo.
        // echo "Código de la fila insertada" . $bd->lastInsertId() . "<br>";
    } 
    
    catch (PDOException $e)
    {
        echo 'Error con la base de datos: ' . $e->getMessage();
    }

?>