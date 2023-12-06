package Data.Structures.Collection;

import java.util.Map;

/**
 *           Use : Stores key-value pairs in no specific order.
 *    Advantages : Fast, efficient search for insertion and deletion operations.
 * Disadvantages : Does not guarantee a specific order.
 * */
public class HashMap
{
    public static void main(String[] args)
    {
        // Declaration
        Map<String, Integer> myHashMap = (Map<String, Integer>) new MyHashMap();

        // Operations
        myHashMap.put("One", 1);
        myHashMap.put("Two", 2);
        myHashMap.put("Three", 3);

        // Iteration
        System.out.println("Initial MyHashMap:");
        iterateHashMap(myHashMap);

        // Update operation
        myHashMap.put("Two", 20);

        // Iteration after update
        System.out.println("\nMyHashMap after update:");
        iterateHashMap(myHashMap);

        // Remove operation
        myHashMap.remove("Three");

        // Iteration after removal
        System.out.println("\nMyHashMap after removal:");
        iterateHashMap(myHashMap);
    }

    // Helper method to iterate over the entries of a MyHashMap
    private static void iterateHashMap(Map<String, Integer> hashMap)
    {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}