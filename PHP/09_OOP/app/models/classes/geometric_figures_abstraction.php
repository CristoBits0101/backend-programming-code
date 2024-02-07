<?php

require_once __DIR__ . '/../interfaces/geometric_figures_interface.php';

// Definición de una clase abstracta llamada GeometricFiguresAbstraction que implementa la interfaz GeometricFiguresInterface.
abstract class Amorphous implements Template
{
    // Propiedades protegidas que almacenarán el área y el perímetro de la figura geométrica.
    protected $name;

    // Constructor de la clase abstracta. Puede personalizarse según las necesidades.
    public function __construct(string $name = null)
    {
        // Asigna el nombre al atributo name.
        $this->name = $name;
    }

    // Método abstracto que debe implementarse por las clases que extiendan esta clase abstracta para obtener el nombre de la figura geométrica.
    abstract public function getName();

    // Método abstracto que debe implementarse por las clases que extiendan esta clase abstracta para obtener el área de la figura geométrica.
    abstract public function getArea();

    // Método abstracto que debe implementarse por las clases que extiendan esta clase abstracta para obtener el perímetro de la figura geométrica.
    abstract public function getPerimeter();
}