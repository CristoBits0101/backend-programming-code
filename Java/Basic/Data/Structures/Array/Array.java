package basic.data.structures.array;

import Paradigms.POO.Class.Generic.Class;

/**
 *           Use : Stores elements continuously in memory.
 *    Advantages : Quick index access, efficient for fixed sizes.
 * Disadvantages : Fixed size, inefficient for insertions and deletions.
 * */
public class Array
{
    public static void main(String[] args)
    {
        // Statement
        int[]   arrayA = { 1, 2, 3, 4, 5 };         //     String array = 5 elements
        int[]   arrayB = new int[10];               //    Integer array = maximum 11 elements
        Class[] arrayC = new Class[3];              // Array of objects = maximum 4 elements

        // Operation
        arrayB[0] = 1;                              //    Add element
        arrayA[4] = 6;                              // Update element

        // Iteration
        for (int i = 0; i <= arrayB.length -1; i++) // For
        {
            System.out.println(i);
            System.out.println(arrayB[i]);
        }

        for (int element:arrayA)                    // Foreach
            System.out.println(element);
    }
}
