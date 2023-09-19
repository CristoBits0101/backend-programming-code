<?php

    /**
     *  - Nota: Para que funcione el XSLT en XAMPP debemos añadir la extensión php.
     *  - Si no lo configuramos así nos dará un error de Librería no encontrada.
     */

    // 1.1. Crea una instancia del objeto DOMDdocumento para manipular HTML o XML.
    $dept = new DOMDocument();

    // 1.2. Cargar el fichero a transformar con el método load de DOMDocument.
    $dept->load('../empleados.xml');

    // 2.1. Crear otra instancia del objeto DOMDocument para cargar la transformación XSLT.
    $transformacion = new DOMDocument();
    
    // 2.2. Cargar el fichero que contiene la transformación que se va a aplicar al XML.
    $transformacion->load('../departamento.xslt');

    // 3.1. Crear el objeto que permite procesar las transformaciones del XSLT.
    $procesador = new XSLTProcessor();

    // 3.2. Asociar el procesador y la transformación.
    $procesador->importStylesheet($transformacion);

    // 4.1. Transformar.
    $transformada = $procesador->transformToXml($dept);
    
    echo $transformada;

?>