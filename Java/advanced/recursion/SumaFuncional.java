package advanced.recursion;

import java.util.stream.IntStream;

public class SumaFuncional {

    public static void main(String[] args) {
        System.out.println(sumaFuncional());
    }

    public static int sumaFuncional() {
        return IntStream                                   // Contiene una secuencia de elementos enteros
            .rangeClosed(1, 5) // Hace un stream con los números del 1 al 5
            .reduce(0, (a, b) -> a + b);          // a es el acumulador y b es el elemento del stream 
    }

}
