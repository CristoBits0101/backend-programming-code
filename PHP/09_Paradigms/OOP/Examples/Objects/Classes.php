<?php

    class Persona {

        private $DNI;
        private $nombre;
        private $apellido;

        function __construct($DNI, $nombre, $apellido) {
            $this->DNI = $DNI;
            $this->nombre = $nombre;
            $this->apellido = $apellido;
        }

        public function getDNI() {
            return $this->DNI;
        }

        public function getNombre() {
            return $this->nombre;
        }

        public function getApellido() {
            return $this->apellido;
        }

        public function setNombre($nombre) {
            $this->nombre = $nombre;
        }

        public function setApellido($apellido) {
            $this->apellido = $apellido;
        }

        public function __toString() {
            return "Persona: " . $this->nombre . " " . $this->apellido;
        }

    }

    class Cliente extends Persona {

        private $saldo = 0;

        function __construct($DNI, $nombre, $apellido, $saldo) {
            parent::__construct($DNI, $nombre, $apellido);
            $this->$saldo = $saldo;
        }

        public function getSaldo() {
            return $this->saldo;
        }

        public function setSaldo($saldo) {
            $this->saldo = $saldo;
        }

        public function __toString() {
            return "Cliente: " . $this->getNombre();
        }
    }

    // Crear una persona.
    $per = new Persona("1111111A", "Ana", "Puertas");

    // Mostrarla, usa el método __toString().
    echo $per . "<br>";

    // Cambiar el apellido.
    $per->setApellido("Montes");

    // Volver a mostrar.
    echo $per . "<br>";

    // Crea un cliente.
    $cli = new Cliente("22222245A", "Pedro", "Sales", 100);

    // Lo muestra.
    echo $cli . "<br>";

    // Array de clientes.
    for ($i = 0; $i < 5; $i++) {
        $cliente = new Cliente("a00$i", "Cliente$i", "Sales$i", 100*$i);
        $arrayClientes[$i] = $cliente;
    }
    
    foreach($arrayClientes as $cliente){
        echo $cliente->getDNI() . " " . $cliente->getNombre() . " " . $cliente->getApellido() . "<br>";
    }

?>