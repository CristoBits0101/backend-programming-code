<?php

    // Se comprueba si existe la cookie.
    if (!isset($_COOKIE["idiomaUsuario"])) 
    {
        // Si no existe, se determina como página la destinada a elegir el idioma.
        $pagina = "pedirIdioma.html";
    } 

    elseif ($_COOKIE["idiomaUsuario"] == "sp") 
    {
        /* Si existe la cookie y el valor de la variable es "sp" se irá a la página en español. Además, se vuelve a grabar la cookie por otras 24 horas. */
        setcookie("idiomaUsuario", "sp", time() + 86400);
        $pagina = "spanish.html";
    } 
    
    else 
    {
        /* Si el valor no es "sp" se irá a la página en inglés. Además, se vuelve a grabar la cookie por otras 24 horas. */
        setcookie("idiomaUsuario", "en", time() + 86400);
        $pagina = "english.html";
    }

?>

<!DOCTYPE html>

<html lang="es">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script language="javascript" type="text/javascript">
        // Se redirige a la página seleccionada.
        location.href = "<?php echo $pagina; ?>";
    </script>

</head>

</html>