package persistence.files.read;

import java.io.*;

public class ReadAllBytes {
    public static void main(String[] args) {

        try {

            // Devuelve un array de bytes con el contenido de un fichero.
            InputStream fichero = new FileInputStream("C:\\Users\\reuda\\Downloads\\pruebas.txt");

            /**
             * Ejemplo 1: readAllBytes()
             * Para cuando el fichero es muy pequeño.
             * Consume poca memoria y pocas operaciones de lectura en el disco.
             */

            // Devuelve String de bytes con el contenido de un fichero.
            byte[] datos = fichero.readAllBytes();

            // Verificar si los datos fueron leídos.
            System.out.println("Tamaño de datos leídos: " + datos.length);

            // Mostrar el contenido del fichero.
            for (byte dato : datos) {
                System.out.println("Código ASCII: " + dato);
                System.out.println("Carácter: " + (char) dato);
            }

            // Mostrar todos los bytes.
            for (byte dato : datos)
                System.out.print("Código ASCII encadenado: " + dato);

            // Mostrar todos los caracteres.
            for (byte dato : datos)
                System.out.print("Caracteres encadenado: " + (char) dato);

        } catch (FileNotFoundException e) {

            // Imprime la lista de llamadas a los métodos.
            e.printStackTrace();

            // Imprime las causas del error.
            System.out.println("No se ha encontrado el fichero.");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            System.out.println("Localized Message: " + e.getLocalizedMessage());

        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
