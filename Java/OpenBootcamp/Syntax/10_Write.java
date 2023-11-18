import java.io.PrintStream;

public class EjemploPrintStream {

  public static void main(String[] args) {
    // Crear un objeto PrintStream asociado a la salida estándar (System.out)
    PrintStream printStream = System.out;

    // Imprimir una cadena usando el objeto PrintStream
    printStream.println("Hola, esto es un ejemplo con PrintStream");

    // Imprimir un número usando el objeto PrintStream
    int numero = 42;
    printStream.println("Número: " + numero);

    // Cerrar el objeto PrintStream (no es necesario en este caso, ya que System.out no se cierra)
    printStream.close();
  }
}

public class EjemploSystemOutPrint {

  public static void main(String[] args) {
    // Imprimir una cadena usando System.out.print
    System.out.print("Hola, esto es un ejemplo con System.out.print ");

    // Imprimir un número usando System.out.print
    int numero = 42;
    System.out.print("Número: " + numero);

    // System.out.println agrega un salto de línea al final
    System.out.println();

    // Imprimir otra línea usando System.out.println
    System.out.println("Esta es otra línea.");

    // También puedes imprimir directamente variables
    double pi = 3.14159;
    System.out.println("El valor de pi es: " + pi);
  }
}
