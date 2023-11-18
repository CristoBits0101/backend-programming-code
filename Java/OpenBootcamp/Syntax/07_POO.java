// Class
class Vehicle {
    // Código relacionado con la clase Vehicle
}

// Static
class StaticExample {
    static int staticVariable = 42;

    static void staticMethod() {
        // Código del método estático
    }
}

// Object
Vehicle car = new Vehicle();

// Correlation
MotorCorrelation volkswagen = new MotorCorrelation(4, 260);
Vehicle citroen = new Vehicle("Elysse", "Citroen", 4999, 2003, false, 0, volkswagen);
System.out.println(citroen.motorCorrelation);

// Encapsulation
class EncapsulationExample {
    private int encapsulatedVariable;

    public int getEncapsulatedVariable() {
        return encapsulatedVariable;
    }

    public void setEncapsulatedVariable(int value) {
        encapsulatedVariable = value;
    }
}

// Inheritance
class SportsCar extends Car {
    // Código de la clase derivada SportsCar
}

// Abstraction
abstract class AbstractShape {
    abstract double calculateArea();
}

class Circle extends AbstractShape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementación del método abstracto
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Polymorphism
Vehicle vehicle;
vehicle = new MotorcycleInheritance();
vehicle = new Car();

// Interfaces
interface InterfaceExample {
    void printMessage();
}

class InterfaceExampleImpl implements InterfaceExample {
    @Override
    public void printMessage() {
        System.out.println("Hello from InterfaceExampleImpl");
    }
}

// Override
class OverrideExample {
    @Override
    void overriddenMethod() {
        // Código del método sobrescrito.
    }
}