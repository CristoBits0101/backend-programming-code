package basic.state.parse.xml;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;

public class XmlParser 
{
    public static <T> T parseXml(Reader reader, Class<T> valueType) throws JAXBException 
    {
        // Crear el contexto JAXB y el objeto Unmarshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(valueType);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Parsear el XML
        return (T) unmarshaller.unmarshal(reader);
    }
}
