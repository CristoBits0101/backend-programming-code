package advanced.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance(); // Method
        Singleton singleton2 = Singleton.getInstance(); // Method

        singleton1.setContador(15);            // Assignment
        singleton2.setContador(20);            // Assignment

        System.out.println(singleton1.getContador());   // Println
        System.out.println(singleton1);                 // Memory zone

        System.out.println(singleton2.getContador());   // Println
        System.out.println(singleton2);                 // Memory zone
    }
}
