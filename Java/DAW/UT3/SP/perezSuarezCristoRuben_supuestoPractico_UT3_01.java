
import java.util.Scanner;

public class perezSuarezCristoRuben_supuestoPractico_UT3_01 {
		
	public static void main ( String[] args ) {
	
	Scanner sc = new Scanner(System.in);
	
		// "Almacenarán la edad de cada alumno.";
		int alumno1 = 0;
		int alumno2 = 0;
		int alumno3 = 0;
		int alumno4 = 0;
		int alumno5 = 0;
	
		// "Utilizo la variable i del for para concatenar mensajes así que el total de alumnos lo pongo en 6 y i empieza en 1.";
		int alumnosTotal = 6;
	
		// "Recoge las edades de los alumnos.";
		int edad;
	
		// "Variable contadora de alumnos con edad superior a 18.";
		int mayores18 = 0;
	
		// "Recoge las estaturas de los alumnos.";
		double estatura;
		
		// "Variable contadora de la altura total de los alumnos para sacar la media.";
		double estaturaContador = 0;
	
		// "Variable contadora de alumnos con estatura superior a 1.75.";
		double estaturaAlumnoSuperior = 0;
		
		// "Variable que almacena la estatura media de la formula.";
		double estaturaMedia = 0;
		
		// "Automatización de la toma de requisitos durante 5 vueltas equivalente a la cantidad de alumnos.";
		for ( int i = 1; i < alumnosTotal; i++ ) {
		
			// "Pedimos la edad.";
			System.out.println ( "Introduzca la edad del alumno " + i + ":");
				edad = sc.nextInt();
			
			// "Salto de línea.";
			System.out.println ();
		
			// "Pedimos la estatura.";
			System.out.println ("Introduzca la estatura del alumno " + i + ":");
				estatura = sc.nextDouble();
			
			// "Fórmula que automatiza la suma de las estaturas.";
			estaturaContador += estatura;
			
			// "Dependiendo de i se almacena la edad en un alumno o otro.";
			if ( i == 1 ) {
				alumno1 += edad;
			}
			
			if ( i == 2 ) {
				alumno2 += edad;
			}
			
			if ( i == 3 ) {
				alumno3 += edad;
			}
			
			if ( i == 4 ) {
				alumno4 += edad;
			}
			
			if ( i == 5 ) {
				alumno5 += edad;
			}
			
			// "Comprobación de los alumnos mayores  a 18.";
			if ( edad > 18 ) {
				mayores18 += 1;
			}
			
			// "Comprobación de las estaturas mayores  a 1.75.";
			if ( estatura > 1.75 ) {
				estaturaAlumnoSuperior += 1;
			}
			
		// "Salto de línea.";
		System.out.println ();
			
		}
		
		// "Fórmula que calcula la estatura media.";
		estaturaMedia = estaturaContador / alumnosTotal;
		
		// "Impresión por pantalla de la edad de cada alumno.";
		System.out.println ( "La edad del primer alumno es: "  + alumno1 );
		System.out.println ( "La edad del segundo alumno es: " + alumno2 );
		System.out.println ( "La edad del tercer alumno es: "  + alumno3 );
		System.out.println ( "La edad del cuarto alumno es: "  + alumno4 );
		System.out.println ( "La edad del quinto alumno es: "  + alumno5 );
		
		// "Impresión por pantalla de la cantidad de alumnos mayores a 18 años.";
		System.out.println ("La cantidad de alumnos mayores a 18 años es: " + mayores18 );
		
		// "Impresión por pantalla de la cantidad de alumnos con estatura superior a 1.75.";
		System.out.println ("La cantidad de alumnos con estatura superior a 1.75 es: " + estaturaAlumnoSuperior);
		
		// "Impresión por pantalla de la estatura media del total de alumnos.";
		System.out.println ("La estatura media de los alumnos es: " + estaturaMedia );
			
	};
	
};
