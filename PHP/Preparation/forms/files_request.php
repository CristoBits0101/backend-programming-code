<?php
    require_once "../files/read_file.php"       // Importación del script de lectura.
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create</title>
</head>
<body>
    <?php
        $file = "../files/form_structure.cfg";  // URL del formulario.
        read_file($file);                       // Inicialización del formulario.
    ?>
</body>
</html>