
// "Dibuja un cuadrado de n elementos de lado utilizando.";

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_1_01 {
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// "Recogemos las dimensiones que el usuario quiere que tenga el cuadrado.";
		System.out.println ("Introduzca el tamaño que quiere que tenga el cuadrado:");
		int n = sc.nextInt();
		
		// "Carácter que se va a imprimir.";
		String asterisco = "*";
		
		// "Bucle anidado cada x caracteres se introduce un salto de línea para que no se concatene la impresión.";
		for ( int i = 0; i < n; i++ ) {
		
			for ( int e = 0; e < n; e++ ) {
			
				System.out.print (asterisco);
		
			}
			
			System.out.println ();
			
		}
			
	}
	
}
