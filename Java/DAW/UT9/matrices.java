//Matrices ordenada por burbuja

import java.util.Scanner;

public class matrices {

public static void main (String[] args) 
    {         
      // declara una matriz de enteros.
      int [][] matriz=new int[5][5];
         
     
         
     
	for (int i = 0; i < matriz.length; i++){
	for (int j=0;j<matriz[0].length; j++){
	matriz[i][j]=(int) (Math.random() * 100);
	}
}
         
     for (int i = 0; i < matriz.length; i++){
	for (int j=0;j<matriz[0].length; j++){
	System.out.print(matriz[i][j] + "  ");
	}
	System.out.println();
}

int t=0;

for( int i=0; i < matriz.length; i++){
	for( int j=0;j< matriz[0].length; j++){
		for(int x=0; x < matriz.length; x++){
			for(int y=0; y <matriz[0].length; y++){
				if(matriz[i][j] > matriz[x][y]){
				t = matriz[i][j];
				matriz[i][j] = matriz[x][y];
				matriz[x][y] = t;
}
}
}
}}
System.out.println();System.out.println();System.out.println();System.out.println();

  for (int i = 0; i < matriz.length; i++){
	for (int j=0;j<matriz[0].length; j++){
	System.out.print(matriz[i][j] + "  ");
	}
	System.out.println();
}


       
    }
}