package persistence.files.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read {
    public static void main(String[] args) {

        try {

            // Devuelve un array de bytes con el contenido de un fichero.
            InputStream fichero = new FileInputStream("C:\\Users\\reuda\\Downloads\\pruebas.txt");

            /**
             * Para cuando el fichero es muy grande.
             * Consume mucha memoria y muchas operaciones de lectura en el disco.
             */

            // Devuelve un Integer con el contenido de un fichero.
            int datos = fichero.read();

            // read.() devuelve -1 cuando se llega al final del fichero.
            while (datos != -1) {
                System.out.println(datos);
                datos = fichero.read();
            }

            while (datos != -1) {
                System.out.println((char) datos);
                datos = fichero.read();
            }

            // Cerrar el fichero y liberar los recursos asociados.
            fichero.close();

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
