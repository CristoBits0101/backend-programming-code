<?php

require_once __DIR__ . "/geometric_figures_abstraction.php";

// Clase llamada Square que hereda de la clase abstracta GeometricFiguresAbstraction.
final class Square extends Amorphous
{
    // Atributo privado que almacena el lado del cuadrado.
    private $side;

    // Constructor de la clase Square que recibe el lado como parámetro.
    final public function __construct(float $side, string $name = null)
    {
        // Llama al constructor de la clase padre.
        parent::__construct($name);

        // Asigna el lado al atributo lado.
        $this->side = $side;
    }

    // Método para obtener el valor del lado.
    final public function getSide()
    {
        return $this->side;
    }

    // Método para establecer un nuevo valor para el lado.
    final public function setSide($side)
    {
        $this->side = $side;

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
     * Obtiene el área del cuadrado.
     *
     * @override.
     *
     * @return float El área del cuadrado.
     */
    final public function getArea()
    {
        return pow($this->side, 2);
    }

    /**
     * Obtiene el perímetro del cuadrado.
     *
     * @override.
     *
     * @return float El perímetro del cuadrado.
     */
    final public function getPerimeter()
    {
        return 4 * $this->side;
    }
}