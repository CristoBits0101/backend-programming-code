package basic.flow.io.scanner;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {

        // 1. Declaramos las variables.
        String nombre;
        int age;

        // 2. Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        do {

            // 3. Solicitar al usuario que ingrese un entero
            System.out.print("Por favor, ingresa su nombre: ");
            System.out.print("Por favor, ingresa su edad: ");

            // 4. Leer el nombre y el número entero del usuario
            nombre = scanner.next();
            age = scanner.nextInt();
            
        } while ();

        // 5. Mostrar los datos ingresado
        System.out.println(nombre + " tiene " + age + " años.");

        // 6. Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}