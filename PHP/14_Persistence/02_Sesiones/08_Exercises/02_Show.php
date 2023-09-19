<?php

    session_start();

    $mensaje = "";

    // Comprobamos si ya se ha enviado el formulario.
    if (isset($_POST['borrar']))
    {
        // Eliminamos la información en la sesión.
        session_unset();

        $mensaje = "Información de la sesión eliminada.";
    }

?>

<!DOCTYPE html>

<html lang="es">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Preferencias por usuario</title>

    <link href="estilo.css" rel="stylesheet" type="text/css">

</head>

<body>

    <div id='login'>

        <form action='<?php echo $_SERVER['PHP_SELF'] ?>' method='post'>

            <fieldset>

                <legend>Preferencias</legend>

                <div>
                    <span class='mensaje'>
                        <?php echo $mensaje; ?>
                    </span>
                </div>

                <!-- Recuperamos la información de la sesión -->

                <!-- I D I O M A -->
                <div class='campo'>

                    <label class='etiqueta'>
                        Idioma:
                    </label>

                    <br/>

                    <label class='texto'>
                        <?php if (isset($_SESSION['idioma'])) 
                            {
                                echo $_SESSION['idioma'];
                                                
                            } 
                        ?>
                    </label>

                </div>

                <!-- P E R F I L -->
                <div class='campo'>

                    <label class='etiqueta'>
                        Perfil público:
                    </label>
                    
                    <br/>

                    <label class='texto'>
                        <?php 
                            if (isset($_SESSION['perfpublico'])) 
                            {
                                echo $_SESSION['perfpublico'];
                            } 
                        ?>
                    </label>

                </div>

                <!-- H O R A R I O -->
                <div class='campo'>

                    <label class='etiqueta'>
                        Zona horaria:
                    </label>

                    <br/>

                    <label class='texto'>
                        <?php 
                            if (isset($_SESSION['zonahoraria'])) 
                            {
                                echo $_SESSION['zonahoraria'];
                            } 
                        ?>
                    </label>

                </div>

                <br/>

                <!-- B O R R A R -->
                <div class='campo'>
                    <input type='submit' name='borrar' value='Borrar preferencias' />
                </div>

                <!-- P R E F E R E N C I A S -->
                <div class='campo'>
                    <a href="preferencias.php">Establecer preferencias</a>
                </div>

            </fieldset>

        </form>

    </div>

</body>

</html>