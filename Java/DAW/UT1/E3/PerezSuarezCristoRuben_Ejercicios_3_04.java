
// "Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo que todos los meses son de 30 días".

import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_3_04 {
	
	public static void main ( String [] args ) {
		
	//"Cada fecha tendrá sus variables para recoger datos de los años, meses y días, luego 2 variables guardan el total de días por fechas y una tercera para almacenar el resultado de la distancia".
	int ano1, mes1, dia1, totalDias1;
	int ano2, mes2, dia2, totalDias2;
	int diferenciaTemporal;
		
	//"En principio no tengo días con los que trabajar".
	totalDias1 = 0;
	totalDias2 = 0;
		
	//"Llamo al metodo escaner para que la máquina sepa leer los datos que voy a introducir".
	Scanner sc = new Scanner (System.in);
		
	//"Primero dame los datos ya luego te digo si son válidos o no para hacer el cálculo".
	do {
			
		System.out.println ("Recuerda:");
		System.out.println (" - Los días deben estar entre 1 y 30.");
		System.out.println (" - Los meses deben estar entre 1 y 12.");
		System.out.println (" - Los años no pueden ser inferiores a 0.");
		
		System.out.println (" ");
		
		System.out.println ("Introduzca una fecha:");
		System.out.print (" - Día: "); dia1 = sc.nextInt();
		System.out.print (" - Mes: "); mes1 = sc.nextInt();
		System.out.print (" - Año: "); ano1 = sc.nextInt();
		
		System.out.println (" ");
		
		System.out.println ("Introduzca otra fecha:");
		System.out.print (" - Día: "); dia2 = sc.nextInt();
		System.out.print (" - Mes: "); mes2 = sc.nextInt();
		System.out.print (" - Año: "); ano2 = sc.nextInt();
		
	//"Sí una de estas condiciones se cumple repíteme la entrada de datos dado que la fecha no está en una escala de rango permitida".	
	} while (ano1 < 0 || ano2 < 0 || mes1 < 1 || mes1 > 12 || mes2 < 1 || mes2 > 12 || dia1 < 1 || dia1 > 30 || dia2 < 1 || dia2 > 30);
		
		//"Conversión de los años a días para sacar el total de días en una fecha".
		ano1 *= 365;
		ano2 *= 365;
	
		//"Conversión de los meses a días para sacar el total de días en una fecha".
		mes1 *= 30;
		mes2 *= 30;
		
		//"Suma del total de los días obtenidos en los años, meses y días que introdujo el usuario".
		totalDias1 = ano1 + mes1 + dia1;
		totalDias2 = ano2 + mes2 + dia2;
		
		System.out.println ("⠀");
	
		//"Si la fecha 1 es menor a la 2, resta la 1 a la 2".
		if (totalDias1 < totalDias2) {
			diferenciaTemporal = totalDias2 - totalDias1;
			System.out.println ("La distancia temporal de días es de: " + diferenciaTemporal + " días.");
		}
		
		//"Si la fecha 2 es menor a la 1, resta a la 1 la 2".
		if (totalDias1 > totalDias2) {
			diferenciaTemporal = totalDias1 - totalDias2;
			System.out.println ("La distancia temporal de días es de: " + diferenciaTemporal + " días.");
		}
		
		//"Sí las fechas son iguales imprime esté mensaje".
		if (totalDias1 == totalDias2) {
			System.out.println ("No hay diferencia temporal porque las fechas introducidas son iguales ;)");
		}
		
	}
	
}

