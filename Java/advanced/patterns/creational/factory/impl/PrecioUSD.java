package advanced.patterns.creational.factory.impl;

import advanced.patterns.creational.factory.service.Precio;

public class PrecioUSD implements Precio {
    @Override
    public double getPrecio() {
        return 1.07;
    }
}
