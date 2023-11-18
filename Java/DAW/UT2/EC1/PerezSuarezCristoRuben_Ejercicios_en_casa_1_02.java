
/*Realizar una función para conversión de euros a dólares (1€=1,17$).
  Pedir al usuario la cantidad de euros o dólares a convertir y usando la función mostrar el resultado por pantalla en el cambio correcto,
  es decir, si el usuario introduce euros el conversor devuelve dólares, pero si el usuario introduce dólares el conversor introduce euros.*/

//"La librería de la clase Scanner".
import java.util.Scanner;

//"Mi clase principal con el mismo nombre que el del archivo".
public class PerezSuarezCristoRuben_Ejercicios_en_casa_1_02 {
	
	public static void main ( String [] args ) {
	
	//"Llamo a la clase Scanner para poder recoger los datos primitivos y sus métodos para que el usuario introduzca los valores con los que desea trabajar".
		Scanner sc = new Scanner(System.in);
		
		//"Declaro 3 tipos de variables una para dólares otra para euros y otra para saber que quiere convertir";
		//"Las defino de tipo String para que puedan almacenar una serie de caracteres";
		//"Llamo al método nextLine para recoger una string de teclado que va a ser el dato que inicialice a la variable moneda";
		
		String Dolares = "Dolares";
		String dolares = "dolares";
		String Dólares = "Dólares";
		String dólares = "dólares";
		
		String Euros = "Euros";
		String euros = "euros";
		
		String moneda = "";
		
		boolean aux = true;
		
		do {
			
			if ( aux == true) {
			
				System.out.println ("¿Qué quieres convertir dólares o euros?: ");
				moneda = sc.nextLine();
				
				aux = false;
			}
			
			else if (aux == false) {
			
				System.out.println ("La palabra no equivale a ninguna moneda permitida, debe seleccionar si quiere convertir euros o dólares: ");
				moneda = sc.nextLine();
			
			}
			
		} while ( !moneda.equals("Dolares") && !moneda.equals("dolares") && !moneda.equals("Dólares") && !moneda.equals("dólares") && !moneda.equals("Euros") && !moneda.equals("euros") );
		
		//"Si introduce alguna palabra de dólares pide el valor de los dólares, muestra en pantalla un mensaje y devuelve la función conversor dólares".
		if ( moneda.equals("Dolares") || moneda.equals("dolares") || moneda.equals("Dólares") || moneda.equals("dólares") ) {
			
			System.out.println ("Introduzca la cantidad de dólares: ");
			float valorDolares = sc.nextFloat();
			
			System.out.println ("Sus " + valorDolares + " dólares equivalen a: " + conversorDolares (valorDolares) + " euros." );
			
		}
		
		//"Si introduce alguna palabra de euros pide el valor de los euros, muestra en pantalla un mensaje y devuelve la función conversor euros".
		else if ( moneda.equals(Euros) || moneda.equals(euros) ) {
			
			System.out.println ("Introduzca la cantidad de euros: ");
			float valorEuros = sc.nextFloat();
			
			System.out.println ("Sus " + valorEuros + " euros equivalen a: " + conversorEuros (valorEuros) + " dólares." );
		
		}
		
	}
	
	//"Función para convertir de dolares a euros";
	static float conversorDolares (float dolaresAeuros) {
		
		dolaresAeuros *= 0.87;
		
		return dolaresAeuros;
		
	}
	
	//"Función para convertir de euros a dólares";
	static float conversorEuros (float eurosAdolares) {
		
		eurosAdolares *= 1.14;
		
		return eurosAdolares;
		
	}
	
}

