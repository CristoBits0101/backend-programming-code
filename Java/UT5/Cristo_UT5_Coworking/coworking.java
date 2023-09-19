// Importamos los paquetes necesarios para hacer funcionar la clase.
import java.util.Scanner;
import java.lang.String;
import oficina.oficina;
import oficina.puesto;

// Clase principal del programa porque contiene el procedimiento principal.
public class coworking {

    // Procedimiento principal del programa por donde empieza a ejecutarse el código.
    public static void main(String[] args) {

        // Creamos un objeto de la clase Scanner que nos permita reconocer los datos del teclado.
        Scanner datos = new Scanner(System.in);

        // Creamos un objeto de la clase oficina para usar sus metodos y procedimientos.
        oficina oficinas = new oficina();

        // Creamos la matriz de objetos que contendrá los puestos con sus atributos.
        puesto [][] puestos = new puesto [3][3];

        // Almacena datos que el usuario introduzca y los traspasa a las clases correspondientes.
        String elemento = "";

        // Valores iniciales que quiero que tengan los 9 puestos de la oficina.
        String puestoEstado = "libre";
        String nombrePersona = "desconocido";

        // Un objeto por cada puesto dado que los atributos de cada puesto puedes contener estados diferentes.
        // De esta manera también se respeta la identidad.
        puesto puesto1 = new puesto(puestoEstado, nombrePersona);
        puesto puesto2 = new puesto(puestoEstado, nombrePersona);
        puesto puesto3 = new puesto(puestoEstado, nombrePersona);
        puesto puesto4 = new puesto(puestoEstado, nombrePersona);
        puesto puesto5 = new puesto(puestoEstado, nombrePersona);
        puesto puesto6 = new puesto(puestoEstado, nombrePersona);
        puesto puesto7 = new puesto(puestoEstado, nombrePersona);
        puesto puesto8 = new puesto(puestoEstado, nombrePersona);
        puesto puesto9 = new puesto(puestoEstado, nombrePersona);

        // Cargamos la matriz de objetos con los puestos.
        puestos [0][0] = puesto1;
        puestos [0][1] = puesto2;
        puestos [0][2] = puesto3;
        puestos [1][0] = puesto4;
        puestos [1][1] = puesto5;
        puestos [1][2] = puesto6;
        puestos [2][0] = puesto7;
        puestos [2][1] = puesto8;
        puestos [2][2] = puesto9;

        // Según la opción del menú almacenada en esta variable se ejecutará un método.
        int opcionMenu = 0;

        // Se utiliza para contar el estado de las posiciones en la matriz de objetos.
        int aux = 0;

        // Para que cuando se asigne un puesto libre a una persona no vuelva a pedirme datos si quedan más puestos libres.
        boolean puestoAsignado = false;

        // Se ejecuta el código hasta que el usuario desee salir del programa con la opción 9.
        while (opcionMenu != 9) {

            //  Desplegamos las opciones disponibles.
            do {
                System.out.println("—(•·÷{ Menú de opciones }÷·•)—");
                System.out.println("    1. Asignar nombre a la oficina.");
                System.out.println("    2. Asignar dirección a la oficina.");
                System.out.println("    3. Obtener nombre de la oficina.");
                System.out.println("    4. Obtener dirección de la oficina.");
                System.out.println("    5. Obtener número de puestos libres de la oficina.");
                System.out.println("    6. Asignar un puesto libre a una persona.");
                System.out.println("    7. Liberar el puesto que estaba usando una persona.");
                System.out.println("    8. Consultar quien ocupa un puesto de la oficina.");
                System.out.println("    9. Salir.");

                /*
                ** - Almacenamos la opción elegida en la siguiente variable.
                ** - Si obtiene el valor 9 el bucle while dejara de ejecutar instrucciones.
                */
                System.out.print("    ➞  "); opcionMenu = datos.nextInt();
            
            // Si la opción elegida está fuera del rango repetir la decisión.
            } while (opcionMenu < 1 || opcionMenu > 9);

            // Salto de línea estético.
            System.out.println();

            // Según la opción del menú elegida ejecutamos un método.
            switch (opcionMenu) {

                case 1:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();
                    
                    // Recogemos datos.
                    System.out.println("Introduzca un nombre para la oficina:");
                    elemento = datos.nextLine();

                    // Trasladamos datos al atributo de la clase correspondiente.
                    oficinas.setNombreOficina(elemento);
                    
                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 2:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();

                    // Recogemos datos.
                    System.out.println("Introduzca la dirección de la oficina:");
                    elemento = datos.nextLine();

                    // Trasladamos datos al atributo de la clase correspondiente.
                    oficinas.setDireccionOficina(elemento);

                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 3:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();
                
                    // Llamamos al atributo e imprimimos su valor.
                    System.out.println("El nombre de la oficina es: " + oficinas.getNombreOficina());
                    
                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 4:
                    
                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();

                    // Llamamos al atributo e imprimimos su valor.
                    System.out.println("La dirección de la oficina es: " + oficinas.getDireccionOficina());

                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 5:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();
                    
                    // Se imprime las posiciones cuyos atributos puestoEstado tengan un valor libre.
                    for (int i = 0; i < puestos.length; i++) {
                        for (int j = 0; j < puestos.length; j++) {

                            if (puestos[i][j].getPuestoEstado().equals("libre")) {
                                aux += 1;
                            }

                        }
                    }
                    
                    // Indicamos que se muestre por pantalla la cantidad de posiciones nulas.
                    System.out.println("Quedan " + aux + " puestos libres.");

                    // Reseteamos la variable auxiliar.
                    aux = 0;
                    
                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 6:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();
                    
                    // Se imprime las posiciones cuyos atributos puestoEstado tengan un valor libre.
                    for (int i = 0; i < puestos.length; i++) {
                        for (int j = 0; j < puestos.length; j++) {

                            if (puestos[i][j].getPuestoEstado().equals("libre") && puestoAsignado == false) {

                                System.out.println("Introduzca el nombre de la persona que va a ocupar el puesto:");
                                nombrePersona = datos.nextLine();
                                puestos[i][j].setNombrePersona(nombrePersona);

                                puestoEstado = "Cubierto";
                                puestos[i][j].setPuestoEstado(puestoEstado);

                                puestoAsignado = true;

                            }

                            // Si se llega hasta la última posición con puestoAsignado == false es que no quedan puestos libres.
                            if (i == 2 && j == 2 && puestoAsignado == false) {
                                System.out.println("No hay puestos libres disponibles.");
                            }

                        }
                    }

                    // Reseteamos la variable para poder seguir rellenando puestos vacíos.                            
                    puestoAsignado = false;
                    
                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 7:

                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();

                    System.out.println("¿Qué puesto de la oficina quiere liberar?:");
                    System.out.println("Introducir el número del puesto del 1 al 9");
                    int posicion = datos.nextInt();

                    // Buscamos la posición que quiere liberar el usuario y si está libre le indicamos que ya lo está. 
                    switch (posicion) {

                        case 1:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[0][0].setPuestoEstado("libre");
                                puestos[0][0].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 2:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[0][1].setPuestoEstado("libre");
                                puestos[0][1].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 3:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[0][2].setPuestoEstado("libre");
                                puestos[0][2].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 4:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[1][0].setPuestoEstado("libre");
                                puestos[1][0].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 5:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[1][1].setPuestoEstado("libre");
                                puestos[1][1].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 6:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[1][2].setPuestoEstado("libre");
                                puestos[1][2].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 7:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[2][0].setPuestoEstado("libre");
                                puestos[2][0].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 8:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[2][1].setPuestoEstado("libre");
                                puestos[2][1].setNombrePersona("desconocido");
                            }
                            else {
                                System.out.println("El puesto ya está libre.");
                            }
                            break;

                        case 9:

                            if (puestos[0][0].getPuestoEstado().equals("Cubierto")){
                                puestos[2][2].setPuestoEstado("libre");
                                puestos[2][2].setNombrePersona("desconocido");

                                // Salto de línea estético.
                                System.out.println("");

                                // Si se libera el puesto imprimir que se ha realizado.
                                System.out.println("Puesto liberado correctamente.");

                            }
                            
                            else {
                                System.out.println("El puesto ya está libre.");
                            }

                            break;

                        default:
                            System.out.println("¡UPS! ha ocurrido un error inesperado, inténtelo de nuevo.");
                            break;
                    }

                    // Salto de línea estético.
                    System.out.println();

                    break;

                case 8:
                    
                    // Limpiamos el buffer porque hay colisión en este punto de tipo entero y carácter.
                    datos.nextLine();
                    
                    // Se imprime las posiciones cuyos atributos puestoEstado tengan un valor cubierto.
                    for (int i = 0; i < puestos.length; i++) {
                        for (int j = 0; j < puestos.length; j++) {

                            if (puestos[i][j].getPuestoEstado().equals("Cubierto")) {

                               System.out.println(puestos[i][j].getNombrePersona() + " tiene un puesto en la oficina.");

                                // Cuando aux obtenga un valor diferente a 0 ya sé que en la matriz hay al menos un puesto cubierto.
                                // Me sirve para imprimir que no hay puestos cubiertos en la matriz.
                                if (aux == 0) {

                                    aux += 1;

                                }
                                
                            }

                        }
                    }

                    if (aux == 0) {
                        System.out.println("No hay puestos cubiertos.");
                    }

                    // Reseteamos la variable auxiliar.
                    aux = 0;

                    // Salto de línea estético.
                    System.out.println();

                    break;
                }
            }

        // Vaciamos el buffer antes de realizar una nueva ejecución de instrucciones.
        datos.nextLine();

        // Cerramos el objeto de la clase Scanner que hemos creado.
        datos.close();

    }
}