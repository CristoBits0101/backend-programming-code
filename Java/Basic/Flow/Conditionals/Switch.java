package basic.flow.conditionals;

public class Switch
{
    public static void main(String[] args)
    {
        int years = 3;

        String isBaby = (years % 2 == 0) ? "¡Usted es un recién nacido!" : "¡Usted no es un recién nacido!";

        switch (isBaby)
        {
            case "¡Usted es un recién nacido!":
                System.out.println("¡Debe comprar un regalo!");
                break;

            case "¡Usted no es un recién nacido!":
                System.out.println("¡No debe comprar un regalo!");
                break;

            default:
                System.out.println("¡No debe comprar un regalo!");
        }
    }
}
