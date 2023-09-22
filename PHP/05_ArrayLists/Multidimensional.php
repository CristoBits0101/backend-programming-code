<?php

    /**
     *  - Matriz Indexada.
     *  - 2 dimensiones.
     *  - $animal[row][column] = "valor"; 
     */
    $animal[0][0] = "Perro";
    $animal[0][1] = "Gato";
    $animal[1][0] = "Lombriz";
    $animal[1][1] = 1;
    $animal[2][0] = true;
    $animal[2][1] = "Cocodrilo";

    echo $animal[2][1];
    echo $animal[0][0];

    /**
     *  - Matriz Instanciada.
     *  - 2 dimensiones. 
     */
    $animal2 = array(
        array("Perro", "Gato"),
        array("Lombriz", "Burro"),
        array("Murciélago", "Cocodrilo")
    );

    echo $animal2[2][1];
    echo $animal2[0][0];

    /**
     *  - Matriz Clave => Valor.
     *  - 2 dimensiones. 
     */
    $datos = 
    [
        ["nombre" => "pepe", "edad" => 25, "peso" => 80],
        ["nombre" => "juan", "edad" => 22, "peso" => 75]
    ];

    $horarios = [
        "lunes" => [
            "08:00-08:55" => "MarR - DEW - G201",
            "08:55-09:50" => "MarR - DEW - G201",
            "09:50-10:45" => "MarM - DPL - G201",
            "11:15-12:10" => "SerR - DSW - G201",
            "12:10-13:05" => "MarV - DOR - G201",
            "13:05-14:00" => "MarV - DOR - G201",
        ],
        "martes" => [
            "08:00-08:55" => "MarR - DEW - G201",
            "08:55-09:50" => "MarR - DEW - G201",
            "09:50-10:45" => "MarV - DOR - G201",
            "11:15-12:10" => "MarV - DOR - G201",
            "12:10-13:05" => "SerR - DSW - G201",
            "13:05-14:00" => "SerR - DSW - G201",
        ],
    ];

    print "<p>{$datos[1]["nombre"]} pesa {$datos[1]["peso"]} kilos</p>\n";
    print "\n";
    print "<p>" . $datos[0]["nombre"] . " tiene " . $datos[0]["edad"] . " años</p>\n";

    /**
     *  - Tridimensional Indexada.
     *  - $animal[face][row][column] = "valor"; 
     */
    $animal3 = [[[]]];
    $animal3[0][0][0] = "Perro";
    $animal3[0][0][1] = "Gato";
    $animal3[0][0][2] = "Lombriz";
    $animal3[1][0][0] = "Burro";
    $animal3[1][0][1] = "Murcielago";
    $animal3[1][0][2] = "Cocodrilo";

    echo "<br>" . $animal3[1][0][1];

    // ERROR! => Clave no definida.
    echo "<br>" . $animal3[0][0][3];

    // Tridimensional Asociativo.
    $arrayDatos = 
    [
        [
            "DNI" => "1111a",
            "Nombre" => "Yeray",
            "Apellidos" => "Pérez V.",
            "Direccion" => [
                "Calle" => "Falsa 123",
                "CP" => 35015,
                "numero" => 3
            ]
        ]
    ];

?>