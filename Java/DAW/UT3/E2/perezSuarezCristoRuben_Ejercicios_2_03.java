/* 
 *  Realizar el programa de cantidad de billetes necesarios para cubrir una cantidad usando vectores.
 */ 

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_2_03 {
		
	public 
	/** 
	 * @param args
	 * @return 
	 */
	static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int cantidadBilletes[] = new int[7];
	int cantidadEuros = 0;
	
	// "Si el ejercicio no es múltiplo de 5 pedimos datos otra vez porque si no da error a la hora de dar los billetes exactos.";
        do {
        
        	System.out.println ("Introduzca una cantidad dinero para saber cuantos billetes de euros se necesitan para igualarla.");
        	System.out.println ("La cantidad introducida debe ser múltiplo de 5:");
        	cantidadEuros = sc.nextInt();
        
        } while (cantidadEuros % 5 != 0);      
	
	/*
	 *  1) Se comprueba que la cantidad inicial y los restos de la cantidad inicial son divisibles por los billetes.
	 *  2) Se almacena en una variable adicional la división de la cantidad de euros entre el valor del billete para el total de billetes necesarios.
	 *  3) El resto de las divisiones sé ira almacenando en la cantidad de euros.
	 */
	
	if ( cantidadEuros >= 500) {
			
		cantidadBilletes[0] = cantidadEuros / 500;
		
		cantidadEuros = cantidadEuros % 500;
		
		System.out.println ("La cantidad de billetes de 500 necesarias es: " + cantidadBilletes[0]);
			
	}
	
	if ( cantidadEuros >= 200) {
			
		cantidadBilletes[1] = cantidadEuros / 200;
		
		cantidadEuros = cantidadEuros % 200;
		
		System.out.println ("La cantidad de billetes de 200 necesarias es: " + cantidadBilletes[1]);
			
	}
	
	if ( cantidadEuros >= 100) {
			
		cantidadBilletes[2] = cantidadEuros / 100;
		
		cantidadEuros = cantidadEuros % 100;
		
		System.out.println ("La cantidad de billetes de 100 necesarias es: " + cantidadBilletes[2]);
			
	}
	
	if ( cantidadEuros >= 50 ) {
		
		cantidadBilletes[3] = cantidadEuros / 50;
		
		cantidadEuros = cantidadEuros % 50;
		
		System.out.println ("La cantidad de billetes de 50 necesarias es: " + cantidadBilletes[3]);
			
	}
	
	if ( cantidadEuros >= 20 ) {
			
		cantidadBilletes[4] = cantidadEuros / 20;
		
		cantidadEuros = cantidadEuros % 20;
		
		System.out.println ("La cantidad de billetes de 20 necesarias es: " + cantidadBilletes[4]);
			
	}
	
	if ( cantidadEuros >= 10 ) {
			
		cantidadBilletes[5] = cantidadEuros / 10;
		
		cantidadEuros = cantidadEuros % 10;
		
		System.out.println ("La cantidad de billetes de 10 necesarias es: " + cantidadBilletes[5]);
			
	}
	
	if ( cantidadEuros >= 5  ) {
		
		cantidadBilletes[6] = cantidadEuros / 5;
		
		cantidadEuros = cantidadEuros % 5;
		
		System.out.println ("La cantidad de billetes de 5 necesarias es: " + cantidadBilletes[6]);
		
	}
	sc.close();
			
    }
	
}
