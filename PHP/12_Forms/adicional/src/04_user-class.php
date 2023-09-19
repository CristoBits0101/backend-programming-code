<?php

    class UserData 
    {
        private $nombre;
        private $apellidos;
        private $telefono;
        private $correo;
        private $contrasena1;
        private $idioma;
        private $visibilidad;
        private $tematica;
        private $fichero1;
        private $fichero2;
        private $foto;

        function __construct
        (
                $nombre,
                $apellidos,
                $telefono,
                $correo,
                $contrasena1,
                $idioma,
                $visibilidad,
                $tematica,
                $fichero1,
                $fichero2,
                $foto,
        ) 
        {
                $this->nombre = $nombre;
                $this->apellidos = $apellidos;
                $this->telefono = $telefono;
                $this->correo = $correo;
                $this-> contrasena1= $contrasena1;
                $this->idioma = $idioma;
                $this->visibilidad = $visibilidad;
                $this->tematica = $tematica;
                $this->fichero1 = $fichero1;
                $this->fichero2 = $fichero2;
                $this->foto = $foto;
        }

        /**
         * Get the value of nombre
         */ 
        public function getNombre(){return $this->nombre;}

        /**
         * Set the value of nombre
         *
         * @return  self
         */ 
        public function setNombre($nombre)
        {
                $this->nombre = $nombre;

                return $this;
        }

        /**
         * Get the value of apellidos
         */ 
        public function getApellidos()
        {
                return $this->apellidos;
        }

        /**
         * Set the value of apellidos
         *
         * @return  self
         */ 
        public function setApellidos($apellidos)
        {
                $this->apellidos = $apellidos;

                return $this;
        }

        /**
         * Get the value of telefono
         */ 
        public function getTelefono()
        {
                return $this->telefono;
        }

        /**
         * Set the value of telefono
         *
         * @return  self
         */ 
        public function setTelefono($telefono)
        {
                $this->telefono = $telefono;

                return $this;
        }

        /**
         * Get the value of correo
         */ 
        public function getCorreo()
        {
                return $this->correo;
        }

        /**
         * Set the value of correo
         *
         * @return  self
         */ 
        public function setCorreo($correo)
        {
                $this->correo = $correo;

                return $this;
        }

        /**
         * Get the value of contrasena1
         */ 
        public function getContrasena1()
        {
                return $this->contrasena1;
        }

        /**
         * Set the value of contrasena1
         *
         * @return  self
         */ 
        public function setContrasena1($contrasena1)
        {
                $this->contrasena1 = $contrasena1;

                return $this;
        }

        /**
         * Get the value of idioma
         */ 
        public function getIdioma()
        {
                return $this->idioma;
        }

        /**
         * Set the value of idioma
         *
         * @return  self
         */ 
        public function setIdioma($idioma)
        {
                $this->idioma = $idioma;

                return $this;
        }

        /**
         * Get the value of visibilidad
         */ 
        public function getVisibilidad()
        {
                return $this->visibilidad;
        }

        /**
         * Set the value of visibilidad
         *
         * @return  self
         */ 
        public function setVisibilidad($visibilidad)
        {
                $this->visibilidad = $visibilidad;

                return $this;
        }

        /**
         * Get the value of tematica
         */ 
        public function getTematica()
        {
                return $this->tematica;
        }

        /**
         * Set the value of tematica
         *
         * @return  self
         */ 
        public function setTematica($tematica)
        {
                $this->tematica = $tematica;

                return $this;
        }

        /**
         * Get the value of fichero1
         */ 
        public function getFichero1()
        {
                return $this->fichero1;
        }

        /**
         * Set the value of fichero1
         *
         * @return  self
         */ 
        public function setFichero1($fichero1)
        {
                $this->fichero1 = $fichero1;

                return $this;
        }

        /**
         * Get the value of fichero2
         */ 
        public function getFichero2()
        {
                return $this->fichero2;
        }

        /**
         * Set the value of fichero2
         *
         * @return  self
         */ 
        public function setFichero2($fichero2)
        {
                $this->fichero2 = $fichero2;

                return $this;
        }

        /**
         * Get the value of foto
         */ 
        public function getFoto()
        {
                return $this->foto;
        }

        /**
         * Set the value of foto
         *
         * @return  self
         */ 
        public function setFoto($foto)
        {
                $this->foto = $foto;

                return $this;
        }
    }

?>