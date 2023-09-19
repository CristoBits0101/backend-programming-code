<?php

    function validate_form()
    {

        // Text.
        if
        (
            !isset($_REQUEST['nombre'])      || empty($_REQUEST['nombre'])      ||
            !isset($_REQUEST['apellidos'])   || empty($_REQUEST['apellidos'])   ||
            !isset($_REQUEST['telefono'])    || empty($_REQUEST['telefono'])    ||
            !isset($_REQUEST['correo'])      || empty($_REQUEST['correo'])      ||
            !isset($_REQUEST['descripcion']) || empty($_REQUEST['descripcion']) ||
            $_REQUEST['contrasena1'] !== $_REQUEST['contrasena2']
        )
        {
            throw new Exception("¡ERROR! (verifique los datos de usuario).");
        }

        // Select.
        if
        (
            $_REQUEST['idioma'] !== 'es' && 
            $_REQUEST['idioma'] !== 'en'    
        )
        {
            throw new Exception("¡ERROR! (verifique las opciones seleccionadas).");
        }

        // Radio.
        if
        (
            $_REQUEST['visibilidad'] !== 'publico' && 
            $_REQUEST['visibilidad'] !== 'privado'
        )
        {
            throw new Exception("¡ERROR! (verifique las opciones seleccionadas).");
        }

        // Checkbox.
        if 
        (
            !isset($_REQUEST['tematica']) || empty($_REQUEST['tematica'])
        ) 
        {
            throw new Exception("¡ERROR! (verifique los recuadros marcados).");
        }

        foreach ($_REQUEST['tematica'] as $datos)
        {
            if
            (
                $datos !== 'administracion'     && 
                $datos !== 'finanzas'
            )
            {
                throw new Exception("¡ERROR! (verifique los recuadros marcados).");
            }
        }

        // File1.
        if 
        (
            !isset($_FILES['fichero1']) || empty($_FILES['fichero1'])
        ) 
        {
            throw new Exception("¡ERROR! (verifique los documentos).");
        }

        $_fileName1      = $_FILES['fichero1']['name'];     
        $_fileError1     = $_FILES['fichero1']['error'];    
        $_fileSize1      = $_FILES['fichero1']['size'];    
        $_fileMaxSize1   = 1024 * 1024 * 1;
        $_fileExtension1 = pathinfo($_fileName1, PATHINFO_EXTENSION);
        $_fileFormats1   = array('txt','pdf','docx','xlsx','pptx','odt');
        
        if
        (
            $_fileError1 === true                       ||
            $_fileSize1   >  $_fileMaxSize1             ||
            $_fileSize1   <  1                          ||
            !in_array($_fileExtension1, $_fileFormats1)
        )
        {
            throw new Exception("¡ERROR! (verifique los documentos).");
        }

        // File2.
        if 
        (
            !isset($_FILES['fichero2']) || empty($_FILES['fichero2'])
        ) 
        {
            throw new Exception("¡ERROR! (verifique los documentos).");
        }

        $_fileName2      = $_FILES['fichero2']['name'];     
        $_fileError2     = $_FILES['fichero2']['error'];    
        $_fileSize2      = $_FILES['fichero2']['size'];    
        $_fileMaxSize2   = 1024 * 1024 * 1;
        $_fileExtension2 = pathinfo($_fileName2, PATHINFO_EXTENSION);
        $_fileFormats2   = array('txt','pdf','docx','xlsx','pptx','odt');

        if
        (
            $_fileError2 === true                       ||
            $_fileSize2   >  $_fileMaxSize2             ||
            $_fileSize2   <  1                          ||
            !in_array($_fileExtension2, $_fileFormats2)
        )
        {
            throw new Exception("¡ERROR! (verifique los documentos).");
        }

        // Photo.
        if 
        (
            !isset($_FILES['foto']) || empty($_FILES['foto'])
        ) 
        {
            throw new Exception("¡ERROR! (verifique la foto).");
        }

        $_photoName      = $_FILES['foto']['name'];     
        $_photoError     = $_FILES['foto']['error'];    
        $_photoSize      = $_FILES['foto']['size'];    
        $_photoMaxSize   = 1024 * 1024 * 1;
        $_photoExtension = pathinfo($_photoName, PATHINFO_EXTENSION);
        $_photoFormats   = array('jpg','png','gif');

        if
        (
            $_photoError === true                       ||
            $_photoSize   >  $_photoMaxSize             ||
            $_photoSize   <  1                          ||
            !in_array($_photoExtension, $_photoFormats)
        )
        {
            throw new Exception("¡ERROR! (verifique la foto).");
        }

        echo '¡Contenido del formulario! ✅<br/><br/>';

        return true;

    }

?>