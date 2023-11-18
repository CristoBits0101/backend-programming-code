/*
 *  Crear una tabla de tamaño 7x7.
 *  Rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.
 */

public class perezSuarezCristoRuben_Actividad_1_04 {
    public static void main(String[] args) {

        //"Cargamos la matriz de forma manual realizando la diagonal con los valores que se solicitan en el ejercicio.";
        int [][] matrizDiagonal  = new int [][] {

            {1,0,0,0,0,0,0},{0,1,0,0,0,0,0},{0,0,1,0,0,0,0},{0,0,0,1,0,0,0},{0,0,0,0,1,0,0},{0,0,0,0,0,1,0},{0,0,0,0,0,0,1}
            
        };

        //"Impresión de los datos con la tabla realizada de forma manual.";
        for (int i = 0; i < matrizDiagonal.length; i++) {
            
            for (int j = 0; j < matrizDiagonal.length; j++) {

                System.out.print ( matrizDiagonal [i][j] );

            }
        
        //"Salto de línea entre párrafos.";
        System.out.println ();

        }
    }    
}