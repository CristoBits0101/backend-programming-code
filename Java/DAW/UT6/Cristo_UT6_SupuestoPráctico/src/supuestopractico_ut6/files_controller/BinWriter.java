/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuestopractico_ut6.files_controller;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import supuestopractico_ut6.SupuestoPractico_UT6;

/**
 *
 * @author Jorge lap
 */
public class BinWriter {

public static void escrituraBinario(){                                                                     
        FileOutputStream fos = null;
        DataOutputStream salida = null;

            try {
                  fos = new FileOutputStream("./Datos.dat");
                  salida = new DataOutputStream(fos);
                
                  //Bucle para recorrernos la clase Cliente e ir añadiendolos al fichero binario
                  for (int i=0; i<SupuestoPractico_UT6.cliente.size(); i++){  
                      
                    //Llamamos al metodo que realiza la conversion
                    byte[] allDataInBytes = convertDataToBytes(i);
                    
                    //Mensaje para el depurador
                    System.out.println("AllData length"+allDataInBytes.length);
                    int x;
                    do{
                              for (x=0; x<allDataInBytes.length; x++){
                                   salida.writeByte(allDataInBytes[x]); //se escribe el byte en el fichero  !!IMPORTANTE
                                   System.out.println("BinWriter input data: "+allDataInBytes[x]);
                              }                                  
                              //Se repite hasta que se llegue a la longitud maxima del array
                        }while (x != allDataInBytes.length);
                  } 
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                    if (salida != null) {
                        salida.close();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());                                                               
                }
            }
    }   

    //Metodo que coge los datos del objeto cliente y lo transforma a ASCII
    public static byte[] convertDataToBytes(int i){
        /*Almacenamos los datos de cada cliente en una variable tipo string que luego será convertida a bytes
              este seria uno de pasos importantes para realizar la escribtura en el fichero*/
       String allData = SupuestoPractico_UT6.cliente.get(i).getDNI()+"&"+
            SupuestoPractico_UT6.cliente.get(i).getNombre()+"&"+
            SupuestoPractico_UT6.cliente.get(i).getApellidos()+"&"+
            SupuestoPractico_UT6.cliente.get(i).getCuenta()+"&"+
            SupuestoPractico_UT6.cliente.get(i).getSaldo()+";";
       
            
            //Convertimos la String a ASCII y la almacenamos en un array de bytes[];                    
            byte[] bytes = allData.getBytes(java.nio.charset.Charset.forName("US-ASCII"));
            
            //Depurador
            System.out.println("ArrayBytes length "+bytes.length);

            //Devolvemos el array de bytes.
            return bytes; 
    }
}
