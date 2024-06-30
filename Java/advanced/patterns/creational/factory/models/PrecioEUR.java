package advanced.patterns.creational.factory.models;

import advanced.patterns.creational.factory.services.Precio;

public class PrecioEUR implements Precio {
    @Override
    public double getPrecio() {
        return 1;
    }
}
