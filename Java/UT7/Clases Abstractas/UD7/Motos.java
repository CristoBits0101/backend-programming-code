package UD7;

import java.time.LocalDate;

public class Motos extends Vehiculos {

    public Motos() {
    }

    public Motos(String matricula, String chasis, String marca, String DNIPropietario, int yearMatriculacion) {
        super(matricula, chasis, marca, DNIPropietario, yearMatriculacion);
    }

    @Override
    public String getITV() {
        if ((LocalDate.now().getYear()-getYearMatriculacion()) % 5 == 0) {
            return "Debe pasar la ITV este año";
        } else {
            return "Debe pasar la ITV dentro de " + (5 - ((LocalDate.now().getYear()-getYearMatriculacion()) % 5)) + " año/s";
        }
    }
}
