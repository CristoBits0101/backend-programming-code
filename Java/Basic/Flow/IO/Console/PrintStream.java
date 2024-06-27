package persistence.files.print;

public class PrintStream {
    public static void main(String[] args) {

        // 1. Crear un objeto PrintStream asociado a la salida estándar (System.out)
        java.io.PrintStream printStream = System.out;

        // 2. Imprimir una cadena usando el objeto PrintStream
        printStream.println("Hola, esto es un ejemplo con PrintStream");

        // 3. Imprimir un número usando el objeto PrintStream
        int numero = 42;
        printStream.println("Número: " + numero);

        // 4. Cerrar el objeto PrintStream.
        printStream.close();

    }
}
