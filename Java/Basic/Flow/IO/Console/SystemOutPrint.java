package basic.flow.io.console;

public class SystemOutPrint
{
    public static void main(String[] args)
    {
        // 1. Imprimir una cadena usando System.out.print
        System.out.print("Hola, esto es un ejemplo con System.out.print ");

        // 2. Imprimir un número usando System.out.print
        int numero = 42;
        System.out.print("Número: " + numero);

        // 3. System.out.println agrega un salto de línea al final
        System.out.println();

        // 4. Imprimir otra línea usando System.out.println
        System.out.println("Esta es otra línea.");

        // 5. También puedes imprimir directamente variables
        double pi = 3.14159;
        System.out.println("El valor de pi es: " + pi);
    }
}
