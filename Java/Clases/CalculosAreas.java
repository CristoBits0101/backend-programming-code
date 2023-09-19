
import java.util.Scanner;

public class CalculosAreas { 
	
	public static void main (String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	//"Variable que recogerán el valor de las funciones".
	System.out.println ("Introduzca un lado del cuadrado:");
	double ladoCuadrado = sc.nextDouble();
	
	System.out.println ("Introduzca la base del rectángulo:");
	double baseRectangulo = sc.nextDouble();
	
	System.out.println ("Introduzca la altura del rectángulo:");
	double alturaRectangulo = sc.nextDouble();
	
	System.out.println ("Introduzca el radio del círculo:");
	double radioCirculo = sc.nextDouble();
	
	//"Añado los valores del usuario a las funciones e imprimó un mensaje que acompañe el resultado de la función".
	System.out.println ( "Esté es el area del cuadrado: "   + areaCuadrado   (ladoCuadrado) );
	
	System.out.println ( "Esté es el area del rectángulo: " + areaRectangulo (baseRectangulo, alturaRectangulo) );
	
	System.out.println ( "Esté es el area del círculo: "    + areaCirculo    (radioCirculo) );
	
	}
	
	//"Función que calcula el área de un cuadrado".
	static double areaCuadrado (double lado) {
		
		double resultadoCuadrado = lado * lado;
		
		return resultadoCuadrado;
		
	}
	
	//"Función que calcula el área de un rectángulo".
	static double areaRectangulo (double base, double altura) {
		
		double resultadoRectangulo = base * altura;
		
		return resultadoRectangulo;
		
	}
	
	//"Función que calcula el área de un círculo".
	static double areaCirculo (double radio) {
		
		final double pi = 3.14;
		
		double resultadoCirculo = pi * radio * radio;
		
		return resultadoCirculo;
	
	}
	
}

