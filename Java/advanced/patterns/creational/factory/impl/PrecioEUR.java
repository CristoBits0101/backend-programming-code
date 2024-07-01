package advanced.patterns.creational.factory.impl;

import advanced.patterns.creational.factory.service.Precio;

public class PrecioEUR implements Precio {
    @Override
    public double getPrecio() {
        return 1;
    }
}
