 /* SUPUESTO  PRÁCTICO_UT 4_Ejercicio 1
Se pretende realizar un programa para gestionar la lista de participaciones en una
competición de salto de longitud. 
El número de plazas disponible es indeterminado.
Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose los
atletas. 
Si se selecciona 1, se introducirán los datos de uno de los participantes:
Dorsal, Nombre, mejor marca del 2018, mejor marca del 2019 y mejor marca del
2020. 
Si se elige la opción 2, se debe mostrar un listado por número de dorsal. 
La opción 3 mostrará un listado ordenado por la marca del 2020, de mayor a menor.
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se
seleccione la opción 4, que terminará el programa.
Diseñar el programa que muestre las siguientes opciones:
1)Inscribir un participante.
2)Mostrar listado de datos.
3)Mostrar listado por marcas.
4)Finalizar el programa.*/

import java.util.*;

public class DorsalIndefinido {
    public static void main (String [] args){
        
        ArrayList <List <String>> arrayDatos = new ArrayList <List <String>> (); 
       
        Scanner entrada = new Scanner (System.in);
        int opcion = 4, numdorsal = 0;
        String continuar = new String ("y");
                
        do { 
        
            System.out.println ();
            System.out.println ("============ MENÚ ============");
            System.out.println ("1. Inscribir un participante.");
            System.out.println ("2. Mostrar listado de datos.");
            System.out.println ("3. Mostrar listado por mejores marcas de 2020.");
            System.out.println ("4. Finalizar.");
            System.out.print ("Elija una opción: ");
            opcion = entrada.nextInt();
        
            switch (opcion) {
            case 1:
                while (continuar.equals ("y")) {                                        
                        
                        arrayDatos.add(new ArrayList<String>()); //Creamos el espacion de memoria necesario para el almacenaje de la lista.
                        System.out.print ("Número de dorsal del participante "+(numdorsal+1)+": ");                        
                        arrayDatos.get(numdorsal).add(entrada.next());
                        System.out.print ("Nombre: ");
                        arrayDatos.get(numdorsal).add(entrada.next());
                        System.out.print ("Mejor marca 2018: ");
                        arrayDatos.get(numdorsal).add(entrada.next());
                        System.out.print ("Mejor marca 2019: ");
                        arrayDatos.get(numdorsal).add(entrada.next());
                        System.out.print ("Mejor marca 2020: ");
                        arrayDatos.get(numdorsal).add(entrada.next());
                        numdorsal++;
                        
                        System.out.print ("¿Otro dorsal (y/n): ");
                        continuar=entrada.next();
                } 
                              
                break;
            
            case 2:
                
                System.out.println ("Los datos introducidos son: ");
                System.out.println (" \t Dorsal \t Nombre \t Marca18 \t Marca 19 \t Marca 20");
                
                /*for (int i=0;i<numdorsal;i++){
                    for (int j=i+1;j<numdorsal;j++) { //Comparo con los siguientes y ordeno
                        if (arrayDatos.get(i).get(0).compareTo(arrayDatos.get(j).get(0))<0) {  
                            List <String> aux = new ArrayList <> ();
                            aux = arrayDatos.get(i);
                            arrayDatos.set(i,arrayDatos.get(j));// Coloco la fila j en la posición i
                            arrayDatos.set (j,aux);             // y en la posición j coloco el aux (valor más pequeño)
                        }
                    }
                } // Si quiero ordenar por número de dorsal*/

                for (int i=0;i<numdorsal;i++) {  
                    for (int j=0; j<5;j++) {
                        System.out.print (" \t "+arrayDatos.get(i).get(j) + " \t "); 
                    } 
                    System.out.println ();               
                }

                break;
            case 3:                
               
                System.out.println ();
                System.out.println ("Vamos a ordenar por mejores marcas del 2020: ");
                
                for (int i=0;i<numdorsal;i++){
                    System.out.println (arrayDatos);
                    for (int j=i+1;j<numdorsal;j++) { //Comparo con los siguientes y ordeno
                        if (arrayDatos.get(i).get(4).compareTo(arrayDatos.get(j).get(4))<0) {  
                            List <String> aux = new ArrayList <> ();
                            aux = arrayDatos.get(i);
                            arrayDatos.set(i,arrayDatos.get(j));// Coloco la fila j en la posición i
                            arrayDatos.set (j,aux);             // y en la posición j coloco el aux (valor más pequeño)
                        }
                    }
                } 
                
                System.out.println (" \t Dorsal \t Nombre \t Marca18 \t Marca 19 \t Marca 20");
                
                for (int i=0;i<numdorsal;i++) {  
                    for (int j=0; j<5;j++) {
                        System.out.print (" \t "+arrayDatos.get(i).get(j) + " \t "); 
                    } 
                    System.out.println ();               
                }

                break;
            case 4:
                System.out.println ("¡Hasta siempre!");
                break;
            }
        } while (opcion!=4);
        entrada.close();
    }
}
