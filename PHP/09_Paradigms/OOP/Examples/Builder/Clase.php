<?php

    // Paso 1) Añadir crear la clase.
    class Clase_Nombre 
    {
        // Paso 2) Añadir las propiedades de la clase.
        public $nombre;
        public $edad;

        // Paso 3) Crear un constructor para las propiedades de la clase con un valor por defecto para las propiedades de la clase.
        public function __construct(String $nombre = "Unknown", int $edad = 0) 
        {
            // Paso 4) Asignación de valores al instanciar.
            $this->nombre = $nombre;
            $this->edad = $edad;
        }
    }
    
?>