package advanced.functional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PureFunction {

    private static int contador = 0;

    // Función pura porque devuelve el mismo valor con iguales parámetros.
    public int sum(int a, int b) {
        return a + b;
    }

    // Función impura porque modifica una variable global y no local.
    public int sum2(int a, int b) {
        contador++;
        return a + b + contador;
    }

    // Función impura porque no cumple la lógica de sumar.
    public int sum3(int a, int b) {
        return a * b;
    }

    // Función impura porque nunca devuelve el mismo valor.
    public double sum4() {
        double sum = Math.random() * 10;
        return sum;
    }

    // Función impura porque el texto del archivo puede variar.
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }

}
