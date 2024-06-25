package Data.Structures.Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *           Use: Implements a stack for LIFO (Last-In-First-Out) operations.
 *    Advantages: Useful for operations such as reversing elements.
 * Disadvantages: Not efficient for random access.
 * */
public class MyStack<S> implements Iterable<S>
{
    private Node top;

    // Inner Node class
    private class Node
    {
        S data;
        Node next;

        Node(S data)
        {
            this.data = data;
        }
    }

    // Push method to add an element to the stack
    public void push(S item)
    {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    // Iterator for MyStack
    @Override
    public Iterator<S> iterator()
    {
        return new Iterator<S>()
        {
            private Node current = top;

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public S next()
            {
                if (!hasNext())
                    throw new NoSuchElementException();


                S data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public static void main(String[] args)
    {
        // Create a stack
        MyStack<String> stack = new MyStack<>();

        // Open the file
        File file = new File("archivo.txt");
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
        }

        catch (FileNotFoundException e)
        {
            System.err.println("No se pudo encontrar el archivo.");
            System.exit(1);
        }

        // Read the file line by line
        while (scanner.hasNextLine())
            // Push the line onto the stack
            stack.push(scanner.nextLine());

        // Close the file
        scanner.close();

        // Iterate over the stack using a for-each loop
        for (String line : stack)
            System.out.println(line);
    }
}
