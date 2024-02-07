<?php

// Dependencia de código.
require_once __DIR__ . "/geometric_figures_triangle.php";
require_once __DIR__ . '/../interfaces/interface_laboratory.php';

/**
 *  EJEMPLO 1
 */

// Implementación de herencia multiple.
class Laboratory1 implements Test1, Test2
{
    // Atributo estático, que se puede llamar sin instanciar objetos de la clase.
    public static $staticAttribute = "Static Attribute";

    // Método estático, que se puede llamar sin instanciar objetos de la clase.
    public static function staticMethod()
    {
        return "Static Method";
    }
}

// Acceso a atributos estáticos.
echo Laboratory1::$staticAttribute;

// Acceso a métodos estáticos
echo Laboratory1::staticMethod();

/**
 *  EJEMPLO 2
 */

// Subclase de dos Superclase, herencia simple derivada.
class Laboratory2 extends Triangle
{
    /**
     *  - Método sobrecargado para devolver los valores adicionales 2, 3 y Mapa.
     *  - Modifico el comportamiento de un método de una clase padre.
     *  - Ya no es el método vacío de una clase abstracta o interfaz.
     */
    public function __construct(float $base = 2, float $height = 3, string $name = "Mapa")
    {
        parent::__construct($height, $base, $name);

        return func_num_args();
    }

    /**
     *  - Método sobrecargado para devolver el valor adicional Laboratorio.
     *  - Modifico el comportamiento de un método de una clase padre.
     *  - Ya no es el método vacío de una clase abstracta o interfaz.
     */
    public function getName()
    {
        return "Laboratorio :( " . $this->name;
    }
}

/**
 *  EJEMPLO 3
 */

// Implementación de método destructor comparandolo con métodos normales.
class Laboratory3
{
    public function __construct()
    {
        echo "Llamada a un constructor\n";
    }

    public function someMethod()
    {
        echo "Llamada a un método\n";
    }

    public function __destruct()
    {
        echo "Llamada a un método destructor\n";
    }
}

// 1. Crear una instancia de la clase.
$laboratory3 = new Laboratory3();

// 2. Llamar a un método de forma normal..
$laboratory3->someMethod();

// 3. El destructor se llama automáticamente cuando la instancia se destruye, explícitamente o cuando el script termina.

/**
 *  EJEMPLO 4
 */

// Implementación de constantes.
 class Laboratory4 
 {
    const constant_example = "Este es un valor constante";

    public function getConstant() 
    {
        return self::constant_example;
    }
}

// Acceder a la constante fuera de la clase.
echo Laboratory4::constant_example;

// Acceder a la constante desde un método dentro de la clase.
$object_test = new Laboratory4();
echo $object_test->getConstant();


/**
 *  EJMPLO 5
 */
class Laboratory5 
{
    function count_constructor_args()
    {
        // Obtenemos el nombre del constructor
        $constructor_name = get_class($this) . "__construct";

        // Obtenemos el número de argumentos pasados al constructor
        return func_num_args($constructor_name);
    }
}

class Laboratory6 
{

	//ahora declaro una serie de métodos constructores que aceptan diversos números de parámetros
	function __constructA()
	{
		$this->__construct1("Anónimo");
	}
	
    function __construct1($nombre)
	{
		$this->__construct2($nombre, "Sin equipo");
	}
		
    function __construct2($nombre, $equipo)
	{
		$this->nombre = $nombre;
	}
}