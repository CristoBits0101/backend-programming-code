package advanced.patterns.creational.builder;

import advanced.patterns.creational.builder.models.Vehiculo;

public class CocheBuilder {

    // Dentro de un modelo se instancia otro básico.
    Vehiculo vehiculo;

    // El constructor inicializa el modelo.
    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }

    // Las puertas son opcionales.
    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;
    }

    // El motor es opcional.
    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    // Devuelve el modelo construido.
    public Vehiculo build() {
        return this.vehiculo;
    }

}
