import java.util.Scanner;
import java.util.Stack;

public class perezSuarezCristoRuben_actividadString {
    public static void main(String[] args) {

        /* AQUÍ EMPIEZA LA ACTIVIDAD 1 */
        String frase1 = "Invertir: ola k ase";
        String frase2 = "Nombre: Pepa Pig";
        String frase3 = "Escribir: esta frase la vamos a escribir en esta sección con esta máquina";

        // 1) Aplicar trim para eliminar los espacios del inicio y final.
        // 2) Comprobar si las frases contiene el caracter ":".
        // 3) Dividir frases desde incio hasta : en substring "comando".
        // 4) Dividir frases desde "" hasta : en substring "valor".

        String comando = "";
        String valor = "";

        if (frase1.contains(":")) {
            comando = frase1.substring(0, frase1.indexOf(":")).trim();
            valor = frase1.substring(frase1.indexOf(":") + 1, frase1.length()).trim();
            System.out.println(comando);
            System.out.println(valor);
        } else {
            System.out.println(frase1.trim());
        }

        if (frase2.contains(":")) {
            comando = frase2.substring(0, frase2.indexOf(":")).trim();
            valor = frase2.substring(frase2.indexOf(":") + 1, frase2.length()).trim();
            System.out.println(comando);
            System.out.println(valor);
        } else {
            System.out.println(frase2.trim());
        }

        if (frase3.contains(":")) {
            comando = frase3.substring(0, frase3.indexOf(":")).trim();
            valor = frase3.substring(frase3.indexOf(":") + 1, frase3.length()).trim();
            System.out.println(comando);
            System.out.println(valor);
        } else {
            System.out.println(frase3.trim());
        }

        // Espacio entre métodos.
        System.out.println(" ");

        // 1) Invertir la frase1.
        // 2) Transformar la frase1 a mayúsculas.
        StringBuffer aux1 = new StringBuffer(frase1.toUpperCase());
        System.out.println(aux1.reverse());

        // 1) Eliminar los caracteres que no formen parte del nombre en la frase2.
        // 2) Concatenar el saludo Hola con el nombre de la frase2.
        String Hola = "Hola";
        System.out.println(Hola + frase2.substring(frase2.indexOf(":") + 1, frase2.length() - 1));

        // 1) Remplazar la palabra "esta" por "una" en la frase 3;
        System.out.println(frase3.replaceAll("esta", "una"));

        // Espacio entre métodos.
        System.out.println(" ");

        /* AQUÍ EMPIEZA LA ACTIVIDAD 2 */
        Scanner datos = new Scanner(System.in);

        // Recogemos los datos del libro y el autor.
        System.out.print("Introduzca el título de un libro: ");
        String aux2 = datos.nextLine();

        System.out.print("Introduzca el autor de ese libro: ");
        String aux3 = datos.nextLine();

        // Convertimos la String a Stringbuffer.
        StringBuffer titulo = new StringBuffer(aux2);
        StringBuffer autor = new StringBuffer(aux3);

        // Espacio entre métodos.
        System.out.println(" ");

        // 1) Modifica la primera string añadiendo una coma y el autor (con append).
        titulo.append(", ").append(autor);
        System.out.println(titulo);

        // 2) Invierte la cadena (reverse).
        System.out.println(titulo.reverse());

        // 3) Sustituye la coma por la substring “ escrito por “ (con replace).
        System.out.println(titulo.replace(titulo.indexOf(","), titulo.indexOf(",") + 1, " escrito por "));

    }
}