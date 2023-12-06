package Data.Structures.Collection;

import java.util.LinkedList;

public class Queue<T>
{
    public static void main(String[] args)
    {
        // Declaration
        MyQueue<Integer> myQueue = new MyQueue<>();

        // Operations
        enqueue(myQueue, 10);
        enqueue(myQueue, 20);
        enqueue(myQueue, 30);

        // Iteration
        System.out.println("Initial MyQueue:");
        iterateQueue(myQueue);

        // Dequeue operation
        dequeue(myQueue);

        // Iteration after dequeue
        System.out.println("\nMyQueue after dequeue:");
        iterateQueue(myQueue);
    }

    // Helper method to enqueue (add) an element to the queue
    private static void enqueue(MyQueue<Integer> queue, int element)
    {
        queue.offer(element);
    }

    // Helper method to dequeue (remove) an element from the queue
    private static void dequeue(MyQueue<Integer> queue)
    {
        if (!queue.isEmpty())
            queue.poll();

        else
            System.out.println("MyQueue is empty. Cannot dequeue.");
    }

    // Helper method to iterate over the elements of a queue
    private static void iterateQueue(MyQueue<Integer> queue)
    {
        for (int element : queue)
            System.out.println(element);
    }
}
