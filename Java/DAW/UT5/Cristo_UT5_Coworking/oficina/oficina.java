// Referencia que esta clase será perteneciente al paquete (carpeta) oficina.
package oficina;

// Clase que contiene el código perteneciente a las oficinas.
public class oficina {
    
    // Constructor de la clase.
    public oficina (){};

    /*
    ** - Atributos privados del objeto oficina.
    ** - Los métodos de acceso a los campos/atributos privados será mediante Setters y Getters.
    */
    private String nombreOficina;
    private String direccionOficina;

    // Almacena el nombre de la oficina.
    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    // Devuelve el nombre de la oficina.
    public String getNombreOficina() {
        return nombreOficina;
    }
    
    // Almacena la dirección de la oficina.
    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    // Devuelve la dirección de la oficina.
    public String getDireccionOficina() {
        return direccionOficina;
    }
    
}