
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_4_03 {

	public static void main(String[] args) {
		
		// Definimos la variable día como tipo string para que al leer datos se pueda reconocer una cadena de caracteres;
		// Dia va a ser la variable que condicione que contenido se va a mostrar;
		String dia;
		
		Scanner leer = new Scanner (System.in);
		
		// Le pido al usuario que me introduzca un día de la semana que quiera chequear;
		System.out.println ("Introduzca un día de la semana: ");
		dia = leer.nextLine();
		
		// Con la estructura de decisión múltiple mostraremos unos datos en pantalla dependiendo del valor que abquiera dia;
		// La sentencia break para definir el final de esa condición;
		switch (dia) {
			case "lunes":{
			System.out.println ("Esté es el horario del lunes:");
			System.out.println ("a las 8:00 a.m. -> Programación.");
			System.out.println ("a las 9:00 a.m. -> Sistemas informáticos.");
			System.out.println ("a las 10:00 a.m. -> Electrónica.");
			System.out.println ("a las 11:00 a.m. -> Telecomunicaciones.");
			System.out.println ("a las 12:00 p.m. -> Lenguajes de marcas.");
			System.out.println ("a las 13:00 p.m. -> Bases de datos.");
			System.out.println ("a las 14:00 p.m. -> Tira pa tu casa.");
			break;
			}
			case "martes":{
			System.out.println ("Esté es el horario del martes:");
			System.out.println ("a las 8:00 a.m. -> Programación.");
			System.out.println ("a las 9:00 a.m. -> Sistemas informáticos.");
			System.out.println ("a las 10:00 a.m. -> Electrónica.");
			System.out.println ("a las 11:00 a.m. -> Telecomunicaciones.");
			System.out.println ("a las 12:00 p.m. -> Lenguajes de marcas.");
			System.out.println ("a las 13:00 p.m. -> Bases de datos.");
			System.out.println ("a las 14:00 p.m. -> Tira pa tu casa.");
			break;
			}
			case "miércoles":{
			System.out.println ("Esté es el horario del miércoles:");
			System.out.println ("a las 8:00 a.m. -> Programación.");
			System.out.println ("a las 9:00 a.m. -> Sistemas informáticos.");
			System.out.println ("a las 10:00 a.m. -> Electrónica.");
			System.out.println ("a las 11:00 a.m. -> Telecomunicaciones.");
			System.out.println ("a las 12:00 p.m. -> Lenguajes de marcas.");
			System.out.println ("a las 13:00 p.m. -> Bases de datos.");
			System.out.println ("a las 14:00 p.m. -> Tira pa tu casa.");
			break;
			}
			case "jueves":{
			System.out.println ("Esté es el horario del jueves:");
			System.out.println ("a las 8:00 a.m. -> Programación.");
			System.out.println ("a las 9:00 a.m. -> Sistemas informáticos.");
			System.out.println ("a las 10:00 a.m. -> Electrónica.");
			System.out.println ("a las 11:00 a.m. -> Telecomunicaciones.");
			System.out.println ("a las 12:00 p.m. -> Lenguajes de marcas.");
			System.out.println ("a las 13:00 p.m. -> Bases de datos.");
			System.out.println ("a las 14:00 p.m. -> Tira pa tu casa.");
			break;
			}
			case "viernes":{
			System.out.println ("Esté es el horario del viernes:");
			System.out.println ("a las 8:00 a.m. -> Programación.");
			System.out.println ("a las 9:00 a.m. -> Sistemas informáticos.");
			System.out.println ("a las 10:00 a.m. -> Electrónica.");
			System.out.println ("a las 11:00 a.m. -> Telecomunicaciones.");
			System.out.println ("a las 12:00 p.m. -> Lenguajes de marcas.");
			System.out.println ("a las 13:00 p.m. -> Bases de datos.");
			System.out.println ("a las 14:00 p.m. -> Tira pa tu casa.");
			break;
			}
		}
	}
}
