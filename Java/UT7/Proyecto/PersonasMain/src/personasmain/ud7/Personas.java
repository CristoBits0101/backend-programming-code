package personasmain.UD7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public abstract class Personas implements Acceso {

    /**
     * Atributos de la clase
     */
    protected String nombre;

    /**
     * Atributos de la clase
     */
    protected String DNI;
    private LocalDate fechaNacimiento;
    //Campo calculado edad "getEdad"

    /**
     *
     * @param nombre Variable que almacena el nombre de la persona
     * @param DNI Variable que almacena el DNI de la pesona
     * @param fechaNacimiento Variable que alamacena la fecha de nacimiento de la persona
     */
    public Personas(String nombre, String DNI, String fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        setFechaNacimiento(fechaNacimiento);
    }

    /**
     *
     * @return devolvemos el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre setter de la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return devolvemos el valor del DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *
     * @param DNI setter de la variable DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @return devolvemos la fecha de nacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento setter de la fecha de nacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        DateTimeFormatter DateForm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateForm);
    }

    /**
     *
     * @return devolvemos el valor de la edad que es un calculo con la fecha de nacimiento
     */
    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
       
    }
}
