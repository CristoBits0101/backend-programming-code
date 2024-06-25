package Paradigms.POO.Interface;

public class Implements implements Interfaces
{
    private double radius;

    public Implements(double radius)
    {
        this.radius = radius;
    }

    // Implementation of mandatory methods
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
