public class ControlFlowExamples {

  public static void main(String[] args) {
    // If statement
    int number = 10;
    if (number > 5) {
      System.out.println("The number is greater than 5");
    }

    // Else if statement
    int anotherNumber = 3;
    if (anotherNumber > 5) {
      System.out.println("The number is greater than 5");
    } else if (anotherNumber > 0) {
      System.out.println("The number is positive, but not greater than 5");
    } else {
      System.out.println("The number is non-positive");
    }

    // Ternary operator
    boolean isEven = (number % 2 == 0) ? true : false;
    System.out.println("Is the number even? " + isEven);

    // Switch statement
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Excellent!");
        break;
      case 'B':
        System.out.println("Good job!");
        break;
      case 'C':
        System.out.println("You passed.");
        break;
      case 'D':
        System.out.println("You need to improve.");
        break;
      case 'F':
        System.out.println("Sorry, you failed.");
        break;
      default:
        System.out.println("Invalid grade");
    }
  }
}
