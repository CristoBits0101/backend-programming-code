import java.util.ArrayList;
import java.util.Scanner;

public class EjemploListaDeNumerosScanner {
    public static void main (String [] args) {
        ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>();

        Scanner num = new Scanner (System.in);
        Scanner cont = new Scanner (System.in);

        String Continuar = new String ("y");

        while (Continuar.equals ("y")) {
            System.out.print ("Introducir un número entero: ");
            ListaDeNumeros.add(num.nextInt());
            System.out.print ("¿Desea introducir otro número (y/n): ");
            Continuar =  cont.nextLine ();
        }
        
        System.out.println ("La lista de números es: "+ListaDeNumeros);
        num.close();
        cont.close ();       
    }
    
}
