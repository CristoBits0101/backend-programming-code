<?php

    // 1. Recoger los datos.
    $datos     = simplexml_load_file("../empleados.xml");

    // 2. Filtrar los datos.
    $edades    = $datos->xpath("//edad");
    $nombres   = $datos->xpath("//nombre");
    $empleados = $datos->xpath("//empleado");

    // 3. Mostrar info de los datos.
    var_dump($edades);
    var_dump($nombres);
    var_dump($empleados);

    echo "Edades: <br>";

    // 4. Imprimir los datos.
    foreach ($edades as $valor) 
    {
        print_r($valor);

        echo "<br>";
    }

    // Para acceder a los atributos utilizamos ->
    echo $empleados[0]->nombre    . "<br>";
    echo $empleados[0]->apellidos . "<br>";
    echo $empleados[0]->edad      . "<br>";

    echo $empleados[1]->nombre    . "<br>";
    echo $empleados[1]->apellidos . "<br>";
    echo $empleados[1]->edad      . "<br>";

    foreach($empleados as $empleado)
    {
        echo "
                Nombre: $empleado->nombre                   <br> 
                Apellidos: $empleado->apellidos             <br>
                Edad: $empleado->edad                       <br>
                Carnet Conducir: $empleado->carnetConducir  <br>
                                                            <br>
            ";
    }

?>