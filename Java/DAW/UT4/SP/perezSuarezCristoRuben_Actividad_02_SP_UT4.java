
/*
 * - Realizar un programa para la gestión bancaria de un número indeterminado de usuarios con cinco opciones:
 *      1. Pedir DNI, nombre , apellidos y número de cuenta corriente de usuario.
 *      2. Realizar un ingreso en la cuenta del usuario con una cantidad.
 *      3. Realizar un cargo en la cuenta del usuario.
 *      4. Estado de la cuenta de un usuario.
 *      5. Salir del programa.
 */

import java.util.*;

public class perezSuarezCristoRuben_Actividad_02_SP_UT4 {
    // Función que comprueba el formato del DNI.
    public static boolean comprobarDNI (String elemento){
        if (elemento.isEmpty()              || 
            elemento.length() != 9          || 
            elemento.endsWith("A") == false && elemento.endsWith("a") == false &&
            elemento.endsWith("B") == false && elemento.endsWith("b") == false &&
            elemento.endsWith("C") == false && elemento.endsWith("c") == false &&
            elemento.endsWith("D") == false && elemento.endsWith("d") == false &&
            elemento.endsWith("E") == false && elemento.endsWith("e") == false &&
            elemento.endsWith("F") == false && elemento.endsWith("f") == false &&
            elemento.endsWith("G") == false && elemento.endsWith("g") == false &&
            elemento.endsWith("H") == false && elemento.endsWith("h") == false &&
            elemento.endsWith("I") == false && elemento.endsWith("i") == false &&
            elemento.endsWith("J") == false && elemento.endsWith("j") == false &&
            elemento.endsWith("K") == false && elemento.endsWith("k") == false &&
            elemento.endsWith("L") == false && elemento.endsWith("l") == false &&
            elemento.endsWith("M") == false && elemento.endsWith("m") == false &&
            elemento.endsWith("N") == false && elemento.endsWith("n") == false &&
            elemento.endsWith("Ñ") == false && elemento.endsWith("ñ") == false &&
            elemento.endsWith("O") == false && elemento.endsWith("o") == false &&
            elemento.endsWith("P") == false && elemento.endsWith("p") == false &&
            elemento.endsWith("Q") == false && elemento.endsWith("q") == false &&
            elemento.endsWith("R") == false && elemento.endsWith("r") == false &&
            elemento.endsWith("S") == false && elemento.endsWith("s") == false &&
            elemento.endsWith("T") == false && elemento.endsWith("t") == false &&
            elemento.endsWith("U") == false && elemento.endsWith("u") == false &&
            elemento.endsWith("V") == false && elemento.endsWith("v") == false &&
            elemento.endsWith("W") == false && elemento.endsWith("w") == false &&
            elemento.endsWith("X") == false && elemento.endsWith("x") == false &&
            elemento.endsWith("Y") == false && elemento.endsWith("y") == false &&
            elemento.endsWith("Z") == false && elemento.endsWith("z") == false) {
            return true;
        }
        else {
            return false;
        }
    }
    // Función que comprueba el formato del IBAN.
    public static boolean comprobarIBAN (String elemento){
        if (elemento.isEmpty()             || 
            elemento.length() < 1          && 
            elemento.length() > 34         ||
            elemento.contains("A") == true || elemento.contains("a") == true ||
            elemento.contains("B") == true || elemento.contains("b") == true ||
            elemento.contains("C") == true || elemento.contains("c") == true ||
            elemento.contains("D") == true || elemento.contains("d") == true ||
            elemento.contains("E") == true || elemento.contains("e") == true ||
            elemento.contains("F") == true || elemento.contains("f") == true ||
            elemento.contains("G") == true || elemento.contains("g") == true ||
            elemento.contains("H") == true || elemento.contains("h") == true ||
            elemento.contains("I") == true || elemento.contains("i") == true ||
            elemento.contains("J") == true || elemento.contains("j") == true ||
            elemento.contains("K") == true || elemento.contains("k") == true ||
            elemento.contains("L") == true || elemento.contains("l") == true ||
            elemento.contains("M") == true || elemento.contains("m") == true ||
            elemento.contains("N") == true || elemento.contains("n") == true ||
            elemento.contains("Ñ") == true || elemento.contains("ñ") == true ||
            elemento.contains("O") == true || elemento.contains("o") == true ||
            elemento.contains("P") == true || elemento.contains("p") == true ||
            elemento.contains("Q") == true || elemento.contains("q") == true ||
            elemento.contains("R") == true || elemento.contains("r") == true ||
            elemento.contains("S") == true || elemento.contains("s") == true ||
            elemento.contains("T") == true || elemento.contains("t") == true ||
            elemento.contains("U") == true || elemento.contains("u") == true ||
            elemento.contains("V") == true || elemento.contains("v") == true ||
            elemento.contains("W") == true || elemento.contains("w") == true ||
            elemento.contains("X") == true || elemento.contains("x") == true ||
            elemento.contains("Y") == true || elemento.contains("y") == true ||
            elemento.contains("Z") == true || elemento.contains("z") == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Almacena un dato entero y basándose en eso se ejecuta un case del switch.
        int opcionMenu = 0;
        // Cuando el valor cambie a true se termina el bucle.
        boolean decisionFinalizar = false;
        // Almacena los datos de los usuarios.
        ArrayList<String> DNI = new ArrayList<String>();
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<String> apellidos = new ArrayList<String>();
        ArrayList<String> IBAN = new ArrayList<String>();
        // Para gestionar el dinero asociado a una cuenta bancaria.
        ArrayList<Double> saldo = new ArrayList<Double>();
        double ingreso = 0.0;
        double cargo = 0.0;
        // Se usa para almacenar la posición de  un dato en una lista.
        int datoID = 0;
        // Se usa para validar los datos antes de pasarlos a las listas.
        String elemento = new String();
        // Contiene las instrucciones del menú.
        while (decisionFinalizar == false) {
            // Repetir si la opción del menú elegida no está en el rango permitido.
            do {
                // Opciones disponibles.
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("    1) Añadir un usuario.");
                System.out.println("    2) Realizar un ingreso.");
                System.out.println("    3) Realizar un cargo.");
                System.out.println("    4) Mostrar datos de un usuario.");
                System.out.println("    5) Cerrar la aplicación.");
                // Recogemos la opción del menú y aplicamos salto de línea.
                System.out.print("      🡺  "); opcionMenu = datos.nextInt(); System.out.println(" ");
                // En caso de entrada de datos errónea imprimir esto.
                if (opcionMenu < 1 || opcionMenu > 5) {
                    System.out.println("¡La opción elegida no es válida!, seleccione una de las siguientes:");
                }
            } while (opcionMenu < 1 || opcionMenu > 5);
            // Cada case contiene una opción del menú.
            switch (opcionMenu) {
                // Rellenar datos del usuario.
                case 1:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    // Se validan los datos del usuario antes de pasarlos a la lista.
                    do {
                        System.out.println("# Introduzca el DNI:");
                        elemento = datos.nextLine();
                        if (comprobarDNI(elemento) == true){
                            // Salto de línea estético.
                            System.out.println(" ");
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                        else {
                            DNI.add(elemento);
                        }
                    } while (comprobarDNI(elemento) == true);
                    do {
                        // Salto de línea estético.
                        System.out.println(" ");
                        System.out.println("# Introduzca el nombre:");
                        elemento = datos.nextLine();
                        if (elemento.isEmpty() || elemento.length() > 15) {
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos."); 
                        }
                        else {
                            nombre.add(elemento);
                        }
                    } while (elemento.isEmpty() || elemento.length() > 15);
                    do {
                        // Salto de línea estético.
                        System.out.println(" ");
                        System.out.println("# Introduzca los apellidos:");
                        elemento = datos.nextLine();
                        if (elemento.isEmpty() || elemento.length() > 15) {
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                        else {
                            apellidos.add(elemento);
                        }
                    } while (elemento.isEmpty() || elemento.length() > 15);
                    do {
                        // Salto de línea estético.
                        System.out.println(" ");
                        System.out.println("# Introduzca el IBAN:");
                        elemento = datos.nextLine();
                        if (comprobarIBAN(elemento) == true) {
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                        else {
                            IBAN.add(elemento);
                        }
                    } while (comprobarIBAN(elemento) == true);
                    // Inicializamos la cuenta del usuario con 0 saldo.
                    saldo.add(0.0);
                    break;
                // Realizar un ingreso a un usuario.
                case 2:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    // Salto de línea estético.
                    System.out.println(" ");
                    // Si no se ha encontrado ningún dato en la lista repetir.
                    boolean aux = true;
                    do {
                        System.out.println("# Introduzca el IBAN de la cuenta en la que quiere realizar el cargo:");
                        elemento = datos.nextLine();
                        do {
                            System.out.println("# Introduzca la cantidad de dinero a ingresar:");
                            ingreso = datos.nextLong();
                        } while (ingreso < 0.1);
                        for (int i = 0; i < IBAN.size(); i++) {
                            if (IBAN.get(i).equals(elemento)) {
                                // Cogemos el valor de la posición.
                                datoID = i;
                                aux = false;
                            }
                        }
                        if (comprobarIBAN(elemento) == true){
                            // Salto de línea estético.
                            System.out.println(" ");
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                    } while (comprobarIBAN(elemento) == true || aux == true);
                    Double saldoAlmacenado = saldo.get(datoID) + ingreso;
                    saldo.set(datoID, saldoAlmacenado);
                    break;
                // Realizar un cargo  a un usuario.
                case 3:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    // Salto de línea estético.
                    System.out.println(" ");
                    // Si no se ha encontrado ningún dato en la lista repetir.
                    aux = true;
                    do {
                        System.out.println("# Introduzca el IBAN de la cuenta en la que quiere realizar el cargo:");
                        elemento = datos.nextLine();
                        do {
                            System.out.println("# Introduzca la cantidad de dinero del recibo a cargar:");
                            cargo = datos.nextLong();
                        } while (cargo < 0.1);
                        for (int i = 0; i < IBAN.size(); i++) {
                            if (IBAN.get(i).equals(elemento)) {
                                // Cogemos el valor de la posición.
                                datoID = i;
                                aux = false;
                            }
                        }
                        if (comprobarIBAN(elemento) == true){
                            // Salto de línea estético.
                            System.out.println(" ");
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                    } while (comprobarIBAN(elemento) == true || aux == true);
                    saldoAlmacenado = saldo.get(datoID) - cargo;
                    saldo.set(datoID, saldoAlmacenado);
                    break;
                // Mostrar datos de un usuario.
                case 4:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    // Salto de línea estético.
                    System.out.println(" ");
                    // Si no se ha encontrado ningún dato en la lista repetir.
                    aux = true;
                    do {
                        System.out.println("# Introduzca el DNI del usuario que quiere consultar:");
                        elemento = datos.nextLine();
                        for (int i = 0; i < DNI.size(); i++) {
                            if (DNI.get(i).equals(elemento)) {
                                // Cogemos el valor de la posición.
                                datoID = i;
                                aux = false;
                            }
                        }
                        if (comprobarDNI(elemento) == true){
                            // Salto de línea estético.
                            System.out.println(" ");
                            System.out.println("¡Formato de datos incorrecto!, vuelva a introducirlos.");
                        }
                    } while (comprobarDNI(elemento) == true || aux == true);
                    // Salto de línea estético.
                    System.out.println(" ");
                    // Imprimimos las posiciones que coinciden con el DNI.
                    System.out.println( DNI.get(datoID)       + ", " + 
                                        nombre.get(datoID)    + ", " + 
                                        apellidos.get(datoID) + ", " + 
                                        IBAN.get(datoID)      + ", " + 
                                        saldo.get(datoID) );
                    break;
                // Cambiamos el valor de la variable para que se finalice el programa.
                case 5:
                    decisionFinalizar = true;
                    break;
                // Si algo sale del rango controlado del case imprimir esto.
                default:
                System.out.println("¡Error inesperado inténtelo de nuevo!");
                    break;
            }
            // Salto de línea estético.
            System.out.println(" ");
        }
        // Para que la clase Scanner no se quede abierta.
        datos.close();
    }
}