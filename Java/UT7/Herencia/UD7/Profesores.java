package UD7;

public class Profesores extends Personas {
    private int NRP;
    private int especialidad;
    private String centroDestino;

    public Profesores(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    public int getNRP() {
        return NRP;
    }

    public void setNRP(int NRP) {
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
}
