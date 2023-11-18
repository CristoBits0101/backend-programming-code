
/* "Escribe un programa en el que se pidan al usuario dos números enteros. 
    A continuación, muestra por pantalla el valor de las funciones definidas como suma, resta, multiplicación, división y resto de la división (módulo)." */;

// "La librería de la clase Scanner".
import java.util.Scanner;

// "Mi clase principal con el mismo nombre que el del archivo.";
public class PerezSuarezCristoRuben_Ejercicios_en_casa_1_01 {
	
	// "Mi función que me permite sumar con su bloque de código y su operación sencilla con una variable que recoge la operación y se devuelve el resultado con el return.";
	static int sumar (int dato1, int dato2) {
	
		int suma = dato1 + dato2;
		
		return suma;
	
	};
	
	// "Mi función que me permite restar con su bloque de código y su operación sencilla con una variable que recoge la operación y se devuelve el resultado con el return.";
	static int restar (int dato1, int dato2) {
	
		int resta = dato1 - dato2;
		
		return resta;
		
	};
	
	//"Mi función que me permite multiplicar con su bloque de código y su operación sencilla con una variable que recoge la operación y se devuelve el resultado con el return.";
	static int multiplicar (int dato1, int dato2) {
	
		int multiplicacion = dato1 * dato2;
		
		return multiplicacion;
		
	};
	
	//"Mi función que me permite dividir con su bloque de código y su operación sencilla con una variable que recoge la operación y se devuelve el resultado con el return.";
	static int dividir (int dato1, int dato2) {
	
		int division = dato1 / dato2;
		
		return division;
		
	};
	
	//"Procedimiento principal".
	public static void main (String [] args) {
	
		//"Llamo a la clase Scanner para poder recoger los datos primitivos y sus métodos para que el usuario introduzca los valores con los que desea trabajar.";
		Scanner sc = new Scanner(System.in);
		
		int a = 0; 
		int b = 0;
		
		// "Dependiendo de si es true o false mostrara un mensaje adicional.";
		boolean aux = true;
		
		do {
		
			if (aux == true) {
		
				System.out.println ("Introduzca un valor: ");
				a = sc.nextInt();
		
				System.out.println (" ");
		
				System.out.println ("Introduzca otro valor: ");
				b = sc.nextInt();
			
				aux = false;
			
			}
			
			if (aux == false) {
			
				System.out.println ("No se admiten números negativos porfavor vuelva a introducir las cantidades.");
		
				System.out.println ("Introduzca un valor: ");
				a = sc.nextInt();
		
				System.out.println (" ");
		
				System.out.println ("Introduzca otro valor: ");
				b = sc.nextInt();
			
			}
		
		} while (a < 0 || b < 0);
		
	/* "Indico a que bloques de función se va a traspasar los datos que ha introducido el usuario del programa, 
	    llamando a la función a la que quiero que vallan y diciendo en que posición se debe traspasar los valores a y b." */;
	
		//"Impresión del resultado de la función sumar";
		System.out.println ("Resultado de la suma: " + sumar (a, b));
		
		//"Impresión del resultado de la función restar";
		System.out.println ("Resultado de la resta: " + restar (a, b));
		
		//"Impresión del resultado de la función multiplicar";
		System.out.println ("Resultado de la multiplicación: " + multiplicar (a, b));
		
		//"Impresión del resultado de la función dividir";
		System.out.println ("Resultado de la división: " + dividir (a, b));
		
	};
	
};
