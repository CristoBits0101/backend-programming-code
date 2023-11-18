
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_4_01 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Introduzca un número de partida: ");
	
	// 2 variables una que recogera el número de partida y otra el paso que hira restando hasta 0.
	int datos = sc.nextInt();
	
	int paso;
	
	// Un bucle que para que el usuario me introduzca un paso y que este vaya restando hasta llegar a 0 en el siguiente bucle;
	// Este bucle ha de ejecutarse mientras el paso sea menor o igual a 0;
	do {
	
		System.out.println ("Introduzca un paso, el número debe ser mayor a 0:");
		paso = sc.nextInt();
		
	} while (paso < 1);
	
	int i;
		
		/*Mientras i y datos tengan valores distintos ejecutame este bucle*/
		/*Cuando i y datos se igualen detén el bucle*/
		/*Disminuye datos hasta que se iguales al bucle*/
		/*La disminución de datos va a ser proporcional al paso*/
		/*Muéstrame cuanto está disminuyendo datos y que valor tiene por vuelta del bucle*/
		for ( i = -1; i < datos; datos = datos - paso ) {
			
			System.out.println (datos);
			
		}
		
	}
	
}

