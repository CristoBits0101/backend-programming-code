package UD7;

public class Profesores extends Personas implements Sueldo{
    protected String NRP;
    protected int especialidad;
    protected String centroDestino;
    protected double salario; //Implementarlo en main

    public Profesores(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    @Override
    public String getIdef() {
        return NRP;
    }

    @Override
    public void setIdef(String  NRP) {
        this.NRP = NRP;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public String getCentroDestino() {
        return centroDestino;
    }

    public void setCentroDestino(String centroDestino) {
        this.centroDestino = centroDestino;
    }

    @Override
    public double getSueldo() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
