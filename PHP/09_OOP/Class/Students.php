<?php

    require "persona.php";

    class Alumno extends Persona
    {
        private $edad;
        private $especialidad;
        private $curso;
        private $grupo;
        private $modulos;

        function __construct($DNI, $nombre, $apellido, $edad, $especialidad, $curso, $grupo, $modulos) 
        {
            parent::__construct($DNI, $nombre, $apellido);
            $this->edad = $edad;
            $this->especialidad = $especialidad;
            $this->curso = $curso;
            $this->grupo = $grupo;
            $this->modulos = $modulos;
        }


        /**
         * Get the value of modulos
         */ 
        public function getModulos() 
        {
            return $this->modulos;
        }

        /**
         * Set the value of modulos
         *
         * @return  self
         */ 
        public function setModulos($modulos) 
        {
            $this->modulos = $modulos;

            return $this;
        }

        /**
         * Get the value of grupo
         */ 
        public function getGrupo() 
        {
            return $this->grupo;
        }

        /**
         * Set the value of grupo
         *
         * @return  self
         */ 
        public function setGrupo($grupo) 
        {
            $this->grupo = $grupo;

            return $this;
        }

        /**
         * Get the value of curso
         */ 
        public function getCurso() 
        {
            return $this->curso;
        }

        /**
         * Set the value of curso
         *
         * @return  self
         */ 
        public function setCurso($curso) 
        {
            $this->curso = $curso;

            return $this;
        }

        /**
         * Get the value of especialidad
         */ 
        public function getEspecialidad() 
        {
            return $this->especialidad;
        }

        /**
         * Set the value of especialidad
         *
         * @return  self
         */ 
        public function setEspecialidad($especialidad) 
        {
            $this->especialidad = $especialidad;

            return $this;
        }

        /**
         * Get the value of edad
         */ 
        public function getEdad() 
        {
            return $this->edad;
        }

        /**
         * Set the value of edad
         *
         * @return  self
         */ 
        public function setEdad($edad) 
        {
            $this->edad = $edad;

            return $this;
        }
    }

?>