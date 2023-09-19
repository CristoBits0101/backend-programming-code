package UD7;

import java.time.LocalDate;

public class Guaguas extends Vehiculos {
    private int numPlazas;
    private String tipoServicio; //Publico, Escolar o Discrecional

    public Guaguas() {
    }

    public Guaguas(String matricula, String chasis, String marca, String DNIPropietario, int yearMatriculacion, int numPlazas, String tipoServicio) {
        super(matricula, chasis, marca, DNIPropietario, yearMatriculacion);
        this.numPlazas = numPlazas;
        this.tipoServicio = tipoServicio;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String getITV() {
        if ((LocalDate.now().getYear()-getYearMatriculacion()) % 2 == 0) {
            return "Debe pasar la ITV este año";
        } else {
            return "Debe pasar la ITV dentro de " + (2 - ((LocalDate.now().getYear()-getYearMatriculacion()) % 2)) + " año/s";
        }
    }
}
