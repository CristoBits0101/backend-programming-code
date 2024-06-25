package basic.poo.Class.generic;

public class Super extends Class
{
    public String nacionality;

    // Initializing a new constructor and indicating which parameters belong to a parent constructor
    public Super(String name, int age, String nacionality)
    {
        super(name, age);
        this.nacionality = nacionality;
    }
}
