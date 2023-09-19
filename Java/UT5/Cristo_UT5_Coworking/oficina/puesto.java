// Referencia que esta clase será perteneciente al paquete (carpeta) oficina.
package oficina;

// Importamos los paquetes necesarios para hacer funcionar la clase.
import java.lang.String;

// Clase que contiene el código perteneciente a los puestos.
public class puesto {

    // Atributos de la clase puesto.
    private String puestoEstado;
    private String nombrePersona;

    // Constructor de la clase puesto que estará vacío de momento.
    public puesto () {
        puestoEstado = "";
        nombrePersona = "";
    }

    // Constructor que recibe los datos de las variables y lo pasa a las funciones para inicializarlas.
    public puesto (String puestoEstado, String nombrePersona) {
        this.puestoEstado = puestoEstado;
        this.nombrePersona = nombrePersona;
    }

    // Devuelve el estado del puesto.
    public String getPuestoEstado() {
        return puestoEstado;
    }

    // Devuelve el nombre de la persona que ocupa el puesto.
    public String getNombrePersona() {
        return nombrePersona;
    }

    // Recive el nombre de la persona que ocupa el puesto.
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    // Recive el estado que tiene el puesto en un momento concreto.
    public void setPuestoEstado(String puestoEstado) {
        this.puestoEstado = puestoEstado;
    }

}