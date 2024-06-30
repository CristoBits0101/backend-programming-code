package advanced.patterns.creational.factory.models;

import advanced.patterns.creational.factory.services.Precio;

public class PrecioUSD implements Precio {
    @Override
    public double getPrecio() {
        return 1.07;
    }
}
