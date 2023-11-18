// Class

// Static

// Object

// Correlation
MotorCorrelation volkswagen = new MotorCorrelation(4, 260);
Vehicle Citroen = new Vehicle("Elysse", "Citroen", 4999, 2003, false, 0, volkswagen);
System.out.println(Citroen.motorCorrelation);

// Encapsulation

// Inheritance

// Abstraction
abstract class AbstractShape 
{
    abstract double calculateArea();
}

class Circle extends AbstractShape 
{
    double radius;

    // Constructor
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Implementación del método abstracto
    @Override
    double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

// Polymorphism
Vehicle vehicle;
vehicle = new MotorcycleInheritance();
vehicle = new Car();

// Interfaces
interface InterfaceExample 
{
    void printMessage();
}

// Override
class InterfaceExampleImpl implements InterfaceExample 
{
    @Override
    public void printMessage() 
    {
        System.out.println("Hello from InterfaceExampleImpl");
    }
}