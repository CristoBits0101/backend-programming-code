
/* - Dado el salario mínimo interprofesional de un año. 
   - Si se planifica una subida para el próximo año y se le pide esa subida al usuario en porcentaje. 
   - ¿Cuál sería el nuevo salario mínimo? */

// "La librería de la clase Scanner.";
import java.util.Scanner;

// "Mi clase principal con el mismo nombre que el del archivo.";
public class PerezSuarezCristoRuben_Ejercicios_en_casa_2_03 {
	
	// "Función que actualiza el salario mínimo interprofesional según el porcentaje incrementado.";
	double salaryIncrease (salarioMinimo, porcentaje) {
		
		// "Fórmula que calcula el porcentaje incrementado según el salario base = sueldo * porcentaje / 100.";
		double cantidadAumentada = (salarioMinimo * porcentaje) / 100;
		
		// "Fórmula que actualiza el salario base añadiendo el porcentaje incrementado.";
		double nuevoSalarioMinimo = salarioMinimo + cantidadAumentada;
		
		// "Retornamos el sueldo actualizado.";
		return nuevoSalarioMinimo;
	
	}
	
	// "Clase principal donde está la recogida de datos y la impresión por pantalla del resultado.";
	public static void main ( String [] args ) {
		
		// "La clase Scanner.";
		Scanner sc = new Scanner(System.in);
		
		// "Pedimos el salario mínimo.";
		System.out.println ("¿Cuál es el salario mínimo de este año?");
		double salarioMinimo;
		
		// "Pedimos el porcentaje que se desea incrementar.";
		System.out.println ("¿En qué porcentaje va a aumentar el salario mínimo?:");
		double porcentaje
		
		// "Impresión del resultado más el método.";
		System.out.println ("Este es el nuevo salario mínimo: " + salaryIncrease(salarioMinimo, porcentaje) + " €");
		
	}
	
}

