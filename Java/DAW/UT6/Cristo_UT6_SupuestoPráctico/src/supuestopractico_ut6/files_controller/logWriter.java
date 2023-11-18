/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuestopractico_ut6.files_controller;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorge lap
 */
public class logWriter {
    
       public static void writingInFile(String LogMensaje){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            File file = new File("./ApplicationLogs.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            //Escribimos el mensaje que nos llega desde cualquier parte de nuestro programa
            bw.write(LogMensaje+"\n");
            
           
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
             //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
