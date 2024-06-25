import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class ParseoXMLConJAXB 
{
    public static void main(String[] args) throws JAXBException 
    {
        // XML de entrada como cadena
        String xmlString = "<Persona><Nombre>John Doe</Nombre><Edad>30</Edad></Persona>";

        // Crear el contexto JAXB y el objeto Unmarshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(Persona.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Parsear el XML
        StringReader reader = new StringReader(xmlString);
        Persona persona = XmlParser.parseXml(reader, Persona.class);

        // Mostrar los datos parseados
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
