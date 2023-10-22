<?php

    function save_documents () 
    {
        // Paso 5.2) Comprobar los archivos que se han enviado.
        if ($_FILES['fichero1']['size'] > 0) 
        {
            // Paso 5.3) Obtener la extensión de los archivos.
            $extension1 = pathinfo($_FILES['fichero1']['name'], PATHINFO_EXTENSION);

            // Paso 5.4) Obtener la ruta de los archivos enviados.
            $_filePath1 = $_FILES['fichero1']['tmp_name'];

            // Paso 5.5) Crear una nueva ruta para los archivos.
            $_newPath1 = "C:/xampp/htdocs/03_Task_UT2/2_gestion_documentos/03_file-directory/".$extension1.'/'.$_FILES['fichero1']['name'];

            // Paso 5.6) Mover el fichero a la nueva ruta.
            move_uploaded_file($_filePath1, "$_newPath1");
        }

        else 
        {
            echo '¡No se ha almacenado el fichero 1!<br/><br/>';
        }

        if ($_FILES['fichero2']['size'] > 0) 
        {
            // Paso 5.3) Obtener la extensión de los archivos.
            $extension2 = pathinfo($_FILES['fichero2']['name'], PATHINFO_EXTENSION);

            // Paso 5.4) Obtener la ruta de los archivos enviados.
            $_filePath2 = $_FILES['fichero2']['tmp_name'];

            // Paso 5.5) Crear una nueva ruta para los archivos.
            $_newPath2 = "C:/xampp/htdocs/03_Task_UT2/2_gestion_documentos/03_file-directory/".$extension2.'/'.$_FILES['fichero2']['name'];

            // Paso 5.6) Mover el fichero a la nueva ruta.
            move_uploaded_file($_filePath2, "$_newPath2");
        }

        else 
        {
            echo '¡No se ha almacenado el fichero 2!<br/><br/>';
        }

        if ($_FILES['fichero3']['size'] > 0)  
        {
            // Paso 5.3) Obtener la extensión de los archivos.
            $extension3 = pathinfo($_FILES['fichero3']['name'], PATHINFO_EXTENSION);

            // Paso 5.4) Obtener la ruta de los archivos enviados.
            $_filePath3 = $_FILES['fichero3']['tmp_name'];

            // Paso 5.5) Crear una nueva ruta para los archivos.
            $_newPath3 = "C:/xampp/htdocs/03_Task_UT2/2_gestion_documentos/03_file-directory/".$extension3.'/'.$_FILES['fichero3']['name'];

            // Paso 5.67) Mover el fichero a la nueva ruta.
            move_uploaded_file($_filePath3, "$_newPath3");
        }

        else 
        {
            echo '¡No se ha almacenado el fichero 3!<br/><br/>';
        }

        // Retorno de finalización de función.
        echo '¡Los documentos han sido almacenados correctamente! ✅<br/><br/>';
    }
    
?>