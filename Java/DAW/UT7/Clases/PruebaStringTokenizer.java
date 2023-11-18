import java.util.StringTokenizer;
import java.util.Scanner;

public class PruebaStringTokenizer {
        public static void main(String[] args) {       
 
        Scanner entrada = new Scanner(System.in);
        String frase = "Hola: Mundo";
        Boolean Dospuntos = true;

        do {
            System.out.println ("*****************************************************************");
            System.out.println ("Escribe una frase que incluya ':' ");
            frase = entrada.nextLine();
                
            if (frase.indexOf(':') != -1)
                Dospuntos =true;
              
            else{
                System.out. println ("El valor ':' no aparece en la frase.");
                Dospuntos = false;
            }

        } while (Dospuntos == false);
        
        StringTokenizer Nuevafrase = new StringTokenizer (frase,":");
        System.out.println ("Las frases separadas por los ':' son...");

        while (Nuevafrase.hasMoreTokens()) {
            System.out.println (Nuevafrase.nextToken());
        }
        entrada.close();      
         
    }
      
}
