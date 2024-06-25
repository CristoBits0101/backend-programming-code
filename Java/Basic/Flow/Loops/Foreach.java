package basic.flow.loops;

public class Foreach
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers)
            System.out.println("Number: " + number);
    }
}
