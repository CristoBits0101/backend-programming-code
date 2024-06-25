package advanced.functional;

import java.util.function.Function;

// Función que llama una función y/o devuelve otra función.
public class HigherOrderFunction {

    /**
     * Lambda
     **/
    private Function<String, String> mayus = x -> x.toUpperCase();
    private Function<Integer, Integer> sum = x -> Integer.sum(x, x);

    // Llamar a la funciones Lambda
    public void test() {
        mayus.apply("hola");
        sum.apply(6);
    }

    // Función que recibe otra función como parámetro
    public void test2() {
        saluda(mayus, "Cristo");
    }

    public void saluda(Function<String, String> mayus2, String name) {
        mayus2.apply(name);
    }

    // Función de alto nivel que retorna una función
    public boolean startsWithA(String text) {
        return text.startsWith("A");
    }

}