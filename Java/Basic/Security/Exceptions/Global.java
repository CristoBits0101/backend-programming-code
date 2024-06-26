package basic.security.exceptions;

public class Global {

    public static void main(String[] args) {

        /**
         * La clase Exception captura todos los tipos de errores.
         */
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Capturando error: " + e.getMessage());
        }

        /**
         * Combinar la captura de excepciones.
         * Si la excepción no es numérica, intentará capturar el otro tipo de excepción.
         */
        try {
            int result = 10 / 0;
        } catch (ArithmeticException f) {
            System.out.println("Capturando error: " + f.getMessage());
        } catch (Exception e) {
            System.out.println("Capturando error: " + e.getMessage());
        }

    }

}
