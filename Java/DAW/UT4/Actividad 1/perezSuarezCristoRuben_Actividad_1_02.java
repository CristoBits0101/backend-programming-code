/*
 *  1. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */

//"Librería que se necesita para usar la clase Scanner que permite leer datos del teclado.";
import java.util.Scanner;

//"La clase que pertenece al archivo.";
public class perezSuarezCristoRuben_Actividad_1_02 {
    
    //"Clase principal (main) por donde se empieza a ejecutar nuestro código.";
    public static void main ( String[] args ) {

        //"Creación de nuevo objeto con el parámetro System.in para almacenar los datos que se introducen por el teclado.";
        Scanner sc = new Scanner(System.in);

        //"Están son las dos matrices que voy a cargar para posterior realizar la suma.";
        double [][] matrizA = new double [3][3];
        double [][] matrizB = new double [3][3];

        //"Esta matriz almacena la suma de las posiciones, en las mismas posiciones en las que coincidió la suma..";
        double [][] matrizC = new double [3][3];

        //"Este bucle rellena las filas de la matriz.";
        for ( int i = 0; i < 3; i++ ) {

            //"Este bucle anidado rellena las columnas de la matriz.";
            for ( int j = 0; j < 3; j++ ) {

                //"Pedimos los datos de la primera matriz.";
                System.out.println ( "Introduce el valor de la fila " + i + " columna " + j + " para la primera matriz:" );
                matrizA [i][j] = sc.nextDouble();

                System.out.println ( "Introduce el valor de la fila " + i + " columna " + j + " para la segunda matriz:" );
                matrizB [i][j] = sc.nextDouble();
                
                //"Pedimos los datos de la segunda matriz.";
                matrizC [i][j] = matrizA [i][j] + matrizB [i][j];

            }
        }

        //"Este bucle se usa para imprimir los datos de las filas y para añadir un salto de línea entre filas.";
        for ( int i = 0; i < 3; i++ ) {

            //"Este bucle anidado se usa para imprimir los datos de las columnas sin salto de línea para que tome la forma de una tabla.";
            for ( int j = 0; j < 3; j++ ) {
                
                //"Impresión de la suma.";
                System.out.print ( matrizC [i][j] + " " );
                            
            }
        
        //"Añade un salto de línea entre las filas.";
        System.out.println ();
        
        }
    }    
}