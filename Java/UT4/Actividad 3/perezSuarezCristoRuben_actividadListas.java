import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class perezSuarezCristoRuben_actividadListas {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // (a):
        // Cuenta el usuario y lo concatena al mensaje de pedir la altura.
        int contador = 1;
        // Almacena la altura de usuario y la introduce en la lista.
        double altura;
        // Almacena la suma de todas las notas.
        double sumaNotas = 0;
        // Almacena la media de las notas.
        double media = 0;
        // Almacena la decisión del usuario de seguir rellenando la lista.
        String decision = "";
        // Dependiendo de la decisión cambia la condición del bucle.
        Boolean condición = true;
        // Lista que almacenara las alturas.
        
        while (condición == true) {
            // Solicitamos la altura del usuario y la introducimos en la lista.
            System.out.println("Introduzca la altura del usuario número " + contador + ":");
            altura = datos.nextDouble();
            ejemList.add(altura);
            contador += 1;
            // Preguntamos que decisión va a tomar el usuario.
            do {
                System.out.println("¿Quiere volver a introducir la altura de algún usuario?");
                System.out.print("Seleccione Y/N: ");
                decision = datos.nextLine();
                if (decision.equals("N")) {
                    // Cerramos el bucle si su decisión es la de no introducir más alturas.
                    condición = false;
                }
            } while (!decision.equals("N") && !decision.equals("Y"));
        }
        // (b):
        for (int i = 0; i < ejemList.size(); i++) {
            sumaNotas += ejemList.get(i);
        }
        media = sumaNotas / ejemList.size();
        System.out.print("La altura media es: " + media);
        // (c):
        // Objeto se adapta al tipo de la lista.
        Object[] array = ejemList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " (soy parte del array).");
        }
        // (d):
        // Metodo que ordena listas.
        Collections.sort(ejemList);
        // (e):
        // Imprimimos la lista ordenada.
        System.out.println(ejemList + "(lista ordenada).");
        // (f):
        // Busca cuantos alumnos están por debajo de la media y lo almacena.
        double contadorBajos = 0;
        for (int i = 0; i < ejemList.size(); i++) {
            if (ejemList.get(i) < media) {
                contadorBajos += 1;
            }
        }
        System.out.println("Hay " + contadorBajos + " alumnos por debajo de la media.");
        // (g):
        for (int i = 0; i < ejemList.size(); i++) {
            if (ejemList.get(i) == ejemList.indexOf(media)) {
                System.out.println(ejemList.get(i));
            } else {
                System.out.println("El alumno " + i + " no tiene una altura igual a la media.");
            }
        }
    }
}