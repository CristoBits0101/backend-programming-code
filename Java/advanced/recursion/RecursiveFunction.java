package advanced.recursion;

public class RecursiveFunction {

    public static void main(String[] args) {
        System.out.println(sumaIterativa(5));
        System.out.println();
        System.out.println(sumaIterativa(5));
    }

    // Ejemplo 1
    public static int sumaIterativa(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++)
            resultado += i;
        return resultado;
    }

    // Ejemplo 2
    public static int sumaRecursiva(int n) {
        return (n == 0) ? 0 : n + sumaRecursiva(n - 1);
    }

}