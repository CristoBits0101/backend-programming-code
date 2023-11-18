
import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println ("Introduzca un número de partida: ");
	int datos = sc.nextInt();
	
		if (datos%2==0) {
	
			System.out.println ("El número es par");
	
		}
		
		else  {
			
			System.out.println ("El número es impar");
			
		}	
		
	}
	
}

