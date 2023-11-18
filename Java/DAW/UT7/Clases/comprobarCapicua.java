/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numerocapicua;

/**
 *
 * @author cristobits0101
 * @version 16/03/2022
 * @throws excepción para lanzar explícitamente una excepción.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Esta función dala vuelta a un conjunto de números para que se impriman al revés. * @param numero obtiene los valores de trabajo.
 * @param NUMERO almacena las posiciones el revés.
 * @param resultado almacena la salida de la función con el resultado.
 * @return darLaVuelta retorna el número capicúa al revés.
 */
public class NumeroCapicua {
    static int darLaVuelta (int numero) {
        String NUMERO = "" + numero; // convierte numero de int a String.
        String RESULTADO = "";
        int posicion = NUMERO.length()-1;
        do {
            RESULTADO += NUMERO.charAt(posicion);
            posicion--;
        } while (posicion >= 0);
        int resultado = Integer.parseInt(RESULTADO);
        return resultado;
    }
/**
 * Esta función hace una llamada a la función dar la vuelta y luego compara el número resultante con el valor inicial del número para saber si son iguales.
 * @param numero obtiene los valores de trabajo.
 * @param numeroAlReves almacena las posiciones el revés.
 * @return esCapicua retorna el número capicúa al revés.
 */
    static boolean esCapicua (int numero) {
        int numeroAlReves = darLaVuelta(numero);
        if (numero == numeroAlReves) {
            return true;
        } else {
            return false;
        }
    }

    static int crearCapicua (int numero) {
        int numeroAlReves = darLaVuelta(numero);
        String CAPICUA = "" + numero + numeroAlReves;
        int resultado = Integer.parseInt(CAPICUA);
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        do {
            System.out.println("-------------------------------------------------");
            System.out.print("Inserte un número para comprobar si es capicúa: ");
            numero = Integer.parseInt(teclado.readLine());
        } while (numero <= 0);
        if (esCapicua(numero)) {
            System.out.println("\nEl número introducido es capicúa.");
        } else {
            System.out.println("\nEl número introducido no es capicúa.");
            System.out.print("Se puede generar el siguiente capicúa con él: ");
            int capicua = crearCapicua(numero);
            System.out.println(capicua);
        }
    }
}