<?php
    
    // Save option 1.
    $moveUploadedFile = move_uploaded_file
    (
        $_FILES["fichero"]["tmp_name"],
        $_SERVER['DOCUMENT_ROOT'] . "/imagenes/" .
        $_FILES["fichero"]["name"]
    );

    if ($moveUploadedFile) 
    {
        echo "<br>Fichero guardado";
    } 
    else 
    {
        echo "<br>Error";
    }

    // Save option 2
    $moveUploadedFile = move_uploaded_file
    (
        $_FILES["fichero"]["tmp_name"], 
        "/03_Task_UT2/1_sistema_ventas/images/" . 
        $_FILES["fichero"]["name"]
    );

    if ($moveUploadedFile) 
    {
        echo "<br>Fichero guardado";
    } 
    else 
    {
        echo "<br>Error";
    }

?>