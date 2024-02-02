<?php

// Incluir las clases y la interfaz
require_once './interface/geometric_figures_interface.php';
require_once './class/abstract/geometric_figures_abstraction.php';
require_once './class/generic/geometric_figures_circle.php';
require_once './class/generic/geometric_figures_rectangle.php';
require_once './class/generic/geometric_figures_square.php';
require_once './class/generic/geometric_figures_triangle.php';

// Función para mostrar el formulario y los resultados
function showFormAndResults($formData)
{
    echo '<h2>Calculadora de Área y Perímetro de Figuras Geométricas</h2>';
    echo '<form method="post" action="index.php">';
    echo '<label for="figureType">Seleccione una figura:</label>';
    echo '<select name="figureType" id="figureType">';
    echo '<option value="circle">Círculo</option>';
    echo '<option value="rectangle">Rectángulo</option>';
    echo '<option value="square">Cuadrado</option>';
    echo '<option value="triangle">Triángulo</option>';
    echo '</select><br>';

    switch ($formData['figureType']) {
        case 'circle':
            echo '<label for="radius">Radio:</label>';
            echo '<input type="text" name="radius" id="radius" value="' . $formData['radius'] . '" /><br>';
            break;
        case 'rectangle':
            echo '<label for="width">Ancho:</label>';
            echo '<input type="text" name="width" id="width" value="' . $formData['width'] . '" /><br>';
            echo '<label for="height">Alto:</label>';
            echo '<input type="text" name="height" id="height" value="' . $formData['height'] . '" /><br>';
            break;
        case 'square':
            echo '<label for="side">Lado:</label>';
            echo '<input type="text" name="side" id="side" value="' . $formData['side'] . '" /><br>';
            break;
        case 'triangle':
            echo '<label for="base">Base:</label>';
            echo '<input type="text" name="base" id="base" value="' . $formData['base'] . '" /><br>';
            echo '<label for="triangleHeight">Altura:</label>';
            echo '<input type="text" name="triangleHeight" id="triangleHeight" value="' . $formData['triangleHeight'] . '" /><br>';
            break;
    }

    echo '<input type="submit" value="Calcular">';
    echo '</form>';

    // Mostrar resultados si se han enviado los datos del formulario
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        echo '<h3>Resultados:</h3>';

        // Crear la instancia de la figura seleccionada
        switch ($formData['figureType']) {
            case 'circle':
                $circle = new Circle('Círculo', $formData['radius']);
                echo 'Área: ' . $circle->getArea() . '<br>';
                echo 'Perímetro: ' . $circle->getPerimeter() . '<br>';
                break;
            case 'rectangle':
                $rectangle = new Rectangle($formData['width'], $formData['height']);
                echo 'Área: ' . $rectangle->getArea() . '<br>';
                echo 'Perímetro: ' . $rectangle->getPerimeter() . '<br>';
                break;
            case 'square':
                $square = new Square($formData['side']);
                echo 'Área: ' . $square->getArea() . '<br>';
                echo 'Perímetro: ' . $square->getPerimeter() . '<br>';
                break;
            case 'triangle':
                $triangle = new Triangle($formData['base'], $formData['triangleHeight']);
                echo 'Área: ' . $triangle->getArea() . '<br>';
                echo 'Perímetro: ' . $triangle->getPerimeter() . '<br>';
                break;
        }
    }
}

// Datos del formulario
$formData =
[
    'figureType'     => isset($_POST['figureType'])     ? $_POST['figureType']     : 'circle',
    'radius'         => isset($_POST['radius'])         ? $_POST['radius']         : '',
    'width'          => isset($_POST['width'])          ? $_POST['width']          : '',
    'height'         => isset($_POST['height'])         ? $_POST['height']         : '',
    'side'           => isset($_POST['side'])           ? $_POST['side']           : '',
    'base'           => isset($_POST['base'])           ? $_POST['base']           : '',
    'triangleHeight' => isset($_POST['triangleHeight']) ? $_POST['triangleHeight'] : '',
];

// Mostrar formulario y resultados
showFormAndResults($formData);

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora de áreas y perímetros de figuras geométricas.</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>

</body>

</html>