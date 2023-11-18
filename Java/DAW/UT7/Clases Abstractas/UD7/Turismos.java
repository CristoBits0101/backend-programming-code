package UD7;

import java.time.LocalDate;

public class Turismos extends Vehiculos {
    private int numPuertas;
    private boolean hasRemolque;
    private int numPlazas;

    public Turismos() {
    }

    public Turismos(String matricula, String chasis, String marca, String DNIPropietario, int yearMatriculacion, int numPuertas) {
        super(matricula, chasis, marca, DNIPropietario, yearMatriculacion);
        this.numPuertas = numPuertas;
        //hasRemolque y numPlazas se introducen a parte
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean hasRemolque() {
        return hasRemolque;
    }

    public void setHasRemolque(boolean hasRemolque) {
        this.hasRemolque = hasRemolque;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String  getITV() {
        if ((LocalDate.now().getYear()-getYearMatriculacion()) % 5 == 0) {
            return "Debe pasar la ITV este año";
        } else {
            return "Debe pasar la ITV dentro de " + (5 - ((LocalDate.now().getYear()-getYearMatriculacion()) % 5)) + " año/s";
        }
    }
}