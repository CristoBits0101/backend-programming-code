<?php

    /**
     *  - Activity: A1.2
     *  - Author: Cristo Rubén Pérez Suárez
     */

    /**
     *  - PASO 1) Definir el horario y guardar el estado en la memoria mediante una matriz porque tiene 2 claves de acceso a la información.
     */

    // Lunes.
    $_horario[1][1] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:00 - 08:55
    $_horario[1][2] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:55 - 09:50
    $_horario[1][3] = "Docente: MarM\nMódulo: DPL\nTaller: G201\n"; // 09:50 - 10:45
    $_horario[1][4] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 11:15 - 12:10
    $_horario[1][5] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 12:10 - 13:05
    $_horario[1][6] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 13:05 - 14:00

    // Martes.
    $_horario[2][1] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:00 - 08:55
    $_horario[2][2] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:55 - 09:50
    $_horario[2][3] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 09:50 - 10:45
    $_horario[2][4] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 11:15 - 12:10
    $_horario[2][5] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 12:10 - 13:05
    $_horario[2][6] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 13:05 - 14:00

    // Miércoles.
    $_horario[3][1] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:00 - 08:55
    $_horario[3][2] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 08:55 - 09:50
    $_horario[3][3] = "Docente: MarR\nMódulo: DEW\nTaller: G201\n"; // 09:50 - 10:45
    $_horario[3][4] = "Docente: MarM\nMódulo: DPL\nTaller: G201\n"; // 11:15 - 12:10
    $_horario[3][5] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 12:10 - 13:05
    $_horario[3][6] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 13:05 - 14:00

    // Jueves.
    $_horario[4][1] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 08:00 - 08:55
    $_horario[4][2] = "Docente: MarV\nMódulo: DOR\nTaller: G201\n"; // 08:55 - 09:50
    $_horario[4][3] = "Docente: MarG\nMódulo: EMR\nTaller: G201\n"; // 09:50 - 10:45
    $_horario[4][4] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 11:15 - 12:10
    $_horario[4][5] = "Docente: MarR\nMódulo: DPL\nTaller: G201\n"; // 12:10 - 13:05
    $_horario[4][6] = "Docente: MarR\nMódulo: DPL\nTaller: G201\n"; // 13:05 - 14:00

    // Viernes.
    $_horario[5][1] = "Docente: MarG\nMódulo: EMR\nTaller: G201\n"; // 08:00 - 08:55
    $_horario[5][2] = "Docente: MarG\nMódulo: EMR\nTaller: G201\n"; // 08:55 - 09:50
    $_horario[5][3] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 09:50 - 10:45
    $_horario[5][4] = "Docente: SerR\nMódulo: DSW\nTaller: G201\n"; // 11:15 - 12:10
    $_horario[5][5] = "Docente: MarM\nMódulo: DPL\nTaller: G201\n"; // 12:10 - 13:05
    $_horario[5][6] = "Docente: MarM\nMódulo: DPL\nTaller: G201\n"; // 13:05 - 14:00

    /**
     *  - PASO 2) Preguntar al usuario que día de la semana desea ver y guardar la elección en una variable.
     */
    do {

        echo "
        Seleccione el día de la semana:
        1) Lunes
        2) Martes
        3) Miércoles
        4) Jueves
        5) Viernes
        ";
        
        $_selectionDay = trim(fgets(STDIN));

        if ($_selectionDay < 1 || $_selectionDay > 5) 
        {
            echo "\n¡La elección debe estar dentro del rango de números permitidos en el menú!\n";
        }

    } while ($_selectionDay < 1 || $_selectionDay > 5);

    /**
     *  - PASO 3) Preguntar al usuario que hora del día desea ver y guardar la elección en una variable.
     */
    do {

        echo "
        Seleccione el día de la semana:
        1) 08:00 - 08:55
        2) 08:55 - 09:50
        3) 09:50 - 10:45
        4) 11:15 - 12:10
        5) 12:10 - 13:05
        6) 13:05 - 14:00
        ";
        
        $_selectionHour = trim(fgets(STDIN));

        if ($_selectionHour < 1 || $_selectionHour > 6) 
        {
            echo "\n¡La elección debe estar dentro del rango de números permitidos en el menú!\n";
        }

    } while ($_selectionHour < 1 || $_selectionHour > 6);

    echo "\n";
    echo $_horario[$_selectionDay][$_selectionHour];

?>