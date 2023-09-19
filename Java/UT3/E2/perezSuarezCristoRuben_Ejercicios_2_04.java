/*
 *  Realizar un programa con cinco opciones:
 *  	- Pedir DNI, nombre , apellidos y número de cuenta corriente de 5 usuarios.
 *  	- Realizar un ingreso en la cuenta del usuario con una cantidad.
 *  	- Realizar un cargo en la cuenta del usuario.
 *  	- Estado de la cuenta de un usuario.
 *  	- Salir del programa.
 */

//import javax.print.attribute.standard.Sides;

import java.util.Scanner;

public class perezSuarezCristoRuben_Ejercicios_2_04 {

    public static void main(String[] args) {
	
	//Los datos del usuario se recogen en un array dentro de los for, se pregunta si se quiere hacer algún cargo de recibo o algún ingreso y se modifica la variable segun el valor introducido y el 		  número de usuario introducido, luego se pregunta si se quiere ver los datos de algún usuario y se imprime los datos de usuario que vaya eligiendo hasta que diga que no quiere ver más con 		  el objeto string N.
	
        Scanner sc = new Scanner(System.in);
	
        //
        byte usuarios = 5;
        byte datosUsuarios = 3;
        
        //
        double saldo1 = 0;
	    double saldo2 = 0;
	    double saldo3 = 0;
	    double saldo4 = 0;
	    double saldo5 = 0;

        //
        double dineroIngresado = 0;
	    double cargoRecibido = 0;

        //
        long cuentaBancaria = 0;
        long numCuentaBancaria1 = 0;
	    long numCuentaBancaria2 = 0;
	    long numCuentaBancaria3 = 0;
	    long numCuentaBancaria4 = 0;
	    long numCuentaBancaria5 = 0;
        
        //
        boolean datosErroneos = false;

        //
        String usuario1[] = new String[3];
	    String usuario2[] = new String[3];
	    String usuario3[] = new String[3];
	    String usuario4[] = new String[3];
	    String usuario5[] = new String[3];

        //
        String dni = "";
	    String nombre = "";
	    String apellidos = "";

        //
        String S = "S";
        String N = "N";
        String decision = "";

        System.out.println ("Por favor rellené los datos de los usuarios.");

        for (int i = 0; i < usuarios; i++) {
            
            //
            if (i == 0) {
                for (int e = 0; e < datosUsuarios; e++) {
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
                }
            }

            if (i == 1) {
                for (int e = 0; e < datosUsuarios; e++) {
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
                }
            }

            if (i == 2) {
                for (int e = 0; e < datosUsuarios; e++) {
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
                }
            }

            if (i == 3) {
                for (int e = 0; e < datosUsuarios; e++) {
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
                }
            }

            if (i == 4) {
                for (int e = 0; e < datosUsuarios; e++) {
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
                }
            }
        }

        //
        do {
            if (datosErroneos == false) {
                System.out.println ("Asigne un número de cuenta bancaria del usuario 1:");
                numCuentaBancaria1 = sc.nextLong();
            }
            if (datosErroneos == true) {
                System.out.println ("Revise que no haya introducido números negativos, letras o que la cuenta que está intentando crear ya exista.");
                System.out.println ("Vuelva a introducir los números:");
                numCuentaBancaria1 = sc.nextLong();
            }

            datosErroneos = true;

        } while (numCuentaBancaria1 < 0);

        datosErroneos = false;

        do {
            if (datosErroneos == false) {
                System.out.println ("Asigne un número de cuenta bancaria del usuario 2:");
                numCuentaBancaria2 = sc.nextLong();
            }
            if (datosErroneos == true) {
                System.out.println ("Revise que no haya introducido números negativos, letras o que la cuenta que está intentando crear ya exista.");
                System.out.println ("Vuelva a introducir los números:");
                numCuentaBancaria2 = sc.nextLong();
            }

            datosErroneos = true;

        } while (numCuentaBancaria2 < 0 || numCuentaBancaria2 == numCuentaBancaria1 || numCuentaBancaria2 == numCuentaBancaria3 || numCuentaBancaria2 == numCuentaBancaria4 || numCuentaBancaria2 == numCuentaBancaria5);

        datosErroneos = false;

        do {
            if (datosErroneos == false) {
                System.out.println ("Asigne un número de cuenta bancaria del usuario 3:");
                numCuentaBancaria3 = sc.nextLong();
            }
            if (datosErroneos == true) {
                System.out.println ("Revise que no haya introducido números negativos, letras o que la cuenta que está intentando crear ya exista.");
                System.out.println ("Vuelva a introducir los números:");
                numCuentaBancaria3 = sc.nextLong();
            }

            datosErroneos = true;

        } while (numCuentaBancaria3 < 0 || numCuentaBancaria3 == numCuentaBancaria1 || numCuentaBancaria3 == numCuentaBancaria2 || numCuentaBancaria3 == numCuentaBancaria4 || numCuentaBancaria3 == numCuentaBancaria5);
        
        datosErroneos = false;

        do {
            if (datosErroneos == false) {
                System.out.println ("Asigne un número de cuenta bancaria del usuario 4:");
                numCuentaBancaria4 = sc.nextLong();
            }
            if (datosErroneos == true) {
                System.out.println ("Revise que no haya introducido números negativos, letras o que la cuenta que está intentando crear ya exista.");
                System.out.println ("Vuelva a introducir los números:");
                numCuentaBancaria4 = sc.nextLong();
            }

            datosErroneos = true;

        } while (numCuentaBancaria4 < 0 || numCuentaBancaria4 == numCuentaBancaria1 || numCuentaBancaria4 == numCuentaBancaria2 || numCuentaBancaria4 == numCuentaBancaria3 || numCuentaBancaria4 == numCuentaBancaria5);

        datosErroneos = false;

        do {
            if (datosErroneos == false) {
                System.out.println ("Asigne un número de cuenta bancaria del usuario 5:");
                numCuentaBancaria5 = sc.nextLong();
            }
            if (datosErroneos == true) {
                System.out.println ("Revise que no haya introducido números negativos, letras o que la cuenta que está intentando crear ya exista.");
                System.out.println ("Vuelva a introducir los números:");
                numCuentaBancaria5 = sc.nextLong();
            }

            datosErroneos = true;

        } while (numCuentaBancaria5 < 0 || numCuentaBancaria5 == numCuentaBancaria1 || numCuentaBancaria5 == numCuentaBancaria2 || numCuentaBancaria5 == numCuentaBancaria3 || numCuentaBancaria5 == numCuentaBancaria4);

        datosErroneos = false;

        sc.nextLine();

        //
        do {
            System.out.println ("¿Quiere usted ingresar dinero en alguna cuenta bancaria?");
            System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
            decision = sc.nextLine();
        } while (!decision.equals("S") && !decision.equals("N"));

        while (decision.equals("S")) {

            do {
                if (datosErroneos = false) {
                    System.out.println ("¿En qué cuenta bancaria quiere usted ingresar dinero?");
                    cuentaBancaria = sc.nextLong();
                }
                if (datosErroneos = true) {
                    System.out.println ("La cuenta bancaria no coincide con la de ningun usuario, porfabor vuelva a introducir los datos:");
                    cuentaBancaria = sc.nextLong();
                }

                datosErroneos = true;

            } while (cuentaBancaria != numCuentaBancaria1 && cuentaBancaria != numCuentaBancaria2 && cuentaBancaria != numCuentaBancaria3 && cuentaBancaria != numCuentaBancaria4 && cuentaBancaria != numCuentaBancaria5);

            datosErroneos = false;

            do {
                if (datosErroneos = false) {
                    System.out.println ("¿Cuanto dinero quiere usted ingresar en la cuenta?");
                    dineroIngresado = sc.nextDouble();
                }
                if (datosErroneos = true) {
                    System.out.println ("Introduzca solamente una cantidad superior a 0, recuerde que no se admite letras:");
                    dineroIngresado = sc.nextDouble();
                }

                datosErroneos = true;
                
            } while (dineroIngresado < 1);

            datosErroneos = false;

            if (cuentaBancaria == numCuentaBancaria1) {
                saldo1 += dineroIngresado;
            }

            if (cuentaBancaria == numCuentaBancaria2) {
                saldo2 += dineroIngresado;
            }

            if (cuentaBancaria == numCuentaBancaria3) {
                saldo3 += dineroIngresado;
            }

            if (cuentaBancaria == numCuentaBancaria4) {
                saldo4 += dineroIngresado;
            }

            if (cuentaBancaria == numCuentaBancaria5) {
                saldo5 += dineroIngresado;
            }

            do {

                System.out.println ("¿Quiere usted volver a ingresar dinero en alguna cuenta?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
                decision = sc.nextLine();

            } while (!decision.equals("S") && !decision.equals("N"));
        }

        //
        do {
            System.out.println ("¿Quiere usted cargar algún recibo en alguna cuenta bancaria?");
            System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
            decision = sc.nextLine();
        } while (!decision.equals("S") && !decision.equals("N"));

        while (decision.equals("S")) {

            do {
                if (datosErroneos = false) {
                    System.out.println ("¿En qué cuenta bancaria quiere usted cargar el recibo?");
                    cuentaBancaria = sc.nextLong();
                }
                if (datosErroneos = true) {
                    System.out.println ("La cuenta bancaria no coincide con la de ningun usuario, porfabor vuelva a introducir los datos:");
                    cuentaBancaria = sc.nextLong();
                }

                datosErroneos = true;

            } while (cuentaBancaria != numCuentaBancaria1 && cuentaBancaria != numCuentaBancaria2 && cuentaBancaria != numCuentaBancaria3 && cuentaBancaria != numCuentaBancaria4 && cuentaBancaria != numCuentaBancaria5);

            datosErroneos = false;

            do {
                if (datosErroneos = false) {
                    System.out.println ("¿Cuanto dinero quiere usted cargar en la cuenta?");
                    cargoRecibido = sc.nextDouble();
                }
                if (datosErroneos = true) {
                    System.out.println ("Introduzca solamente una cantidad superior a 0, recuerde que no se admite letras:");
                    cargoRecibido = sc.nextDouble();
                }

                datosErroneos = true;
                
            } while (cargoRecibido < 1);

            datosErroneos = false;

            if (cuentaBancaria == numCuentaBancaria1) {
                saldo1 -= cargoRecibido;
            }

            if (cuentaBancaria == numCuentaBancaria2) {
                saldo2 -= cargoRecibido;
            }

            if (cuentaBancaria == numCuentaBancaria3) {
                saldo3 -= cargoRecibido;
            }

            if (cuentaBancaria == numCuentaBancaria4) {
                saldo4 -= cargoRecibido;
            }

            if (cuentaBancaria == numCuentaBancaria5) {
                saldo5 -= cargoRecibido;
            }

            do {

                System.out.println ("¿Quiere usted cargar otro recibe en alguna de las cuentas de la entidad?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
                decision = sc.nextLine();

            } while (!decision.equals("S") && !decision.equals("N"));
        }
        
        //
        do {
                System.out.println ("¿Quiere usted ver el estado de la cuenta bancaria de algún usuario?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no:");
                decision = sc.nextLine();
        } while (!decision.equals("S") && !decision.equals("N"));
        
        while (decision.equals("S")) {
        
            do {
                if (datosErroneos = false) {
                    System.out.println ("¿De que usuario desea usted ver los datos?");
                    cuentaBancaria = sc.nextLong();
                }
                if (datosErroneos = true) {
                    System.out.println ("La cuenta bancaria no coincide con la de ningun usuario, porfabor vuelva a introducir los datos:");
                    cuentaBancaria = sc.nextLong();
                }
        
                datosErroneos = true;
        
            } while (cuentaBancaria != numCuentaBancaria1 && cuentaBancaria != numCuentaBancaria2 && cuentaBancaria != numCuentaBancaria3 && cuentaBancaria != numCuentaBancaria4 && cuentaBancaria != numCuentaBancaria5);
        
            datosErroneos = false;
        
            if (cuentaBancaria == numCuentaBancaria1) {
                System.out.println ("Este es el DNI del usuario: " + usuario1[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario1[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario1[2]);
                System.out.println ("Este es el número de cuenta bancaria: " + numCuentaBancaria1);
                System.out.println ("Este es el saldo de la cuenta: " + saldo1);
            }

            if (cuentaBancaria == numCuentaBancaria2) {
                System.out.println ("Este es el DNI del usuario: " + usuario2[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario2[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario2[2]);
                System.out.println ("Este es el número de cuenta bancaria: " + numCuentaBancaria2);
                System.out.println ("Este es el saldo de la cuenta: " + saldo2);
            }

            if (cuentaBancaria == numCuentaBancaria3) {
                System.out.println ("Este es el DNI del usuario: " + usuario3[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario3[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario3[2]);
                System.out.println ("Este es el número de cuenta bancaria: " + numCuentaBancaria3);
                System.out.println ("Este es el saldo de la cuenta: " + saldo3);
            }

            if (cuentaBancaria == numCuentaBancaria4) {
                System.out.println ("Este es el DNI del usuario: " + usuario4[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario4[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario4[2]);
                System.out.println ("Este es el número de cuenta bancaria: " + numCuentaBancaria4);
                System.out.println ("Este es el saldo de la cuenta: " + saldo4);
            }

            if (cuentaBancaria == numCuentaBancaria5) {
                System.out.println ("Este es el DNI del usuario: " + usuario5[0]);
                System.out.println ("Este es el nombre del usuario : " + usuario5[1]);
                System.out.println ("Estos son los apellidos del usuario: " + usuario5[2]);
                System.out.println ("Este es el número de cuenta bancaria: " + numCuentaBancaria5);
                System.out.println ("Este es el saldo de la cuenta: " + saldo5);
            }

            do {
        
                System.out.println ("¿Quiere volver a ver los datos de algún usuario?");
                System.out.println ("Introduzca S mayúscula para sí y N mayúscula para no y cerrar el programa:");
                decision = sc.nextLine();
        
            } while (!decision.equals("S") && !decision.equals("N"));
        }
        sc.close();
    }
}
