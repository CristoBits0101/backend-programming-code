<?php

    require "clases/cliente.php";
    require "clases/operaciones.php";

    // Crear una persona.
    $per = new Persona("1111111A", "Ana", "Puertas");

    // Mostrarla, usa el método __toString().
    echo $per . "<br>";

    // Cambiar el apellido.
    $per->setApellido("Montes");

    // Volver a mostrar.
    echo $per . "<br>";

    // Crea un cliente.
    $cli = new Cliente("22222245A", "Pedro", "Sales", 100);

    // Lo muestra.
    echo $cli . "<br>";

    $operaciones = new Operaciones([]);

    // $operaciones->setClientes = $operaciones->generarCLientesAleatorios(15);
    $operaciones->generarTablaClientes();

?>