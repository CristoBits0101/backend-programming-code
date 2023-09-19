package Paquete1;

import java.util.Scanner;

public class SumaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos del vector");
        int n = tec.nextInt();
        int [] vec = new int [n];
        vec = llenar(n);
        int suma = sumar(vec);
        System.out.println("La suma es:" + suma);
	}
	
    private static int[] llenar(int n) {
        int [] tabla = new int [n];
        for (int i=0; i<n; i++)
        tabla [i] = i * 10;
        return tabla;
    }   //llenar tabla

    public static int sumar (int [] tabla) {
        int suma =0;
        int n = tabla.length;
        for(int i=0; i<n; i++)
        suma+= tabla[i]; 
        return suma;
    }  

}
