public class MatrizDiagonal {
    public static void main (String[] args){
     
    int [] [] Matriz = new int [7][7];
    
    System.out.println ("La matriz diagonal de ceros y unos es:");
    for (int i=0;i<Matriz.length;i++){
        for(int j=0;j<Matriz.length;j++){
            if (i==j) Matriz [i][j]=1;
            else Matriz [i][j]=0;
        System.out.print (Matriz[i][j]+" ");
        }
        System.out.println ();
    }
    
            
     }
    
}
