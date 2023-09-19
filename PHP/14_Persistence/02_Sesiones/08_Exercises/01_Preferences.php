<?php

    session_start();

    $mensaje = "";

    // Comprobamos si ya se ha enviado el formulario.
    if (isset($_POST['enviar'])) 
    {
        // Guardamos la información en la sesión.

        $_SESSION['idioma'] = $_POST['idioma'];

        $_SESSION['perfpublico'] = $_POST['perfpublico'];

        $_SESSION['zonahoraria'] = $_POST['zonahoraria'];

        $mensaje = "Información guardada en la sesión.";
    }

    function crear_opciones($valores, $seleccionado)
    {
        foreach ($valores as $valor) 
        {
            if ($valor == $seleccionado)
                echo "<option selected='selected'>" . $valor . "</option>";
            else
                echo "<option>" . $valor . "</option>";
        }
    }

    $idiomas = array('español', 'inglés');

    $sino = array('sí', 'no');

    $zonas_horarias = array('GMT-2', 'GMT-1', 'GMT', 'GMT+1', 'GMT+2');

?>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Preferencias por usuario</title>
    
    <link href="estilo.css" rel="stylesheet" type="text/css">

</head>

<body>

    <div id='preferencias'>

        <form action='<?php echo $_SERVER['PHP_SELF'] ?>' method='post'>

            <fieldset>

                <legend>Preferencias</legend>

                <div><span class='mensaje'><?php echo $mensaje; ?></span></div>

                <!-- Recuperamos la información de la sesión -->
                <div class='campo'>
                    <label class='etiqueta' for='idioma'>
                        Idioma:
                    </label>
                    
                    <br/>

                    <select name='idioma' id='idioma'>
                        <?php crear_opciones($idiomas, $_SESSION['idioma']); ?>
                    </select>

                </div>

                <div class='campo'>
        
                    <label class='etiqueta' for='perfpublico'>Perfil público:</label><br/>

                    <select name='perfpublico' id='perfpublico'>
                        <?php crear_opciones($sino, $_SESSION['perfpublico']); ?>
                    </select>

                </div>

                <div class='campo'>

                    <label class='etiqueta' for='zonahoraria'>Zona horaria:</label><br/>

                    <select name='zonahoraria' id='zonahoraria'>
                        <?php crear_opciones($zonas_horarias, $_SESSION['zonahoraria']); ?>
                    </select>

                </div>

                <br/>

                <div class='campo'>
                    <input type='submit' name='enviar' value='Establecer preferencias'/>
                </div>
                
                <div class='campo'>
                    <a href="mostrar.php">Mostrar preferencias</a>
                </div>

            </fieldset>

        </form>

    </div>

</body>

</html>