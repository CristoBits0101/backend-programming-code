<?php

    // Get option 1.
    $_newPath  = 'http://'                  .  
    $_SERVER['SERVER_NAME']                 . 
    "/03_Task_UT2/1_sistema_ventas/images/" . 
    $_fileName ;

    // Get option 2.
    $_newPath  = 'http://192.168.0.1:80/03_Task_UT2/1_sistema_ventas/images/'.$_fileName;
    $user->setFoto($_newPath);
    '<td><img width="150px" height="200px" src='.$user->getFoto().'></td>';
    
    // Get option 3.
    $_newPath  = "http://localhost/03_Task_UT2/1_sistema_ventas/images/".$_fileName;
    $user->setFoto($_newPath);
    '<td><img width="150px" height="200px" src='.$user->getFoto().'></td>';
    
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

    if ($$moveUploadedFile) 
    {
        echo "<br>Fichero guardado";
    } 
    else 
    {
        echo "<br>Error";
    }

?>