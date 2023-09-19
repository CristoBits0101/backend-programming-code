<?php

    $dept = new DOMDocument();

    // Fichero Validado con el formato de definición XSD.
    $dept->load('../empleados.xml');
    $res = $dept->schemaValidate('../departamento.xsd');

    if ($res)
    {
        echo "El fichero es válido";
    } 
    
    else
    {
        echo "Fichero no válido";
    }

    // Fichero no validado.
    $dept->load('../empleados_otro.xml');
    $res = $dept->schemaValidate('../departamento.xsd');

    if ($res) 
    {
        echo "El fichero es válido";
    } 
    
    else 
    {
        echo "Fichero no válido";
    }

?>