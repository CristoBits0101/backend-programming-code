<?php

    // Paso 3.1) Comprueba los campos de texto.
    function check_text_fields ()
    {
        if
        (
            /**
             * VALIDACIÓN DE INPUT TYPE TEXT.
             */
            // Paso 3.2) Si el autor, el nombre de los documentos, la descripción y las palabras clave no disponen de datos, lanzamos un error controlado.
            !isset($_REQUEST['autor'])                || empty($_REQUEST['autor'])                 ||
            !isset($_REQUEST['nombreDocumentos'])     || empty($_REQUEST['nombreDocumentos'])      ||
            !isset($_REQUEST['descripcionDocumento']) || empty($_REQUEST['descripcionDocumento'])  ||
            !isset($_REQUEST['palabrasClave'])        || empty($_REQUEST['palabrasClave'])         ||

            /**
             * VALIDACIÓN DE LOS SELECT OPTION Y INPUT TYPE RADIO.
             */
            // Paso 3.3) Si el tipo de documento, los idiomas y la visibilidad son diferente a todos los valores posibles, lanzamos un error controlado.
            $_REQUEST['tipoDocumento'] !== 'documento'    && $_REQUEST['tipoDocumento'] !== 'informe'  && 
            $_REQUEST['tipoDocumento'] !== 'presentacion' && $_REQUEST['tipoDocumento'] !== 'variados' ||

            $_REQUEST['idioma'] !== 'es' && $_REQUEST['idioma'] !== 'en' && $_REQUEST['idioma'] !== 'otrosIdiomas' ||

            $_REQUEST['visibilidad'] !== 'publico' && $_REQUEST['visibilidad'] !== 'privado' ||

            !isset($_REQUEST['tematica'])
        )
        {
            throw new Exception("¡ERROR! (verifique que ha introducido todos los datos y vuelva a intentarlo).");
        }

        else
        {
            echo '<br/>¡El autor, nombre de documentos, tipo de documento y palabras clave pasan el filtro! ✅<br/><br/>';
            echo '<br/>¡El tipo de documento, el idioma y la visibilidad pasan el filtro! ✅<br/><br/>';
            echo '<br/>¡Al menos una temática seleccionada! ✅<br/><br/>';
            
            return true;
        }
    }

?>