<?php

    // require "../vendor/autoload.php";
    // require "cliente.php";

    // use PHPUnit\Framework\TestCase;

    // class clienteTest extends TestCase 
    // {

    //     protected $dni = "1236", $nombre = "yeray", $apellido = "pv", $saldo = 5000;
    //     protected $cliente = null;

    //     public function testContructorCliente() 
    //     {
    //         $cliente = null;
    //         $this->assertNull($cliente);

    //         $cliente = new Cliente($this->dni, $this->nombre, $this->apellido, $this->saldo);
    //         $this->assertInstanceOf(Cliente::class, $cliente);
    //     }

    //     public function testGetNombre() 
    //     {
    //         $cliente = null;
    //         $this->assertNull($cliente);

    //         $cliente = new Cliente($this->dni, $this->nombre, $this->apellido, $this->saldo);
    //         $this->assertStringStartsWith("yeray", $cliente->getNombre());
    //         $this->assertInstanceOf(Cliente::class, $cliente);
    //     }

    //     /**
    //      * @test
    //      */
    //     public function getApellidoValidoTest() 
    //     {
    //         $cliente = null;
    //         $this->assertNull($cliente);

    //         $cliente = new Cliente($this->dni, $this->nombre, $this->apellido, $this->saldo);
    //         $this->assertStringStartsWith("pv", $cliente->getApellido());
    //         $this->assertInstanceOf(Cliente::class, $cliente);
    //     }

    //     /**
    //      * @test
    //      */
    //     public function getSaldo() 
    //     {
    //         $dni = "1234";
    //         $nombre = "yeray";
    //         $apellido = "pv";
    //         $saldo = 0;

    //         // Caso base saldo a 0
    //         $cliente = new Cliente($dni, $nombre, $apellido, $saldo);
    //         $this->assertEquals(0, $cliente->getSaldo());

    //         // Saldo a 3000
    //         $cliente->setSaldo(3000);
    //         $this->assertEquals(3000, $cliente->getSaldo());

    //         $this->assertGreaterThan(2999, $cliente->getSaldo());
    //         $this->assertLessThan(3001, $cliente->getSaldo());
    //     }

    //     /**
    //      * @test
    //      */
    //     public function setSaldoException() 
    //     {
    //         $dni = "1234";
    //         $nombre = "yeray";
    //         $apellido = "pv";
    //         $saldo = 0;

    //         // Caso base saldo a 0
    //         $cliente = new Cliente($dni, $nombre, $apellido, $saldo);
    //         $this->assertEquals(0, $cliente->getSaldo());

    //         // Saldo a -3000 lanza exception
    //         $this->expectException("Exception");
    //         $cliente->setSaldo(-3000);
    //     }

    // }

?>