import java.util.Scanner;

public class millasMarinas_a_metros {

	public static void main(String[] args) {
	
	Scanner leer = new Scanner (System.in);
	
	double decision = 1;
	
	while ( decision >= 1) {
		
		double millas = 0;
		
		do {
	
			// Los datos tienen que ser de tipo entero porque los factoriales solo trabajan con enteros naturales.";
			System.out.println ("Introduzca un número de partida, no puede ser negativo: ");
			millas = leer.nextInt();
		
		} while (millas < 1);
	
		double cantidadMetros = millas * 1852;
		
	// "Mostramos el en pantalla el factorial obtenido del número introducido.";
	System.out.println ("Esté es la cantidad de metros:" + cantidadMetros);
	
	// "Preguntamos si desea continuar con el algoritmo y evaluamos la condición de salida en el bucle while.";
	System.out.println ("¿Desea calcular otra vez?");
	System.out.println ("1 o superior para sí, 0 o inferior para no.");
	decision = leer.nextInt();
	
	}
		
    }
	
}
