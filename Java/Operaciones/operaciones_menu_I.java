import java.util.Scanner;

public class operaciones_menu_I {
	
	static float suma (int dato1, int dato2) {
	
		return dato1 + dato2;
		
	}

	static float resta (int dato1, int dato2) {

		return dato1 - dato2;
	
	}

	static float multiplicacion (int dato1, int dato2) {
	
		return dato1 * dato2;
	
	}

	static float division (int dato1, int dato2) {

		return dato1 / dato2;
	
	}
	
	static double resultado (int dato1, int dato2, int opc) {
        
        	double res;
	
		switch (opc) {

		case 1:  res = (suma           (dato1, dato2) );
		break;
		
		case 2:  res = (resta          (dato1, dato2) );
		break;
		
		case 3:  res = (multiplicacion (dato1, dato2) );
		break;
		
		case 4:  res = (division       (dato1, dato2) );
		break;
		
		default: res = 0;
		
		}
	
	return res;
	
	}
	
	static void menu () {
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println(" ");
		int dato1 = leer.nextInt();
		
		System.out.println("");
		int dato2 = leer.nextInt();
		
        	int opc;
        	
		do {
		
			System.out.println("Opción de 1 a 4");
			opc = leer.nextInt();
		
		} while (opc < 1 || opc > 4);
		
		System.out.println ( resultado ( dato1, dato2, opc ) );
		
	}
	
	public static void main(String[]args) {
	
		menu();
	
	}

}
