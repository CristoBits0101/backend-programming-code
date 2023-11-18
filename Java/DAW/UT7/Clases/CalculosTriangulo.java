import java.util.Scanner;

//"Mi clase principal con el mismo nombre que el del archivo".
public class CalculosTriangulo {
    public static void main(String[] args) {

        // "Variables necesarias para las formulas";
        double perimetro;

        double area;

        double lado1;
        double lado2;
        double lado3;

        double base;

        double altura;
        
        boolean verdaderoFalso = true;

        // "clase Scanner para poder recoger los datos primitivos";
        Scanner sc = new Scanner(System.in);
	
	//"Sí introduce números negativos vuelve a escribirlos";
	do {
	
        // "Pedimos los valores".
        
        if (boolean verdaderoFalso == true;) {
        
        	System.out.println("Introduzca la medida de los tres lados: ");
        	lado1 = sc.nextDouble();
        	lado2 = sc.nextDouble();
        	lado3 = sc.nextDouble();

        	System.out.println("Introduzca la medida de la base: ");
        	base = sc.nextDouble();

        	System.out.println("Introduzca la medida de la altura: ");
        	altura = sc.nextDouble();
        	
        	boolean verdaderoFalso = false;
        	
        }
        
        if (boolean verdaderoFalso == false;) {
        	
        	System.out.println("¡Cuidado!, no se admite números negativos, porfabor vuelva a introducir los datos.");
        
        	System.out.println("Introduzca la medida de los tres lados: ");
        	lado1 = sc.nextDouble();
        	lado2 = sc.nextDouble();
        	lado3 = sc.nextDouble();

        	System.out.println("Introduzca la medida de la base: ");
        	base = sc.nextDouble();

        	System.out.println("Introduzca la medida de la altura: ");
        	altura = sc.nextDouble();
        	
        }
 	
 	} while (lado1 < 0 || lado2 < 0 || lado3 < 0 || altura < 0 || base < 0);	
 	
        // "Fórmula para calcular el área";
        area = (base * altura) / 2;

        // "Fórmula para calcular el perímetro";
        perimetro = lado1 + lado2 + lado3;

        System.out.println("Esté es el área del triángulo: " + area + " cm");
        System.out.println("Esté es el perímetro del triángulo: " + perimetro + " cm");

    };

};
