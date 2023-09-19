<?php

	require 'vendor/autoload.php'; 

	try 
	{
		// $cliente = new MongoDB\Client("mongodb://localhost:27017");
		$bd = $cliente->empresa;

		// Devuelve todos los usuarios.
		echo "Todos los usuarios" . "<br>";
		
		$usuarios = $bd->usuarios->find();

		foreach($usuarios as $usuario)
		{
			var_dump($usuario);
		}

		// Usuarios con nombre Ana
		echo "Usuarias con nombre 'Ana'" . "<br>";

		$usuarios = $bd->usuarios->find(['nombre' => 'Ana']);

		foreach($usuarios as $usuario)
		{
			var_dump($usuario);
		}

		// Solo devuelve el primero que encuentre.
		echo "Usuaria con nombre 'Ana'" . "<br>";

		$ana = $bd->usuarios->findOne(['nombre' => 'Ana']);

		var_dump($ana);
	}

	catch (Exception $e) 
	{
		print ($e);
	}

?>