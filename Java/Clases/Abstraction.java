// 
abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void mostrarDescripcion();

}

//
class Telefono extends Producto {
    private String marca;

    public Telefono(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public void mostrarDescripcion() {
        System.out.println("Teléfono: " + getNombre() + ", Marca: " + marca + ", Precio: " + getPrecio());
    }

    private String getPrecio() {
        return null;
    }

    private String getNombre() {
        return null;
    }
}

//
class Computadora extends Producto {
    private String procesador;

    public Computadora(String nombre, double precio, String procesador) {
        super(nombre, precio);
        this.procesador = procesador;
    }

    public void mostrarDescripcion() {
        System.out.println("Computadora: " + getNombre() + ", Procesador: " + procesador + ", Precio: " + getPrecio());
    }

    private String getPrecio() {
        return null;
    }

    private String getNombre() {
        return null;
    }
}

//
public class Abstraction {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("iPhone", 999.99, "Apple");
        telefono.mostrarDescripcion();

        Computadora computadora = new Computadora("Laptop", 1499.99, "Intel i7");
        computadora.mostrarDescripcion();
    }
}
