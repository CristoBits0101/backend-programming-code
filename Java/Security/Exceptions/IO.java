package Security.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// input/output, such as problems reading or writing files or streams
public class IO extends Throwable
{
    public static void main(String[] args)
    {
        // 1. Call the function that can throw an IOException
        try
        {
            readInput();
            System.out.println("Result: " + result);
        }

        catch (java.io.IOException e)
        {
            System.err.println("IOException caught: " + e.getMessage());
        }

        finally
        {
            System.out.println("Finally block - cleanup code goes here.");
        }
    }

    // 2. Function that throws an IOException
    private static void readInput() throws IOException, java.io.IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter something: ");
        String input = reader.readLine();

        System.out.println("You entered: " + input);
    }
}
