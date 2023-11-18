/*
 *  1. Se pretende realizar un programa para gestionar la lista de participaciones en una competición de salto de longitud.
 *  2. El número de plazas disponible es de 5.
 *  3. Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose los atletas.
 *  4. Si se selecciona 1, se introducirán los datos de uno de los participantes:
 *      - Dorsal, Nombre, mejor marca del 2018, mejor marca del 2019 y mejor marca del 2020.
 *      - Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
 *      - La opción 3 mostrará un listado ordenado por la marca del 2020, de mayor a menor.
 *  5. Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción 4, que terminará el programa.
 *  6. Diseñar el programa que muestre las siguientes opciones:
 *      - Inscribir un participante.
 *      - Mostrar listado de datos.
 *      - Mostrar listado por marcas.
 *      - Finalizar el programa.
 */

import java.util.Scanner;

public class perezSuarezCristoRuben_SP_UT4_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         *  - La matriz va a tener 5 filas que equivalen a la cantidad de participantes máxima.
         *  - La matriz tendrá 5 columnas porque es la cantidad de datos mínima y máxima a almacenar.
         */
        String [][] datosParticipantes = new String [5][5];

        // Esta variable almacenará los datos de cada usuario y los ira trasladando a las posiciones correspondientes de la matriz según la toma de requisitos.
        String datos = "";

        // Esta variable controlara que opción del menú del programa se ejecutara.
        int opcionMenu = 0;

        /*
         *  - Si el usuario presiona 4 el valor de la variable cambiara de false a true.
         *  - El bucle while dejara de ejecutar las instrucciones por lo cual el programa dejara de ejecutarse.
         */
        boolean cerrarPrograma = false;

        // Esta variable ira sumando 1 cada vez que se introduzca un usuario para controlar que filas y columnas de la matriz se rellenan.
        int contadorUsuarios = 1;

        String [] preservar  = new String [5];

        /*
         *  - Este bucle controlara la condición de salida del programa que dependiendo de si el usuario pulsa un 4 saldrá del menú o no y finalizara el programa.
         *  - Será de tipo while porque no sabemos cuando el usuario quiere terminar el proceso.
         */
        while (cerrarPrograma == false) {

            // Este bucle controlará que la variable está dentro de los rangos de las opciones para evitar errores futuros en la ejecución del programa.
            do {

                // Indicamos las opciones disponibles y pedimos que introduzca una.
                System.out.println("- Pulse 1 para añadir un participante.");
                System.out.println("- Pulse 2 para ver el listado de participante y el dorsal que les corresponde.");
                System.out.println("- Pulse 3 para ver un listado ordenado de la marca obtenida por los participantes en el 2020 / 2019 / 2018.");
                System.out.println("- Pulse 4 para cerrar el programa.");
                   opcionMenu = sc.nextInt();

                    // Aquí tengo que vaciar el buffer porque me estaba dado errores en la impresión de mensajes.
                    sc.nextLine();

                // Espacio entre el menú de opciones y la entrada / salida de datos.
                System.out.println("");

            } while (opcionMenu < 1 && opcionMenu > 4);
            
            switch (opcionMenu) {
                case 1:
                    switch (contadorUsuarios) {
                        case 1:

                            for (int i = 0; i < datosParticipantes.length; i++)    {

                                if (i == 0) {
                                    System.out.println("Introduce el dorsal del primer participante:");
                                }

                                if (i == 1) {
                                    System.out.println("Introduce el nombre completo del primer participante:");
                                }

                                if (i == 2) {
                                    System.out.println("Introduce la mejor marca del 2018 del primer participante:");
                                }

                                if (i == 3) {
                                    System.out.println("Introduce la mejor marca del 2019 del primer participante:");
                                }

                                if (i == 4) {
                                    System.out.println("Introduce la mejor marca del 2020 del primer participante:");
                                }

                                datos = sc.nextLine();
                                datosParticipantes [0][i] = datos;

                            }

                            contadorUsuarios += 1;

                            break;

                        case 2:

                            for (int j = 0; j < datosParticipantes.length; j++)    {

                                if (j == 0) {
                                    System.out.println("Introduce el dorsal del segundo participante:");
                                }

                                if (j == 1) {
                                    System.out.println("Introduce el nombre completo del segundo participante:");
                                }

                                if (j == 2) {
                                    System.out.println("Introduce la mejor marca del 2018 del segundo participante:");
                                }

                                if (j == 3) {
                                    System.out.println("Introduce la mejor marca del 2019 del segundo participante:");
                                }

                                if (j == 4) {
                                    System.out.println("Introduce la mejor marca del 2020 del segundo participante:");
                                }

                                datos = sc.nextLine();
                                datosParticipantes [1][j] = datos;

                            }

                            contadorUsuarios += 1;

                            break;

                        case 3:

                            for (int j2 = 0; j2 < datosParticipantes.length; j2++) {
                                if (j2 == 0) {
                                    System.out.println("Introduce el dorsal del tercer participante:");
                                }

                                if (j2 == 1) {
                                    System.out.println("Introduce el nombre completo del tercer participante:");
                                }

                                if (j2 == 2) {
                                    System.out.println("Introduce la mejor marca del 2018 del tercer participante:");
                                }

                                if (j2 == 3) {
                                    System.out.println("Introduce la mejor marca del 2019 del tercer participante:");
                                }

                                if (j2 == 4) {
                                    System.out.println("Introduce la mejor marca del 2020 del tercer participante:");
                                }

                                datos = sc.nextLine();
                                datosParticipantes [2][j2] = datos;
                                
                            }

                            contadorUsuarios += 1;

                            break;

                        case 4:

                            for (int k = 0; k < datosParticipantes.length; k++)    {
                                if (k == 0) {
                                    System.out.println("Introduce el dorsal del cuarto participante:");
                                }

                                if (k == 1) {
                                    System.out.println("Introduce el nombre completo del cuarto participante:");
                                }

                                if (k == 2) {
                                    System.out.println("Introduce la mejor marca del 2018 del cuarto participante:");
                                }

                                if (k == 3) {
                                    System.out.println("Introduce la mejor marca del 2019 del cuarto participante:");
                                }

                                if (k == 4) {
                                    System.out.println("Introduce la mejor marca del 2020 del cuarto participante:");
                                }

                                datos = sc.nextLine();
                                datosParticipantes [3][k] = datos;
                                
                            }

                            contadorUsuarios += 1;

                            break;

                        case 5:

                            for (int k2 = 0; k2 < datosParticipantes.length; k2++) {

                                if (k2 == 0) {
                                    System.out.println("Introduce el dorsal del quinto participante:");
                                }

                                if (k2 == 1) {
                                    System.out.println("Introduce el nombre completo del quinto participante:");
                                }

                                if (k2 == 2) {
                                    System.out.println("Introduce la mejor marca del 2018 del quinto participante:");
                                }

                                if (k2 == 3) {
                                    System.out.println("Introduce la mejor marca del 2019 del quinto participante:");
                                }

                                if (k2 == 4) {
                                    System.out.println("Introduce la mejor marca del 2020 del quinto participante:");
                                }

                                datos = sc.nextLine();
                                datosParticipantes [4][k2] = datos;                              

                            }

                            contadorUsuarios += 1;

                            // Para dejar un espacio entre el case 5 y case 6.
                            System.out.println("");

                            break;
                        
                        /*
                         *  Si se han introducido 5 usuarios el contador habrá llegado a 6 y indicará que no se puede introducir más usuarios.
                         */
                        case 6:

                            System.out.println("~ La competición solo dispone de 5 plazas no se pueden introducir más usuarios.");

                            break;
                    
                        default:
                            break;
                    }
                    break;

                case 2:

                    for (int i = 0; i < datosParticipantes.length; i++) {
                        for (int j = 0; j < datosParticipantes.length - i - 1; j++) {
                        
                            int dato1 = Integer.valueOf(datosParticipantes[j][0]);
                            int dato2 = Integer.valueOf(datosParticipantes[j+1][0]);

                            if (dato1 < dato2) {
                                // Intercambia 2 filas de la matriz.
                                preservar = datosParticipantes[j];
                                datosParticipantes[j] = datosParticipantes[j+1];
                                datosParticipantes[j+1] = preservar;
                            }
                        }
                    }

                for (int i = 0; i < datosParticipantes.length; i++) {

                    int aux = i + 1;

                    System.out.println("El participante número " + aux + " con nombre " + datosParticipantes [i][1] + ", le corresponde el dorsal " + datosParticipantes [i][0] + ".");
                    
                }

                // Espacio entre el menú de opciones y la entrada / salida de datos.
                System.out.println("");

                    break;

                case 3:
                    
                    for (int i = 0; i < datosParticipantes.length; i++) {
                        for (int j = 0; j < datosParticipantes.length - i - 1; j++) {
                            
                            int dato1 = Integer.valueOf(datosParticipantes[j][4]);
                            int dato2 = Integer.valueOf(datosParticipantes[j+1][4]);

                            if (dato1 < dato2) {
                                // Intercambia 2 filas de la matriz.
                                preservar = datosParticipantes[j];
                                datosParticipantes[j] = datosParticipantes[j+1];
                                datosParticipantes[j+1] = preservar;
                            }
                        }
                    }

                    for (int i = 0; i < datosParticipantes.length; i++) {

                        int aux = i + 1;

                        System.out.println("El participante número " + aux + " con nombre " + datosParticipantes [i][1] + ", obtuvo una marca en el 2020 de: " + datosParticipantes [i][4] + ".");
                        
                    }

                    // Espacio entre el menú de opciones y la entrada / salida de datos.
                    System.out.println("");

                    break;
                    
                case 4:

                    // Aquí tengo que vaciar el buffer porque me estaba dado errores en la impresión de mensajes.
                    sc.nextLine();

                    cerrarPrograma = true;

                    break;
            
                default:
                    break;
            }

            // Para dejar un espacio entre el menú de opciones y la salida de mensajes.
            System.out.println("");

        }     
    }    
}