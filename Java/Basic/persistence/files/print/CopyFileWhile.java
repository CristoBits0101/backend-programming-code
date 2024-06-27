package persistence.files.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class CopyFileWhile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            
            // Se usa para leer el archivo.
            InputStream fileToRead = new FileInputStream("C:\\Users\\reuda\\Downloads\\pruebas.txt");

            // Se usa para escribir en el archivo.
            PrintWriter fileToWrite = new PrintWriter("C:\\Users\\reuda\\Downloads\\pruebas2.txt");

            int c;

            // Leer cada byte del archivo pruebas.txt
            while ((c = fileToRead.read()) != -1) {

                // Escribir cada byte de c en el archivo pruebas2.txt
                fileToWrite.write(c);

            }

            // Cerrar PrintWriter y InputStream
            fileToWrite.close();
            fileToRead.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
