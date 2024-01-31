<?php
    switch ($_REQUEST['dia']) {
        case '1':
            echo 'Lunes: BAE';
            break;
        case '2':
            echo 'Martes: ETS';
            break;
        case '3':
            echo 'Miercoles: LND';
            break;
        case '4':
            echo 'Jueves: PRO';
            break;
        case '5':
            echo 'Viernes: SSF';
            break;   
        default:
            echo "¡El día indicado, no se imparten clases!";
            break;
    }
?>