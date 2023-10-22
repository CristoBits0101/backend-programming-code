<?php

    // Arquitectura de la información para un usuario del sistema.
    class UserSalesSystem 
    {
        // Atributos válidos para las propiedades de los usuarios registrados.
        private $nombre;
        private $apellidos;
        private $role;
        private $contrasena;
        private $telefono;
        private $email;
        private $foto;

        // Datos obligatorios para almacenar un usuario en el sistema.
        function __construct($nombre, $apellidos, $role, $contrasena, $telefono, $email, $foto) {
            $this->nombre = $nombre;
            $this->apellidos = $apellidos;
            $this->role = $role;
            $this->contrasena = $contrasena;
            $this->telefono = $telefono;
            $this->email = $email;
            $this->foto = $foto;
        }

        /**
         * Get the value of nombre.
         */ 
        public function getNombre()
        {
                return $this->nombre;
        }

        /**
         * Set the value of nombre.
         *
         * @return  self
         */ 
        public function setNombre($nombre)
        {
                $this->nombre = $nombre;
                return $this;
        }

        /**
         * Get the value of apellidos.
         */ 
        public function getApellidos()
        {
                return $this->apellidos;
        }

        /**
         * Set the value of apellidos.
         *
         * @return  self
         */ 
        public function setApellidos($apellidos)
        {
                $this->apellidos = $apellidos;
                return $this;
        }

        /**
         * Get the value of role.
         */ 
        public function getRole()
        {
                return $this->role;
        }

        /**
         * Set the value of role.
         *
         * @return  self
         */ 
        public function setRole($role)
        {
                $this->role = $role;
                return $this;
        }

        /**
         * Get the value of contrasena.
         */ 
        public function getContrasena()
        {
                return $this->contrasena;
        }

        /**
         * Set the value of contrasena.
         *
         * @return  self
         */ 
        public function setContrasena($contrasena)
        {
                $this->contrasena = $contrasena;
                return $this;
        }

        /**
         * Get the value of telefono.
         */ 
        public function getTelefono()
        {
                return $this->telefono;
        }

        /**
         * Set the value of telefono.
         *
         * @return  self
         */ 
        public function setTelefono($telefono)
        {
                $this->telefono = $telefono;
                return $this;
        }

        /**
         * Get the value of email.
         */ 
        public function getEmail()
        {
                return $this->email;
        }

        /**
         * Set the value of email.
         *
         * @return  self
         */ 
        public function setEmail($email)
        {
                $this->email = $email;
                return $this;
        }

        /**
         * Get the value of foto.
         */ 
        public function getFoto()
        {
                return $this->foto;
        }

        /**
         * Set the value of foto.
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