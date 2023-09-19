<?php

    # Las claves de acceso, ahora las ponemos aquí.
    # Y en otro ejercicio las ponemos en una base de datos.
    $usuarioCorrecto = "prueba";
    $passwordCorrecto = "prueba";

    /*
     *  - Para  leer  los  datos  que fueron enviados al formulario,
     *    accedemos al arreglo llamado $_POST en PHP. 
     *  - Para obtener un valor accedemos a $_POST["clave"] en donde 
     *    clave es el "nombre" que le dimos al valor de entrada.
     */

    # Nota: no estamos haciendo validaciones.
    $usuario = $_POST["usuario"];
    $password = $_POST["password"];

    # Luego de haber obtenido los valores, ya podemos comprobar:
    if ($usuario === $usuarioCorrecto && $password === $passwordCorrecto) 
    {
        # Significa que coinciden, vamos a guardar algo en el arreglo superglobal $_SESSION.
        # Ya que ese arreglo "persiste" a través de todas las páginas.
        # Iniciar sesión para poder usar el arreglo.
        session_start();

        # Y guardar un valor que nos pueda decir si el usuario.
        # Ya ha iniciado sesión o no.
        # En este caso es el nombre de usuario.
        $_SESSION["usuario"] = $usuario;

        # Luego redireccionamos a la página "Secreta".
        header("Location: secreta.php");
    } 

    else 
    {
        # No coinciden, así que simplemente imprimimos un mensaje diciendo que es incorrecto.
        echo "El usuario o la contraseña son incorrectos";
        echo "<a href='index.php'><button>Volver</button></a>";
    }

?>