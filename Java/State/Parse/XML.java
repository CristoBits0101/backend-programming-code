<Persona>
    <Nombre>John Doe</Nombre>
    <Edad>30</Edad>
</Persona>

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class ParseoXMLConJAXB {
    public static void main(String[] args) throws JAXBException {
        // XML de entrada como cadena
        String xmlString = "<Persona><Nombre>John Doe</Nombre><Edad>30</Edad></Persona>";

        // Crear el contexto JAXB y el objeto Unmarshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(Persona.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Parsear el XML
        StringReader reader = new StringReader(xmlString);
        Persona persona = (Persona) unmarshaller.unmarshal(reader);

        // Mostrar los datos parseados
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}

// Clase Java correspondiente
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
    private String nombre;
    private int edad;

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}