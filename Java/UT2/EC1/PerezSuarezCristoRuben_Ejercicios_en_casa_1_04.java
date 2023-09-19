
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_en_casa_1_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// "Pregunto al usuario cuantos digitos va a tener su número para saber cuantas posiciones hay en el array.";
		System.out.println("¿Por cuántos dígitos va a estar compuesto su número?:");
		int numberLength = sc.nextInt();

		// "Declaró e inicializo a la variable num, indicando cuantas posiciones va a tener.";
		int num[] = new int[numberLength];

		// "Será usada para inicializar las posiciones del array con el valor de cada dígito.";
		for (int i = 0; i < numberLength; i++) {

			// "Dame el valor de cada posición.";
			System.out.println("Introduzca el dígito de la posición " + i + " :");
			int userNumber = sc.nextInt();

			// "Se aprovechara las vueltas del bucle para indicar las posiciones del array y el valor de estas.";
			num[i] = userNumber;

		}

		// "Le pedimos el dígito que va a utilizar para hacer el intercambio.";
		System.out.println("Introduzca el dígito que quiere añadir:");
		int userDigit = sc.nextInt();

		// "Le pedimos la posición en la que quiere que vaya el número.";
		System.out.println("Introduzca la posición del dígito que quiere sustituir:");
		int userPosition = sc.nextInt();

		// "Cambiamos el valor de la posición.";
		num[userPosition] = userDigit;

		System.out.print("Este es su número con el arreglo incluido: ");

		// "Mostrará todas las posiciones del bucle sin hacer salto de línea.";
		for (int i = 0; i < numberLength; i++) {

			// "Impresión de cada posición de bucle sin hacer salto de línea para que se concatenen.";
			System.out.print(num[i]);

		}
		
		System.out.print(" ");
		
	}

}

