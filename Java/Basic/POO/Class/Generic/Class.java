package basic.poo.Class.generic;

public class Class
{
    // Attributes
    public String name;
    protected int age;
    private double account;

    // Constructors
    public Class()
    {

    }

    protected Class(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    private Class(String name, int age, double account)
    {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
