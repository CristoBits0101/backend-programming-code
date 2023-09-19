<?php

    // Importar los archivos para poder hacer uso de sus funciones.
    include_once './07_serialize-database-table.php';

    // PUNTUALIZACIÓN: El ejercicio anterior lo hice con clases, este lo voy a hacer con array asociativo para practicar.

    // Paso 6.1) La función register_data recive un array con el nombre de los documentos almacenados.
    function register_data()
    {
        $associativeDataArray = 
        [
            "AUTOR/ES"                  => $_REQUEST['autor'],
            "NOMBRE DE DOCUMENTOS"      => $_REQUEST['nombreDocumentos'],
            "DESCRIPCIÓN DE DOCUMENTOS" => $_REQUEST['descripcionDocumento'],
            "TIPO DE DOCUMENTO"         => $_REQUEST['tipoDocumento'],
            "EXTENSIÓN DE ARCHIVO"      => $_REQUEST['extensiones'],
            "PALABRAS CLAVE"            => $_REQUEST['palabrasClave'],
            "IDIOMA"                    => $_REQUEST['idioma'],
            "VISIBILIDAD"               => $_REQUEST['visibilidad'],
            "TEMÁTICA"                  => $_REQUEST['tematica'],
        ];

        // if ($_FILES['fichero1']['size'] > 0) 
        // {
        //     $tamano1 = implode('',$_FILES['fichero1']['size']);
        //     $arrayDatos .= [
        //         "FICHERO1"                  => $_FILES['fichero1']['name'],
        //         "FICHERO1TAMAÑO"            => $tamano1, 
        //     ];
        // }

        // if ($_FILES['fichero2']['size'] > 0) 
        // {
        //     $tamano2 = implode('',$_FILES['fichero2']['size']);
        //     $arrayDatos .= [
        //         "FICHERO2"                  => $_FILES['fichero2']['name'],
        //         "FICHERO2TAMAÑO"            => $tamano2,
        //     ];
        // }

        // if ($_FILES['fichero3']['size'] > 0) 
        // {
        //     $tamano3 = implode('', $_FILES['fichero3']['size']);
        //     $arrayDatos .= [
        //         "FICHERO3"                  => $_FILES['fichero3']['name'],
        //         "FICHERO3TAMAÑO"            => $tamano3,
        //     ];
        // }

        echo '¡Los datos se han cargado en el array asociativo! ✅<br/><br/>';

        // Serializamos el array que se ha cargado correctamente.
        serialize_data($associativeDataArray);
    }

?>