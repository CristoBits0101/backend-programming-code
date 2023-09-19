// "Dadas dos variables a y b de tipo entero, debes intercambiar los datos.";

// "La librería de la clase Scanner.";
import java.util.Scanner;

// "Mi clase principal con el mismo nombre que el del archivo.";
public class PerezSuarezCristoRuben_Ejercicios_en_casa_2_01 {
	
	public static void main ( String [] args ) {
		
	Scanner sc = new Scanner(System.in);
	
		int a, b, c;
		
		// "Inicializamos la variable a y b con los datos del usuario.";
		System.out.println ("Introduzca un valor para a: ");
		a = sc.nextInt();
		
		System.out.println ("Introduzca un valor para b: ");
		b = sc.nextInt();
		
		// "Declaro c para antes de que a coja el valor de b no se pieda el valor de a y luego b coge el valor de c.";
		c = a;
		
		a = b;
		
		b = c;
		
	System.out.println ("Este es el nuevo valor de a :" + a);
	
	System.out.println ("Este es el nuevo valor de b :" + b);
			
	}
	
}

