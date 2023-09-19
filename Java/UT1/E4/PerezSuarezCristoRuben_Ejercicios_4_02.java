
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_4_02 {

	public static void main(String[] args) {
	
	Scanner leer = new Scanner (System.in);
	
	do {
		// Los datos tienen que ser de tipo entero porque los factoriales solo trabajan con enteros naturales;
		System.out.println ("Introduzca un número de partida, no puede ser negativo: ");
		int datos = leer.nextInt();
		
	} while (datos < 0);
	
	// Inicializo factorial en 1 para poder ir multiplicando por el resto de números y pueda coger el valor del dato introducido en la primera vuelta;
	int factorial = 1;
		
		// Bucle de tipo for que para cuando los datos lleguen a 1 y durante las vueltas vamos igualando y multiplicando;
		for ( int i = 1; datos > i; datos-- ) {
			
			factorial *= datos;
			
		}
		
		// Mostramos el en pantalla el factorial obtenido del número introducido;
		System.out.println ("Esté es el factorial:" + factorial);
		
	}
}
