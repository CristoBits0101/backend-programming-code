/* 
 *  Realizar un programa en Java que genere una combinación de lotería Euromillón.
 *  Se debe generar un secuencia de 5 números aleatorios entre 1 y 50 y dos números más entre 1 y 12.
 *  Se debe comprobar que no se repitan los números.
 */ 

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_2_01 {
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// "Variables para los números entre el 1 y el 50.";
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		int num4 = 1;
		int num5 = 1;
		
		// "Variables para los números entre el 1 y el 12.";
		int num6 = 1;
		int num7 = 12;
		
		// "Valores para alterar los números de salida no permite introducir un número que ya fue introducido con anterioridad 2 veces seguidas.";
		int numX = 1;
		int numXX = 2;
		
		// "Controla la entrada a los if y altera los dos últimos números del 1 al 12.";
		long i = 2;
		
		// "Condición de salida del bucle.";
		String S = "S";
		String N = "N";
		String exit = "N";
		
		while (exit.equals("N")) {
			
		/*Dependiendo de si i es par o impar entra en un if y le suma un valor distinto a la variable + un número aleatorio que el usuario introduzca que no puede ser igual al anterior 			introducido, estos valores se concatenan cada vuelta del while lo que hace que una combinación no se repita nunca esto se debe a que el usuario o el matemático nunca podrá 			concatenar un mismo valor y no podrá sacar un patrón, el usuario no puede repetir números y el bucle nunca suma la misma cantidad, no todos los números va a llegar a 50 a la 			misma vez así que nunca se resetean por igual y cuando vuelva a sumar a partir de 1 nunca lo hará de la misma manera que la anterior porque no todos los números empiezan como 			empezaron en la primera vuelta de bucle, aunque el usuario repita números cada 2 vueltas se concatenan con diferentes valores para que no pueda establecer un patrón en cada dígito*/
		
			if (i % 2 == 0) {
				
				num1 += 2;
				num2 += 5;
				num3 += 4;
				num4 += 7;
				num5 += 6;
				
		//Las variables finales entre 1 y 12 en un if suma +par +impar y en otro +par +par así que nunca igualaran valores si no es de forma aleatoria i se regenera cada 12 y empieza en 2 para 			respetar la condición de entrada a los if alterara tb 1 variable o otra dependiendo de la vuelta y a veces dará un valor negativo o positivo en cada if cada 3 if se repite lo que es 			aleatorio.
		
				num6 += 1;
				num7 += 3;
				num6 += i;
				
				do {
					System.out.println ("Introduzca un número: ");
					numX = sc.nextInt();
			  	} while (numX > 50 || numX < 1 || numX == numXX);
			}
			
			num1 += numX;
			num2 += numX;
			num3 += numX;
			num4 += numX;
			num5 += numX;
			
			if (i % 2 != 0) {
				
				num1 += 1;
				num2 += 8;
				num3 += 3;
				num4 += 10;
				num5 += 7;
				
				num6 += 2;
				num7 += 2;
				num7 += i;
				
				do {
					System.out.println ("Introduzca un número: ");
					numXX = sc.nextInt();
				} while (numXX > 50 || numXX < 1 || numXX == numX);
			}
			
			num1 += numXX;
			num2 += numXX;
			num3 += numXX;
			num4 += numXX;
			num5 += numXX;
			
			do {	
				//
				if (
					num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 ||
					num2 == num1 || num2 == num3 || num2 == num4 || num2 == num5 ||
					num3 == num1 || num3 == num2 || num3 == num4 || num3 == num5 ||
					num4 == num1 || num4 == num2 || num4 == num3 || num4 == num5 ||
					num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4
				) {
					num1 += 1;
					num2 += 2;
					num3 += 3;
					num4 += 4;
					num5 += 5;
				}	
				
				
				// "Reseteo de variables que superen los valores permitidos en los números.";
				if (num1 > 50) {
					num1 = 1;
				}
			
				if (num2 > 50) {
					num2 = 1;
				}
			
				if (num3 > 50) {
					num3 = 1;
				}
			
				if (num4 > 50) {
					num4 = 1;
				}
			
				if (num5 > 50) {
					num5 = 1;
				}
			
				if (num1 < 1) {
					num1 = 1;
				}
		
				if (num2 < 1) {
					num2 = 1;
				}
		
				if (num3 < 1) {
					num3 = 1;
				}
			
				if (num4 < 1) {
					num4 = 1;
				}
			
				if (num5 < 1) {
					num5 = 1;
				}
				
			} while (
				num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 ||
				num2 == num1 || num2 == num3 || num2 == num4 || num2 == num5 ||
				num3 == num1 || num3 == num2 || num3 == num4 || num3 == num5 ||
				num4 == num1 || num4 == num2 || num4 == num3 || num4 == num5 ||
				num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4
			);
			
			do {
				if (num6 == num7) {
					num6 += 1;
				}
				if (num6 > 12 || num6 < 1) {
					num6 = 1;
				}
				if (num7 > 12 || num7 < 1) {
					num7 = 1;
				}
			} while (num7 == num6);
			
			// "Impresión de datos obtenidos."
			System.out.println (num1 + (" ") + num2 + (" ") + num3 + (" ") + num4 + (" ") + num5);
			System.out.println (num6 + (" ") + num7);
			
			sc.nextLine();
			
			//"Revisamos si quiere salir del bucle.";
			do {
				System.out.println ("¿Quiere terminar de generar números de lotería?");
				System.out.println ("Pulse S mayúscula para si y N mayúscula para no:");
				exit = sc.nextLine();
			} while (!exit.equals("N") && !exit.equals("S"));
			
			// "Reseteo de i para alterar las variables 6 y 7".;
			i += 1;
			
		}
		sc.close();	
	}
}
