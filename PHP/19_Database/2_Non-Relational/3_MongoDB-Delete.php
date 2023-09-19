<?php

	require 'vendor/autoload.php'; 

	try 
	{
		// $cliente = new MongoDB\Client("mongodb://localhost:27017");

		$bd = $cliente->empresa;

		// Pone a 7000 el saldo del usuario con nombre Ana.
		// $updateResult = $bd->usuarios->deleteMany([]);
		$updateResult = $bd->usuarios->deleteOne(
			[ 'nombre' => 'Paco' ]
		);

		echo "Documentos restantes después de borrar: " . $bd->usuarios->count();
	}

	catch (Exception $e) 
	{
		print ($e);
	}

?>