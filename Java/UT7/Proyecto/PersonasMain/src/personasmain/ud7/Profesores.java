package personasmain.UD7;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public class Profesores extends Personas implements Sueldo{

    /**
     * Atributo NRP de la clase
     */
    protected String NRP;

    /**
     * Atributo Especialidad de la clase
     */
    protected int especialidad;

    /**
     * Atributo centroDestino de la clase
     */
    protected String centroDestino;

    /**
     * Atributo salario de la clase
     */
    protected double salario; //Implementarlo en main

    /**
     *
     * @param nombre Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     */
    public Profesores(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    /**
     *
     * @return devolvemos el numero identificativo para profesores es el NRP
     */
    @Override
    public String getIdef() {
        return NRP;
    }

    /**
     *
     * @param NRP setter del numero identificativo NRP
     */
    @Override
    public void setIdef(String  NRP) {
        this.NRP = NRP;
    }

    /**
     *
     * @return devolvemos la especialidad
     */
    public int getEspecialidad() {
        return especialidad;
    }

    /**
     *
     * @param especialidad setter de la especialidad del profesor
     */
    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    /**
     *
     * @return devolvemos el centro de destino
     */
    public String getCentroDestino() {
        return centroDestino;
    }

    /**
     *
     * @param centroDestino setter del centro de destino
     */
    public void setCentroDestino(String centroDestino) {
        this.centroDestino = centroDestino;
    }

    /**
     *
     * @return devolvemos el salario del profesor
     */
    @Override
    public double getSueldo() {
        return salario;
    }

    /**
     *
     * @param salario setter del salaio del profesor
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
