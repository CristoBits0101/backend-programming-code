import java.util.Scanner;

public class RellenarDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String [] DNI = new String [4];
        String [] nombre = new String [4];
        String [] apellidos = new String [4];

        String [] nota = new String [14];

        for (int i = 0; i < 5; i++) {

            System.out.println ("Introduzca el DNI del alumno " + i + ":");
            DNI [i] = sc.nextLine();
            
            System.out.println ("Introduzca el nombre del alumno " + i + ":");
            nombre [i] = sc.nextLine();

            System.out.println ("Introduzca el apellidos del alumno " + i + ":");
            apellidos [i] = sc.nextLine();

            nota = sc.nextLine();
            nota [i] = datos;
            nota [i+1] = datos;
            nota [i+2] = datos;
            nota [i+3] = datos;
            nota [i+4] = datos;
        }

    }

}
