package basic.security.exceptions;

// Generally used to handle errors related to mathematical operations
public class Arithmetic
{
    public static void main(String[] args)
    {
        try
        {
            // 1. Function call that may throw an ArithmeticException
            int result = divideByZero();

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e)
        {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }

        finally
        {
            System.out.println("Finally block - cleanup code goes here.");
        }
    }

    // 2. Function that throws an ArithmeticException
    private static int divideByZero() throws ArithmeticException
    {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
