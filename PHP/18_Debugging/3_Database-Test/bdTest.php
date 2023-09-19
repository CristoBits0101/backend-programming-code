<?php

    // require "../vendor/autoload.php";
    // require "bd.php";

    // use PHPUnit\Framework\TestCase;

    // class bdTest extends TestCase {

    //     /**
    //      * @test
    //      */
    //     public function leerConfigResultadosValidosTest() 
    //     {
    //         // preparamos el entorno de la prueba creamos objetos, variables, etc.
    //         $alias = "root";
    //         $clave = "1234";
    //         $resultadoLecturaConfigFicheroXML = [];
    //         $resultadoLecturaConfigFicheroXML[] = $alias;
    //         $resultadoLecturaConfigFicheroXML[] = $clave;

    //         $nombreFicheroXML = dirname(__FILE__) . "/configuracion.xml";
    //         $nombreFicheroEsquema = dirname(__FILE__) . "/configuracion.xsd";

    //         // Verificamos que existen los ficheros que vamos a probar
    //         $this->assertFileEquals('configuracion.xml', $nombreFicheroXML);
    //         $this->assertFileEquals('configuracion.xsd', $nombreFicheroEsquema);

    //         $this->assertFileExists($nombreFicheroXML);
    //         $this->assertFileExists($nombreFicheroEsquema);

    //         // realizamos la acción que vamos a probar
    //         $resultado = leer_config($nombreFicheroXML, $nombreFicheroEsquema);

    //         // Verificamos los resultados obtenidos.
    //         $this->assertEquals($resultadoLecturaConfigFicheroXML, $resultado);

    //         $this->assertStringStartsWith('root', $resultado[0]);
    //         $this->assertStringStartsWith('1234', $resultado[1]);
    //     }

    //     /**
    //      * @test
    //      */
    //     public function comprobarUsuarioValidoTest() 
    //     {
    //         // preparamos el entorno de la prueba creamos objetos, variables, etc.
    //         $alias = "root";
    //         $clave = "1234";
    //         $resultadoLecturaConfigFicheroXML = [];
    //         $resultadoLecturaConfigFicheroXML[] = $alias;
    //         $resultadoLecturaConfigFicheroXML[] = $clave;

    //         $nombreFicheroXML = dirname(__FILE__) . "/configuracion.xml";
    //         $nombreFicheroEsquema = dirname(__FILE__) . "/configuracion.xsd";

    //         // Verificamos que existen los ficheros que vamos a probar
    //         $this->assertFileEquals('configuracion.xml', $nombreFicheroXML);
    //         $this->assertFileEquals('configuracion.xsd', $nombreFicheroEsquema);

    //         $this->assertFileExists($nombreFicheroXML);
    //         $this->assertFileExists($nombreFicheroEsquema);

    //         // realizamos la acción que vamos a probar
    //         $resultado = comprobar_usuario($alias, $clave);

    //         // Verificamos los resultados obtenidos.
    //         $this->assertTrue($resultado);
    //     }

    //     /**
    //      * @test
    //      */
    //     public function comprobarUsuarioNoValidoTest() {
    //         // preparamos el entorno de la prueba creamos objetos, variables, etc.
    //         $alias = "admin";
    //         $clave = "1234";
    //         $resultadoLecturaConfigFicheroXML = [];
    //         $resultadoLecturaConfigFicheroXML[] = $alias;
    //         $resultadoLecturaConfigFicheroXML[] = $clave;

    //         $nombreFicheroXML = dirname(__FILE__) . "/configuracion.xml";
    //         $nombreFicheroEsquema = dirname(__FILE__) . "/configuracion.xsd";

    //         // Verificamos que existen los ficheros que vamos a probar
    //         $this->assertFileEquals('configuracion.xml', $nombreFicheroXML);
    //         $this->assertFileEquals('configuracion.xsd', $nombreFicheroEsquema);

    //         $this->assertFileExists($nombreFicheroXML);
    //         $this->assertFileExists($nombreFicheroEsquema);

    //         // realizamos la acción que vamos a probar
    //         $resultado = comprobar_usuario($alias, $clave);

    //         // Verificamos los resultados obtenidos.
    //         $this->assertTrue($resultado);
    //     }

    //     /**
    //      * @test
    //      */
    //     public function cargarCategoriasValidoTest() 
    //     {
    //         $resultado = null;

    //         $this->assertNull($resultado);

    //         $resultado = [];

    //         $this->assertEmpty($resultado);

    //         $resultado = cargar_categorias();

    //         // Deben existir 5 elementos en el array
    //         $this->assertCount(5, $resultado);

    //         // Verificar los identificadores del array
    //         $this->assertArrayHasKey(0, $resultado);
    //         $this->assertArrayHasKey(1, $resultado);
    //         $this->assertArrayHasKey(2, $resultado);
    //         $this->assertArrayHasKey(3, $resultado);
    //         $this->assertArrayHasKey(4, $resultado);
    //     }

    // }

?>