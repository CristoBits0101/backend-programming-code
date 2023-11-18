package personasmain.UD7;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public class Alumnos extends Personas {

    /**
     * Atributos de nuestra clase
     */
    protected String cial;
    private String ciclo;

    /**
     * Constructor de la clase heredada
     * @param nombre Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     */
    public Alumnos(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }
    
    //Constructor para usarlo con Becarios

    /**
     *
     * @param nombre  Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     * @param cial Variable que almacena el cial del alumno
     * @param ciclo Variable que almacena el ciclo al que pertenece el alumno
     */
    public Alumnos(String nombre, String DNI, String fechaNacimiento, String cial, String ciclo){
        super(nombre, DNI, fechaNacimiento);
        this.cial = cial;
        this.ciclo = ciclo;
        
    }

    /**
     *
     * @return devolvemos el valor del cial
     */
    @Override
    public String getIdef() {
        return cial;
    }

    /**
     *
     * @param cial setter de la variable
     */
    @Override
    public void setIdef(String cial) {
        this.cial = cial;
    }

    /**
     *
     * @return devolvemo el valor del Ciclo
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     *
     * @param ciclo setter de la variable ciclo
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
