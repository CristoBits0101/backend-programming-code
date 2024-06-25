package basic.data.structures.collection;

import java.util.Set;

/**
 *           Use : Store unique items, without duplicates.
 *    Advantages : Quick search, guarantees unique items.
 * Disadvantages : Does not guarantee a specific order.
 * */
public class MyHashSet
{
    public static void main(String[] args)
    {
        // Declaration
        Set<Character> myHashSet = (Set<Character>) new MyHashSet();

        // Operations
        myHashSet.add('A');
        myHashSet.add('B');
        myHashSet.add('C');

        // Iteration using enhanced for loop
        System.out.println("Initial MyHashSet:");
        iterateHashSet(myHashSet);

        // Add operation
        myHashSet.add('D');

        // Iteration after adding an element
        System.out.println("\nMyHashSet after addition:");
        iterateHashSet(myHashSet);

        // Remove operation
        myHashSet.remove('B');

        // Iteration after removal
        System.out.println("\nMyHashSet after removal:");
        iterateHashSet(myHashSet);
    }

    // Helper method to iterate over the elements of a MyHashSet
    private static void iterateHashSet(Set<Character> hashSet)
    {
        for (char element : hashSet)
            System.out.println(element);
    }
}
