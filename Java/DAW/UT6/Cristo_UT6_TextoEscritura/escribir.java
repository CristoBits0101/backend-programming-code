
// Con este programa vamos a escribir en un fichero, si no existe, se crea, y si ya existe, lo sobreescribe.

// Librerías necesarias.
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

//Incluye el procedimiento principal main.
public class escribir {

    // Se utiliza para recoger los datos personales del usuario y los devuelve en una variable de tipo String.
    public static String addPersonalDataLine(){
        Scanner datos = new Scanner(System.in);
        // Almacena el retorno.
        String personalInformation = "";
        // Colores alternativos para la consola.
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RED  = "\u001B[31m";
            // Lectura de datos de los datos.
            System.out.println(ANSI_RED  + "¡Introduzca sus datos personales!");
            System.out.print  (ANSI_BLUE + "    ➞ DNI        : ");  String dni        = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ Nombre     : ");  String nombre     = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ Apellidos  : ");  String Apellidos  = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ E-mail 1   : ");  String email_1    = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ Teléfono 1 : ");  String Telefono_1 = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ E-mail 2   : ");  String email_2    = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ Teléfono 2 : ");  String Telefono_2 = datos.nextLine();
            System.out.print  (ANSI_BLUE + "    ➞ E-mail 3   : ");  String email_3    = datos.nextLine();
            personalInformation = dni + ", " + "\"" + nombre + "\", " + "\"" + Apellidos + "\", " + email_1 + ", " + Telefono_1 + ", " + email_2 + ", " + Telefono_2 + ", " + email_3;
            System.out.println(" ");
        // Cerramos la clase Scanner
        datos.close();
        // Retorna la concatenación de los datos.
        return personalInformation;
    }

    public static void main(String[] args) {
        // File enlaza el objeto en el que se quiere escribir a través de la ruta absoluta (original y copia).
        File        fl1 = null;
        File        fl2 = null;
        // Contiene métodos para escribir así que le pasamos el archivo (original y copia).
        FileWriter  fw1 = null;
        FileWriter  fw2 = null;
        // Permite extender los métodos del FileWriter.
        PrintWriter pw = null;
        try {
            // Seleccionamos el objeto en el que vamos a escribir.
            fl1 = new File ("/home/cristobits0101/Downloads/Cristo_UT6_TextoEscritura/datos.txt");
            fl2 = new File ("/home/cristobits0101/Downloads/Cristo_UT6_TextoEscritura/datos2.txt");
            // Inicializamos con true para que no lo borre y escriba en la última línea disponible.
            fw1 = new FileWriter (fl1, true);
            fw2 = new FileWriter (fl2, true);
            // Inicializamos un buffer para poder extender los métodos.
            pw = new PrintWriter(fw1);
            // Añadimos mis datos al final del archivo.
            pw.println(addPersonalDataLine());
            // Copiamos los datos a datos2.
            try {
                Files.copy(fl1.toPath(), fl2.toPath()); 
            } catch (Exception e2) {
                System.out.println("¡Error!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Aprovechamos el finally para asegurarnos que se cierra el fichero.
                if (null != fw1) fw1.close();
                if (null != fw2) fw2.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}