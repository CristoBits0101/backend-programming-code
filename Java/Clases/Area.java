import java.util.Scanner;
public class Area {
	// TODO Auto-generated method stub
	Scanner tec = new Scanner(System.in);
	int ladoMayor, ladoMenor, area, perimetro;
	System.out.println("Programa que cálcula el área y el perímetro de un rectángulo.");
	System.out.println("Introduce el valor del lado mayor.");
	ladoMayor = tec.nextInt();
	System.out.println("Introduce el valor del lado mayor.");
	ladoMenor = tec.nextInt();
	area = ladomayor + ladoMenor;
	perimetro = ladoMayor * ladoMenor;
	System.out.println("El área del rectangulo es: " + area);
	System.out.println("El perimetro del rectangulo es: + perimetro");
}
