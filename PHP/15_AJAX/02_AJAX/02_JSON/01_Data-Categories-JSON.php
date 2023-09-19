<?php

    // 1. Array asosiativo.
    $cat1 = array("cod" => 1, "nombre" => "Comida");
    $cat2 = array("cod" => 2, "nombre" => "Bebida");

    // 2. Matriz de array.
    $array = array($cat1, $cat2);

    // 3. Mensaje informativo.
    echo "Forma de array: ";

    // 4. Contenido del mensaje.
    print_r($array);

    // 5. Salto de línea.
    echo "<br>";

    // 6. Codificar a json.
    $json = json_encode($array);

    // 7. Mensaje informativo.
    echo "Forma de JSON: " . $json;

?>