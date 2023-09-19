/*
 *  El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: 
 *  Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
 *    - 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B",
 *    - 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
 *  Escribe un programa que pida el número de DNI y muestre por pantalla la letra asociada.
 */

// "Librería que trae las clases y métodos para leer datos del teclado.";
import java.util.Scanner;

// "Está es la clase para el ejercicio (3) del SP_UT2.";
public class perezSuarezCristoRuben_supuestoPractico_03 {

    // "Esta es la clase principal del programa por donde el algoritmo empezara a ejecutar las instrucciones.";
    public static void main(String[] args) {

        // "Scanner es una clase que nos permite obtener la entrada de datos primitivos.";
        Scanner sc = new Scanner(System.in);

        // "Esta variable almacenará los números del DNI para poder operar con ellos.";
        int numDNI = 0;

        // "Estas son las variables que se imprimirán dependiendo del resultado del resto.";
        char T = 'T';
        char R = 'R';
        char W = 'W';
        char A = 'A';
        char G = 'G';
        char M = 'M';
        char Y = 'Y';
        char F = 'F';
        char P = 'P';
        char D = 'D';
        char X = 'X';
        char B = 'B';
        char N = 'N';
        char J = 'J';
        char Z = 'Z';
        char S = 'S';
        char Q = 'Q';
        char V = 'V';
        char H = 'H';
        char L = 'L';
        char C = 'C';
        char K = 'K';
        char E = 'E';

        // "Dependiendo de si la vuelta del bucle es la primera o no ejecutara una instrucción u otra.";
        boolean vueltaBucle1 = true;

        // "Ejecuta al menos una vez la entrada de datos del usuario.";
        do {

            // "En la primera vuelta del bucle se imprimirá un mensaje que será diferente al que se empezara a imprimir de la vuelta 2.";
            if (vueltaBucle1 == true) {
                System.out.println("Introduzca el número de DNI del cual se quiere obtener la letra:");
                numDNI = sc.nextInt();
            }

            else if (vueltaBucle1 == false) {
                System.out.println ("El número de DNI no puede contener decimales.");
                System.out.println ("El número de DNI no puede ser mayor a su máxima combinación 99999999, formada por un total de 8 dígitos.");
                System.out.println ("El número de DNI no puede ser menor a su mínima combinación 00000000, formada por un total de 8 dígitos.");
                System.out.println ("Introduzca de nuevo el DNI en el formato válido:");
                numDNI = sc.nextInt();
            }

        // "Rango de dígitos permitidos en el DNI.";
        // "Los 10000000 números contienen ceros a la izquierda es lo mismo dividir entre (00000432) que entre (432) el resto va a ser igual";
        } while (numDNI < 0 && numDNI > 99999999);

        // "Fin del algoritmo y de las instrucciones mostramos el valor de letra obtenido dependiendo del resto de la división.";
        switch (numDNI % 23) {

            case 0:
                System.out.println ("El DNI introducido será validado con la letra " + T);
                break;

            case 1:
                System.out.println ("El DNI introducido será validado con la letra " + R);
                break;

            case 2:
                System.out.println ("El DNI introducido será validado con la letra " + W);
                break;

            case 3:
                System.out.println ("El DNI introducido será validado con la letra " + A);
                break;

            case 4:
                System.out.println ("El DNI introducido será validado con la letra " + G);
                break;

            case 5:
                System.out.println ("El DNI introducido será validado con la letra " + M);
                break;

            case 6:
                System.out.println ("El DNI introducido será validado con la letra " + Y);
                break;

            case 7:
                System.out.println ("El DNI introducido será validado con la letra " + F);
                break;

            case 8:
                System.out.println ("El DNI introducido será validado con la letra " + P);
                break;

            case 9:
                System.out.println ("El DNI introducido será validado con la letra " + D);
                break;

            case 10:
                System.out.println ("El DNI introducido será validado con la letra " + X);
                break;

            case 11:
                System.out.println ("El DNI introducido será validado con la letra " + B);
                break;

            case 12:
                System.out.println ("El DNI introducido será validado con la letra " + N);
                break;

            case 13:
                System.out.println ("El DNI introducido será validado con la letra " + J);
                break;

            case 14:
                System.out.println ("El DNI introducido será validado con la letra " + Z);
                break;

            case 15:
                System.out.println ("El DNI introducido será validado con la letra " + S);
                break;

            case 16:
                System.out.println ("El DNI introducido será validado con la letra " + Q);
                break;

            case 17:
                System.out.println ("El DNI introducido será validado con la letra " + V);
                break;

            case 18:
                System.out.println ("El DNI introducido será validado con la letra " + H);
                break;

            case 19:
                System.out.println ("El DNI introducido será validado con la letra " + L);
                break;

            case 20:
                System.out.println ("El DNI introducido será validado con la letra " + C);
                break;

            case 21:
                System.out.println ("El DNI introducido será validado con la letra " + K);
                break;

            case 22:
                System.out.println ("El DNI introducido será validado con la letra " + E);
                break;

            default:
                System.out.println ("Ha ocurrido un error por favor inténtelo denuedo.");
                break;
		
        }

    }

}
