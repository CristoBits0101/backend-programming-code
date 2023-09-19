import java.util.Scanner;

public class Potencia {
    public static boolean esUnNumeroEnteroPositivo (String dato) {
        for (int i = 0; i < dato.length(); i++) {
            if (!Character.isDigit(dato.charAt(i))) {
                return false;
            }      
        }
        return true;
    }


public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String sBase;
    do{ 
        System.out.print("Indique la base de la potencia: ");
        sBase = teclado.next();
    } while (!esUnNumeroEnteroPositivo(sBase));
    int base = Integer.parseInt(sBase);
    String sExponente;
    do {
        System.out.print("Indique el exponente de la potencia: ");
        sExponente = teclado.next();
    } while (!esUnNumeroEnteroPositivo(sExponente));
    int exponente = Integer.parseInt(sExponente);
    int resultado = 1;
    int cuenta = 0;
    do {
        resultado = resultado*base;
        cuenta++;
    } while (cuenta < exponente);


    System.out.println("La potencia " + base + " elevada a " + exponente + " es " + resultado);
    }
}

