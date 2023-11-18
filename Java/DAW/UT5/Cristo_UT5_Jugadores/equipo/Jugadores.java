// Indicamos a que paquete pertenece la clase.
package equipo;

// Importamos los paquetes para el funcionamiento del código.
import java.util.Scanner;

// Clase correspondiente a los requisitos del ejercicio.
public class Jugadores {

    // Creamos un objeto de la clase Scanner que nos permita reconocer los datos del teclado.
    Scanner datos = new Scanner(System.in);
    
    /*
     *  - Los atributos serán privados para preservar la integridad de los datos al acceder a ellos.
     *  - Solo podrán ser consultados desde la misma clase y a través de procedimientos y métodos.
     *  - Únicamente se podrá cambiar el estado de los atributos a través de procedimientos y métodos.
     *  - Según la información a almacenar en los atributos, se ha elegido el tipo de dato correspondiente.
     */
    private String nombre, equipo, posicion, nacionalidad, goles, ficha;
    
    // Constructor que no requiere de parámetros (para la matriz).
    public Jugadores(){};

    // Colores.
    String ANSI_RED = "\u001B[31m"; 
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_BLUE = "\u001B[34m";
    
    // Declaramos la matriz que va a contener los datos de los jugadores.
    String [][] matriz;

    // Recibe los datos del usuario.
    String elemento = "";

    // Recibe la cantidad de jugadores que va a tener el equipo y se lo pasa a la matriz.
    int numeroJugadores = 0;

    // Se utiliza para hacer conversión de tipos.
    double aux = 0.0;

    // Una vez indicada la cantidad límite de jugadores del equipo no se podrá modificar.
    boolean cantidadJugadores = false;
    
    // Verifica que los jugadores tienen datos antes de mostrarlos.
    boolean datosIdentificados = false;

    // Procedimientos que reciben y métodos que devuelven el estado de los atributos.
    // NOMBRE.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // EQUIPO.
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public String getEquipo() {
        return equipo;
    }

    // POSICIÓN.
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    // NACIONALIDAD.
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // GOLES.
    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }
    
    // FICHA.
    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    // Recoge por cuantos jugadores está compuesto el equipo.
    public void setCantidadJugadores() {
        // Validamos los jugadores.
        if (cantidadJugadores == false) {
            do {
                System.out.println("Introduzca la cantidad de jugadores que tendrá el equipo:");
                numeroJugadores = datos.nextInt();
                // En caso de que la cantidad de jugadores sea inferior a la permitida.
                if (numeroJugadores == 0) {
                    // Salto de línea estético.
                    System.out.println("");
                    System.out.println("La cantidad de jugadores debe ser superior a 0.");
                }
                // Salto de línea estético.
                System.out.println("");
            } while (numeroJugadores < 1);
            // Inicializamos la matriz con la cantidad de jugadores.
            matriz = new String [numeroJugadores][6];
            // Si ya se han añadido los jugadores cambiamos el valor de la variable booleana.
            cantidadJugadores = true;
            // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
            datos.nextLine();
        }
        // Mensaje alternativo si los datos ya han sido añadidos.
        else {
            System.out.println(ANSI_RED + "¡Ya se ha indicado de cuantos jugadores se compone el equipo!.");
            // Salto de línea estético.
            System.out.println("");
        }
    }
    
    // Recoge los datos de los jugadores.
    public void setDatosJugadores() {
        // Si se tiene la cantidad de jugadores y aún no se han añadido datos.
        if (cantidadJugadores == true && datosIdentificados == false) {
            // Rellenamos la matriz con los datos de los usuarios.
            for (int i = 0; i < numeroJugadores; i++) {
                for (int j = 0; j < 6; j++) {
                    // NOMBRE.
                    do {
                        if (j == 0) {
                            System.out.println("Introduzca el nombre del jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setNombre(elemento);
                            matriz [i][j] = getNombre();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED + "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                    // EQUIPO.
                    do {
                        if (j == 1) {
                            System.out.println("Introduzca el equipo del jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setEquipo(elemento);
                            matriz [i][j] = getEquipo();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED + "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                    // POSICIÓN.
                    do {
                        if (j == 2) {
                            System.out.println("Introduzca la posición del jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setPosicion(elemento);
                            matriz [i][j] = getPosicion();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED+ "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                    // NACIONALIDAD.
                    do {
                        if (j == 3) {
                            System.out.println("Introduzca la nacionalidad del jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setNacionalidad(elemento);
                            matriz [i][j] = getNacionalidad();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED + "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                    // GOLES.
                    do {
                        if (j == 4) {
                            System.out.println("Introduzca si ha marcado goles el jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setGoles(elemento);
                            matriz [i][j] = getGoles();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED + "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                    // FICHA.
                    do {
                        if (j == 5) {
                            System.out.println("Introduzca la ficha del jugador número " + (i+1) + ":");
                            elemento = datos.nextLine();
                            setFicha(elemento);
                            matriz [i][j] = getFicha();
                            // Salto de línea estético.
                            System.out.println("");
                        }
                        if (elemento == null) {
                            System.out.println(ANSI_RED + "¡Los datos no pueden estar vacíos!");
                            // Salto de línea estético.
                            System.out.println("");
                        }
                    } while (elemento == null);
                }
            }
            // Confirmamos que los jugadores ya disponen de datos.
            datosIdentificados = true;
        }
        // Si no se tiene la cantidad de jugadores.
        else {
            System.out.println("¡Aún no ha introducido la cantidad de jugadores que componen el equipo!");
            // Salto de línea estético.
            System.out.println("");
        }
    }
    
    // Devuelve los datos de los jugadores.
    public void getDatosJugadores() {
        // Si se tiene la cantidad de jugadores.
        if (cantidadJugadores == true && datosIdentificados == true) {
            // Rellenamos la matriz con los datos de los usuarios.
            for (int i = 0; i < numeroJugadores; i++) {
                for (int j = 0; j < 6; j++) { 
                    if (j < 5) {
                        System.out.print(matriz[i][j] + ", ");
                    } 
                    else {
                        System.out.print(matriz[i][j] + ".");
                        // Salto de línea estético.
                        System.out.println("");
                    }
                }
            }
            // Salto de línea estético.
            System.out.println("");
        }
        // Si no se tiene la cantidad de jugadores.
        else {
            System.out.println(ANSI_RED + "¡Aún no ha introducido los datos de los jugadores!");
            // Salto de línea estético.
            System.out.println("");
        }
    }
    
    // Muestra los datos de los jugadores del FC Barcelona si los hubiera con el 20% del traspaso adicional.
    public void mostrarFutbolClubBarcelona (){
        for (int i = 0; i < numeroJugadores; i++) {
            for (int j = 0; j < 6; j++) { 
                if (matriz[i][j].equals("FC Barcelona")) {
                    // String a double.
                    aux = Integer.valueOf(matriz[i][5]);
                    aux += aux * 20 / 100;
                    // double a String.
                    matriz[i][5] = String.valueOf(aux);
                    System.out.print(ANSI_GREEN + matriz[i][0] + ", " + matriz[i][1] +  ", " + matriz[i][2] +  ", " + matriz[i][3] +  ", " + matriz[i][4] +  ", " +  matriz[i][5] + ". ");
                    // Salto de línea estético.
                    System.out.println("");
                }
                else {
                    System.out.print(ANSI_GREEN + "Buscando a los jugadores del futbol club Barcelona...");
                    // Salto de línea estético.
                    System.out.println("");
                }
            }
        }
        // Salto de línea estético.
        System.out.println("");
    }
    
    // Comprueba las posiciones de los jugadores derechos y las cambia a izquierdo.
    public void comprobarPosicion () {
        for (int i = 0; i < numeroJugadores; i++) {
            for (int j = 0; j < 6; j++) { 
                if (matriz[i][j].contains("Derecho")) {
                    // Actualizamos el estado del atributo en la posición.
                    setPosicion("Izquierdo");
                    matriz[i][j].replaceAll("Derecho", getPosicion());
                    System.out.println(ANSI_GREEN + "Posición remplazada en un jugador.");
                }
                else if (matriz[i][j].contains("derecho")) {
                    // Actualizamos el estado del atributo en la posición.
                    setPosicion("izquierdo");
                    matriz[i][j].replaceAll("derecho", getPosicion());
                    System.out.println(ANSI_GREEN + "Posición remplazada en un jugador.");
                }
                else {
                    System.out.println("Jugador no concuerda con la posición a remplazar.");
                    System.out.println("Buscando...");
                }
            }
        }
    }

    // Comprueba la nacionalidad y devuelve true si coincide con la de Italia, en caso contrario devuelve false.
    public boolean comprobarNacionalidad(){
        boolean encontrada = false;
        for (int i = 0; i < numeroJugadores; i++) {
            for (int j = 0; j < 6; j++) { 
                if (matriz[i][j].contains("Italia") || matriz[i][j].contains("Italiana")) {
                    encontrada = true;
                }
            }
        }
        if (encontrada == true) {
            return true;
        }
        else {
            return false;
        }
    }
}