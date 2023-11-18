import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileExample {
    public static void main(String[] args) {
        // Reemplaza "ruta_del_archivo.txt" con la ruta real de tu archivo
        String filePath = "ruta_del_archivo.txt";  

        // Bloque try-with-resources para garantizar el cierre adecuado de recursos
        try (
            // FileInputStream para obtener un flujo de entrada de bytes desde un archivo
            FileInputStream fileInputStream = new FileInputStream(filePath);
            
            // InputStreamReader para convertir bytes en caracteres
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            
            // BufferedReader para leer líneas completas de manera eficiente
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            // Variable para almacenar cada línea leída
            String line;
            
            // Leer cada línea del archivo hasta llegar al final
            while ((line = bufferedReader.readLine()) != null) {
                // Imprimir la línea en la consola
                System.out.println(line);
            }

        } catch (IOException e) {
            // Capturar excepciones de entrada/salida (IOException)
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        }
    }
}

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        // Reemplaza "ruta_del_archivo.bin" con la ruta real de tu archivo binario
        String filePath = "ruta_del_archivo.bin";

        // Declarar un objeto BufferedInputStream
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath))) {
            // Tamaño del búfer para leer datos (puedes ajustar según sea necesario)
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];

            int bytesRead;
            // Leer datos desde el BufferedInputStream al búfer
            while ((bytesRead = bufferedInputStream.read(buffer, 0, bufferSize)) != -1) {
                // Procesar los bytes leídos según sea necesario
                processBytes(buffer, bytesRead);
            }

        } catch (IOException e) {
            // Capturar excepciones de entrada/salida (IOException)
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        }
    }

    // Método para procesar los bytes leídos (puedes personalizar según sea necesario)
    private static void processBytes(byte[] buffer, int bytesRead) {
        // Ejemplo: Imprimir los bytes en la consola
        System.out.print(new String(buffer, 0, bytesRead));
    }
}

import java.util.Scanner;

public class LeerDesdeTeclado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un entero
        System.out.print("Por favor, ingresa un número entero: ");

        // Leer el entero ingresado por el usuario
        int numeroEntero = scanner.nextInt();

        // Mostrar el número ingresado
        System.out.println("Has ingresado: " + numeroEntero);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}