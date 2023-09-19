import java.util.Scanner;

public class MatrizSuma {
    public static void main (String[] args){

        int [][] matrizA = new int [3][3];
        int [][] matrizB = new int [3][3];
        int [][] matrizC = new int [3][3];   
        Scanner entrada = new Scanner(System.in);
       
        System.out.println ("Programa que suma matrices.");
        System.out.println ("Introducir valores de la primera matriz: ");

        for (int Ai=0;Ai<matrizA.length;Ai++) {
            for (int Aj=0;Aj<matrizA.length;Aj++){
                System.out.print ("A"+"["+ Ai+ "]" + "[" + Aj + "] = ");
                matrizA [Ai][Aj]= entrada.nextInt ();                
            }
        }
        
        System.out.println ("La matriz A introducida es la siguiente: ");

        for (int Ak=0;Ak<matrizA.length;Ak++) {
            for (int Al=0;Al<matrizA.length;Al++){
                 System.out.print (matrizA[Ak][Al]+ " ");
            }
        System.out.println ();
        }       
        
        System.out.println ("Introducir valores de la segunda matriz: ");

        for (int Bi=0;Bi<matrizB.length;Bi++) {
            for (int Bj=0;Bj<matrizB.length;Bj++){
                System.out.print ("B"+"["+ Bi+ "]" + "[" + Bj + "] = ");
                matrizB [Bi][Bj]= entrada.nextInt ();                
            }
        }
       
        System.out.println ("La matriz B introducida es la siguiente: ");

        for (int Bk=0;Bk<matrizB.length;Bk++) {
            for (int Bl=0;Bl<matrizA.length;Bl++){
                 System.out.print (matrizB[Bk][Bl]+ " ");
            }
        System.out.println ();
        } 

        System.out.println ("La matriz suma resultante es: ");

        for (int Ci=0;Ci<matrizC.length;Ci++) {
            for (int Cj=0;Cj<matrizB.length;Cj++){
                matrizC [Ci][Cj]= matrizA [Ci][Cj]+matrizB [Ci][Cj];                
            }
        }
        
        for (int Ck=0;Ck<matrizC.length;Ck++) {
            for (int Cl=0;Cl<matrizA.length;Cl++){
                 System.out.print (matrizC[Ck][Cl]+ " ");
            }
        System.out.println ();
        } 
    entrada.close ();
    }
    
}