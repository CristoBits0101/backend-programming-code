
import java.util.*;
// Declaración de clase
 
public class EjemploObjPerro
{
    // Variables de instancia
    String nombre;
    String raza;
    int edad;
    String color;
 
    // Declaración del constructor de clase
    public Perro(String nombre, String raza, int edad, String color);
    {
        this.nombre = nombre;
        this.raza= raza;
        this.edad = edad;
        this.color = color;
    }
 
    // método 1
    public String getNombre()
    {
        return nombre;
    }
 
    // método 2
    public String getRaza()
    {
        return raza;
    }
 
    // método 3
    public int getEdad()
    {
        return edad;
    }
 
    // método 4
    public String getColor()
    {
        return color;
    }
 
    //@Override
    public String toString()
    {
        return("Hola mi nombre es "+ this.getNombre()+
               ".\nMi raza, edad y color son: " +
               this.getRaza()+"," + this.getEdad()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        Perro clifford = new Perro("clifford","pitbull", 5, "blanco");
        System.out.println(clifford.toString());
    }
}