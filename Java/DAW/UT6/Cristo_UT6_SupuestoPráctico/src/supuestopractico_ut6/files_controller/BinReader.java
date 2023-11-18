package supuestopractico_ut6.files_controller;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import supuestopractico_ut6.SupuestoPractico_UT6;
import supuestopractico_ut6.cliente.*;
import supuestopractico_ut6.files_controller.*; 

/**
 *
 * @author Jorge lap
 */
public class BinReader {

    public static int lecturabinario() { 
            int countLines=0;
            FileInputStream fis = null;
            DataInputStream entrada = null;
            int n;
            try {
                fis = new FileInputStream("./Datos.dat");
                entrada = new DataInputStream(fis);
                String[] lines = Files.readAllLines(new File("./Datos.dat").toPath()).toArray(new String[0]);
                
                /*Separamos la string que creamos con todos los datos provenientes de Datos.dat
                     * Obtendremos a cada uno de los clientes (Recordar que cada cliente esta separado por ;
                     *  y cada uno de sus atributos por &). Así tendremos un array con un conjunto de datos de cada cliente
                     * El siguiente paso será recorrernos este array y realizarle otro split para así obtener cada atributo de cada 
                     * cliente. Como forma lógica de verlo digamos que estamos trabajando con peuqeños paquetes de datos donde cada paquete
                     * es un cliente y dentro de su paquete tenemos sus atributos, de esta forma tenemos nuestros datos perfectamente estructurados
                    */
                String[] data = lines[0].split(";");
                
                //Variable auxiliar para llamar al constructor del objeto cliente
                Cliente aux;                
                
                //Se repetirá tantas vecs como clientes haya
                for (int x=0; x<data.length;x++){
                    //Separamos los atributos de cada cliente x
                    String[] splited = data[x].split("&");
                    
                    /*Cuando los datos se separen, cogeremos cada posicion del array que sabemos que es como máximo de 5
                            atributos por cliente. Siguiente paso mandamos los datos al constructor de Cliente   */                 
                    aux = new Cliente(splited[0],splited[1],splited[2],splited[3],splited[4]);
                    
                    SupuestoPractico_UT6.cliente.add(aux); 
                }
                
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (EOFException e) {
                System.out.println();
                System.out.println("Fin de fichero");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    if (entrada != null) {
                        entrada.close();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());                                                               
                }
            }
            System.out.println(countLines);
            return countLines;
      }   
}
