package basic.state.files.binary;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Read
{
    public static void main(String[] args) 
    {
        // 1. Reemplaza "ruta_del_archivo.bin" con la ruta real de tu archivo binario
        String filePath = "ruta_del_archivo.bin";

        // 2. Declarar un objeto BufferedInputStream
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath))) 
        {
            // 3. Tamaño del búfer para leer datos (puedes ajustar según sea necesario)
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];

            int bytesRead;
            
            // 4. Leer datos desde el BufferedInputStream al búfer
            while ((bytesRead = bufferedInputStream.read(buffer, 0, bufferSize)) != -1)
                // Procesar los bytes leídos según sea necesario
                processBytes(buffer, bytesRead);

        } 
        
        catch (IOException e) 
        {
            // Capturar excepciones de entrada/salida (IOException)
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        }
    }

    // Método para procesar los bytes leídos (puedes personalizar según sea necesario)
    private static void processBytes(byte[] buffer, int bytesRead) 
    {
        // Ejemplo: Imprimir los bytes en la consola
        System.out.print(new String(buffer, 0, bytesRead));
    }
}
