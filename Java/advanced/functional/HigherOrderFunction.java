package advanced.functional;

import java.util.function.Function;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

// Función que llama una función y/o devuelve otra función.
public class HigherOrderFunction {

    private static Function<String, String> uppercase = x -> x.toUpperCase();  // Actúa en el parámetro directamente.
    private static Function<Integer, Integer> adder = x -> Integer.sum(x, x);  // No actúa en el parámetro directamente.
    private static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(uppercase.apply("Cristo"));                       // Ejemplo 1
        System.out.println(adder.apply(5));                                  // Ejemplo 2

        saludar(uppercase, "Cristo");                                     // Ejemplo 3

        names.add("Cristo");
        names.add("Adara");

        names.stream().forEach(System.out::println);                           // Ejemplo 4
        names.stream().forEach(x ->  System.out.println(x));                   // Ejemplo 5
        names.stream().map(x -> x.toUpperCase()).forEach(System.out::println); // Ejemplo 6

        Stream <String> valores = names.stream().map(x -> x.toUpperCase());
        valores.forEach(System.out::println);                                  // Ejemplo 7

        names
            .stream()
            .map(x -> x.toUpperCase())
            .filter(x -> x.startsWith("C"))
            .forEach(System.out::println);                                     // Ejemplo 8

        int []numeros = {1, 2, 3, 4, 5, 6};
        var streamNumeros = Arrays.stream(numeros);
        streamNumeros.forEach(System.out::println);                            // Ejemplo 9 

        var resultado1 = streamNumeros                                         // Ejemplo 10
            .filter(x -> x % 2 == 0)
            .reduce(0, (x, y) -> x + y);
        
        var resultado2 = streamNumeros                                         // Ejemplo 11
        .filter(x -> x % 2 == 0)
        .reduce(30, (x, y) -> {
            System.out.println("X es:" + x);
            System.out.println("Y es:" + y);
            return x + y;
        });
    }

    /**
     * @param uppercase
     * @param name
     */
    public static void saludar(Function<String, String> uppercase, String name) {
        System.out.println(uppercase.apply(name));
    }

}