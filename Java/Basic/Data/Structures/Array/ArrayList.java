package basic.data.structures.array;

/**
 *           Use : Implements a dynamic list using an underlying array.
 *    Advantages : Dynamic size, quick access by index.
 * Disadvantages : Inefficient for insertions and deletions in intermediate positions.
 * */
public class ArrayList
{
    public static void main(String[] args)
    {
        // Statement
        java.util.ArrayList<String> ArrayList = new java.util.ArrayList<>();

        // Operation
        ArrayList.add("Car");                       //    Add element
        ArrayList.get(0);                           //   Read element
        ArrayList.set(0, "Motorcycle");             // Update element
        ArrayList.remove(0);                  // Delete element

        ArrayList.clear();                          //  Empty the array
        ArrayList.size();                           // return the size

        // Iteration
        for (int i = 0; i < ArrayList.size(); i++)  // For
        {
            System.out.println(ArrayList.get(i));
        }

        for ( String i : ArrayList)                 // Foreach
        {
            System.out.println(i);
        }
    }
}
