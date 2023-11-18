
/* "Escribe un programa en el que se pidan al usuario dos números enteros.
    A continuación, muestra por pantalla el valor de las funciones definidas como suma, resta, multiplicación, división y resto de la división (módulo)." */;

// "La librería de la clase Scanner.";
import java.util.Scanner;

// "Mi clase principal con el mismo nombre que el del archivo.";
public class perezSuarezCristoRuben_supuestoPractico_UT3_02 {
		
	// "Procedimiento principal".
	public static void main (String [] args) {
		
		// "Llamo a la clase Scanner para poder recoger los datos primitivos y sus métodos para que el usuario introduzca los valores con los que desea trabajar.";
		Scanner sc = new Scanner(System.in);
		
		// "Recogemos las dimensiones que el usuario quiere que tenga el cuadrado.";
		System.out.println ("Introduzca el tamaño que quiere que tenga el cuadrado:");
		int n = sc.nextInt();
		
		// "Carácter que se va a imprimir.";
		String signoSumar = "+";
		
		// "Bucle anidado cada x caracteres se introduce un salto de línea para que no se concatene la impresión.";
		for ( int i = 0; i < n; i++ ) {
		
			for ( int e = 0; e < n; e++ ) {
			
				System.out.print (signoSumar);
		
			}
			
			System.out.println ();
		
		}
			
	};
	
};
