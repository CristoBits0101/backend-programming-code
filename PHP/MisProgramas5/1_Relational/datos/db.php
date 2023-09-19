<?php

    require "../clases/pelicula.php";

    function cargarDatosXMLDB()
    {
        $datosDB = simplexml_load_file("configuracion.xml");

        $datos = 
        [
            'ip'      => (string)$datosDB->xpath("//ip")[0],
            'puerto'  => (string)$datosDB->xpath("//puerto")[0],
            'nombre'  => (string)$datosDB->xpath("//nombre")[0],
            'usuario' => (string)$datosDB->xpath("//usuario")[0],
            'clave'   => (string)$datosDB->xpath("//clave")[0]
        ];

        return $datos;
    }

    function conectarDB()
    {
        $datosDB        = cargarDatosXMLDB();
        $cadenaConexion = "mysql:dbname=" . $datosDB["nombre"] . ";host=" . $datosDB["ip"] . ";port=" . $datosDB["puerto"];
        $usuario        = $datosDB["usuario"];
        $clave          = $datosDB["clave"];
        $bd             = new PDO($cadenaConexion, $usuario, $clave);

        return $bd;
    }

    function otrasFormasCargaDB($idPelicula)
    {
        $bd = conectarDB();

        echo "<h2>Otras formas de cargar datos desde BD con Objetos PDOStament</h2>";
        echo "<br>";
        echo "Forma básica de Carga de datos: Recorriendo Array";
        echo "<br>";

        $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
        $peliculasQuery->execute(array(':id' => $idPelicula));

        echo "<br>";

        var_dump($peliculasQuery);

        echo "<br>";

        foreach($peliculasQuery as $dato)
        {
            print_r($dato);
        }

        echo "<br>";
        echo "<br>";

        $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
        $peliculasQuery->execute(array(':id' => $idPelicula));

        echo("PDO::FETCH_ASSOC ");
        echo("<br>");
        echo("Devolver la siguiente fila como un array indexado por nombre de colunmna");
        echo("<br>");

        $result = $peliculasQuery->fetch(PDO::FETCH_ASSOC);

        var_dump($result);
    
        echo("<br>");
        echo("<br>");

        $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
        $peliculasQuery->execute(array(':id' => $idPelicula));

        echo("PDO::FETCH_BOTH: ");
        echo("<br>");
        echo("Devolver la siguiente fila como un array indexado por nombre y número de columna\n");
        echo("<br>");

        $result = $peliculasQuery->fetch(PDO::FETCH_BOTH);

        var_dump($result);

        echo("<br>");
        echo("<br>");

        $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
        $peliculasQuery->execute(array(':id' => $idPelicula));

        echo("PDO::FETCH_LAZY: ");
        echo("<br>");
        echo("Devolver la siguiente fila como un objeto anónimo con nombres de columna como propiedades\n");
        echo("<br>");

        $result = $peliculasQuery->fetch(PDO::FETCH_LAZY);

        var_dump($result);

        echo("<br>");
        echo("<br>");

        $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
        $peliculasQuery->execute(array(':id' => $idPelicula));

        echo("PDO::FETCH_OBJ: ");
        echo("<br>");
        echo("Devolver la siguiente fila como un objeto anónimo con nombres de columna como propiedades\n");
        echo("<br>");

        $result = $peliculasQuery->fetch(PDO::FETCH_OBJ);

        var_dump($result);

        echo("<br>");
        echo("<br>");
    }

    function cargarPelicula($idPelicula)
    {
        try 
        {
            $bd = conectarDB();

            $peliculasQuery = $bd->prepare("select * from peliculas where id = :id");
            $peliculasQuery->execute(array(':id' => $idPelicula));

            if ($peliculasQuery == false) 
            {
                return false;
            }

            return new Pelicula($peliculasQuery);

        } 
        
        catch (PDOException $e) 
        {
            echo 'Error con la base de datos: ' . $e->getMessage();
        }
    }

?>