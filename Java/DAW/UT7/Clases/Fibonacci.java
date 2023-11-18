import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        var n=100;
        int fibo[];
        fibo = new int [n];

        System.out.print ("¿Cuántos términos de la serie de Fibonnaci quieres calcular? ");
        n = sc.nextInt();
        
        System.out.print ("La serie de Fibonacci de "+n+" términos es ");

        for (int i = 1; i<n+1;i++){
            if (i==1 || i==2)
                fibo[i] = 1;
            else 
                fibo[i]=fibo[i-1]+fibo[i-2];
                            
            System.out.print (fibo[i]+" ");
        }
    sc.close();
    }
}
