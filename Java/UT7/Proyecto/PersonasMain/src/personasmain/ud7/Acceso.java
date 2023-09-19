package personasmain.UD7;

/**
 * Interfaz con la identificacion para las personas
 * @author Cristo Rubén Pérez Suárez
 */
public interface Acceso {

    /**
     *
     * @return getter para el identificador
     */
    public String getIdef();

    /**
     *
     * @param idefCode Codogo de indentificacion para los alumnos y profesores (personas)
     */
    public void setIdef(String idefCode);
}
