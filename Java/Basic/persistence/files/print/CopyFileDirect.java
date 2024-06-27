package persistence.files.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class CopyFileDirect {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            
            // Se usa para leer el archivo.
            InputStream fileToRead = new FileInputStream("C:\\Users\\reuda\\Downloads\\pruebas.txt");
            byte[] data = fileToRead.readAllBytes();

            // Se usa para escribir en el archivo.
            PrintStream fileToWrite = new PrintStream("C:\\Users\\reuda\\Downloads\\pruebas2.txt");
            fileToWrite.write(data);

            fileToWrite.close();
            fileToRead.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
