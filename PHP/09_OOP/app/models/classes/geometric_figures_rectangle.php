<?php

require_once __DIR__ . "/geometric_figures_abstraction.php";

// Clase llamada Rectangle que hereda de la clase abstracta GeometricFiguresAbstraction.
final class Rectangle extends Amorphous
{
    // Atributos privados que almacenan el ancho y el alto del rectángulo.
    private $width;
    private $height;

    // Constructor de la clase Rectangle que recibe el ancho y el alto como parámetros.
    final public function __construct(float $width = 0, float $height = 0, string $name = null)
    {
        // Llama al constructor de la clase padre.
        parent::__construct($name);
        
        $this->width = $width;
        $this->height = $height;
    }

    // Método para obtener el valor del ancho.
    final public function getWidth()
    {
        return $this->width;
    }

    // Método para establecer un nuevo valor para el ancho.
    final public function setWidth($width)
    {
        $this->width = $width;

        return $this;
    }

    // Método para obtener el valor del alto.
    final public function getHeight()
    {
        return $this->height;
    }

    // Método para establecer un nuevo valor para el alto.
    final public function setHeight($height)
    {
        $this->height = $height;

        return $this;
    }

    /**
     * Obtiene el nombre del objeto.
     *
     * @override.
     *
     * @return string El nombre del objeto.
     */
    final public function getName()
    {
        return $this->name;
    }

    /**
     * Obtiene el área del rectángulo.
     * 
     * @override.
     *
     * @return float El área del rectángulo.
     */
    final public function getArea()
    {
        return $this->width * $this->height;
    }

    /**
     * Obtiene el perímetro del rectángulo.
     * 
     * @override.
     *
     * @return float El perímetro del rectángulo.
     */
    final public function getPerimeter()
    {
        return 2 * ($this->width + $this->height);
    }
}