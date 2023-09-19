/*
 *  Realiza el programa en Java que dé solución al siguiente enunciado:
 *    - La siguiente tabla muestra cómo se calcula el Índice de Masa Corporal (IMC) y el estado de una persona según el IMC. 
 *    - El programa debe solicitar el peso y la estatura de la persona, calcular el IMC e indicar el tipo de obesidad y la categoría.
 *    - Se hará el diagnóstico a tantas personas que lo soliciten hasta que se introduzcan en el peso o estatura algún número negativo o cero.
 */

 // "Librería que trae las clases y métodos para leer datos del teclado.";
import java.util.Scanner;

// "Está es la clase para el ejercicio (1) del SP_UT2.";
public class perezSuarezCristoRuben_supuestoPractico_01 {

    // "Esta es la clase principal del programa por donde el algoritmo empezara a ejecutar las instrucciones.";
    public static void main(String[] args) {
        
        // "Scanner es una clase que nos permite obtener la entrada de datos primitivos.";
	Scanner sc = new Scanner(System.in);
        
        // "Estas son las variables que almacenaran el peso y la altura y condicionaran todas las estructuras.";
        double pesoKG;
        double estaturaMT = 1;
        
        // "Mensaje informativo por si alguien no quiere pesarse.";
        System.out.println ("Recuerda de que en caso de que no quieras obtener el IMC puedes pulsar el 0 o un número negativo:");
        
        // "Dependiendo de la cantidad introducida sabremos si se quiere pesar y continuaremos con las instrucciones.";
        System.out.println ("Introduzca su peso en Kilogramos:");
        pesoKG = sc.nextDouble();
        
        // "Solo si el usuario quiere pesarse le pediré la estatura para que no tenga que introducir 2 ceros para salir, el valor de uno no me condiciona el bucle.";
        if ( pesoKG > 0 ) {
        
        	System.out.println ("Introduzca su estatura metros:");
        	estaturaMT = sc.nextDouble();
        
        }
        
        // "Si el usuario quiere pesarse y la estatura y el peso son mayores a 0 le mostraré el resultado de los primeros datos obtenidos y volveré a preguntar si alguien más se quiere pesar.";
        while ( pesoKG > 0 && estaturaMT > 0 ) {
        	
        	// "La fórmula se aplicará dentro del bucles que es donde los if necesitan los valores para trabajar esta fórmula se declara identifica e inicializa si se quiere pesar.";
        	double IMC = pesoKG / ( estaturaMT * estaturaMT );
        	
        	// "Rango de valores homologados por sanidad para obtener un IMC.";
        	if ( IMC >= 0 &&  IMC <= 18.49 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que tiene el peso bajo.");
        
        	}
        
        	if ( IMC >= 18.5 &&  IMC <= 24.9 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que tiene un peso normal.");
        
        	}
        
        	if ( IMC >= 25 &&  IMC <= 29.9 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que usted padece de sobrepeso.");
        
        	}
        
        	if ( IMC >= 30 &&  IMC <= 34.9 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que tiene obesidad leve de tipo 1.");
        
        	}
        
        	if ( IMC >= 35 &&  IMC <= 39.9 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que tiene obesidad media de tipo 2.");
        
        	}
        
        	if ( IMC >= 40 ) {
        
        		System.out.println ( "Su IMC es: " + IMC + ", eso indica que tiene obesidad mórbida de tipo 3.");
        
        	}
      		
      		// "Los datos se piden al final del bucle para que la primera vez no se impriman 2 resultados.";
      		System.out.println ("Recuerda de que en caso de que no quieras obtener el IMC puedes pulsar el 0 o un número negativo:");
      		
        	System.out.println ("Introduzca su peso en Kilogramos:");
        	pesoKG = sc.nextDouble();
        	
        	if ( pesoKG > 0 ) {
        
        		System.out.println ("Introduzca su estatura metros:");
        		estaturaMT = sc.nextDouble();
        
        	}
        	
        }
        
    }

}
