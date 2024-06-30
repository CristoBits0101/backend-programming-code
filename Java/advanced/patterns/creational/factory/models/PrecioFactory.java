package advanced.patterns.creational.factory.models;

import advanced.patterns.creational.factory.services.Precio;

public class PrecioFactory {

    public Precio precio;                                       // La interface es un atributo.

    private PrecioFactory() {                                   // Los constructores vacíos son privados.
    }

    public PrecioFactory(String pais) {                         // Único constructor accesible.
        if (pais.equalsIgnoreCase("España")) {    // Si el valor del parametro del constructor es "España"
            System.out.println("España");
            this.precio = new PrecioEUR();                      // Polimorfismos de la interface a la clase que implementa.
        } else {                                                // Si el valor del parametro del constructor es "Estados Unidos"
            System.out.println("Estados Unidos");
            this.precio = new PrecioUSD();                      // Polimorfismos de la interface a la clase que implementa.
        }
    }

}
