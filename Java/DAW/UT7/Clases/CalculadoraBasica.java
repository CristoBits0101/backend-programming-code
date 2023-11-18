
import java.util.Scanner;

public class CalculadoraBasica {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Introduzca un número de partida: ");
	float datos1 = sc.nextFloat();
	float datos2 = sc.nextFloat();
	
	float S, R, M, D;
	
	S = datos1 + datos2;
	R = datos1 - datos2;
	M = datos1 * datos2;
	D = datos1 / datos2;
	
	System.out.println ("Este es el resultado de la suma: " + S);	
	System.out.println ("Este es el resultado de la resta: " + R);
	System.out.println ("Este es el resultado de la multiplicación: " + M);
	System.out.println ("Este es el resultado de la división: " + D);
	
	}
	
}

