// Importamos los paquetes para el funcionamiento del código.
import java.util.*;
import equipo.Jugadores;

/*
 *  - 1. Los equipos de la lista empiezan en la posición 0 recordar a la hora de trabajar con datos de los equipos.
 *  - 2. Debe estirar la consola y/o terminal para ver el contenido completo de las impresiones por pantalla.
 *  - 3. Si faltan datos o procesos por realizar se mostrara un mensaje de error (realice todos los pasos).
 *  - 4. Se han realizado pruebas tanto para acciones válidas como erróneas en caso de fallo comunicarlo.
 *  - 5. Aveces el programa muestra errores raros, cierra el editor o IDE y vuelve a ejecutarlo.
 */

// Es la clase principal porque contiene el procedimiento principal.
public class Principal {

    /* 
     *  - Método que genera objetos de la clase jugadores en una lista.
     *  - Cada objeto jugadores permite tener uno o varios jugadores a un equipo o provenientes.
     *  - Público para que pueda ser usado.
     *  - Estático para que pueda ser llamado desde procedimientos y métodos.
     *  - ArrayList de tipo (Jugadores) para que pueda almacenar una lista de jugadores.
     */

    // Contiene la String main que indica al compilador que es el primer bloque de código a ejecutar.
    public static void main(String[] args) {

        // Colores.
        String ANSI_RED = "\u001B[31m"; 
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";

        // Creamos un objeto de la clase Scanner que nos permita reconocer los datos del teclado.
        Scanner datos = new Scanner(System.in);

        // Almacena objetos de tipo jugadores para trabajar con distintos equipos.
        ArrayList <Jugadores> JugadoresEquipo = new ArrayList <Jugadores>();

        // Establece que opción del menú se va a ejecutar.
        int opcionMenu = -1;

        // Indica a que objeto de la lista se le va a realizar la acción.
        int numeroLista = -1;

        // Contador de equipos para jugadores.
        int cantidadEquipos = 0;
        
        // Controla la opción de salida del programa.
        while (opcionMenu != 0) {
            
            // Se comprueba que la opción del menú elegida es válida.
            do {
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println(ANSI_GREEN + "👉 ¡INDIQUE QUE ACCIÓN DESEA REALIZAR!");
                System.out.println(ANSI_BLUE  + "     1. Añadir  un  equipo a la lista.");
                System.out.println(ANSI_BLUE  + "     2. Añadir  la  cantidad de jugadores.");
                System.out.println(ANSI_BLUE  + "     3. Añadir  los datos de los jugadores.");
                System.out.println(ANSI_BLUE  + "     4. Mostrar los datos de un equipo.");
                System.out.println(ANSI_BLUE  + "     5. Mostrar los datos de todos los equipos.");
                System.out.println(ANSI_BLUE  + "     6. Mostrar los datos de FC Barcelona (20% del traspaso incluido).");
                System.out.println(ANSI_BLUE  + "     7. Sustituir la posición de un jugador derecho a izquierdo.");
                System.out.println(ANSI_BLUE  + "     8. Eliminar equipos con jugadores de nacionalidad italiana.");
                System.out.println(ANSI_BLUE  + "     0. Salir.");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.print("     ➞  "); opcionMenu = datos.nextInt();
            } while (opcionMenu < 0 || opcionMenu > 8);

            // Salto de línea estético.
            System.out.println("");
            
            // Ejecuta un método o procedimiento dependiendo de la opción del menú elegida.
            switch (opcionMenu) {
                // Para añadir un equipo a la lista.
                case 1:
                    cantidadEquipos += 1;
                    do {
                        if (JugadoresEquipo.size() < cantidadEquipos) {
                            Jugadores jugadores = new Jugadores();
                            JugadoresEquipo.add(jugadores);
                            System.out.println("📝 La plaza para los jugadores ha sido añadida a la lista correctamente 👍.");
                        }
                        else {
                            System.out.println(ANSI_RED + "¡UPS! ha ocurrido un error inesperado, inténtelo de nuevo.");
                        }
                    } while (JugadoresEquipo.size() < cantidadEquipos);
                    break;
                // Para indicar la cantidad de jugadores del equipo.
                case 2:
                    if (cantidadEquipos > 0) {
                        System.out.println("👉 Indique a que equipo de la lista desea realizar la acción:");
                        numeroLista = datos.nextInt();
                        // Salto de línea estético.
                        System.out.println("");
                        if (numeroLista < JugadoresEquipo.size()) {
                            JugadoresEquipo.get(numeroLista).setCantidadJugadores();
                        }
                        else {
                            System.out.println(ANSI_RED + "¡Los equipos añadidos aún no llegan a esa posición de la lista!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Para añadir los datos de los jugadores.
                case 3:
                    if (cantidadEquipos > 0) {
                        System.out.println("👉 Indique a que equipo de la lista desea realizar la acción:");
                        numeroLista = datos.nextInt();
                        // Salto de línea estético.
                        System.out.println("");
                        if (numeroLista < JugadoresEquipo.size()) {
                            JugadoresEquipo.get(numeroLista).setDatosJugadores();
                        }
                        else {
                            System.out.println(ANSI_RED + "¡Los equipos añadidos aún no llegan a esa posición de la lista!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Para mostrar los datos de los jugadores.
                case 4:
                    if (cantidadEquipos > 0) {
                        System.out.println("👉 Indique a que equipo de la lista desea realizar la acción:");
                        numeroLista = datos.nextInt();
                        // Salto de línea estético.
                        System.out.println("");
                        if (numeroLista <= JugadoresEquipo.size()) {
                            JugadoresEquipo.get(numeroLista).getDatosJugadores();
                        }
                        else {
                            System.out.println(ANSI_RED + "¡Los equipos añadidos aún no llegan a esa posición de la lista!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Para mostrar los datos de todos los jugadores de todos los equipos.
                case 5:
                    if (cantidadEquipos > 0) {
                        for (int i = 0; i < JugadoresEquipo.size(); i++) {
                            JugadoresEquipo.get(i).getDatosJugadores();
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Datos del FC Barcelona + 20% de traspaso.
                case 6:
                     if (cantidadEquipos > 0) {
                        for (int i = 0; i < JugadoresEquipo.size(); i++) {
                            JugadoresEquipo.get(i).mostrarFutbolClubBarcelona();
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Sustitución de posición de los jugadores de lado derecho.
                case 7:
                    if (cantidadEquipos > 0) {
                        for (int i = 0; i < JugadoresEquipo.size(); i++) {
                            JugadoresEquipo.get(i).comprobarPosicion();
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // Remueve de la lista el objeto que contenga jugadores con la nacionalidad Italia o Italiana.
                case 8:
                    if (cantidadEquipos > 0) {
                        for (int i = 0; i < JugadoresEquipo.size(); i++) {
                            if (JugadoresEquipo.get(i).comprobarNacionalidad() == true) {
                                JugadoresEquipo.remove(i);
                                System.out.println("Equipos con jugadores de nacionalidad italiana eliminados.");
                                // Salto de línea estético.
                                System.out.println("");
                            }
                            else {
                                System.out.println(ANSI_RED + "No hay jugadores con la nacionalidad de Italia en los equipos.");
                            }
                        }
                    }
                    else {
                        System.out.println(ANSI_RED + "¡aún no hay equipos en la lista!");
                    }
                    break;
                // En caso de error, mostrar el siguiente mensaje.
                default:
                    System.out.println("¡UPS! ha ocurrido un error inesperado, inténtelo de nuevo.");
                    break;
            }
        }
        
        // Cerramos el objeto de la clase Scanner que hemos creado.
        datos.close();

    }
}