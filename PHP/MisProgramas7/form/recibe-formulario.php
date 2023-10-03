<?php
    function validate_form()
    {
        // Text.
        (!isset($_REQUEST['name'])           || empty($_REQUEST['name']))           ? null : throw new Exception("¡ERROR! (verifique el nombre).");
        (!isset($_REQUEST['password'])       || empty($_REQUEST['password']))       ? null : throw new Exception("¡ERROR! (verifique la contraseña).");
        (!isset($_REQUEST['repeatPassword']) || empty($_REQUEST['repeatPassword'])) ? null : throw new Exception("¡ERROR! (verifique la confirmación de contraseña).");

        // Select.
        ($_REQUEST['incorporation'] !== 'immediate' && $_REQUEST['incorporation'] !== 'days') ? null : throw new Exception("¡ERROR! (verifique la fecha deincorporación).");

        // Radio.
        if
        (
            $_REQUEST['incorporation'] !== 'publico' && 
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
    }
?>