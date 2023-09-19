
// Matrices ordenadas por el método burbuja.

public class matrizEjemplo {

    public static void main(String[] args) {
        
        int [][] matriz = new int [5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = (int) (Math.random() * 100);

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println(matriz[i][j] + " ");

            }

            System.out.println();

        }

        int t = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int j2 = 0; j2 < matriz.length; j2++) {
                    for (int k = 0; k < matriz[0].length; k++) {
                        
                        if (matriz[i][j] > matriz[j2][k]) {
                            
                            t = matriz[i][j];

                            matriz[i][j] = matriz[j2][k];

                            matriz[j2][k] = t;

                        }
                    }
                }
            }
        }

        System.out.println(); System.out.println(); System.out.println(); System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println(matriz[i][j] + " ");

            }

            System.out.println();

        }
    }
}