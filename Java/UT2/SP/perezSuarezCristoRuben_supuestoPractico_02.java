/*
 *   Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
 *   (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar
 *   dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5).
 *   
 *   Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100 €, 
 *   2 billetesde 20 € y 1 billete de 5 €
 */

 // "Librería que trae las clases y métodos para leer datos del teclado.";
import java.util.Scanner;

// "Está es la clase para el ejercicio (2) del SP_UT2.";
public class perezSuarezCristoRuben_supuestoPractico_02 {

    // "Esta es la clase principal del programa por donde el algoritmo empezara a ejecutar las instrucciones.";
    public static void main(String[] args) {
	
	// "Scanner es una clase que nos permite obtener la entrada de datos primitivos.";
	Scanner sc = new Scanner(System.in);
	
	// "Una variable para almacenar las cantidades de dinero y otra para almacenar la cantidad de billetes.";
        int cantidadEuros = 0;
        
        int cantidadBilletes= 0;
        
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
			
		cantidadBilletes = cantidadEuros / 500;
		
		cantidadEuros = cantidadEuros % 500;
		
		System.out.println ("La cantidad de billetes de 500 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 200) {
			
		cantidadBilletes = cantidadEuros / 200;
		
		cantidadEuros = cantidadEuros % 200;
		
		System.out.println ("La cantidad de billetes de 200 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 100) {
			
		cantidadBilletes = cantidadEuros / 100;
		
		cantidadEuros = cantidadEuros % 100;
		
		System.out.println ("La cantidad de billetes de 100 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 50 ) {
		
		cantidadBilletes = cantidadEuros / 50;
		
		cantidadEuros = cantidadEuros % 50;
		
		System.out.println ("La cantidad de billetes de 50 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 20 ) {
			
		cantidadBilletes = cantidadEuros / 20;
		
		cantidadEuros = cantidadEuros % 20;
		
		System.out.println ("La cantidad de billetes de 20 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 10 ) {
			
		cantidadBilletes = cantidadEuros / 10;
		
		cantidadEuros = cantidadEuros % 10;
		
		System.out.println ("La cantidad de billetes de 10 necesarias es: " + cantidadBilletes);
			
	}
	
	if ( cantidadEuros >= 5  ) {
		
		cantidadBilletes = cantidadEuros / 5;
		
		cantidadEuros = cantidadEuros % 5;
		
		System.out.println ("La cantidad de billetes de 5 necesarias es: " + cantidadBilletes);
		
	}
        
    }

}
