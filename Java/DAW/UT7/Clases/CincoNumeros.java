import java.util.Scanner;

public class CincoNumeros {
	public static void main (String[] args){
		int num[] = new int [5];
        int i=0, j=0;
        
		try (Scanner sc = new Scanner (System.in)) {
            System.out.println ("Introduce 5 números: ");
            System.out.println ();

            for (i=0;i<5;i++){
                System.out.print ("Introduce un números: ");
                num[i] = sc.nextInt();
            }
            
            System.out.println ();
            System.out.print ("Los números son: ");     
            for (j=0;j<5;j++)
                System.out.print (num[j] + " ");
            
            sc.close();
        }
    }
}