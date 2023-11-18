
//"Metodos funciones y procedimientos".

import java.util.Scanner;


public class operaciones_menu {

	static float division(int n1,int n2){
	try{
	return n1/n2; }
	catch (ArithmeticException e){
	System.out.println("Error: "+ e.getMessage());
	return 0;
	}
}

static double resultado (int n1, int n2, int opc){
       double res;
	switch (opc) {

	case 1: res=(suma(n1,n2));
		break;
		
	case 2: res=(resta(n1,n2));
		break;

	case 3: res=(multiplicacion(n1,n2));
		break;

	case 4: res=(division(n1,n2));
		break;

	case 5: res=(modulo(n1,n2));
		break;


	default: res= 0;
		
		
		}
return res;

}

static void menu(){
	Scanner sc= new Scanner(System.in);  
	System.out.println("Primer operando");
	int n1= sc.nextInt();
	System.out.println("Segundo operando");
	int n2= sc.nextInt();
	
        int opc;
	do{
	System.out.println("Opción de 1 a 5");
	opc= sc.nextInt();
	} while(opc<1 || opc>5);

	System.out.println(resultado(n1,n2,opc));

}

public static void main(String[] args)
	{

		menu();

	}
}
