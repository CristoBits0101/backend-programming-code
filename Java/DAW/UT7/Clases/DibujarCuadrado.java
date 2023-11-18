import java.util.Scanner;

public class DibujarCuadrado {

    public static void main (String[] args) {
        int n=0, i=0, j=0;

        Scanner sc = new Scanner (System.in);
        System.out.print ("Lado: ");
        n=sc.nextInt ();

        while (j<n) {
            for (i=0;i<n;i++) {
                System.out.print ("*");               
            }
            j++;
            System.out.println ();
        }
    }

}
