package State.Files.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read
{
    public static void main(String[] args) 
    {
        // 1. Reemplaza "ruta_del_archivo.txt" con la ruta real de tu archivo
        String filePath = "ruta_del_archivo.txt";  

        // 2. Bloque try-with-resources para garantizar el cierre adecuado de recursos
        try 
        (
            // 3. FileInputStream para obtener un flujo de entrada de bytes desde un archivo
            FileInputStream fileInputStream = new FileInputStream(filePath);
            
            // 4. InputStreamReader para convertir bytes en caracteres
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            
            // 5. BufferedReader para leer líneas completas de manera eficiente
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        )
        {
            // 6. Variable para almacenar cada línea leída
            String line;
            
            // 7. Leer cada línea del archivo hasta llegar al final
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } 
        
        catch (IOException e) 
        {
            // 8. Capturar excepciones de entrada/salida (IOException)
            System.err.println("Error de lectura del archivo: " + e.getMessage());
        }
    }
}
