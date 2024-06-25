package basic.data.structures.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *           Use : Representation of a directed graph.
 *    Advantages : Flexible structure that can adapt to different types of graphs.
 *    Advantages : Allows you to store additional information (values associated with the edges).
 * Disadvantages : It requires manually handling the logic of adding and removing nodes and edges.
 * */
public class MyGraph
{
    public static void main(String[] args)
    {
        // Declaration
        Map<String, List<String>> graph = new HashMap<>();

        // Operations
        addNode(graph, "A");
        addNode(graph, "B");
        addEdge(graph, "A", "B");
        addEdge(graph, "B", "C");

        // Print initial state
        System.out.println("Initial MyGraph:");
        printGraph(graph);

        // Update operation
        updateNode(graph, "A", "UpdatedA");
        updateEdge(graph, "B", "C", "D");

        // Print updated state
        System.out.println("\nUpdated MyGraph:");
        printGraph(graph);

        // Delete operation
        deleteNode(graph, "B");

        // Print final state
        System.out.println("\nFinal MyGraph:");
        printGraph(graph);
    }

    // Helper method to add a node to the graph
    private static void addNode(Map<String, List<String>> graph, String node)
    {
        graph.put(node, List.of());
    }

    // Helper method to add an edge to the graph
    private static void addEdge(Map<String, List<String>> graph, String source, String destination)
    {
        if (graph.containsKey(source))
            graph.get(source).add(destination);
        else
            throw new IllegalArgumentException("Source node does not exist in the graph: " + source);
    }

    // Helper method to update a node in the graph
    private static void updateNode(Map<String, List<String>> graph, String oldNode, String newNode)
    {
        if (graph.containsKey(oldNode))
        {
            List<String> neighbors = graph.remove(oldNode);
            graph.put(newNode, neighbors);
        }

        else
            throw new IllegalArgumentException("Node to update does not exist in the graph: " + oldNode);
    }

    // Helper method to update an edge in the graph
    private static void updateEdge(Map<String, List<String>> graph, String source, String oldDestination, String newDestination)
    {
        if (graph.containsKey(source))
        {
            List<String> neighbors = graph.get(source);

            if (neighbors.contains(oldDestination))
            {
                neighbors.remove(oldDestination);
                neighbors.add(newDestination);
            }

            else
                throw new IllegalArgumentException("Edge to update does not exist in the graph: " + source + " -> " + oldDestination);
        }

        else
            throw new IllegalArgumentException("Source node does not exist in the graph: " + source);
    }

    // Helper method to delete a node from the graph
    private static void deleteNode(Map<String, List<String>> graph, String node)
    {
        graph.remove(node);

        // Remove references to the node in other adjacency lists
        for (List<String> neighbors : graph.values())
            neighbors.remove(node);
    }

    // Helper method to print the graph
    private static void printGraph(Map<String, List<String>> graph)
    {
        for (Map.Entry<String, List<String>> entry : graph.entrySet())
        {
            String node = entry.getKey();
            List<String> neighbors = entry.getValue();

            System.out.print(node + " -> ");

            if (!neighbors.isEmpty())
                System.out.print(String.join(", ", neighbors));

            System.out.println();
        }
    }
}
