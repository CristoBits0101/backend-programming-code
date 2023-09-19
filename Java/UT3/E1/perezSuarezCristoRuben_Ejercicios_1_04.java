/* 
 *  Programa que genera los N primeros números de la serie de Fibonacci.
 *  El valor N deberá ser mayor que 0.
 *  NOTA: Los dos primeros números son 1, y el resto se obtiene sumando los dos anteriores: 1,1,2,3,5,8,13,21…
 */

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_1_04 {
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		int Fibonacci = 1;
		
		// "Se recoge el valor de N si es menor a 1 repetir la entrada de datos.";
		do {
			System.out.println ("¿Cuántos números de la serie Fibonacci desea ver?:");
			N = sc.nextInt();
		} while ( N < 1 );
		
		// "Salto de línea.";
		System.out.println ();
		
		// "Si N vale 1 solo se imprime una vez.";
		if ( N == 1 ) {
			System.out.println (Fibonacci);
		}
		
		// "Si N vale 2 se imprime dos veces.";
		if ( N == 2 ) {
			System.out.println (Fibonacci);
			System.out.println (Fibonacci);
		}
		
		// "Si N vale 3 o más se imprime tres veces.";
		if ( N > 2 ) {
		
			System.out.println (Fibonacci);
			System.out.println (Fibonacci);
			
			// "Se descuenta a N las dos impresiones adicionales.";
			N -= 2;
			
			for ( int i = 0; i < N; i++ ) {
				Fibonacci += Fibonacci;
				System.out.println (Fibonacci);
			}
			
		}
			
	}
	
}
