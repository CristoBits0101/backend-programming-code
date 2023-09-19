<?php

    // Cargamos los datos del fichero modulos.xml.
    $datos = simplexml_load_file("modulos.xml");

    /**
     *  - Nombre de los módulos que se imparten en el Instituto:
     *  - Aplicaciones web, gestión de bases de datos, lenguajes de marcas y sistemas de gestión de información, implantación de aplicaciones web.
     */
    $modulos = $datos->xpath("//nombre");

    foreach ($modulos as $modulo) 
    {
        echo $modulo . ",";
    }

    /**
     *  - Nombre de los módulos del ciclo ASIR:
     *  - Gestión de bases de datos, Lenguajes de marcas y sistemas de gestión de información, Implantación de aplicaciones web.
     */
    echo "<br/><br>/";
    
    $modulos = $datos->xpath("//modulo");

    /**
     *  - Se puede utilizar también.. sin el if..
     *  - $modulos = $datos->xpath("//modulo[ciclo='ASIR']/nombre");
     */
    foreach ($modulos as $modulo) 
    {
        if ($modulo->ciclo == "ASIR") 
        {
            echo $modulo->nombre . " ";
        }
    }

    /**
     *  - Nombre de los módulos que se imparten en el segundo curso de cualquier ciclo:
     *  - Aplicaciones web, implantación de aplicaciones web
     */
    echo "<br/><br>/";
    
    $modulos = $datos->xpath("//modulo");

    // $modulos = $datos->xpath("//modulo[curso='2']/nombre");

    foreach ($modulos as $modulo) 
    {
        if ((int) $modulo->curso == 2) 
        {
            echo $modulo->nombre . " ";
        }
    }

    /**
     *  - Nombre de los módulos de menos de 5 horas semanales:
     *  - Aplicaciones web lenguajes de marcas y sistemas de gestión de información.
     */
    echo "<br/><br>/";
    
    $modulos = $datos->xpath("//modulo");

    // $modulos = $datos->xpath("//modulo[horasSemanales<5]/nombre");

    foreach ($modulos as $modulo) 
    {
        if ((int) $modulo->horasSemanales < 5) 
        {
            echo $modulo->nombre . " ";
        }
    }

    /**
     *  - Nombre de los módulos que se imparten en el primer curso de ASIR:
     *  - Gestión de bases de datos Lenguajes de marcas y sistemas de gestión de información.
     */
    echo "<br/><br>/";
    
    $modulos = $datos->xpath("//modulo");

    // $modulos = $datos->xpath("//modulo[curso=1 and ciclo='ASIR']/nombre");

    foreach ($modulos as $modulo) 
    {
        if ((int) $modulo->curso == 1 && $modulo->ciclo == "ASIR") 
        {
            echo $modulo->nombre . " ";
        }
    }

    // Horas semanales de los módulos de más de 3 horas semanales: 4 5 5

    echo "<br/><br>/";

    $modulos = $datos->xpath("//modulo");

    // $modulos = $datos->xpath("//modulo[horasSemanales>3]/horasSemanales");

    foreach ($modulos as $modulo) 
    {
        if ((int) $modulo->horasSemanales > 3) 
        {
            echo $modulo->horasSemanales . " ";
        }
    }

?>