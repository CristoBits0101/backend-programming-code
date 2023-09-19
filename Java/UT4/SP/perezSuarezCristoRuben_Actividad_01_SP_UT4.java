
/*
 *  - Se pretende realizar un programa para gestionar la lista de participaciones en una competición de salto de longitud.
 *  - El número de plazas disponible es indeterminado.
 *  - Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose los atletas.
 *  - Si se selecciona 1, se introducirán los datos de uno de los participantes:
 *      1) Dorsal.
 *      2) Nombre.
 *      3) Mejor marca del 2018.
 *      4) Mejor marca del 2019.
 *      5) Mejor marca del 2020.
 *  - Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
 *  - La opción 3 mostrará un listado ordenado por la marca del 2020, de mayor a menor.
 *  - Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción 4, que terminará el programa.
 *  - Diseñar el programa que muestre las siguientes opciones:
 *      1) Inscribir un participante.
 *      2) Mostrar listado por número de dorsal.
 *      3) Mostrar listado ordenado por la marca del 2020.
 *      4) Finalizar el programa.
 */

import java.util.*;

public class perezSuarezCristoRuben_Actividad_01_SP_UT4 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Una lista por cada tipo de dato de los usuarios.
        ArrayList<String> dorsal = new ArrayList<String>();
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<String> marca2018 = new ArrayList<String>();
        ArrayList<String> marca2019 = new ArrayList<String>();
        ArrayList<String> marca2020 = new ArrayList<String>();
        /*
         * - Variable auxiliar, guarda los datos del teclado y los pasa a la lista.
         * - Pasando los datos directamente a la lista se me colgaba el buffer.
         */
        String elemento = "";
        // Almacena un dato de las listas para por intercambiar los datos de posición.
        String aux = "";
        // Almacena un dato entero y basándose en eso se ejecuta un case del switch.
        int opcionMenu = 0;
        /*  
         *  - Se utiliza para finalizar el programa si el usuario pulsa 4 la variable
         *  cambia su valor a true y basándose en eso no se ejecuta más el bucle while.
         */
        boolean decisionFinalizar = false;
        // Bucle que contiene las instrucciones.
        while (decisionFinalizar == false) {
            // Le pide a un usuario que elija una opción dentro del rango del menú.
            do {
                System.out.println("- Pulse 1 para añadir un participante.");
                System.out.println("- Pulse 2 para mostrar los datos ordenados por dorsal.");
                System.out.println("- Pulse 3 para mostrar los datos ordenados por marcas del 2020.");
                System.out.println("- Pulse 4 para finalizar el programa.");
                opcionMenu = datos.nextInt();
            } while (opcionMenu < 1 || opcionMenu > 4);
            // Salto de línea estético.
            System.out.println(" ");
            // Cada case contiene una opción del menú.
            switch (opcionMenu) {
                case 1:
                    // Lista que almacena los dorsales.
                    System.out.println("Introduzca el dorsal:");
                    datos.nextLine();
                    elemento = datos.nextLine();
                    dorsal.add(elemento);
                    // Lista que almacena los nombres.
                    System.out.println("Introduzca el nombre:");
                    elemento = datos.nextLine();
                    nombre.add(elemento);
                    // Lista que almacena las marcas del 2018.
                    System.out.println("Introduzca la marca del 2018:");
                    elemento = datos.nextLine();
                    marca2018.add(elemento);
                    // Lista que almacena las marcas del 2019.
                    System.out.println("Introduzca la marca del 2019:");
                    elemento = datos.nextLine();
                    marca2019.add(elemento);
                    // Lista que almacena las marcas del 2020.
                    System.out.println("Introduzca la marca del 2020:");
                    elemento = datos.nextLine();
                    marca2020.add(elemento);
                    break;
                case 2:
                    /*
                     * - Compara alfabéticamente los dorsales y los intercambia de menor a mayor
                     * para mostrar por orden de dorsal.
                     * - Si se intercambia un dato en la lista dorsal también se hará lo mismo en
                     * cada lista.
                     * - Esto es para que el usuario tenga todos sus datos en la misma posición.
                     */
                    for (int i = 0; i < dorsal.size() - 1; i++) {
                        for (int j = 0; j < dorsal.size() - 1 - i; j++) {
                            if (dorsal.get(j).compareTo(dorsal.get(j + 1)) > 0) {
                                aux = dorsal.get(j);
                                dorsal.set(j, dorsal.get(j + 1));
                                dorsal.set(j + 1, aux);
                                //
                                aux = nombre.get(j);
                                nombre.set(j, nombre.get(j + 1));
                                nombre.set(j + 1, aux);
                                //
                                aux = marca2018.get(j);
                                marca2018.set(j, marca2018.get(j + 1));
                                marca2018.set(j + 1, aux);
                                //
                                aux = marca2019.get(j);
                                marca2019.set(j, marca2019.get(j + 1));
                                marca2019.set(j + 1, aux);
                                //
                                aux = marca2020.get(j);
                                marca2020.set(j, marca2020.get(j + 1));
                                marca2020.set(j + 1, aux);
                            }
                        }
                    }
                    /*  
                     *  - Concatenación de las posiciones del dorsal para imprimir los datos del
                     *  usuario en una misma línea.
                     */
                    for (int i = 0; i < dorsal.size(); i++) {
                        System.out.print(dorsal.get(i) + ", " + nombre.get(i) + ", " + marca2018.get(i) + ", "
                                + marca2019.get(i) + ", " + marca2020.get(i));
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    /*
                     * - Compara alfabéticamente las marcas del 2020 intercambia de menor a mayor
                     * para mostrar por orden de dorsal.
                     * - Si se intercambia un dato en la lista marcas2020 también se hará lo mismo
                     * en cada lista.
                     * - Esto es para que el usuario tenga todos sus datos en la misma posición.
                     * - Abajo imprimo las marcas invertidas para que aparezca por orden de mejor
                     * puntuación.
                     */
                    for (int i = 0; i < marca2020.size() - 1; i++) {
                        for (int j = 0; j < marca2020.size() - 1 - i; j++) {
                            if (marca2020.get(j).compareTo(marca2020.get(j + 1)) > 0) {
                                aux = dorsal.get(j);
                                dorsal.set(j, dorsal.get(j + 1));
                                dorsal.set(j + 1, aux);
                                //
                                aux = nombre.get(j);
                                nombre.set(j, nombre.get(j + 1));
                                nombre.set(j + 1, aux);
                                //
                                aux = marca2018.get(j);
                                marca2018.set(j, marca2018.get(j + 1));
                                marca2018.set(j + 1, aux);
                                //
                                aux = marca2019.get(j);
                                marca2019.set(j, marca2019.get(j + 1));
                                marca2019.set(j + 1, aux);
                                //
                                aux = marca2020.get(j);
                                marca2020.set(j, marca2020.get(j + 1));
                                marca2020.set(j + 1, aux);
                            }
                        }
                    }
                    // Invierto el bucle para que la lista se imprima al revés.
                    for (int i = dorsal.size() - 1; i > -1; i--) {
                        System.out.print(dorsal.get(i) + ", " + nombre.get(i) + ", " + marca2018.get(i) + ", "
                                + marca2019.get(i) + ", " + marca2020.get(i));
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    // Finaliza el bucle while = true.
                    decisionFinalizar = true;
                    break;
                default:
                    break;
            }
            // Salto de línea estético.
            System.out.println(" ");
        }
        // Para que la clase Scanner no se quede abierta.
        datos.close();
    }
}