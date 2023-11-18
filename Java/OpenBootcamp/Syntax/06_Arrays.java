import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class AllExamples {

  public static void main(String[] args) {
    // Array
    System.out.println("Array:");
    int[] array = { 1, 2, 3, 4, 5 };
    for (int element : array) {
      System.out.println("Element: " + element);
    }

    // Matriz
    System.out.println("\nMatrix:");
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    for (int[] row : matrix) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }

    // Vector
    System.out.println("\nVector:");
    Vector<Integer> vector = new Vector<>();
    vector.add(10);
    vector.add(20);
    vector.add(30);

    for (int element : vector) {
      System.out.println("Element: " + element);
    }

    // ArrayList
    System.out.println("\nArrayList:");
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("One");
    arrayList.add("Two");
    arrayList.add("Three");
    for (String element : arrayList) {
      System.out.println("Element: " + element);
    }

    // LinkedList
    System.out.println("\nLinkedList:");
    LinkedList<Double> linkedList = new LinkedList<>();
    linkedList.add(3.14);
    linkedList.add(2.718);
    for (double element : linkedList) {
      System.out.println("Element: " + element);
    }

    // HashSet
    System.out.println("\nHashSet:");
    HashSet<Character> hashSet = new HashSet<>();
    hashSet.add('A');
    hashSet.add('B');
    hashSet.add('C');
    for (char element : hashSet) {
      System.out.println("Element: " + element);
    }

    // HashMap
    System.out.println("\nHashMap:");
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("One", 1);
    hashMap.put("Two", 2);
    hashMap.put("Three", 3);
    for (String key : hashMap.keySet()) {
      System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
    }
  }
}
