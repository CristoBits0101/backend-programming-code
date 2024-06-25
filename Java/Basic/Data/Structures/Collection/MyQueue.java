package basic.data.structures.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 *           Use : Implements a queue for FIFO (First-In-First-Out) operations.
 *    Advantages : Useful for tasks such as managing waiting tasks.
 * Disadvantages : Not efficient for random access.
 * */
public class MyQueue<T>
{
    public static void main(String[] args)
    {
        // Declaration
        Queue<Integer> myQueue = new LinkedList<>();                    // Using LinkedList as the underlying data structure for the queue

        // Operations
        enqueue(myQueue, 10); // Adding an Integer element
        enqueue(myQueue, 20); // Adding an Integer element
        enqueue(myQueue, 30); // Adding an Integer element

        // Iteration
        System.out.println("Initial MyQueue:");
        iterateQueue(myQueue);                                          // Iteration over Integer elements

        // Dequeue operation
        dequeue(myQueue);                                               // Queuing an Integer element

        // Iteration after dequeue
        System.out.println("\nMyQueue after dequeue:");
        iterateQueue(myQueue);                                          // Iteration over remaining Integer elements
    }

    // Helper method to enqueue (add) an element to the queue
    private static void enqueue(Queue<Integer> queue, int element)
    {
        queue.offer(element);                                           // Enqueuing an element of type T
    }

    // Helper method to dequeue (remove) an element from the queue
    private static void dequeue(Queue<Integer> queue)
    {
        if (!queue.isEmpty())
            queue.poll();                                               // Queuing an element of type T
        else
            System.out.println("MyQueue is empty. Cannot dequeue.");
    }

    // Helper method to iterate over the elements of a queue
    private static void iterateQueue(Queue<Integer> queue)
    {
        for (Integer element : queue)
            System.out.println(element);                                // Iteration over elements of type T
    }
}
