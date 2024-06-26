package basic.security.exceptions;

public class ThrowsExceptions {
    public static void main(String[] args) {
        division(10, 0);
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    // Ejemplo a.
    public static int division(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return result;
    }

    // Ejemplo b, manda la excepción a main al try catch que la captura.
    public static void metodoA() throws Exception {
        metodoB();
    }

    public static void metodoB() throws Exception {
        metodoC();
    }

    public static void metodoC() throws Exception {
        // Simulamos una excepción lanzada desde aquí
        throw new Exception("Excepción lanzada desde metodoC");
    }
}
