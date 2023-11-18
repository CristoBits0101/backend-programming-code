
// "Crear un función que dados cinco caracteres devuelva una palabra. Se le pide al usuario 5 caracteres y se muestra por pantalla la palabra resultado.";

// "Librería que me incluye la clase Scanner para leer teclado.";
import java.util.Scanner;

public class PerezSuarezCristoRuben_Ejercicios_en_casa_1_03 {

    public static void main ( String [] args ) {
        
        // "Clase Scanner para que la máquina entienda los caracteres del teclado.";
        Scanner sc = new Scanner (System.in);
        
        // "Declaro 5 variables, defino el tipo char para recoger 5 caracteres.";
        // "Los identificadores son a, e, i, o, u, pero no tienen nada que ver con la letra que van a almacenar que es quien las inicializa.";
        char a, e, i, o, u;
        
        // "Método char que me recoge el valor de un solo carácter x 5 veces por que tengo que recoger 5 caracteres".
        /* "Quería meter un bucle con la condición de evaluar si cada CHAR era diferente a los caracteres de la A hasta Z, 
           pidiera el carácter otra vez, pero incluir todos los caracteres tanto en mayúsculas como minúsculas y acentos era un trabajo innecesario." */;
        System.out.println ("Introduzca el primer carácter: ");
        a = sc.next().charAt(0);
        
        System.out.println ("Introduzca el tercer carácter: ");
        e = sc.next().charAt(0);
        
        System.out.println ("Introduzca el cuarto carácter: ");
        i = sc.next().charAt(0);
        
        System.out.println ("Introduzca el quinto carácter: ");
        o = sc.next().charAt(0);
        
        System.out.println ("Introduzca el sexto carácter: ");
        u = sc.next().charAt(0);
        
        // "Concateno una String con 5 variables a diferencia de PSeInt todo dentro del paréntesis.";
	System.out.println ( "Los caracteres introducidos forman esta palabra: " + a + e + i + o + u);
	
    }
    
}

