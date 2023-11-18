
import java.util.Scanner;

//"".
public class operaciones_menu_II {
	
	//"".
	static float suma (int cantidad, float datos) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("¿Cuántos números quiere sumar?:");
		
		cantidad = sc.nextInt();
	
		for (int i = 0; i < cantidad; i++) {
		
			datos = sc.nextFloat();
				
			float contador += datos;
				
			return contador;
		
		}
	
	}
	
	//"".
	static float resta (int cantidad, float datos) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("¿Cuántos números quiere restar?:");
		
		cantidad = sc.nextInt();
	
		for (int i = 0; i < cantidad; i++) {
		
			datos = sc.nextFloat();
				
			float contador -= datos;
				
			return contador;
		
		}
	
	}
	
	//"".
	static float multiplicacion (int cantidad, float datos) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("¿Cuántos números quiere multiplicar?:");
		
		cantidad = sc.nextInt();
	
		for (int i = 0; i < cantidad; i++) {
		
			datos = sc.nextFloat();
				
			float contador *= datos;
				
			return contador;
		
		}
	
	}
	
	//"".
	static float division (int cantidad, float datos) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("¿Cuántos números quiere dividir?:");
		
		cantidad = sc.nextInt();
	
		for (int i = 0; i < cantidad; i++) {
		
			datos = sc.nextFloat();
				
			float contador /= datos;
				
			return contador;
		
		}
	
	}
	
	//"".
	static double resultado () {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("");
	}
	
	//"".
	static void menu () {
	
	}
	
	//"".
	public static void main ( String [] args ) {
	
		//menu();
		
		float resultadoDivision = division;
	
	}
}

