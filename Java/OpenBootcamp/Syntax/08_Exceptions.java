import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

  public static void main(String[] args) {
    try {
      // Llamada a la función que puede lanzar una ArithmeticException
      int result = divideByZero();

      // Llamada a la función que puede lanzar una IOException
      readInput();

      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.err.println("ArithmeticException caught: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("IOException caught: " + e.getMessage());
    } finally {
      System.out.println("Finally block - cleanup code goes here.");
    }
  }

  // Función que lanza una ArithmeticException
  private static int divideByZero() throws ArithmeticException {
    int numerator = 10;
    int denominator = 0;
    return numerator / denominator;
  }

  // Función que lanza una IOException
  private static void readInput() throws IOException {
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    System.out.print("Enter something: ");
    String input = reader.readLine();
    System.out.println("You entered: " + input);
  }
}
