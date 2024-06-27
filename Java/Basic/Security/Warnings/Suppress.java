package security.warnings;

public class Suppress {

    // Eliminaria el tipo de advertencia rawtypes.
    @SuppressWarnings("rawtypes");
    public static void demo() {
        System.out.println("Hola");
    }

}
