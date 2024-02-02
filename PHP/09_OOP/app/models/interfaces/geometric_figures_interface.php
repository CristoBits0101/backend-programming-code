<?php

// Definición de una interfaz que se utilizará como plantilla para que todas las clases respeten la cantidad de métodos y sus nombres.
interface Template
{
    /**
     * Obtiene el área de la forma geométrica.
     *
     * @return El área de la forma geométrica.
     */
    public function getArea();

    /**
     * Obtiene el perímetro de la forma geométrica.
     *
     * @return El perímetro de la forma geométrica.
     */
    public function getPerimeter();
}