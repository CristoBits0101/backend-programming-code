<?php

    // 1. Configuración.
    define("server",   "localhost");
    define("database", "ieselrincon");
    define("user",     "ouliden");
    define("password", "1234");

    // 2. Conexión.
    try
    {
        $connection = new PDO("mysql:host=$server; dbname=$database", $user, $password);
        $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }

    catch (PDOException $e)
    {
        echo "Error de conexión: " . $e->getMessage();
    }

    if ($_SERVER['REQUEST_METHOD'] === 'GET' && isset($_GET['boton'])) 
    {
        $nombreCompleto = $_GET['nombre_completo'];
        $descripcion = $_GET['descripcion'];

        if (!empty($nombreCompleto)) {
            /* PREPARE */
            /*
            $updateStmt = $conn->prepare("UPDATE modulos SET nombre_completo = :nombre_completo, descripcion = :descripcion WHERE iniciales = :iniciales");
            $updateStmt->bindParam(':nombre_completo', $nombreCompleto);
            $updateStmt->bindParam(':descripcion', $descripcion);
            $updateStmt->bindParam(':iniciales', $iniciales);
            $updateStmt->execute();
            */

            /* QUERY */
            $updateStmt = $conn->query("UPDATE modulos SET nombre_completo = '$nombreCompleto', descripcion = '$descripcion' WHERE iniciales = '$iniciales'");

            echo "Módulo actualizado correctamente.";
        } else {
            echo "El nombre completo es obligatorio.";
        }
    }

/* QUERY */
$stmt = $conn->query("SELECT * FROM modulos WHERE iniciales = '$iniciales'");
$modulo = $stmt->fetch(PDO::FETCH_ASSOC);

?>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Editar Módulo</title>
    </head>
    <body>
        <h2>Editar Módulo</h2>
        <form action="edita_modulo.php" method="get">
            Iniciales:       <?php echo $modulo['iniciales']; ?>
            <br/>
            <br/>

            Nombre Completo: <input type="text" size='50' name="nombre_completo" value="<?php echo $modulo['nombre_completo']; ?>" required>
            <br/>
            <br/>

            Descripción:     <textarea cols='50' name="descripcion"><?php echo $modulo['descripcion']; ?></textarea>
            <br/>
            <br/>

            <input type="hidden" name="iniciales" value="<?php echo $iniciales; ?>">
            
            <input type="submit" name="boton" value="Actualizar">
        </form>
    </body>
</html>