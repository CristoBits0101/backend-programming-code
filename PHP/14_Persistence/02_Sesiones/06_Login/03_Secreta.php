<?php

    # Iniciar sesión para usar $_SESSION
    session_start();

    # Y ahora leer si NO hay algo llamado usuario en la sesión.
    if (empty($_SESSION["usuario"])) 
    {
        # Lo redireccionamos al formulario de inicio de sesión index.php
        header("Location: index.php");
        # Y salimos del script
        //exit();
    }

    # No hace falta un else, pues si el usuario no se identifica, todo lo de abajo no se ejecuta
    echo "Soy un mensaje secreto";

?>

<!-- Por cierto, también se puede usar HTML como en todos los scripts de PHP-->
<p>
    Hola <?php echo $_SESSION["usuario"]; ?>, soy un párrafo HTML que solamente pueden ver los usuarios logueados.
</p>

<!-- Y aprovechando, le indicamos al usuario un enlace para salir-->
<a href="logout.php">Cerrar sesión</a>