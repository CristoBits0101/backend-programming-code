package UD7;

public class Tutores extends Profesores {
    protected String grupo;

    public Tutores(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public double getSueldo(){
        return salario+((salario*complemento)/100);
        
    }
}
