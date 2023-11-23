<?php

    // 1. Dependencia.
    require_once "./configuration.php";

    // 2. Sesión.
    session_start();

    // 3. Redirección.
    if (!isset($_SESSION['user_id']))
    {
        // Alerta.
        $_SESSION['session_inactiva'] = '¡Debe inicar sesión primero para poder usar nuestros servicios!';

        // Redirige.
        header("Location: form_login.php");

        // Detiene.
        exit;
    }

    // 4. Recepción.
    if ($_SERVER['REQUEST_METHOD'] === 'POST')
        validations();

    // 5. Validación.
    function validations()
    {
        // Campos.
        foreach ($_REQUEST as $field => $value)
            if (!isset($value) || empty($value))
                $errors = "<p>'Error en campo $field no almacenado.</p><br/>";

         // Ficheros.
        foreach ($_FILES as $key => $file)
        {
            // Tipos.
            $allowed_types = array(
                "image/jpeg",                                                               // JPEG
                "image/png",                                                                // PNG
                "image/gif",                                                                // GIF
                "application/pdf",                                                          // PDF
                "text/plain",                                                               // TXT
                "application/octet-stream",                                                 // CFG
                "application/msword",                                                       // DOC
                "application/vnd.openxmlformats-officedocument.wordprocessingml.document"   // DOCX
            );

            if (!in_array($file['type'], $allowed_types))
            {
                $errors .= "<p>Error en campo $key: Tipo de archivo no permitido.</p><br/>";
                continue;
            }

            // Tamaño.
            $max_size = 2 * 1024 * 1024;

            if ($file['size'] > $max_size)
            {
                $errors .= "<p>Error en campo $key: El archivo supera el tamaño permitido.</p><br/>";
                continue;
            }
        }

        // Éxito.
        if (empty($errors))
        {
            save_data();
            echo "<script>alert('¡Datos almacenados correctamente!')</script>";
        }

        // Fracaso.
        else
        {
            echo '<div id="mensajes">';
                echo $errors;
                echo '<a href="./crear_producto.php">Volver a rellenar formulario</a>';
            echo '</div>';
        }
    }

    // 6. Almacenamiento.
    function save_data()
    {
        try
        {
            // Path.
            $imagePath  = image_path();

            // Conecta.
            $connection = connect_to_database();

            // Preparación.
            $stmt = $connection->prepare(
                "INSERT INTO
                    productos (Nombre, Precio, Imagen, Categoría)
                VALUES
                    (:nombre, :precio, :imagen, :categoria)"
            );

            // Purificación.
            $nombre    = filter_var($_POST['nombre'], FILTER_UNSAFE_RAW);
            $precio    = filter_var($_POST['precio'], FILTER_VALIDATE_FLOAT);
            $categoria = filter_var($_POST['categoria'], FILTER_UNSAFE_RAW);

            // Sincronización.
            $stmt->bindParam(':nombre', $nombre);
            $stmt->bindParam(':precio', $precio);
            $stmt->bindParam(':imagen', $imagePath);
            $stmt->bindParam(':categoria', $categoria);

            // Ejecución.
            $stmt->execute();

            // Desplazamiento.
            move_uploaded_file($_FILES["imagen"]["tmp_name"], $imagePath);

            // Cierres.
            $connection = null;
            $stmt = null;
        }

        catch (PDOException $e)
        {
            echo "Error al insertar datos: " . $e->getMessage();
        }
    }

    // 7. Path.
    function image_path()
    {
        // Carpeta.
        $target_dir  = "ficheros\\";

        // Destino.
        $target_file = $target_dir . basename($_FILES["imagen"]["name"]);

        // Incrementador.
        $increment = 0;

        // Comprobación.
        while (file_exists($target_file))
        {
            // Incremento.
            $increment++;

            // Datos.
            $pathinfo  = pathinfo($target_file);
            $name      = $pathinfo["filename"];
            $extension = $pathinfo["extension"];

            // Refactorización.
            $target_file =  $target_dir . $name . $increment . "." . $extension;
        }

        // Retorno.
        return basename($target_file);
    }

?>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>CREATE</title>

        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <div class="container">

            <?php
                include_once "./menu.php";
            ?>

            <main>

                <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" enctype="multipart/form-data">

                    <div class="inputs">
                        <label for="nombre">Nombre:</label>
                        <br/>
                        <input type="text" id="nombre" name="nombre">
                    </div>

                    <br/>

                    <div class="inputs">
                        <label for="precio">Precio:</label>
                        <br/>
                        <input type="number" id="precio" name="precio">
                    </div>

                    <br/>

                    <div class="inputs">
                        <label for="imagen">Imagen:</label>
                        <br/>
                        <input type="file" id="imagen" name="imagen" accept=".jpg,.png,.gif,.jfif"/>
                    </div>

                    <br/>

                    <div class="inputs">
                        <p style="margin: 0 0 0.2rem 0 ;"><b>Categoría:</b></p>
                        <select name="categoria" id="categoria">
                            <?php
                                // Conecta.
                                $connection = connect_to_database();

                                // Ejecuta.
                                $stmt = $connection->query(
                                    "SELECT 
                                        id, nombre 
                                    FROM 
                                        Categorías"
                                );

                                // Éxito.
                                if ($stmt) 
                                    while ($row = $stmt->fetch())
                                        echo '<option value="' . $row['id'] . '">' . $row['nombre'] . '</option>';

                                // Fracaso.
                                else
                                    echo '<option value="null"> Las categorías no están disponibles </option>';

                                // Cierres.
                                $connection = null;
                                $stmt = null;
                            ?>
                        </select>
                    </div>

                    <br/>
                    
                    <button type="submit">Envíar</button>

                </form>
            </main>
        </div>
    </body>
</html>
