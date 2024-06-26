package basic.data.structures.array;

import java.util.Vector;

/**
 *           Use : Similar to ArrayList but synchronized, meaning it is thread safe.
 *    Advantages : Thread safety.
 * Disadvantages : It may be slower due to timing.
 * */
public class Vectors
{
    public static void main(String[] args)
    {
        // Statement
        Vector<Integer> vector = new Vector();
        Vector<Integer> vector2 = new Vector(50, 15);

        // Comparation
        boolean result = vector.equals(vector2);

        // Operation
        vector.add(10);                                 //    Add element
        vector.get(0);                                  //   Read element
        vector.set(0, 5);                               // Update element
        vector.remove(1);                         // Remove element

        // Iteration
        for (int i = 0; i < vector.size(); i++)         // For
        {
            System.out.println(vector.get(i) + " ");
        }

        for (int element : vector)                      // Foreach
        {
            System.out.println(element + " ");
        }

    }
}
