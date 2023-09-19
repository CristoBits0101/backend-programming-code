Algoritmo Ejercicios_2_03
	//Pedir un número N, y mostrar todos los números del 1 al N.
	
	// 1.a) Defino una variable donde se va a guardar el camino de numeros recorridos.
	// 1.b) Defino una segunda variable para que el usuario determine hasta donde contar y almacenar ese dato.
	Definir dato, i Como entero;
	
	// 2) Le pregunto al usuario hasta donde quiere que se cuente.
	Escribir ("Introduzca un valor de partida:");
	Leer dato;
	
	// 3.a) Nesecito un bucle que se itere hasta el rango definido por el usuario. 
	// 3.b) Cuando el rango se iguale a el rango definido por el usuario este bucle se detendra.
	//"como no sabemos el alcance será un mientras".
	//Ejecuto el escribir dentro del mientras por que si lo hago fuera me da un valor final y no los pasos.
	
	//Si el dato introducido por el usuario es positivo hacer:
	Si dato > 0 Entonces
		Para i <- 0 Hasta dato Con Paso 1 Hacer
			Escribir i;
		Fin Para
	SiNo
		//Si el dato introducido por el usuario es negativo hacer:
		Si dato < 0 Entonces
			Para i <- 0 Hasta dato Con Paso -1 Hacer
				Escribir i;
			Fin Para
		Fin Si
	Fin Si

FinAlgoritmo
