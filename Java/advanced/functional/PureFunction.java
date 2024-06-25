package advanced.functional;

public class PureFunction {

    private static int contador = 0;

    /**
     * Función pura porque siempre devuelve el mismo resultado.
     * Si siempre le pasas 1 + 1 te devuelve 2.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Si invocara otra función que no sea pura dejaria de ser pura.
     * La función que llame no puede modificar la lógica de la función principal.
     */
    public static int sum2(int a, int b) {
        return sum3(a, b);
    }

    // No es pura el valor está alterado.
    public static int sum3(int a, int b) {
        contador++;
        return a + b * contador;
    }

}
