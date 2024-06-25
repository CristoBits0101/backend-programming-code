import com.fasterxml.jackson.databind.ObjectMapper;

// Encapsula la lógica de parseo del JSON, proporcionando una abstracción reutilizable.
public class JsonParser 
{
    public static <T> T parseJson(String jsonString, Class<T> valueType) throws Exception 
    {
        // Crear un objeto ObjectMapper de Jackson
        ObjectMapper objectMapper = new ObjectMapper();

        // Parsear el JSON
        return objectMapper.readValue(jsonString, valueType);
    }
}
