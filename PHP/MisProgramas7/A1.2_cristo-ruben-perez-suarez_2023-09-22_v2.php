<?php

    /**
     *  - Activity: A1.2
     *  - Author: Cristo Rubén Pérez Suárez
     * */

    // Paso 1) Establecemos la zona horaria a Canarias.
    date_default_timezone_set('Atlantic/Canary');

    // Paso 2) Obtenemos el día de la semana actual.
    $diaSemana = date('l');
    echo "Hoy es: " . $diaSemana . "\n";

    // Paso 3) Obtenemos la hora actual en formato 24h.
    $hora = date('H:i');
    echo "Son las: " . $hora . "\n";

    // Paso 4) Definimos el array de horarios.
    $_horario = [
        "Monday" => [
            "08:00-08:55" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:00 - 08:55
            "08:55-09:50" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:55 - 09:50
            "09:50-10:45" => "Docente: MarM\nMódulo: DPL\nTaller: G201\n", // 09:50 - 10:45
            "11:15-12:10" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 11:15 - 12:10
            "12:10-13:05" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 12:10 - 13:05
            "13:05-14:00" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 13:05 - 14:00
        ],
        "Tuesday" => [
            "08:00-08:55" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:00 - 08:55
            "08:55-09:50" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:55 - 09:50
            "09:50-10:45" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 09:50 - 10:45
            "11:15-12:10" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 11:15 - 12:10
            "12:10-13:05" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 12:10 - 13:05
            "13:05-14:00" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 13:05 - 14:00
        ],
        "Wednesday" => [
            "08:00-08:55" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:00 - 08:55
            "08:55-09:50" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 08:55 - 09:50
            "09:50-10:45" => "Docente: MarR\nMódulo: DEW\nTaller: G201\n", // 09:50 - 10:45
            "11:15-12:10" => "Docente: MarM\nMódulo: DPL\nTaller: G201\n", // 11:15 - 12:10
            "12:10-13:05" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 12:10 - 13:05
            "13:05-14:00" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 13:05 - 14:00
        ],
        "Thursday" => [
            "08:00-08:55" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 08:00 - 08:55
            "08:55-09:50" => "Docente: MarV\nMódulo: DOR\nTaller: G201\n", // 08:55 - 09:50
            "09:50-10:45" => "Docente: MarG\nMódulo: EMR\nTaller: G201\n", // 09:50 - 10:45
            "11:15-12:10" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 11:15 - 12:10
            "12:10-13:05" => "Docente: MarR\nMódulo: DPL\nTaller: G201\n", // 12:10 - 13:05
            "13:05-14:00" => "Docente: MarR\nMódulo: DPL\nTaller: G201\n", // 13:05 - 14:00
        ],
        "Friday" => [
            "08:00-08:55" => "Docente: MarG\nMódulo: EMR\nTaller: G201\n", // 08:00 - 08:55
            "08:55-09:50" => "Docente: MarG\nMódulo: EMR\nTaller: G201\n", // 08:55 - 09:50
            "09:50-10:45" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 09:50 - 10:45
            "11:15-12:10" => "Docente: SerR\nMódulo: DSW\nTaller: G201\n", // 11:15 - 12:10
            "12:10-13:05" => "Docente: MarM\nMódulo: DPL\nTaller: G201\n", // 12:10 - 13:05
            "13:05-14:00" => "Docente: MarM\nMódulo: DPL\nTaller: G201\n", // 13:05 - 14:00
        ],
    ];

    // Paso 5) Verificar si el día de la semana está en el array de horarios.
    if (isset($_horario[$diaSemana])) 
    {
        // Paso 6) Verificar si la hora actual está dentro de un rango en ese día.
        foreach ($_horario[$diaSemana] as $rango => $clase) 
        {
            // Paso 7) Obtenemos la clave y la dividimos en la hora de inicio y fin.
            list($horaInicio, $horaFin) = explode('-', $rango);

            // Paso 8) Convertimos las horas a objetos DateTime para facilitar la comparación.
            $horaActual = new DateTime($hora);
            $horaInicioObj = new DateTime($horaInicio);
            $horaFinObj = new DateTime($horaFin);

            // Paso 9) Si la hora actual está dentro del rango de una clave mostramos el valor de la clave.
            if ($horaActual >= $horaInicioObj && $horaActual <= $horaFinObj) 
            {
                // Paso 10) Mostramos el valor de la clave si está dentro del rango permitido.
                echo "Estás en clase: $clase";
                
                break; // Terminamos el bucle si encontramos una coincidencia.
            }
        }
    } 

    else 
    {
        echo "Hoy a esta hora no tienes clases programadas.";
    }

?>