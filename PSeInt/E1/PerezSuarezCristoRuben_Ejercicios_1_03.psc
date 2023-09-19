Proceso Ejercicios_1_03
	//"Pedir 5 sueldos y decir cuántos son mayor que 1000 euros".
	//"Un sueldo tiene dos factores: una es que tiene que ser mayor a 0 y dos que puede contener decimales".
	
	//Paso 1) Crear 5 variables para guardar los datos de los 5 sueldos antes de operar con ellos.
	Definir s1, s2, s3, s4, s5 Como Real;
	
	//Paso 2) Pedir al usuario los datos de los sueldos para almacenarlos en las variables.
	Repetir
		Escribir ("Introduzca 5 sueldos mayor a 0 euros:");
		Leer s1, s2, s3, s4, s5;
	Hasta Que s1 > 0 & s2 > 0 & s3 > 0 & s4 > 0 & s5 > 0;
	
	//Paso 3) Buscar que sueldos son mayores y menores a 1000 euros. 
	//"como hay tres posibles caminos usamos la estructura de control condicional y le añadimos una extra para la tercera condición".
	//Operación lógica del sueldo 1.
	Si s1>0 & s1 >1000 Entonces
		Escribir ("El primer sueldo es superior a los 1000 euros.");
	SiNo
		Si  s1>0 & s1 <1000  Entonces
			Escribir ("El primer sueldo es inferior a los 1000 euros.");
		Fin Si
	Fin Si
	
	//Operación lógica del sueldo 2.
	Si s2>0 & s2 >1000 Entonces
		Escribir ("El segundo sueldo es superior a los 1000 euros.");
	SiNo
		Si  s2>0 & s2 <1000  Entonces
			Escribir ("El segundo sueldo es inferior a los 1000 euros.");
		Fin Si
	Fin Si
	
	//Operación lógica del sueldo 3.
	Si s3>0 & s3 >1000 Entonces
		Escribir ("El tercer sueldo es superior a los 1000 euros.");
	SiNo
		Si  s3>0 & s3 <1000  Entonces
			Escribir ("El tercer sueldo es inferior a los 1000 euros.");
		Fin Si
	Fin Si
	
	//Operación lógica del sueldo 4.
	Si s4>0 & s4 >1000 Entonces
		Escribir ("El cuarto sueldo es superior a los 1000 euros.");
	SiNo
		Si  s4>0 & s4 <1000  Entonces
			Escribir ("El cuarto sueldo es inferior a los 1000 euros.");
		Fin Si
	Fin Si
	
	//Operación lógica del sueldo 5.
	Si s5>0 & s5 >1000 Entonces
		Escribir ("El quinto sueldo es superior a los 1000 euros.");
	SiNo
		Si  s5>0 & s5 <1000  Entonces
			Escribir ("El quinto sueldo es inferior a los 1000 euros.");
		Fin Si
	Fin Si
	
	//Paso 4) Imprimir que sueldos están por encima de 1000 euros y cuandos están por debajo.
	
	Escribir s1, s2, s3, s4, s5;
	
FinProceso