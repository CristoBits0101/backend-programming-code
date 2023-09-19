// Paquete (carpeta) donde van a estar mis clases.
package FicherosTexto;

// Importamos los paquetes necesarios para poder instanciar los objetos y sus métodos.
import java.util.*;

// Incluye la lectura de los archivos de los clientes y los métodos referentes a estos datos.
public class DatosCliente {

    public DatosCliente () {};

    // Atributos de la clase según la toma de requisitos.
    private String id;
    private String nombre;
    private String apellidos;

    // 
    private int aux1 = 0;
    private int aux2 = 0;

    // Creamos las listas que van a almacenar los teléfonos y los correos.
    private ArrayList <String> telefonos = new ArrayList <String> ();
    private ArrayList <String> correos = new ArrayList <String> ();

    // 
    public void total(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        
        // Se imprime la lista de teléfonos.
        while (aux1 < telefonos.size()) {
            System.out.println("Teléfonos: " + telefonos.get(aux1));
            aux1 += 1;
            if (aux1 == telefonos.size()) {
                System.out.println("El número total de teléfonos aportados es: " + aux1);
            }
        }

        // Se imprime los correos.
        while (aux2 < correos.size()) {
            System.out.println("Emails: " + correos.get(aux2));
            aux2 += 1;
        }
    }

    public void setCorreo(String correo) {
        correos.add(correo);
    }

    public void setTelefono(String telefono) {
        telefonos.add(telefono);
    }

    //
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}