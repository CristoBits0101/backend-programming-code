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
            // Tipo.
            $allowed_types = array("image/jpeg", "image/png", "image/gif");

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
    function update_data()
    {
        try
        {
            // Path.
            $imagePath = image_path();

            // Conecta.
            $connection = connect_to_database();

            // Preparación.
            $stmt = $connection->prepare(
                "UPDATE 
                    productos 
                SET 
                    Nombre = :nombre, Precio = :precio, Imagen = :imagen, Categoría = :categoria 
                WHERE 
                    id = :producto_id"
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
            $stmt->bindParam(':producto_id', $_POST['producto_id']);

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
            echo "Error al actualizar datos: " . $e->getMessage();
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

        <title>UPDATE</title>

        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <div class="container">

            <?php
                include_once "./menu.php";
            ?>

            <main>
                <?php

                    // 1. Previsualizar.
                    if ($_SERVER['REQUEST_METHOD'] === 'GET' && isset($_GET['id']) && !empty($_GET['id']) && is_numeric($_GET['id'])) 
                    {
                        // Conecta.
                        $connection = connect_to_database();

                        // Preparación.
                        $stmt = $connection->prepare(
                            "SELECT 
                                productos.Nombre,
                                productos.Precio,
                                productos.Imagen,
                                productos.id,
                                Categorías.nombre
                                
                            -- Tabla con la que va a trabajar.
                            FROM 
                                productos

                            -- Trae todo lo de categorías relacionadas con productos.
                            INNER JOIN 
                                Categorías 

                            -- tabla.columna(Primary key) y tabla.columna(Foreign key).
                            ON 
                                productos.Categoría = Categorías.id

                            -- Key que identifica la relación.
                            WHERE 
                                productos.id = :id"
                        );
                        
                        // Purificación.
                        $product_id = filter_var($_GET['id'], FILTER_VALIDATE_INT);

                        // Sincronización.
                        $stmt->bindParam(':id', $product_id);

                        // Éxito.
                        if ($stmt->execute())
                        {
                            // Éxito.
                            if (($row_data = $stmt->fetch()) !== false)
                            {
                                // Serialización.
                                echo '<form action="' . $_SERVER['PHP_SELF'] . '" method="post" enctype="multipart/form-data">';
                                echo '
                                        <div class="inputs">
                                            <label for="nombre">Nombre:</label>
                                            <br/>
                                            <input type="text" id="nombre" name="nombre" value="' . $row_data['Nombre'] . '">
                                        </div>';
                                echo '  <br/>';
                                echo '      
                                        <div class="inputs">
                                            <label for="precio">Precio:</label>
                                            <br/>
                                            <input type="number" id="precio" name="precio" value="' . $row_data['Precio'] . '">
                                        </div>';
                                echo '  <br/>';
                                echo '      
                                        <div class="inputs">
                                            <label for="imagen">Imagen:</label>
                                            <br/>
                                            <input type="file" id="imagen" name="imagen" accept=".jpg,.png,.gif,.jfif" />
                                        </div>';
                                echo '  <br/>';
                                echo '
                                        <div class="inputs">
                                            <p style="margin: 0 0 0.2rem 0 ;"><b>Categoría:</b></p>
                                            <select name="categoria" id="categoria">';

                                                // Consulta.
                                                if (($stmt = $connection->query("SELECT id, nombre FROM Categorías")) !== false)
                                                    while ($categoria = $stmt->fetch())
                                                    {
                                                        $selected = ($categoria['id'] == $row_data['Categoria'])
                                                        ? ' selected'
                                                        : '';
                                                        
                                                        echo '<option value="' . $categoria['id'] . '"' . $selected . '>' . $categoria['nombre'] . '</option>';
                                                    }

                                                else
                                                    echo '<option value="null">Las categorías no están disponibles</option>';

                                echo '
                                    </select>
                                    </div>
                                    <br/>
                                    <input type="hidden" name="producto_id" value="' . $product_id . '">
                                    <button type="submit">Enviar</button>
                                </form>';
                            } 
                            
                            else 
                                echo '<p>No se encontró el producto con el ID proporcionado.</p>';
                        } 
                        
                        // Fracaso.
                        else 
                            echo '<p>No se pudieron recuperar los datos del producto.</p>';

                        // Cierres.
                        $connection = null;
                        $stmt = null;
                    } 
                    
                    // 2. Mostrar.
                    else 
                    {
                        // Formulario.
                        echo '<form action="' . $_SERVER['PHP_SELF'] . '" method="get"><div class="inputs"><p style="margin: 0 0 0.2rem 0 ;"><b>Selecciona un producto:</b></p><br/><select name="id" id="id">';

                        // Conexión.
                        $connection = connect_to_database();

                        // Consultar.
                        $stmt = $connection->query("SELECT id, nombre FROM productos");

                        // Mostrar.
                        if ($stmt)
                            while ($producto = $stmt->fetch())
                                echo '<option value="' . $producto['id'] . '">' . $producto['nombre'] . '</option>';
                        
                        // Fracaso.
                        else 
                            echo '<option value="null">Los productos no están disponibles</option>';

                        // Cierres.
                        echo '</select></div><br/><button type="submit">Seleccionar</button></form>';
                        $connection = null;
                        $stmt = null;
                    }
                ?>
            </main>
        </div>
    </body>
</html>
