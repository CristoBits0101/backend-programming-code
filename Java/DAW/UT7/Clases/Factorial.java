import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
	Scanner leer = new Scanner (System.in);
	
	double decision = 1;
	
	while ( decision >= 1) {
		
		int datos = 0;
		
		do {
	
			// Los datos tienen que ser de tipo entero porque los factoriales solo trabajan con enteros naturales.";
			System.out.println ("Introduzca un número de partida, no puede ser negativo: ");
			datos = leer.nextInt();
		
		} while (datos < 1);
	
		// Inicializo factorial en 1 para poder ir multiplicando por el resto de números y pueda coger el valor del dato introducido en la primera vuelta.";
		int factorial = 1;
		
		// Bucle de tipo for que para cuando los datos lleguen a 1 y durante las vueltas vamos igualando y multiplicando.";
		for ( int i = 1; datos > i; datos-- ) {
			
			factorial *= datos;
			
		}
		
	// "Mostramos el en pantalla el factorial obtenido del número introducido.";
	System.out.println ("Esté es el factorial:" + factorial);
	
	// "Preguntamos si desea continuar con el algoritmo y evaluamos la condición de salida en el bucle while.";
	System.out.println ("¿Desea calcular algún factorial más?");
	System.out.println ("1 o superior para sí, 0 o inferior para no.");
	decision = leer.nextInt();
	
	}
		
    }
	
}
