/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuestopractico_ut6;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import supuestopractico_ut6.interfaz.*;
import supuestopractico_ut6.cliente.*;
import supuestopractico_ut6.files_controller.*;

/**
 *
 * @author Cristo Pérez Suárez
 */
public class SupuestoPractico_UT6 {

    /**
     * @param args the command line arguments
     */
    
    public static List<Cliente> cliente = new ArrayList();
    
    public static void main(String[] args) {
        FrameInicio i = new FrameInicio();
        i.setVisible (true);
         
        //Pequeño deùrador de datos para mostrar ciertos valores por consola
        System.out.println("DEPURADOR");
        
        //Leemos el fichero binario.
        BinReader.lecturabinario();
        //Pasamos un mensaje a la clase que se encarga de escribir en el Log
        logWriter.writingInFile("Programa arrancado -> "+SupuestoPractico_UT6.obtFecha());
        
    }
    
    //Metodo que genera la fecha
    public static String obtFecha() {
       DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
       Date date = new Date();
       return dateFormat.format(date);
    }
    
}
