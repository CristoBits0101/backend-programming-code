/*
 *  Crear y cargar una tabla de tamaño 4x4.
 *  Decir si es simétrica o no al cambiar las filas por columnas.
 */

import java.util.Scanner;

public class perezSuarezCristoRuben_Actividad_1_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Esta matriz contendrá los datos base con la que vamos a trabajar.
        int [][] matrizBase = new int [4][4];
        
        // Esta matriz contendrá los datos de la matriz base invertidos.
        int [][] matrizInvertida = new int [4][4];

        //
        int aux;

        // Este bloque de código carga la matriz base y la copia en otra.
        for (int i = 0; i < matrizBase.length; i++) {

            for (int j = 0; j < matrizBase.length; j++) {

                System.out.println ("Introduce los datos de la fila " + i + " columna " + j + ":");
                matrizBase [i][j] = sc.nextInt();

                // Se crea una copia de la matriz base para invertir posteriormente las filas y columnas sin modificar la matriz original.
                matrizInvertida [i][j] = matrizBase [i][j];

            }
        }
        
        // Espacio entre la última fila de la matriz base y la primera fila de la matriz invertida.
        System.out.println();

        // Este bloque de código imprime los datos que se han cargado en la matriz base.
        for (int i = 0; i < matrizBase.length; i++) {

            for (int j = 0; j < matrizBase.length; j++) {

                System.out.print( matrizBase[i][j] + " ");

            }

            // Salto de línea entre filas.
            System.out.println();

        }

        // Espacio entre la última fila de la matriz base y la primera fila de la matriz invertida.
        System.out.println();

        // Este bloque de código invierte las filas por las columnas.
        for (int i = 0; i < matrizInvertida.length; i++) {

            // Al poner i y no 3 rellena la matriz desde una diagonal inversa.
            for (int j = 0; j < i; j++) {
                
                System.out.println ("El algoritmo está trabajando en la fila " + i + " columna " + j);

                aux = matrizInvertida [i][j];

                matrizInvertida [i][j] = matrizInvertida [j][i];

                matrizInvertida [j][i] = aux;

            }
        }

        // Espacio entre la última fila de la matriz base y la primera fila de la matriz invertida.
        System.out.println();

        // Este bloque de código imprime la matriz base de forma invertida.
        for (int i = 0; i < matrizBase.length; i++) {

            for (int j = 0; j < matrizBase.length; j++) {

                System.out.print( matrizInvertida [i][j] + " ");

            }

            // Salto de línea entre filas.
            System.out.println();

        }

        // Primero comprobamos si la longitud de la cadena de caracteres son igual con la función length de la clase String.
        if (matrizBase.length == matrizInvertida.length) {
            
            // Si la primera condición se cumple, pasamos a  comprobar si tienen la misma longitud vertical.
            if (matrizBase[0].length == matrizInvertida[0].length) {

                // Ahora comparamos las matrices.
                for (int i = 0; i < matrizBase.length; i++) {
                    
                    for (int j = 0; j < matrizInvertida[0].length; j++) {

                        // Si coincide los valores de las posiciones imprimimos que hay simetría de datos en caso contrario que no la hay.
                        if (matrizBase[i][j] == matrizInvertida[i][j]) {
                            System.out.println("La fila " + i + " columna " + j + " es simétrica.");
                        }

                        if (matrizBase[i][j] != matrizInvertida[i][j]) {
                            System.out.println("La fila " + i + " columna " + j + " no es simétrica.");
                        }
                        
                    }
                    
                }

            }

        }
        
        // Si la longitud de las matrices es diferente no pueden ser iguales.
        else {

            System.out.println("Se ha revisado los datos que hay en las posiciones de las matrices y no coinciden al completo.");

        }
    }
}