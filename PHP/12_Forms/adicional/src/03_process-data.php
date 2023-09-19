<?php

    include_once "./04_user-class.php";

    function process_data()
    {
        // File1.
        $_extension1 = pathinfo($_FILES['fichero1']['name'], PATHINFO_EXTENSION);
        $_filePath1 = $_FILES['fichero1']['tmp_name'];
        $_newPath1 = "C:/xampp/htdocs/dsw-ut2_examen/files/".$_extension1.'/'.$_FILES['fichero1']['name'];
        
        move_uploaded_file($_filePath1, "$_newPath1");

        echo '¡Fichero 1 almacenado! ✅<br/><br/>';

        // File2.
        $_extension2 = pathinfo($_FILES['fichero2']['name'], PATHINFO_EXTENSION);
        $_filePath2 = $_FILES['fichero2']['tmp_name'];
        $_newPath2 = "C:/xampp/htdocs/dsw-ut2_examen/files/".$_extension2.'/'.$_FILES['fichero2']['name'];
        
        move_uploaded_file($_filePath2, "$_newPath2");

        echo '¡Fichero 2 almacenado! ✅<br/><br/>';

        // Photo.
        $_extension3 = pathinfo($_FILES['foto']['name'], PATHINFO_EXTENSION);
        $_filePath3 = $_FILES['foto']['tmp_name'];
        $_newPath3 = "C:/xampp/htdocs/dsw-ut2_examen/files/".$_extension3.'/'.$_FILES['foto']['name'];
        $_showPhoto = 'http://localhost/dsw-ut2_examen/files/png/1.png';
        
        move_uploaded_file($_filePath3, "$_newPath3");

        echo '¡Foto almacenada! ✅<br/><br/>';

        // Data.
        $_tematica = '';

        foreach 
        (
            $_REQUEST['tematica'] as $key => $value
        )
        {
            if 
            (
                $value !== null
            ) 
            {
                $_tematica .= $value;
            }
            else
            {
                break;
            }
            
        }

        $receivedData = new UserData 
        (
            $_REQUEST['nombre'],
            $_REQUEST['apellidos'],
            $_REQUEST['telefono'],
            $_REQUEST['correo'],
            $_REQUEST['contrasena1'],
            $_REQUEST['idioma'],
            $_REQUEST['visibilidad'],
            $_tematica,
            'fichero txt 1',
            'fichero txt 2',
            $_showPhoto
        );

        echo '¡Usuario identificado! ✅<br/><br/>';

        // Write.
        $_file = fopen("../files/txt/data.txt", "w");

        fwrite  ( 
                    $_file, 
                    $receivedData->getNombre()      . ':' .
                    $receivedData->getApellidos()   . ':' .
                    $receivedData->getTelefono()    . ':' .
                    $receivedData->getCorreo()      . ':' .
                    $receivedData->getContrasena1() . ':' .
                    $receivedData->getIdioma()      . ':' .
                    $receivedData->getVisibilidad() . ':' .
                    $receivedData->getTematica()    . ':' .
                    $receivedData->getFichero1()    . ':' .
                    $receivedData->getFichero2()    . ':' .
                    $receivedData->getFoto()        
                );

        fclose($_file);

        echo '¡Fichero actualizado! ✅<br/><br/>';
    }

?>