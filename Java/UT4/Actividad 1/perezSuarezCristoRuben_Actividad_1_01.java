/*
 *  1. Crear una matriz bidimensional de tamaño 5x5 y rellenarla de la siguiente forma:
 *  2. La posición T[n,m] debe contener n+m.
 *  3. Después se debe mostrar su contenido.
 */

//"Estas librerías las importa el editor de código automáticamente porque detecta que le hacen falta para realizar funciones automáticas.";
import java.lang.reflect.Method;
import java.util.function.Function;

//"La clase que pertenece al archivo.";
public class perezSuarezCristoRuben_Actividad_1_01 {

    //"Clase principal (main) por donde se empieza a ejecutar nuestro código.";
    public static void main ( String[] args ) {

        //"Declaro la matriz (el tipo, el identificador, y la longitud de la matriz (5)).";
        int [][] matrizBidimensional = new int [5][5];

        //"Este bucle rellena las filas de la matriz.";
        for ( int i = 0; i < 5; i++ ) {
            
            //"Este bucle anidado rellena las columnas de la matriz.";
            for ( int j = 0; j < 5; j++ ) {
                
                matrizBidimensional [i][j] = i + j;

            }
        }

        //"Este bucle se usa para imprimir los datos de las filas y para añadir un salto de línea entre filas.";
        for ( int i = 0; i < 5; i++ ) {

            //"Este bucle anidado se usa para imprimir los datos de las columnas sin salto de línea para que tome la forma de una tabla.";
            for ( int j = 0; j < 5; j++ ) {
                
                //"Impresión de las posiciones i y j.";
                System.out.print ( matrizBidimensional [i][j] );
                    
            }
        
        //"Añade un salto de línea entre las filas.";
        System.out.println ();

        }
    }
}