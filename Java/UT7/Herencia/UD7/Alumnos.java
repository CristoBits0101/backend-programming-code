package UD7;

public class Alumnos extends Personas {
    private String cial;
    private String ciclo;

    public Alumnos(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    public String getCial() {
        return cial;
    }

    public void setCial(String cial) {
        this.cial = cial;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
