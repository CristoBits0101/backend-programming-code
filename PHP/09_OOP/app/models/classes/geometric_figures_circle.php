<?php

require_once __DIR__ . "/geometric_figures_abstraction.php";

// Clase llamada Circle que hereda de la clase abstracta GeometricFiguresAbstraction.
final class Circle extends Amorphous
{
    // Atributo privado que almacena el radio del círculo.
    private $radio;

    // Constructor de la clase Circle que recibe el radio como parámetro.
    final public function __construct(int $radio = 0, string $name = null)
    {
        // Llama al constructor de la clase padre.
        parent::__construct($name);

        // Asigna el radio al atributo radio.
        $this->radio = $radio;
    }

    // Método para obtener el valor del radio.
    final public function getRadio()
    {
        return $this->radio;
    }

    // Método para establecer un nuevo valor para el radio.
    final public function setRadio($radio)
    {
        $this->radio = $radio;

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
     * Obtiene el área del círculo.
     *
     * @override.
     *
     * @return float El área del círculo.
     */
    final public function getArea()
    {
        return pi() * pow($this->radio, 2);
    }

    /**
     * Obtiene el perímetro del círculo.
     *
     * @override.
     *
     * @return float El perímetro del círculo.
     */
    final public function getPerimeter()
    {
        return 2 * pi() * $this->radio;
    }
}