
import java.util.Scanner;

public class perezSuarezCristoRuben_supuestoPractico_UT3_03 {
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// "Carácter que se va a imprimir.";
		String nomenclatura1 = "BN";
		String nomenclatura2 = "NB";
		
		// "Dimensión del tablero";
		int dimensiones = 4;
		
		// "Bucle anidado cada 4 NB caracteres se introduce un salto de línea para que no se concatene la impresión.";
		for ( int i = 0; i < dimensiones; i++ ) {
		
			for ( int e = 0; e < dimensiones; e++ ) {
			
				System.out.print (nomenclatura1);
		
			}
			
			System.out.println ();
			
			for ( int e = 0; e < dimensiones; e++ ) {
			
				System.out.print (nomenclatura2);
		
			}
			
			System.out.println ();
		
		}
			
	};
	
};
