// Importamos los paquetes necesarios para poder instanciar los objetos y sus métodos.
import FicherosTexto.DatosCliente;
import java.io.*;
import java.lang.String;

// Clase que contiene el método main.
public class XML {
    public static void main(String [] arg) {

        // Objeto que nos da acceso a los datos de los clientes.
        
        DatosCliente dc = new DatosCliente();
        
        // Para importar un archivo.
        File archivo = null;

        // Para poder leer datos del archivo.
        FileReader fr = null;

        // Incluye métodos para trabajar con los archivos.
        BufferedReader br = null;

        // Intentar como primera opción esto.
        try {
            
            /*  
             *  - Apertura del fichero y creación de BufferedReader.
             *  - Para poder hacer una lectura cómoda (disponer del metodo readLine()).
             *  - ¡Ojo con la ruta, esto es solo un ejemplo!.
             */ 
            archivo = new File ("/home/cristobits0101/Downloads/Cristo_UT6_FicherosTexto/datos.txt");

            // ¡El archivo debe existir con anterioridad!.
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Almacena los datos del fichero.
            String linea;
            
            // Lectura del fichero.
            while((linea = br.readLine()) != null){

                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

                // Salto de línea estético.
                System.out.println();

                // Impresión de datos en una línea.
                System.out.println(linea);

                // Salto de línea estético.
                System.out.println();

                // Almacenamientos del valor línea en un Array.
                String [] parts = linea.split(",");

                // Impresión de datos haciendo salto de línea en cada coma.
                for (int i = 0; i < parts.length; i++) {

                    // Impresión de datos, según la cantidad de elementos.
                    System.out.println("Elemento " + i + ": " + parts[i]);

                    // Filtrado de datos según los caracteres que contengan.
                    if (parts[i].length() == 9 && 
                        parts[i].endsWith("A") == true || parts[i].endsWith("B") == true || parts[i].endsWith("C") == true || 
                        parts[i].endsWith("D") == true || parts[i].endsWith("E") == true || parts[i].endsWith("F") == true ||
                        parts[i].endsWith("G") == true || parts[i].endsWith("H") == true || parts[i].endsWith("I") == true ||
                        parts[i].endsWith("J") == true || parts[i].endsWith("K") == true || parts[i].endsWith("L") == true ||
                        parts[i].endsWith("M") == true || parts[i].endsWith("N") == true || parts[i].endsWith("O") == true ||
                        parts[i].endsWith("P") == true || parts[i].endsWith("Q") == true || parts[i].endsWith("R") == true ||
                        parts[i].endsWith("S") == true || parts[i].endsWith("T") == true || parts[i].endsWith("U") == true ||
                        parts[i].endsWith("V") == true || parts[i].endsWith("W") == true || parts[i].endsWith("X") == true ||
                        parts[i].endsWith("Y") == true || parts[i].endsWith("Z") == true
                        ) {
                        dc.setId(parts[i]);
                    }

                    if (parts[i].contains("Margarita") || parts[i].contains("Pepe") || parts[i].contains("Manuel")) {
                        dc.setNombre(parts[i]);
                    }

                    if (parts[i].contains("Viera") || parts[i].contains("Castellano") || parts[i].contains("Luis")) {
                        dc.setApellidos(parts[i]);
                    }
                    
                    if (parts[i].contains("@")) {
                        dc.setCorreo(parts[i]);
                    }

                    if (parts[i].contains("+") || parts[i].contains("(")) {
                        dc.setTelefono(parts[i]);
                    }
                }

                // Salto de línea estético.
                System.out.println();

                dc.total();

                // Salto de línea estético.
                System.out.println();

            }
        }

        // En caso de error. 
        catch(Exception e){
            e.printStackTrace();
        }

        /*  
         *  - En el finally cerramos el fichero.
         *  - Para asegurarnos que se cierra tanto si todo va bien como si salta una excepcion.
         */ 
        finally {

            try {
                if( null != fr )
                fr.close();
            }

            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}