import java.util.Scanner;

public class MatrizSimetrica {
    public static void main (String[] args){

        int [][] matriz = new int [4][4];
        boolean simetrica = true;

        Scanner entrada = new Scanner(System.in); 
       
        System.out.println ("Programa que nos dice si una matriz es simétrica.");

        System.out.println ("Introducir valores de la matriz: ");

        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++){
                System.out.print ("A"+"["+ i+ "]" + "[" + j + "] = ");
                matriz [i][j]= entrada.nextInt ();                
            }
        }
        
        System.out.println ("La matriz introducida es la siguiente: ");

        for (int k=0;k<matriz.length;k++) {
            for (int l=0;l<matriz.length;l++){
                 System.out.print (matriz[k][l]+ " ");
            }
        System.out.println ();
        }       

        // Vamos a comprobar si la matriz es simétrica o no.
        for (int m=0; m<matriz.length;m++){
            for (int n=0;n<matriz.length;n++){                                 
                    if (n!=m && matriz [n][m]!=matriz [m][n])
                        simetrica = false;
            }
        }

        if (simetrica == true)
            System.out.println ("La matriz es SIMÉTRICA.");
        else
            System.out.println ("La matriz es NO es SIMÉTRICA.");
        
        entrada.close ();
    }

} 

