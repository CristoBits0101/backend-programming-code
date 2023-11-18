/* SUPUESTO PRÁCTICO_UT 4_Ejercicio 2
Realizar un programa para la gestión bancaria de un número indeterminado de
usuarios con cinco opciones:
1. Pedir DNI, nombre , apellidos y número de cuenta corriente de usuario.
2. Realizar un ingreso en la cuenta del usuario con una cantidad.
3. Realizar un cargo en la cuenta del usuario.
4. Estado de la cuenta de un usuario.
5. Salir del programa.*/

import java.util.*;

public class Banco_SP4_Ej2 {
    public static void main (String [] args){
        
        ArrayList <List <String>> Datos = new ArrayList <List <String>> (); 
       
        Scanner entrada = new Scanner (System.in);
        int opcion = 5,numclientes = 0;
        String continuar = new String ("y");
        Random SaldoRandom = new Random();
        String Saldo;
        do { 

            System.out.println ();
            System.out.println ("============ MENÚ ============");
            System.out.println ("1. Pedir datos.");
            System.out.println ("2. Realizar un ingreso.");
            System.out.println ("3. Realizar un cargo en cuenta.");
            System.out.println ("4. Estado de la cuenta.");
            System.out.println ("5. Finalizar.");
            System.out.print ("Elija una opción: ");
            opcion = entrada.nextInt(); 

            switch (opcion) {
                case 1:
                    while (continuar.equals ("y")) {                                        
                        
                        Datos.add(new ArrayList<String>()); //Creamos el espacio de memoria necesario
                        System.out.print ("Introduce el DNI del usuario "+(numclientes+1)+": ");                        
                        Datos.get(numclientes).add(entrada.next());
                        System.out.print ("Nombre: ");
                        Datos.get(numclientes).add(entrada.next());
                        System.out.print ("Apellidos: ");
                        Datos.get(numclientes).add(entrada.next());
                        System.out.print ("Número CC: ");
                        Datos.get(numclientes).add(entrada.next());
                        Saldo = Integer.toString (1000 + SaldoRandom.nextInt(2000 - 1500));
                        Datos.get(numclientes).add (Saldo);
                    
                        numclientes++;
                    
                        System.out.print ("¿Datos de otro cliente? (y/n): ");
                        continuar=entrada.next();
                    }
                
                    System.out.println ("---------------------------------------------------------------");
                    System.out.println ("Los datos introducidos son: ");
                    System.out.println (" \t DNI \t\t Nombre \t Apellidos \t CC \t\t Saldo");
                    for (int i=0;i<numclientes;i++) {  
                        for (int j=0; j<5;j++) {
                            System.out.print (" \t "+Datos.get(i).get(j)+" \t "); 
                        } 
                        System.out.println ();               
                    }
                                              
                break;

                case 2:                   
                
                    System.out.print ("Señale el número de cuenta en la que desea hacer el ingreso: ");
                    int datocuentaingreso;
                    datocuentaingreso=entrada.nextInt ();
                    System.out.print ("Cantidad a ingresar: ");
                    int cantidad = 0;
                    cantidad = entrada.nextInt ();

                    for (int i = 0;i<numclientes;i++) {                                                 
                        if (Integer.parseInt (Datos.get (i).get(3)) == datocuentaingreso) {
                            int datoprov = Integer.parseInt (Datos.get (i).get(4))+cantidad;    
                            Datos.get(i).set (4, Integer.toString(datoprov));
                            System.out.println ("\nTras realizar el ingreso, los datos de la cuenta "+datocuentaingreso+ " son: ");
                            for (int j=0; j<5;j++) {
                                System.out.print (" \t "+Datos.get(i).get(j)); 
                            } 
                            System.out.println ();                           
                        } //En el número de CC que coincide, actualiza el valor.                        
                    }  
                
                break;

                case 3:

                    System.out.print ("Señale el número de cuenta en la que va hacer el cargo: ");
                    datocuentaingreso=entrada.nextInt ();
                    System.out.print ("Cuantía del cargo: ");
                    cantidad = entrada.nextInt ();

                    for (int i = 0;i<numclientes;i++) {                                                 
                        if (Integer.parseInt (Datos.get (i).get(3)) == datocuentaingreso) {
                            int datoprov = Integer.parseInt (Datos.get (i).get(4))-cantidad;    
                            Datos.get(i).set (4, Integer.toString(datoprov));
                            System.out.println ("\nTras realizar el cargo, los datos de la cuenta "+datocuentaingreso+ " son: ");
                            for (int j=0; j<5;j++) {
                                System.out.print (" \t "+Datos.get(i).get(j)); 
                            } 
                            System.out.println ();                           
                        } //En el número de CC que coincide, actualiza el valor.                        
                    }                    
                break;

                case 4:

                System.out.println ("---------------------------------------------------------------");
                System.out.println ("Tras los ingresos y cargos realizados, \nlos datos de las cuentas son: ");
                System.out.println (" \t DNI \t\t Nombre \t Apellidos \t CC \t\t Saldo");
                for (int i=0;i<numclientes;i++) {  
                    for (int j=0; j<5;j++) {
                        System.out.print (" \t "+Datos.get(i).get(j)+" \t "); 
                    } 
                    System.out.println ();               
                }
                                          
                break;

                case 5:
                System.out.println ("¡Hasta siempre!");
                break;

            }

        } while (opcion != 5);

    entrada.close();
    }
}
