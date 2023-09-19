Proceso Ejercicios_2_01
	//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
	
	// 1) Definir la variable donde se va a guardar la nota del alumno.
	Definir nota Como Real;
	
	// 2) Comprobar los valores introducidos por teclado antes de ejecutar el programa.
	Repetir
		Escribir ("Introduzca una nota:");
		Leer nota;
	Hasta Que nota > -1 & nota < 11;
	
	//"Esta resuelto de dos formas ver más abajo".
	// 3) Comparar la nota introducida con la escala de valoración para saber en qué rango se encuentra la nota.
	Segun nota Hacer
		5:
			Escribir ("La nota equivale a un Suficiente");
		6:
			Escribir ("La nota equivale a un Suficiente");
		7:
			Escribir ("La nota equivale a un Bien");
		8:
			Escribir ("La nota equivale a un Notable");
		9:
			Escribir ("La nota equivale a un Notable");
		10:
			Escribir ("La nota equivale a un Sobresaliente");
		De Otro Modo:
			Escribir ("La nota equivale a un Insuficiente");
	Fin Segun

//	Si nota < 5 Entonces
//		Escribir ("La nota equivale a un suspenso");
//	SiNo
//		Si nota = 5 & nota < 6 Entonces
//			Escribir ("La nota equivale a un aprobado");
//		SiNo
//			Si nota = 6 & nota < 7 Entonces
//				Escribir ("La nota equivale a un bien");
//			SiNo
//				Si nota = 7 & nota < 9 Entonces
//					Escribir ("La nota equivale a un notable");
//				SiNo
//					Si nota = 9 & nota <= 10 Entonces
//						Escribir ("La nota equivale a un sobresaliente");
//					Fin Si
//				Fin Si
//			Fin Si
//		Fin Si
//	Fin Si

FinProceso