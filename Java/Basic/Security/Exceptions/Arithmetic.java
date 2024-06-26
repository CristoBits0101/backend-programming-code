package basic.security.exceptions;

public class Arithmetic {
    public static void main(String[] args) {
        /**
         * Captura los errores de las operaciones aritméticas.
         */
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Capturando error: " + e.getMessage());
        } finally {
            System.out.println("Hacer algo siempre");
        }
    }
}
