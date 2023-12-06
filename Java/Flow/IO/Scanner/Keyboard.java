package Flow.IO.Scanner;

import java.util.Scanner;

public class Keyboard
{
    public static void main(String[] args) 
    {
        // 1. Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar al usuario que ingrese un entero
        System.out.print("Por favor, ingresa un número entero: ");

        // 3. Leer el entero ingresado por el usuario
        int numeroEntero = scanner.nextInt();

        // 4. Mostrar el número ingresado
        System.out.println("Has ingresado: " + numeroEntero);

        // 5. Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}