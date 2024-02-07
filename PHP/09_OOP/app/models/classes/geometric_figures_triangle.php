<?php

require_once __DIR__ . "/geometric_figures_abstraction.php";

// Clase llamada Triangle que hereda de la clase abstracta GeometricFiguresAbstraction.
final class Triangle extends Amorphous
{
    // Atributos privados que almacenan la base y la altura del triángulo.
    private $base;
    private $height;

    // Constructor de la clase Triangle que recibe la base y la altura como parámetros.
    public function __construct(float $base = 0, float $height = 0, string $name = null)
    {
        // Llama al constructor de la clase padre.
        parent::__construct($name);
        
        $this->base = $base;
        $this->height = $height;
    }

    // Método para obtener el valor de la base.
    public function getBase()
    {
        return $this->base;
    }

    // Método para establecer un nuevo valor para la base.
    public function setBase($base)
    {
        $this->base = $base;

        return $this;
    }

    // Método para obtener el valor de la altura.
    public function getHeight()
    {
        return $this->height;
    }

    // Método para establecer un nuevo valor para la altura.
    public function setHeight($height)
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
    public function getName()
    {
        return $this->name;
    }

    /**
     * Obtiene el área del triángulo.
     * 
     * @override.
     *
     * @return float El área del triángulo.
     */
    public function getArea()
    {
        return 0.5 * $this->base * $this->height;
    }

    /**
     * Obtiene el perímetro del triángulo (asumiendo que es un triángulo equilátero).
     * 
     * @override.
     *
     * @return float El perímetro del triángulo.
     */
    public function getPerimeter()
    {
        // Para un triángulo equilátero.
        return 3 * $this->base; 
    }
}