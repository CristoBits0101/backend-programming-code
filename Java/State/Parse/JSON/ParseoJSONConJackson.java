import com.fasterxml.jackson.databind.ObjectMapper;

// Se encarga de la lógica principal de tu aplicación.
public class ParseoJSONConJackson 
{
    public static void main(String[] args) throws Exception 
    {
        // JSON de entrada como cadena
        String jsonString = "{\"nombre\":\"John Doe\",\"edad\":30}";

        // Crear un objeto ObjectMapper de Jackson
        ObjectMapper objectMapper = new ObjectMapper();

        // Parsear el JSON
        Persona persona = JsonParser.parseJson(jsonString, Persona.class);

        // Mostrar los datos parseados
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
