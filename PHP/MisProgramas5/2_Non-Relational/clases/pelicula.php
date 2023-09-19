<?php

    class Pelicula implements JsonSerializable
    {
        private $id;
        private $titulo;
        private $director;
        private $actores;
        private $genero;
        private $duracion;
        private $argumento;

        function __construct($datos)
        {
            foreach ($datos as $dato) {
                $this->id = $dato["id"];
                $this->titulo = $dato["titulo"];
                $this->director = $dato["director"];
                $this->actores = $dato["actores"];
                $this->genero = $dato["genero"];
                $this->duracion = $dato["duracion"];
                $this->argumento = $dato["argumento"];
            }
        }

        public function jsonSerialize(): mixed
        {
            return [
                'id' => $this->getId(),
                'titulo' => $this->getTitulo(),
                'director' => $this->getDirector(),
                'actores' => $this->getActores(),
                'genero' => $this->getGenero(),
                'duracion' => $this->getDuracion(),
                'argumento' => $this->getArgumento()
            ];
        }

        /**
         * Get the value of id
         */
        public function getId()
        {
            return $this->id;
        }

        /**
         * Set the value of id
         *
         * @return  self
         */
        public function setId($id)
        {
            $this->id = $id;

            return $this;
        }

        /**
         * Get the value of titulo
         */
        public function getTitulo()
        {
            return $this->titulo;
        }

        /**
         * Set the value of titulo
         *
         * @return  self
         */
        public function setTitulo($titulo)
        {
            $this->titulo = $titulo;

            return $this;
        }

        /**
         * Get the value of director
         */
        public function getDirector()
        {
            return $this->director;
        }

        /**
         * Set the value of director
         *
         * @return  self
         */
        public function setDirector($director)
        {
            $this->director = $director;

            return $this;
        }

        /**
         * Get the value of actores
         */
        public function getActores()
        {
            return $this->actores;
        }

        /**
         * Set the value of actores
         *
         * @return  self
         */
        public function setActores($actores)
        {
            $this->actores = $actores;

            return $this;
        }

        /**
         * Get the value of genero
         */
        public function getGenero()
        {
            return $this->genero;
        }

        /**
         * Set the value of genero
         *
         * @return  self
         */
        public function setGenero($genero)
        {
            $this->genero = $genero;

            return $this;
        }

        /**
         * Get the value of duracion
         */
        public function getDuracion()
        {
            return $this->duracion;
        }

        /**
         * Set the value of duracion
         *
         * @return  self
         */
        public function setDuracion($duracion)
        {
            $this->duracion = $duracion;

            return $this;
        }

        /**
         * Get the value of argumento
         */
        public function getArgumento()
        {
            return $this->argumento;
        }

        /**
         * Set the value of argumento
         *
         * @return  self
         */
        public function setArgumento($argumento)
        {
            $this->argumento = $argumento;

            return $this;
        }
    }
?>