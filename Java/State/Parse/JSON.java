import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseoJSONConJackson 
{
    public static void main(String[] args) throws Exception 
    {
        // JSON de entrada como cadena
        String jsonString = "{\"nombre\":\"John Doe\",\"edad\":30}";

        // Crear un objeto ObjectMapper de Jackson
        ObjectMapper objectMapper = new ObjectMapper();

        // Parsear el JSON
        Persona persona = objectMapper.readValue(jsonString, Persona.class);

        // Mostrar los datos parseados
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}

// Clase Java correspondiente
public class Persona 
{
    private String nombre;
    private int edad;

    // Getters y setters (se omiten para brevedad)
}