/* 
 *  Realizar un programa con tres opciones:
 *  	- Pedir DNI, nombre , apellidos y notas de 3 asignaturas de 5 alumnos.
 *  	- Sacar un listado de los alumnos introducidos.
 *  	- Salir del programa.
 */ 

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_2_02 {
		
    /** 
     * @param args
     * @return Retorna este valor.@interface
     */
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
	
        // "Simplemente se rellena el array dentro del bucle for luego se pregunta si quiere ver los datos del usuario y se sale del algoritmo en caso de que no.";
        
        byte alumnos = 5;
        byte datosAlumnos = 6;
        
        int user = 0;

        //
        String usuario1[] = new String[6];
	String usuario2[] = new String[6];
	String usuario3[] = new String[6];
	String usuario4[] = new String[6];
	String usuario5[] = new String[6];

        //
        String dni = "";
	String nombre = "";
	String apellidos = "";
	String nota1 ="";
	String nota2 ="";
	String nota3 ="";

        //
        String S = "S";
        String N = "N";
        String decision = "";

        System.out.println ("Por favor rellené los datos de los usuarios.");

        for (int i = 0; i < alumnos; i++) {
            
            //
            if (i == 0) {
                for (int e = 0; e < datosAlumnos; e++) {
                    if (e == 0) {
                        System.out.println ("Ingrese el DNI del usuario 1:");
						dni = sc.nextLine();
						usuario1[e] = dni;	
                    }
                    if (e == 1) {
                        System.out.println ("Ingrese el nombre del usuario 1:");
						nombre = sc.nextLine();
						usuario1[e] = nombre;
                    }
                    if (e == 2) {
                        System.out.println ("Ingrese los apellidos del usuario 1:");
						apellidos = sc.nextLine();
						usuario1[e] = apellidos;
                    }
                    if (e == 3) {
                        System.out.println ("Ingrese la nota 1 del usuario 1:");
						nota1 = sc.nextLine();
						usuario1[e] = nota1;
                    }
	            if (e == 4) {
                        System.out.println ("Ingrese la nota 2 del usuario 1:");
						nota2 = sc.nextLine();
						usuario1[e] = nota2;
                    }
                    if (e == 5) {
                        System.out.println ("Ingrese la nota 3 del usuario 1:");
						nota3 = sc.nextLine();
						usuario1[e] = nota3;
                    }
                }
            }

            if (i == 1) {
                for (int e = 0; e < datosAlumnos; e++) {
                    if (e == 0) {
                        System.out.println ("Ingrese el DNI del usuario 2:");
						dni = sc.nextLine();
						usuario2[e] = dni;	
                    }
                    if (e == 1) {
                        System.out.println ("Ingrese el nombre del usuario 2:");
						nombre = sc.nextLine();
						usuario2[e] = nombre;
                    }
                    if (e == 2) {
                        System.out.println ("Ingrese los apellidos del usuario 2:");
						apellidos = sc.nextLine();
						usuario2[e] = apellidos;
                    }
                    if (e == 3) {
                        System.out.println ("Ingrese la nota 1 del usuario 2:");
						nota1 = sc.nextLine();
						usuario2[e] = nota1;
                    }
	            if (e == 4) {
                        System.out.println ("Ingrese la nota 2 del usuario 2:");
						nota2 = sc.nextLine();
						usuario2[e] = nota2;
                    }
                    if (e == 5) {
                        System.out.println ("Ingrese la nota 3 del usuario 2:");
						nota3 = sc.nextLine();
						usuario2[e] = nota3;
                    }
                }
            }

            if (i == 2) {
                for (int e = 0; e < datosAlumnos; e++) {
                    if (e == 0) {
                        System.out.println ("Ingrese el DNI del usuario 3:");
						dni = sc.nextLine();
						usuario3[e] = dni;	
                    }
                    if (e == 1) {
                        System.out.println ("Ingrese el nombre del usuario 3:");
						nombre = sc.nextLine();
						usuario3[e] = nombre;
                    }
                    if (e == 2) {
                        System.out.println ("Ingrese los apellidos del usuario 3:");
						apellidos = sc.nextLine();
						usuario3[e] = apellidos;
                    }
                    if (e == 3) {
                        System.out.println ("Ingrese la nota 1 del usuario 3:");
						nota1 = sc.nextLine();
						usuario3[e] = nota1;
                    }
	            if (e == 4) {
                        System.out.println ("Ingrese la nota 2 del usuario 3:");
						nota2 = sc.nextLine();
						usuario3[e] = nota2;
                    }
                    if (e == 5) {
                        System.out.println ("Ingrese la nota 3 del usuario 3:");
						nota3 = sc.nextLine();
						usuario3[e] = nota3;
                    }
                }
            }

            if (i == 3) {
                for (int e = 0; e < datosAlumnos; e++) {
                    if (e == 0) {
                        System.out.println ("Ingrese el DNI del usuario 4:");
						dni = sc.nextLine();
						usuario4[e] = dni;	
                    }
                    if (e == 1) {
                        System.out.println ("Ingrese el nombre del usuario 4:");
						nombre = sc.nextLine();
						usuario4[e] = nombre;
                    }
                    if (e == 2) {
                        System.out.println ("Ingrese los apellidos del usuario 4:");
						apellidos = sc.nextLine();
						usuario4[e] = apellidos;
                    }
                    if (e == 3) {
                        System.out.println ("Ingrese la nota 1 del usuario 4:");
						nota1 = sc.nextLine();
						usuario4[e] = nota1;
                    }
	            if (e == 4) {
                        System.out.println ("Ingrese la nota 2 del usuario 4:");
						nota2 = sc.nextLine();
						usuario4[e] = nota2;
                    }
                    if (e == 5) {
                        System.out.println ("Ingrese la nota 3 del usuario 4:");
						nota3 = sc.nextLine();
						usuario4[e] = nota3;
                    }
                }
            }

            if (i == 4) {
                for (int e = 0; e < datosAlumnos; e++) {
                    if (e == 0) {
                        System.out.println ("Ingrese el DNI del usuario 5:");
						dni = sc.nextLine();
						usuario5[e] = dni;	
                    }
                    if (e == 1) {
                        System.out.println ("Ingrese el nombre del usuario 5:");
						nombre = sc.nextLine();
						usuario5[e] = nombre;
                    }
                    if (e == 2) {
                        System.out.println ("Ingrese los apellidos del usuario 5:");
						apellidos = sc.nextLine();
						usuario5[e] = apellidos;
                    }
                    if (e == 3) {
                        System.out.println ("Ingrese la nota 1 del usuario 5:");
						nota1 = sc.nextLine();
						usuario5[e] = nota1;
                    }
	            if (e == 4) {
                        System.out.println ("Ingrese la nota 2 del usuario 5:");
						nota2 = sc.nextLine();
						usuario5[e] = nota2;
                    }
                    if (e == 5) {
                        System.out.println ("Ingrese la nota 3 del usuario 5:");
						nota3 = sc.nextLine();
						usuario5[e] = nota3;
                    }
                }
            }
        }
        
        do {
                System.out.println ("¿Quiere usted ver los datos de algún usuario?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
                decision = sc.nextLine();
        } while (!decision.equals("S") && !decision.equals("N"));
        
        while (decision.equals("S")) {
        
            do {
            	System.out.println ("¿De que alumno quiere usted ver los datos?");
            	user = sc.nextInt();
            } while (user > 5 && user < 1);
        	
            if (user == 1) {
                System.out.println ("Este es el DNI del usuario: " + usuario1[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario1[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario1[2]);
                System.out.println ("Esta es la nota de la primera asignatura: " + usuario1[3]);
                System.out.println ("Esta es la nota de la segunda asignatura: " + usuario1[4]);
                System.out.println ("Esta es la nota de la tercera asignatura: " + usuario1[5]);
            }
            
            if (user == 2) {
                System.out.println ("Este es el DNI del usuario: " + usuario2[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario2[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario2[2]);
                System.out.println ("Esta es la nota de la primera asignatura: " + usuario2[3]);
                System.out.println ("Esta es la nota de la segunda asignatura: " + usuario2[4]);
                System.out.println ("Esta es la nota de la tercera asignatura: " + usuario2[5]);
            }
            
            if (user == 3) {
                System.out.println ("Este es el DNI del usuario: " + usuario3[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario3[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario3[2]);
                System.out.println ("Esta es la nota de la primera asignatura: " + usuario3[3]);
                System.out.println ("Esta es la nota de la segunda asignatura: " + usuario3[4]);
                System.out.println ("Esta es la nota de la tercera asignatura: " + usuario3[5]);
            }
            
            if (user == 4) {
                System.out.println ("Este es el DNI del usuario: " + usuario4[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario4[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario4[2]);
                System.out.println ("Esta es la nota de la primera asignatura: " + usuario4[3]);
                System.out.println ("Esta es la nota de la segunda asignatura: " + usuario4[4]);
                System.out.println ("Esta es la nota de la tercera asignatura: " + usuario4[5]);
            }
            
            if (user == 5) {
                System.out.println ("Este es el DNI del usuario: " + usuario5[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario5[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario5[2]);
                System.out.println ("Esta es la nota de la primera asignatura: " + usuario5[3]);
                System.out.println ("Esta es la nota de la segunda asignatura: " + usuario5[4]);
                System.out.println ("Esta es la nota de la tercera asignatura: " + usuario5[5]);
            }

            do {
        
                System.out.println ("¿Quiere volver a ver los datos de algún alumno?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no y cerrar el programa:");
                decision = sc.nextLine();
        
            } while (!decision.equals("S") && !decision.equals("N"));
        }
    }
}
