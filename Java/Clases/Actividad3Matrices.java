import java.util.Scanner;

public class Actividad5Matrices {
    public static void main (String [] args){
        
        String Datos [][]= new String [5][5];
        Scanner entrada = new Scanner (System.in);
        
        int opcion = 4;
        
        do{ 
        
            System.out.println ();
            System.out.println ("============ MENÚ ============");
            System.out.println ("1. Inscribir un participante.");
            System.out.println ("2. Mostrar listado de datos.");
            System.out.println ("3. Mostrar listado por marcas.");
            System.out.println ("4. Finalizar.");
            System.out.print ("Elija una opción: ");
            opcion = entrada.nextInt();
        
            switch (opcion) {
            case 1:
                for (int i=0;i<5;i++) {                    
                    System.out.print ("Número de dorsal del participante "+(i+1)+": ");
                    Datos [i][0]=entrada.next();
                    System.out.print ("Nombre: ");
                    Datos [i][1]  = entrada.next ();
                    System.out.print ("Mejor marca 2018: ");
                    Datos [i][2] = entrada.next ();
                    System.out.print ("Mejor marca 2019: ");
                    Datos [i][3] = entrada.next ();
                    System.out.print ("Mejor marca 2020: ");
                    Datos [i][4] = entrada.next ();                                      
                }                 
                break;
            case 2:
                System.out.println ("Los datos introducidos son: ");
                System.out.println (" \t Dorsal \t Nombre \t Marca18 \t Marca 19 \t Marca 20");
                for (int i =0;i<5;i++) { 
                    System.out.println ();
                    System.out.print (" \t "+Datos [i][0] + " \t ");
                    System.out.print (" \t "+Datos [i][1] + " \t ");
                    System.out.print (" \t "+Datos [i][2] + " \t ");
                    System.out.print (" \t "+Datos [i][3] + " \t ");
                    System.out.print (" \t "+Datos [i][4] + " \t ");              
                }
                break;
            case 3:                
                System.out.println ();
                System.out.print ("Vamos a ordenar por mejores marcas del 2020: ");
                int orden [];
                orden = new int [5]; 
                int posicion [];
                posicion = new int [5];              
               
                for (int i=0;i<5;i++){                    
                    orden[i]=Integer.parseInt (Datos[i][4]);
                }
                
                for (int p = 1; p < orden.length; p++){  
                    int aux = orden[p];                           
                    int j = p - 1;                              
                    
                    while ((j >= 0) && (aux > orden[j])){                                                                          
                            orden[j + 1] = orden[j];
                            j--;  
                                                                             
                    }
                    orden[j + 1] = aux;
                }
                    
                for (int k=0;k<5;k++) { 
                        System.out.print (orden[k] + " ");
                        System.out.print (posicion[k] + " ");

                        /*int aux = orden [k];
                        
                        System.out.println ();
                        System.out.print (Datos [aux][0] + "  ");
                        System.out.print (Datos [aux][1] + " ");
                        System.out.print (Datos [aux][2] + " ");
                        System.out.print (Datos [aux][3] + " ");
                        System.out.print (Datos [aux][4] + " ");*/         
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
