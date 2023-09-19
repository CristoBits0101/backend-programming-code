<?php

    // Captura la excepcion producida.
    try 
    {
        // Cuando ocurra un error esperado definimos y lanzamos la excepcion.
        throw new Exception("Texto de la excepción");
    } 
    
    catch (Exception $e) 
    {
        // Podemos mostrar el texto de la excepcion.
        echo 'Excepción: ', $e->getMessage(), "\n";
    }

    // Ejemplo función que captura el error de la división por cero.
    function inverso($x) 
    {
        if (!$x) 
        {
            throw new Exception('División por cero.');
        }

        return 1/$x;
    }

    try 
    {
        echo inverso(5) . "\n";
        echo inverso(0) . "\n";
    } 
    
    catch (Exception $e) 
    {
        echo 'Excepción capturada: ',  $e->getMessage(), "\n";
    }

    // Continuar la ejecución.
    echo 'Hola Mundo\n';

?>