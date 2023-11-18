
// "Se introduce un número entero y se devuelve el carácter que representa en el código ASCII.";

// "La librería de la clase Scanner.";
import java.io.IOException;
import java.util.Scanner;

// "Mi clase principal con el mismo nombre que el del archivo.";
public class PerezSuarezCristoRuben_Ejercicios_en_casa_2_02 {
	
	public static void main ( String[] args ) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		// "Una variable para recoger los datos que introduzca el usuario y otra variable para condicionar acciones del bucle";
		int userData = 0;
		boolean aux = true;
		
		// "Bucle de tipo repetir con variable de tipo lógica para imprimir mensajes dependiendo de las veces que haya iterado el bucle";
		do {
			
			if (aux == true) {
				
				System.out.println ("Introduzca un número entero: ");
				userData = sc.nextInt();
				
				aux = false;
				
			}
			
			else if (aux == false) {
				
				System.out.println ("La cantidad introducida debe estar entré el número 1 y el 255, por favor introduzca la cantidad denuedo.");
				
				System.out.println ("Introduzca un número entero: ");
				userData = sc.nextInt();
				
			}
		
		// "Si no está dentro del rango de valores del código ASCII pide datos otra vez";	
		} while (userData < 1 || userData > 255);
		
		// "Impresión de mensaje por pantalla con conversión de tipo entero a char para obtener el código ASCII y mostrar el carácter";
		System.out.println ("El número introducido es equivalente en la tabla ASCII a: " + (char) userData);
		
	}
	
} 

