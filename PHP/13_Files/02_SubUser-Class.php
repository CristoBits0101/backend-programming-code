<?php

    require "./01_SuperUser-Class.php";
    
    class SubUser extends SuperUser 
    {
        private $saldo = 0;

        function __construct(){}

        // function __construct($DNI, $nombre, $apellido, $saldo) 
        // {
        //     parent::__construct($DNI, $nombre, $apellido);
        //     $this->$saldo = $saldo;
        // }

        /**
         * Get the value of saldo
         */ 
        public function getSaldo()
        {
            return $this->saldo;
        }

        /**
         * Set the value of saldo
         *
         * @return  self
         */ 
        public function setSaldo($saldo)
        {
            if 
            (
                $saldo !== null && 
                $saldo !== false && 
                $saldo > -1 &&
                is_numeric($saldo) === true
            )  
            {
                $this->saldo = $saldo;
            }
        }
    }

?>