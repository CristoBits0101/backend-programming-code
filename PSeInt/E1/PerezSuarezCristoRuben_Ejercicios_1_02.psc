Proceso Ejercicios_1_02
	//"Pedir la edad y decir si es mayor de edad o no (añado la condición de juvilado)".
	
	//Paso 1) Defino la variable edad como entera dado, la edad de una persona se cuenta por años vivido unicamente.
	Definir edad como entero;
	
	//Paso 2) Defino un bucle de tipo repetir para que pueda introducir mínimo su edad 1 vez, antes de verificar si cumple los estándares.
	//"Para mi el año 0 no es un año cumplido pero lo esta viviendo así que se puede verificar que esta vivo".
	Repetir
		Escribir ("Ingrese su edad: ");
		leer edad;
	Hasta Que edad > -1;
	
	//Paso 3) Para saber si una persona es mayor debemos basarnos en las leyes que no dice: 
	//"En españa aquel ser humano con una edad igual o superior a 18 se considera mayor de edad y el resto menor".
	//"Basandome en este dato comparo la edad del usuario con la cifra 18 a través de la estructura de control condicional.
	//"Si la condición se cumple es mayor en caso contrario es menor".
	//"Apartir de los 65 uno se puede juvilar en españa".
	Si edad < 18 & edad >= 0 Entonces
		Escribir ("Usted es: Menor de edad");
	SiNo
		Si edad >= 18 & edad < 65 Entonces
			Escribir ("Usted es: Mayor de edad");
		SiNo
			Si edad > 65 Entonces
				Escribir("Usted esta: En edad de jubilación");
			Fin Si
		Fin Si
	Fin Si
	
FinProceso