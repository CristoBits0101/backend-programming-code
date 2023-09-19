<?php

    $cadenaConexion = 'mysql:dbname=empresa;host=localhost;port=3306';
    $usuario        = 'admin';
    $clave          = '1234';

    try 
    {
        $bd = new PDO($cadenaConexion, $usuario, $clave);

        echo "Conexión realizada con éxito<br>";

        $sql = 'SELECT nombre,clave,rol FROM usuarios';
        $usuarios = $bd->query($sql);

        echo "Número de usuarios: " . $usuarios->rowCount() . "<br>";

        foreach ($usuarios as $usu) 
        {
            echo "Nombre : " . $usu['nombre'] . "<br>" .
                 " Rol : "   . $usu['rol']    . "<br>" .
                 " Clave : " . $usu['clave']  . "<br>";
        }

        // Consulta preparada, parámetros por orden.
        $preparada = $bd->prepare("select nombre from usuarios where nombre = ?");
        $preparada->execute(array('yeray'));

        echo "Nombre de usuarios con usuario 'yeray': " . $preparada->rowCount() . "<br>";

        foreach ($preparada as $usu) 
        {
            print "Nombre : " . $usu['nombre'] . "<br>";
        }

        // Consulta preparada, parámetros por nombre.
        $preparadaNombre = $bd->prepare("select nombre from usuarios where nombre = :nombre");
        $preparadaNombre->execute(array(':nombre' => 'prueba'));

        echo "Nombre de Usuarios con usuario 'prueba': " . $preparadaNombre->rowCount() . "<br>";

        foreach ($preparadaNombre as $usu) 
        {
            print "Nombre : " . $usu['nombre'] . "<br>";
        }
    } 

    catch (PDOException $e) 
    {
        echo 'Error con la base de datos: ' . $e->getMessage();
    }

?>