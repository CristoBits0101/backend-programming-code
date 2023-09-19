<?php

    class estado 
    {
        const Pendiente  = 'P';
        const Activo     = 'A';
        const Suspendido = 'S';
        const Borrado    = 'B';
    }

    /* 
        Enum estadoUsuario 
        {
            case Pendiente;
            case Activo;
            case Suspendido;
            case Borrado;
        }
    */

    enum estadoUsuario: string 
    {
        case Pendiente  = 'P';
        case Activo     = 'A';
        case Suspendido = 'S';
        case Borrado    = 'B';
    }

    // Uso de enumerados.
    $estadoUsuarioActual = 'P';

    echo "Valor:"  . estadoUsuario::Pendiente->value . "<br>";
    echo "Nombre:" . estadoUsuario::Pendiente->name  . "<br>";

    if (estadoUsuario::Pendiente->value == $estadoUsuarioActual) 
    {
        echo "Usuario está Pendiente de Ingreso <br>";
    }

?>

<!DOCTYPE html>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>

<body>
    
    <select id="estado" name="estadoUsuarios">

        <?php

            // Recorrer enumerados.
            foreach (estadoUsuario::cases() as $enumerado) 
            {
                echo "<option value='$enumerado->value'>$enumerado->name</option>";
            }

        ?>

    </select>

</body>

</html>