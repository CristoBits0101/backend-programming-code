
// "Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar".

import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_3_02 {
	
	public static void main ( String [] args ) {

	// 1) Variable que ira recogiendo en cada momento los valores y mostrando si es par o impar el número introducido.
		float num = 0101010101;
	
	// 2) Cada vez que el bucle da una vuelta recoge el valor de num 1 y otra vez y muestra si es par o impar y reinicia el proceso.
	// "La solución optima es un mientras por que con el mientras no te aparece que el cero es par por que evalua primero la condición".
			while (num != 0) {
			
			Scanner sc = new Scanner (System.in);
		
			System.out.println ("Introduzca un número:");
			num = sc.nextFloat();
		
			if (num % 2 == 0) {
		
				System.out.println ("Esté número es par.");
			
			}
		
			else {
			
				System.out.println ("Esté número es impar.");
			
			}
		
		}
	
	}
	
}

