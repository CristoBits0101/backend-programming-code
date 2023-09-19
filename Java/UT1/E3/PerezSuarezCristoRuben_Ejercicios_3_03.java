// "Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido".

import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_3_03 {
	
	public static void main ( String [] args ) {
	
	// 1) 2 Variables una que recoja los números introducidos y otra que acumule la cantidad de números.
	float num;
	int acumulador;
	
	// 2) Acumulador ira guardando la cantidad de números introducidos en principio hay cero.
	num = 0;
	acumulador = 0;
	
	// 3) Bucle que pide números de forma indefinida hasta que se introduzca una cantidad negativa.
		while (num > -1) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println ("Introduzca un número:");
			num = sc.nextFloat();
		
			acumulador = acumulador + 1;
		
		}
		
	// 4) Mostrar en pantalla la cantidad de vueltas del bucle que es igual a la cantidad de números introducidos.
	// "Una vuelta 1 acumulación".
	System.out.println ("La cantidad de números introducidos es: " + acumulador);
		
	}
	
}

