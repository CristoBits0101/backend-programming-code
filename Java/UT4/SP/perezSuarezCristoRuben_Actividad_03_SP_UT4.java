
/*
 *  - Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
 *  - Cada grupo (o clase) está compuesto por 5 alumnos. 
 *  - El sistema admite un número de grupos indefinido. 
 *  - Se pide leer las notas del primer, segundo y tercer trimestre de cada alumno de cada grupo. 
 *  - Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media de cada alumno.
 */
import java.util.*;

public class perezSuarezCristoRuben_Actividad_03_SP_UT4 {
    // Función que comprueba el formato del nombre.
    public static boolean comprobarNombre(String elemento1) {
        if (elemento1.isEmpty() ||
                elemento1.length() < 1 ||
                elemento1.length() > 50 ||
                elemento1.contains("0") == true || elemento1.contains("1") == true ||
                elemento1.contains("2") == true || elemento1.contains("3") == true ||
                elemento1.contains("4") == true || elemento1.contains("5") == true ||
                elemento1.contains("6") == true || elemento1.contains("7") == true ||
                elemento1.contains("8") == true || elemento1.contains("9") == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Almacena un dato entero y basándose en eso se ejecuta un case del switch.
        int opcionMenu = 0;
        // Almacena las notas de los alumnos.
        double elemento2 = 0.0;
        // Almacena el valor de la variable que finaliza el bucle.
        boolean decisionFinalizar = false;
        // Se usa para validar los datos antes de pasarlos a las listas.
        String elemento1 = new String();
        // Almacena el nombre de los alumnos de cada grupo.
        List<String> alumno1 = new ArrayList<String>();
        List<String> alumno2 = new ArrayList<String>();
        List<String> alumno3 = new ArrayList<String>();
        List<String> alumno4 = new ArrayList<String>();
        List<String> alumno5 = new ArrayList<String>();
        // Almacena las notas de los trimestres del alumno 1 de cada grupo.
        List<Double> alumno1NotaPT = new ArrayList<Double>();
        List<Double> alumno1NotaST = new ArrayList<Double>();
        List<Double> alumno1NotaTT = new ArrayList<Double>();
        // Almacena las notas de los trimestres del alumno 2 de cada grupo.
        List<Double> alumno2NotaPT = new ArrayList<Double>();
        List<Double> alumno2NotaST = new ArrayList<Double>();
        List<Double> alumno2NotaTT = new ArrayList<Double>();
        // Almacena las notas de los trimestres del alumno 3 de cada grupo.
        List<Double> alumno3NotaPT = new ArrayList<Double>();
        List<Double> alumno3NotaST = new ArrayList<Double>();
        List<Double> alumno3NotaTT = new ArrayList<Double>();
        // Almacena las notas de los trimestres del alumno 4 de cada grupo.
        List<Double> alumno4NotaPT = new ArrayList<Double>();
        List<Double> alumno4NotaST = new ArrayList<Double>();
        List<Double> alumno4NotaTT = new ArrayList<Double>();
        // Almacena las notas de los trimestres del alumno 5 de cada grupo.
        List<Double> alumno5NotaPT = new ArrayList<Double>();
        List<Double> alumno5NotaST = new ArrayList<Double>();
        List<Double> alumno5NotaTT = new ArrayList<Double>();
        // Contiene las instrucciones del menú.
        while (decisionFinalizar == false) {
            // Repetir si la opción del menú elegida no está en el rango permitido.
            do {
                // Opciones disponibles.
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("    1) Añadir grupo de alumnos.");
                System.out.println("    2) Mostrar la nota media de los alumnos de un grupo.");
                System.out.println("    3) Mostrar la nota media de un grupo.");
                System.out.println("    4) Cerrar la aplicación.");
                // Recogemos la opción del menú y aplicamos salto de línea.
                System.out.print("      🡺  ");
                opcionMenu = datos.nextInt();
                System.out.println(" ");
                // En caso de entrada de datos errónea imprimir esto.
                if (opcionMenu < 1 || opcionMenu > 4) {
                    System.out.println("¡La opción elegida no es válida!, seleccione una de las siguientes:");
                }
                // Salto de línea estético.
                System.out.println(" ");
            } while (opcionMenu < 1 || opcionMenu > 4);
            // Cada case contiene una opción del menú.
            switch (opcionMenu) {
                // Añadir grupo de alumnos.
                case 1:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    // Alumno 1.
                    do {
                        System.out.print("Introduzca el nombre del primer alumno:");
                        elemento1 = datos.nextLine();
                        System.out.println(" ");
                        if (comprobarNombre(elemento1) == true) {
                            System.out.println("Los datos introducidos no son válidos, vuelva a introducirlos.");
                        }
                    } while (comprobarNombre(elemento1) == true);
                    alumno1.add(elemento1);
                    do {
                        System.out.print("Introduzca la nota del primer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno1NotaPT.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del segundo trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno1NotaST.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del tercer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno1NotaTT.add(elemento2);
                    datos.nextLine();
                    // Alumno 2.
                    do {
                        System.out.print("Introduzca el nombre del segundo alumno:");
                        elemento1 = datos.nextLine();
                        System.out.println(" ");
                        if (comprobarNombre(elemento1) == true) {
                            System.out.println("Los datos introducidos no son válidos, vuelva a introducirlos.");
                        }
                    } while (comprobarNombre(elemento1) == true);
                    alumno2.add(elemento1);
                    do {
                        System.out.print("Introduzca la nota del primer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno2NotaPT.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del segundo trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno2NotaST.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del tercer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno2NotaTT.add(elemento2);
                    datos.nextLine();
                    // Alumno 3.
                    do {
                        System.out.print("Introduzca el nombre del tercer alumno:");
                        elemento1 = datos.nextLine();
                        System.out.println(" ");
                        if (comprobarNombre(elemento1) == true) {
                            System.out.println("Los datos introducidos no son válidos, vuelva a introducirlos.");
                        }
                    } while (comprobarNombre(elemento1) == true);
                    alumno3.add(elemento1);
                    do {
                        System.out.print("Introduzca la nota del primer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno3NotaPT.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del segundo trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno3NotaST.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del tercer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno3NotaTT.add(elemento2);
                    datos.nextLine();
                    // Alumno 4.
                    do {
                        System.out.print("Introduzca el nombre del cuarto alumno:");
                        elemento1 = datos.nextLine();
                        System.out.println(" ");
                        if (comprobarNombre(elemento1) == true) {
                            System.out.println("Los datos introducidos no son válidos, vuelva a introducirlos.");
                        }
                    } while (comprobarNombre(elemento1) == true);
                    alumno4.add(elemento1);
                    do {
                        System.out.print("Introduzca la nota del primer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno4NotaPT.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del segundo trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno4NotaST.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del tercer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno4NotaTT.add(elemento2);
                    datos.nextLine();
                    // Alumno 5.
                    do {
                        System.out.print("Introduzca el nombre del quinto alumno:");
                        elemento1 = datos.nextLine();
                        System.out.println(" ");
                        if (comprobarNombre(elemento1) == true) {
                            System.out.println("Los datos introducidos no son válidos, vuelva a introducirlos.");
                        }
                    } while (comprobarNombre(elemento1) == true);
                    alumno5.add(elemento1);
                    do {
                        System.out.print("Introduzca la nota del primer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno5NotaPT.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del segundo trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno5NotaST.add(elemento2);
                    do {
                        System.out.print("Introduzca la nota del tercer trimestre:");
                        elemento2 = datos.nextDouble();
                        System.out.println(" ");
                    } while (elemento2 < 0);
                    alumno5NotaTT.add(elemento2);
                    break;
                // Mostrar la nota media de los alumnos de un grupo.
                case 2:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    do {
                        System.out.println("¿De que grupo quiere ver la nota media de los alumnos?");
                        opcionMenu = datos.nextInt();
                    } while (opcionMenu < 0);
                    double media1 = (alumno1NotaPT.get(opcionMenu) + alumno1NotaST.get(opcionMenu)
                            + alumno1NotaTT.get(opcionMenu)) / 3;
                    double media2 = (alumno2NotaPT.get(opcionMenu) + alumno2NotaST.get(opcionMenu)
                            + alumno2NotaTT.get(opcionMenu)) / 3;
                    double media3 = (alumno3NotaPT.get(opcionMenu) + alumno3NotaST.get(opcionMenu)
                            + alumno3NotaTT.get(opcionMenu)) / 3;
                    double media4 = (alumno4NotaPT.get(opcionMenu) + alumno4NotaST.get(opcionMenu)
                            + alumno4NotaTT.get(opcionMenu)) / 3;
                    double media5 = (alumno5NotaPT.get(opcionMenu) + alumno5NotaST.get(opcionMenu)
                            + alumno5NotaTT.get(opcionMenu)) / 3;
                    System.out.println("GRUPO " + opcionMenu + ":");
                    System.out.println("La nota media de " + alumno1.get(opcionMenu) + " fue de: " + media1);
                    System.out.println("La nota media de " + alumno2.get(opcionMenu) + " fue de: " + media2);
                    System.out.println("La nota media de " + alumno3.get(opcionMenu) + " fue de: " + media3);
                    System.out.println("La nota media de " + alumno4.get(opcionMenu) + " fue de: " + media4);
                    System.out.println("La nota media de " + alumno5.get(opcionMenu) + " fue de: " + media5);
                    break;
                // Mostrar la nota media de un grupo.
                case 3:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
                    do {
                        System.out.println("¿De que grupo quiere ver la nota media?");
                        opcionMenu = datos.nextInt();
                    } while (opcionMenu < 0);
                    double media6 = ((alumno1NotaPT.get(opcionMenu) + alumno1NotaST.get(opcionMenu)
                            + alumno1NotaTT.get(opcionMenu) +
                            alumno2NotaPT.get(opcionMenu) + alumno2NotaST.get(opcionMenu)
                            + alumno2NotaTT.get(opcionMenu) +
                            alumno3NotaPT.get(opcionMenu) + alumno3NotaST.get(opcionMenu)
                            + alumno3NotaTT.get(opcionMenu) +
                            alumno4NotaPT.get(opcionMenu) + alumno4NotaST.get(opcionMenu)
                            + alumno4NotaTT.get(opcionMenu) +
                            alumno5NotaPT.get(opcionMenu) + alumno5NotaST.get(opcionMenu)
                            + alumno5NotaTT.get(opcionMenu)) / 15);
                    System.out.println("La nota media del grupo " + opcionMenu + " es: " + media6);
                    break;
                // Cambiamos el valor de la variable para que se finalice el programa.
                case 4:
                    // Aquí hay que vaciar el buffer.
                    datos.nextLine();
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