package basic.flow.conditionals;

public class ElseIf
{
    public static void main(String[] args)
    {
        int years = 3;

        if (years > 17)
            System.out.println("¡Usted es mayor de edad!");

        else if (years < 18 && years > -1)
            System.out.println("¡Usted es menor de edad!");

        else
            System.out.println("¡Edad errónea!");
    }
}
