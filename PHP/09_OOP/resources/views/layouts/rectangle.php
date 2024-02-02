<?php 

    // Importamos los metadatos de la página.
    require_once "../partials/head.php";

    // Inicialización de la sesión para poder usar la variable de sesión.
    session_start();
    
?>

<body>

    <!-- Incluimos el menú de navegación -->
    <?php require_once "../partials/menu.php"; ?>

    <main>

        <p>INTRODUZCA LOS DATOS</p>

        <br />

        <!-- Formulario para enviar los datos al controllador -->
        <form action="../../../app/controllers/receive_data.php" method="GET">
            <input type="text" name="name" placeholder="Nombre del objeto" />
            <br />
            <br />
            <input type="number" id="width" name="width" placeholder="Ancho del rectángulo">
            <br />
            <br />
            <input type="number" id="height" name="height" placeholder="Alto del rectángulo">
            <br />
            <br />
            <input type="submit" value="Calcular" />
            <input type="hidden" name="figure" value="rectangle" />
        </form>

    </main>

    <aside>
        <?php
            // Comprobación de sí las variables de sesión existen y están inicializadas.
            if 
            (
                $_SESSION['operation'] === 'rectangle' &&
                isset($_SESSION['name'])               &&
                isset($_SESSION['area'])               &&
                isset($_SESSION['perimeter'])          &&
                !empty($_SESSION['name'])              &&
                !empty($_SESSION['area'])              &&
                !empty($_SESSION['perimeter'])
            ) 
            {
                // Imprimimos en una tabla los resultados.
                echo '<table>';
                    echo '<thead>';
                        echo '<tr>';
                        echo '<th>OBJETO</th>';
                        echo '<th>ÁREA</th>';
                        echo '<th>PERÍMETRO</th>';
                        echo '</tr>';
                    echo '</thead>';
                    echo '<tbody>';
                        echo '<tr>';
                        echo '<td>' . $_SESSION['name'] . '</td>';
                        echo '<td>' . $_SESSION['area'] . '</td>';
                        echo '<td>' . $_SESSION['perimeter'] . '</td>';
                        echo '</tr>';
                    echo '</tbody>';
                echo '</table>';

                // Destruimos la sesión después de imprimir los datos.
                session_unset();
                session_destroy();
            } 
            
            else 
            {
                // Si las variables de sesión están vacías o no existen, destruimos la sesión.
                session_unset();
                session_destroy();
            }
        ?>
    </aside>

</body>

</html>