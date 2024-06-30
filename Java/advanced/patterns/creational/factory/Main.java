package advanced.patterns.creational.factory;

import advanced.patterns.creational.factory.models.PrecioFactory;

public class Main {

    public static void main(String[] args) {
        PrecioFactory precioFactory1 = new PrecioFactory("España");
        System.out.println(precioFactory1.getPrecio());

        PrecioFactory precioFactory2 = new PrecioFactory("USA");
        System.out.println(precioFactory2.getPrecio());
    }
}
