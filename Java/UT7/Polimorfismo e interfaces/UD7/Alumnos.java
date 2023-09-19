package UD7;

public class Alumnos extends Personas {
    protected String cial;
    private String ciclo;

    public Alumnos(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    @Override
    public String getIdef() {
        return cial;
    }

    @Override
    public void setIdef(String cial) {
        this.cial = cial;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
