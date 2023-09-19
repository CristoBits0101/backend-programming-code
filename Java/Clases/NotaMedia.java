/* Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un
centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. El sistema
admite un número de grupos indefinido. Se pide leer las notas del primer,
segundo y tercer trimestre de cada alumno de cada grupo. Debemos mostrar, al
final, la nota media del grupo en cada trimestre, y la media de cada alumno. */

import java.util.*;

public class NotaMedia {

    public static void main (String [] args){

        //ArrayList <List <List<Integer>>> GruposNotas = new ArrayList <List <List<Integer>>> (); 
        

        Scanner entrada = new Scanner (System.in);
        int numgrupos =0,nota=0;
        double suma = 0, resultado=0;
                
        System.out.println ("********************************************************");

        System.out.print ("¿De cuántos grupos desea introducir las notas? ");
        numgrupos = entrada.nextInt();
        
        int GruposNotas [][][] = new int [numgrupos][5][3];

        if (numgrupos != 0) {
            for (int i =0;i<numgrupos;i++){
                System.out.println ("------------------------------------------------");
                System.out.println ("Vamos a introducir los datos del grupo "+(i+1));
                
                for (int j =0;j<5;j++) {
                    for (int k=0;k<3;k++) {                            
                            System.out.print ("Nota del alumno "+ (j + 1)+ " en la evaluación "+(k+1)+"--> ");
                            nota=entrada.nextInt(); 
                            GruposNotas [i][j][k]=nota;
                    }       
                } //Damos las notas de los cinco alumnos
            }

        }
            
        System.out.println ("\n********************************************************");
        System.out.println ("Los datos introducidos son: ");

        for (int i = 0; i<numgrupos; i++){
            System.out.println ("GRUPO "+ (i+1));
            for (int j = 0; j<5;j++){
                System.out.print ("Alumno "+ (j+1)+ "--> ");
                for (int k=0;k<3;k++){
                    System.out.print (GruposNotas [i][j][k] + " ");
                }   
                System.out.println();             
            }
        }

        System.out.println ("\n**************************************************************");
        System.out.println ("  Vamos a calcular la media de cada grupo en cada evaluación:");

        for (int i = 0; i<numgrupos; i++){
            for (int k=0;k<3;k++) {
                for (int j = 0; j<5;j++){                
                suma = suma+GruposNotas [i][j][k];    
                }
                resultado = suma/5;
                System.out.print ("\tLa media del grupo "+ (i+1)+" en la evaluación "+(k+1)+ " es ");
                System.out.printf("%.2f", resultado);
                System.out.println();
                suma=0;
                resultado=0;
            }
        }
        
        System.out.println ("\n*************************************************************");
        System.out.println ("  Vamos a calcular la media de cada alumno:");
        
        for (int i = 0; i<numgrupos; i++){
            for (int j = 0; j<5;j++){
               for (int k=0;k<3;k++){
               suma = suma+GruposNotas [i][j][k];    
               } 
            resultado = suma/3;
            System.out.print ("\tLa nota media del alumno "+ (j+1)+" del grupo " + (i+1) + " es ");
            System.out.printf("%.2f", resultado);
            System.out.println();
            suma=0;
            resultado=0; 
            }
           
       }



        entrada.close ();
    } 
    
}
