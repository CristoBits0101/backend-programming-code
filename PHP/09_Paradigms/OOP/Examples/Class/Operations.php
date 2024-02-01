<?php

    class Operaciones 
    {
        private $clientes = [];

        function __construct($clientes) 
        {
            $this->clientes = $clientes;
        }

        public function setClientes($clientes) 
        {
            $this->clientes = $clientes;
        }

        public function getClientes() 
        {
            return $this->clientes;
        }

        public function generarCLientesAleatorios($numClientes) 
        {
            $arrayClientes = [];

            // Array de clientes.
            for ($i = 0; $i < $numClientes; $i++) 
            {
                $cliente = new Cliente("a00$i", "Cliente$i", "Sales$i", rand(1500, 5000));
                $arrayClientes[] = $cliente;
            }

            $this->clientes = $arrayClientes;
        }

        public function generarTablaClientes() 
        {
            if (count($this->clientes) <= 0) 
            {
                return "La tabla de clientes no contiene datos";
            }

            echo "
            <table>
                <tr>
                    <th>DNI</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Saldo</th>
                </tr>";

            foreach ($this->clientes as $cliente) 
            {
                echo "
                    <tr>
                        <td>" . $cliente->getDNI()      . "</td>
                        <td>" . $cliente->getNombre()   . "</td>
                        <td>" . $cliente->getApellido() . "</td>
                        <td>" . $cliente->getSaldo()    . "</td>
                    </tr>";
            }

            echo "</table>";
        }
    }
    
?>