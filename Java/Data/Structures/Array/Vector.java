package Data.Structures.Array;

/**
 *           Use : Similar to ArrayList but synchronized, meaning it is thread safe.
 *    Advantages : Thread safety.
 * Disadvantages : It may be slower due to timing.
 * */
public class Vector
{
    public static void main(String[] args)
    {
        // Statement
        java.util.Vector<Integer> Vector = new java.util.Vector<>();

        // Operation
        Vector.add(10);                                 //    Add element
        Vector.get(0);                                  //   Read element
        Vector.set(0, 5);                               // Update element
        Vector.remove(1);                         // Remove element

        // Iteration
        for (int i = 0; i < Vector.size(); i++)         // For
        {
            System.out.println(Vector.get(i) + " ");
        }

        for (int element : Vector)                      // Foreach
        {
            System.out.println(element + " ");
        }

    }
}
