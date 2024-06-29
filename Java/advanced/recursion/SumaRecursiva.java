package advanced.recursion;

public class SumaRecursiva {

    public static void main(String[] args) {
        sumaRecursivaCabeza(3);
        System.out.println();
        sumaRecursivaCola(3);
    }

    /**
     * Primero el retorno y luego la lógica
     * 
     * @param n
     */
    public static void sumaRecursivaCabeza(int n) {
        if (n == 0)
            return;
        sumaRecursivaCabeza(n - 1);
        System.out.println(n);
    }

    /**
     * Primero la lógica y luego el retorno
     * 
     * @param n
     */
    public static int sumaRecursivaCola(int n) {
        System.out.println(n);
        return (n == 0) ? 0 : n + sumaRecursivaCola(n - 1);
    }

}
