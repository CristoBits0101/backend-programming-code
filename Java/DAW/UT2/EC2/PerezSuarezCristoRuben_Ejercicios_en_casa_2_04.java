/*  Debes leer por teclado dos datos:
 * 	La edad de un alumno y un carácter que representa modalidad de acceso. 
 * 	(los posibles valores serían: “A” acceso directo, “G” grado medio, “P” prueba de acceso).
 *  
 *  Según los valores debes mostrar los siguientes mensajes: 
 * 	Si es menor de edad y accede de forma directa debe mostrar “Pase por secretaría”. 
 * 	Y si es mayor de edad y accede por grado medio o por prueba de acceso se le debe mostrar “Solicite código en jefatura”. 
 * 	En el resto de los casos muestre “Las clases son en la R03, gracias”.
 */

//"La librería de la clase Scanner.";
import java.util.Scanner;

//"Mi clase principal con el mismo nombre que el del archivo.";
public class PerezSuarezCristoRuben_Ejercicios_en_casa_2_04 {
	
	//"La clase principal, la que primero ejecutara el compilador.";
	public static void main ( String [] args ) {
		
		//"La clase scanner para leer los datos del teclado.";
		Scanner sc = new Scanner(System.in);
		
		//"Esta variable va a almacenar la edad del usuario.";
		int edad;
		
		//"Estas variables van a almacenar los valores de acceso y al ser comparadas con L se determinará el camino que tomara las instrucciones."
		String L = "";
		String A = "A";
		String G = "G";
		String P = "P";
		
		/*  "Está variable condicionará los datos que se va a leer dentro del bucle dependiendo de si está en la primera vuelta será true y sí está en la segunda será false.";
		 *  "De esto dependerá el camino que tome el algoritmo."; 
		 */ 
		boolean aux = true;
		
		//"Le pedimos al usuario su edad para trabajar con ella.";
		System.out.println ("Introduzca su edad:");
			edad = sc.nextInt();
			
		//"Si el usuario tiene la edad de acceso ejecutamos estas instrucciones.";
		if (edad >= 16) {
			
			//"Preguntamos el método de acceso en casa de que no introduzca los caracteres se los volvemos a pedir.";
			do {
				//"Método que se va a usar para pedir datos la primera vez que se ejecuta.";
				if ( aux == true ) {
			
					System.out.println ("Introduzca A sí accede de forma directa.");
					System.out.println ("Introduzca G sí accede por grado medio.");
					System.out.println ("Introduzca P sí accede por prueba de acceso.");
						L = sc.nextLine();
					
						aux = false;
					
				}
				
				//"Método que se va a usar para pedir datos a partir de la segunda vez que se ejecuta.";
				else if ( aux == false ) {
			
					System.out.println ("Las opciones posibles son A, G, P en mayúsculas.");
				
					System.out.println ("Introduzca A sí accede de forma directa.");
					System.out.println ("Introduzca G sí accede por grado medio.");
					System.out.println ("Introduzca P sí accede por prueba de acceso.");
						L = sc.nextLine();
					
				}
			
			//"Si los caracteres no son los permitidos vuelve a pedir los valores hasta que se deje de cumplir la condición.";
			} while ( !L.equals("A") && !L.equals("G") && !L.equals("P") );
			
			//"Condición 1 del ejercicio de la edad y el método de acceso.";
			if ( edad < 18 && edad >= 16 && L.equals("A") ) {
		
				System.out.println ("Pase por secretaría.");
		
			}
			
			//"Condición 2 del ejercicio de la edad y el método de acceso.";
			else if ( edad >= 18 && L.equals("G") || L.equals("P") ) {
		
				System.out.println ("Solicite código en jefatura.");
		
			}
			
			//"Condición 3 del ejercicio de la edad y el método de acceso.";
			else if ( edad >= 16 ) {
		
				System.out.println ("Las clases son en la R03, gracia.");
		
			}
			
		}
		
		//"Si la edad del usuario es inferior a la permitida para cursar los ciclos lo mandamos a secretaria.";
		else if ( edad < 16 ) {
			
			System.out.println ("No cumple con la edad de acceso a los ciclos formativos, pase por secretaria.");
				
		}	
		
	}
	
}

