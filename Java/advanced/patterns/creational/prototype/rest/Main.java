package advanced.patterns.creational.prototype.rest;

import advanced.patterns.creational.prototype.beans.Coche;

public class Main {
    public static void main(String[] args) {

        //
        Coche coche1 = new Coche();

        coche1.marca = "Renault";
        coche1.modelo = "Megane";
        coche1.puertas = 5;

        System.out.println(coche1.marca);
        System.out.println(coche1.modelo);
        System.out.println(coche1.puertas);

        //
        try {

            Coche clon = coche1.clonar();

            clon.puertas = 3;

            System.out.println(clon.marca);
            System.out.println(clon.modelo);
            System.out.println(clon.puertas);
            
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar el objeto: " + e.getMessage());
        }

    }
}
