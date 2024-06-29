package advanced.recursion;

public class SumaIterativa {

    public static void main(String[] args) {
        System.out.println(sumaIterativa(5));
    }

    public static int sumaIterativa(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++)
            resultado += i;
        return resultado;
    }

}
