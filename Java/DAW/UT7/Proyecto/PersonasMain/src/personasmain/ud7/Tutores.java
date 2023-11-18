package personasmain.UD7;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public class Tutores extends Profesores {

    /**
     * Atributo de la clase 
     */
    protected String grupo;

    /**
     *
     * @param nombre Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     */
    public Tutores(String nombre, String DNI, String fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }

    /**
     *
     * @return devolvemos el grupo del tutor
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     *
     * @param grupo setter para el grupo del profesor
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     *
     * @return devolvemos el calculo del sueldo con su complemento
     */
    @Override
    public double getSueldo(){
        return salario+((salario*complemento)/100);
        
    }
}
