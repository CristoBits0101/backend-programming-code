package basic.data.structures.list;

/**
 *           Use : Implements a doubly linked list.
 *    Advantages : Efficient insertions and removals in any position.
 * Disadvantages : Slower access per index.
 * */
public class LinkedList
{
    public static void main(String[] args)
    {
        // Create a linked list
        java.util.LinkedList<Double> LinkedList = new java.util.LinkedList<>();

        // Insert elements into the linked list
        LinkedList.add(1.2);
        LinkedList.add(3.4);
        LinkedList.add(5.6);

        // Insert an element at a specific position
        LinkedList.add(2, 7.8);

        // Iterate over the linked list
        for (Double element : LinkedList)
            System.out.println(element);
    }
}
