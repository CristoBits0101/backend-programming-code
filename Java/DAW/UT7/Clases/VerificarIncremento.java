import java.util.Scanner;

public class VerificarIncremento {

    public static void main(String[] args)  {
        
        Scanner teclado = new Scanner(System.in);
       	        
        int numero = 0;  int resultado = 0;
               	
            do {
       	            do {

               	        System.out.print("Indique un número entero positivo: ");
                      	numero = teclado.nextInt();

       	            } while (numero <= 0);
                    
               	    if (numero % 2 != 0 && numero > resultado) {

                      	 resultado = numero;

                    }
                    
       	    } while (numero != 10);
               	
            System.out.println("El resultado es " + resultado);
    }
}
