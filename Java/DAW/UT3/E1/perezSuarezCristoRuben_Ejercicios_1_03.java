/* 
 *  "Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), 
 *   que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, 
 *   con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.";
 */
   
public class perezSuarezCristoRuben_Ejercicios_1_03 {
		
	public static void main (String [] args) {
		
		int digito1 = 0;
		int digito2 = 0;
		int digito3 = 0;
		int digito4 = 0;
		int digito5 = 0;
		
		// "Buque que limita el contador a los requisitos.";
		for ( int i = 0; i < 99999; i++ ) {
			
			// "Dependiendo del valor de dígito se imprime un valor u otro.";
			if ( digito5 != 3 ) {
				System.out.print ( digito5 + "-" );	
			}
			
			else if ( digito5 == 3 ) {
				System.out.print ( "E" + "-" );
			}
			
			else {
				System.out.print ( digito5 + "-" );
			}
		
			if ( digito4 != 3 ) {
				System.out.print ( digito4 + "-" );	
			}
			
			else if ( digito4 == 3 ) {
				System.out.print ( "E" + "-" );
			}
			
			else {
				System.out.print ( digito4 + "-" );
			}
			
			if ( digito3 != 3 ) {
				System.out.print ( digito3 + "-" );	
			}
			
			else if ( digito3 == 3 ) {
				System.out.print ( "E" + "-" );
			}
			
			else {
				System.out.print ( digito3 + "-" );
			}
			
			if ( digito2 != 3 ) {
				System.out.print ( digito2 + "-" );	
			}
			
			else if ( digito2 == 3 ) {
				System.out.print ( "E" + "-" );
			}
			
			else {
				System.out.print ( digito2 + "-" );
			}
			
			if ( digito1 != 3 ) {
				System.out.print ( digito1 );	
			}
			
			else if ( digito1 == 3 ) {
				System.out.print ( "E" );
			}
			
			else {
				System.out.print ( digito1 );
			}
			
			// "Salto de línea después de concatenar los dígitos con el print.";
			System.out.println ();
			
			// "Puesta en marcha del contador, empezando por el digito 1.";
			digito1 += 1;
			
			// "Cada vez que un dígito llegue a 10 se cambia su valor a 0 otra vez, esto se hace después de sumar 1 a 9 y antes de imprimir nuevamente para que no aparezca el 10.";
			if ( digito1 == 10 ) {
				digito1 = 0;
			}
			
			if ( digito1 == 0 ) {
				digito2 += 1;
			}
			
			if ( digito2 == 10 ) {
				digito2 = 0;
			}
			
			if ( digito1 == 0 && digito2 == 0 ) {
				digito3 += 1;
			}
			
			if ( digito3 == 10 ) {
				digito3 = 0;
			}
			
			if ( digito1 == 0 && digito2 == 0 && digito3 == 0 ) {
				digito4 += 1;
			}
			
			if ( digito4 == 10 ) {
				digito4 = 0;
			}
			
			if ( digito1 == 0 && digito2 == 0 && digito3 == 0 && digito4 == 0 ) {
				digito5 += 1;
			}
		
		}
		
	}
			
}
