
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_4_04 {
	
	public static void main(String[]args) {
		
		// Esta son las variables que contaran que cantidad de números positivos, negativos y neutros se han introducido;
		int contadorPositivos, contadorNegativos, contadorNeutros;
		
		// Esta es la variable que va a determinar cuanto tiempo debe estar el bucle ejecutándose;
		int Icondicion;
		
		// Esta es la variable que determina cuando debe para el bucle for;
		int Ipara = 10;
		
		// Esta son las variables que almacenaran la suma de los números introducidos + 1 variable adicional para pedir valores de entrada;
		float positivos, negativos, datos;
		
		// Esta son las variables que recogerán la media de los números introducidos;
		float mediaPositivos, mediaNegativos;
		
		Scanner leer = new Scanner (System.in);
		
		positivos = 0;
		
		contadorPositivos =  0;
		
		contadorNeutros =  0;
		
		negativos =  0;
		
		contadorNegativos = 0;
		
		// Bucle que se ejecutara 10 veces, para recoger 10 números con los que trabajar;
		for ( Icondicion = 0; Icondicion < Ipara; Icondicion++ ) {
			
			// Cada vez que se procese una vuelta en el bucle introdúceme los datos con los que vamos a trabajar;
			
			if (Icondicion == 0) {
			
				System.out.println ("Introduzca un número: ");
				
				datos = leer.nextFloat();
				
			}
			
			else {
			
				System.out.println ("Introduzca un número más: ");
				
				datos = leer.nextFloat();
			
			}
			
			// Si los datos introducidos por el usuario son mayores a 0 entonces suma esa cantidad a positivos e incrementa el contador de positivos en 1;
			if ( datos > 0 ) {
				
				positivos += datos;
				
				contadorPositivos += 1;
				
			};
			
			// En caso de que los datos introducidos por el usuario tenga un valor equivalente a 0 incrementa el contador de neutros en 1;
			if ( datos == 0 ) {
				
				contadorNeutros += 1;
				
			};
			
			// Si los datos introducidos por el usuario son menores a 0 entonces suma esa cantidad a negativos e incrementa el contador de negativos en 1;
			if ( datos < 0 ) {
				
				negativos += datos;
				
				contadorNegativos += 1;
				
			};
			
		};
		
		// Calculamos la media que la formula la suma de las cantidades introducidas divido por la veces que se han introducido ese tipo de cantidades;
		mediaPositivos = positivos / contadorPositivos;
		
		mediaNegativos = negativos / contadorNegativos;
		
		// Imprimimos por pantalla los resultados obtenidos;
		System.out.println ( "Esta es la media de los números positivos: " + mediaPositivos );
		
		System.out.println ( "Esta es la media de los números negativos: " + mediaNegativos );
		
		System.out.println ( "Esta es la cantidad de ceros que se han introducidos: " + contadorNeutros);
		
	};
	
};
