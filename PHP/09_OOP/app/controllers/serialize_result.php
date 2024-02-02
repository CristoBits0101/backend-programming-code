<?php

    // Inicialización de la sesión para poder usar la variable de sesión.
    session_start();

    // Dependencias.
    require_once "../models/classes/geometric_figures_circle.php";
    require_once "../models/classes/geometric_figures_rectangle.php";
    require_once "../models/classes/geometric_figures_square.php";
    require_once "../models/classes/geometric_figures_triangle.php";

    // Función para inicializar atributos, crear objetos y pasar resultados a la sesión.
    function serialize_circle_result()
    {
        // Polimorfismo, un objeto que se convierte en otro.
        $Amorphous = new Circle($_GET['radio'], $_GET['name']);

        // Guardar el área y el perímetro en la sesión.
        $_SESSION['operation'] = 'circle';
        $_SESSION['name']      = $Amorphous->getName();
        $_SESSION['area']      = $Amorphous->getArea();
        $_SESSION['perimeter'] = $Amorphous->getPerimeter();

        // Redirigir a la página de resultados.
        header("Location: ../../resources/views/layouts/circle.php");
        exit;
    }

    function serialize_rectangle_result()
    {
        // Polimorfismo, un objeto que se convierte en otro.
        $Amorphous = new Rectangle($_GET['width'], $_GET['height'], $_GET['name']);

        // Guardar el área y el perímetro en la sesión.
        $_SESSION['operation'] = 'rectangle';
        $_SESSION['name']      = $Amorphous->getName();
        $_SESSION['area']      = $Amorphous->getArea();
        $_SESSION['perimeter'] = $Amorphous->getPerimeter();

        // Redirigir a la página de resultados.
        header("Location: ../../resources/views/layouts/rectangle.php");
        exit;
    }

    function serialize_square_result()
    {
        // Polimorfismo, un objeto que se convierte en otro.
        $Amorphous = new Square($_GET['side'], $_GET['name']);

        // Guardar el área y el perímetro en la sesión.
        $_SESSION['operation'] = 'square';
        $_SESSION['name']      = $Amorphous->getName();
        $_SESSION['area']      = $Amorphous->getArea();
        $_SESSION['perimeter'] = $Amorphous->getPerimeter();

        // Redirigir a la página de resultados.
        header("Location: ../../resources/views/layouts/square.php");
        exit;
    }

    function serialize_triangle_result()
    {
        // Polimorfismo, un objeto que se convierte en otro.
        $Amorphous = new Triangle($_GET['base'], $_GET['height'], $_GET['name']);

        // Guardar el área y el perímetro en la sesión.
        $_SESSION['operation'] = 'triangle';
        $_SESSION['name']      = $Amorphous->getName();
        $_SESSION['area']      = $Amorphous->getArea();
        $_SESSION['perimeter'] = $Amorphous->getPerimeter();

        // Redirigir a la página de resultados.
        header("Location: ../../resources/views/layouts/triangle.php");
        exit;
    }