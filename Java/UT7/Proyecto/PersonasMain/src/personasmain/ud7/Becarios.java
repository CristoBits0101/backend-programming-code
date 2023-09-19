package personasmain.UD7;

//Becario debe heredar de Alumnos y como debe cobrar un sueldo se le implementa la interfaz Sueldo

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public class Becarios extends Alumnos implements Sueldo {

    //El constructor de becario se basa principalmente de los atributos de un alumno

    /**
     *
     * @param nombre Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     * @param cial Variable que almacena el cial del alumno
     * @param ciclo Variable que almacena el ciclo al que pertenece el alumno
     */
    public Becarios(String nombre, String DNI, String fechaNacimiento, String cial, String ciclo) {
        super(nombre, DNI, fechaNacimiento, cial, ciclo);
    }

    /**
     *
     * @return devolvemos el valor identificativo que seria el cial
     */
    @Override
    public String getIdef() {
        return cial;
    }

    /**
     *
     * @param cial setter del numero indentificativo para el alumno es el cial
     */
    @Override
    public void setIdef(String cial) {
        this.cial = cial;
    }

    //Al ser un becario este posee un sueldo

    /**
     *
     * @return devolvemos el sueldo del becario
     */
    @Override
    public double getSueldo() {
     return sueldoBecario;
    }
}
