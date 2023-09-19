package personasmain.UD7;

/**
 *
 * @author Cristo Rubén Pérez Suárez
 */
public interface Sueldo {

    /**
     * Complemento para el sueldo de los profesores
     */
    final int complemento = 10;

    //Sueldo para el Becario

    /**
     * Sueldo fijo del becario
     */
    final int sueldoBecario = 3000;
    
    /**
     *
     * @return devolvemos el valor del sueldo
     */
    public double getSueldo();
}
