package persistence.files.print;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            // Sobrescribir
            PrintWriter file1 = new PrintWriter("c:\\Users\\reuda\\Downloads\\pruebas.txt");
            file1.println("¡Hola mundo!");
            file1.close();

            // Escribe al final por la condición true
            FileWriter path = new FileWriter("c:\\Users\\reuda\\Downloads\\pruebas.txt", true);
            PrintWriter file2 = new PrintWriter(path);
            file2.println("¡Hola mundo! sin sobrescribir");
            file2.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
