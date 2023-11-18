public class LoopExamples {

  public static void main(String[] args) {
    // for loop
    System.out.println("For Loop:");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Iteration " + i);
    }

    // foreach loop (for-each loop)
    System.out.println("\nForeach Loop:");
    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int number : numbers) {
      System.out.println("Number: " + number);
    }

    // while loop
    System.out.println("\nWhile Loop:");
    int count = 0;
    while (count < 5) {
      System.out.println("Count: " + count);
      count++;
    }

    // do-while loop
    System.out.println("\nDo-While Loop:");
    int x = 0;
    do {
      System.out.println("X: " + x);
      x++;
    } while (x < 5);
  }
}
