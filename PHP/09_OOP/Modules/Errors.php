<?php

    include       "Requerido.php";  // Si el archivo no se encuentra genera una advertencia.
    include_once  "Requerido.php";  // 

    require       "Requerido.php";  // Si el archivo no se encuentra genera un error.
    require_once  "Requerido.php";  // 

    // ERROR! => La variable no esta definida en el archivo importado.
    $b = "otra variable del principal";
    
    echo "En el script principal";

?>