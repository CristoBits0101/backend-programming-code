
// "Pedir dos números y decir si son iguales o no".

import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_3_01 {
	
	public static void main ( String [] args ) {

	// 1) 2 variables que me recojan el valor de los datos que voy a comparar.
	// "Las variables serán de tipo real para que me comparen números con decimales".
		double a, b;
	
	// 2) Solicitamos valores para comparar si son iguales o no.
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Introduzca el valor de la primera cantidad: ");
	a = sc.nextDouble();
	
	System.out.println ("Introduzca el valor de la segunda cantidad: ");
	b = sc.nextDouble();
	
	// 3) Hacemos la comparación con la estructura de decisión simple.
		if (a == b) {
		
			System.out.println ("Los números son iguales.");
			
		}
	
		else {
		
			System.out.println ("Los números son desiguales.");
		
		}
	
	}
	
}