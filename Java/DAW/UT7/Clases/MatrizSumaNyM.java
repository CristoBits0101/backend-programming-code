public class MatrizSumaNyM {
    public static void main (String[] args) {

        int matriz [][]=new int [5][5];

        System.out.println ("Programa que suma la posición de la fila con la posición de la columna de una matriz");
        System.out.println ("La matriz que resulta es: ");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++) {
                matriz [i][j]=i+j;
                System.out.print (matriz[i][j]+" ");
            }
            System.out.println ();
        }        
    }
}