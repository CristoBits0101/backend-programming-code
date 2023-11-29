package POO.Object.Polymorphisms;

import POO.Object.Polymorphisms.Automotive.Children.Car;
import POO.Object.Polymorphisms.Automotive.Children.Motorcycle;
import POO.Object.Polymorphisms.Automotive.Parent.Vehicle;

public class Polymorphism
{
    public static void main(String[] args)
    {
        // Parent class
        Vehicle vehicle;

        // The parent class can be polymorphed into the child classes
        vehicle = new Motorcycle();
        vehicle = new Car();
    }
}
