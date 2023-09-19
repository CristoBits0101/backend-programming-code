Proceso Ejercicios_1_04
	//"Calcular el sueldo a pagar a un trabajador que cobra 15 euros la hora".
	
	//"Para saber cuanto va a cobrar un trabajador primero debemos sabes cuantas horas a estado produciendo".
	
	//Paso 1) Lo primero que voy hacer es crear un variable que me guarde las horas realizadas.
	definir hr Como Entero;
	
	//Paso 2) Lo segundo crear una constante que me almacene los 15 euros que se pagan por hora realizada.
	//"Será de tipo entero por es un precio justo el que se paga no tiene ningun valor porcentual".
	definir e Como Entero;
	
	//Paso 3) Defino una variable que me almacene el resultado de los cálculos.
	//"Sera de tipo entero por que los valores serán exactos".
	Definir t Como Entero;
	
	//Paso 4) Defino la constante.
	e = 15;
	
	//Paso 5) Nesecito saber las horas que ha realizado para poder calcular la cantidad de dinero que le pertenece.
	//"Mínimo debe poder introducir las horas 1 vez antes de verificar que son superiores a 0 que es lo lógico".
	Repetir
		escribir ("Introduzca las horas realizadas por el trabajador:");
		leer hr;
	Hasta Que hr > 0;
	
	//Paso 6) Calculamos el dinero a deber.
	t = e * hr;
	
	//Paso 7) Mostramos el resultado del los cálculos.
	Escribir ("Esta es la cantidad de dinero a pagar: "), t (" euros");
	
FinProceso