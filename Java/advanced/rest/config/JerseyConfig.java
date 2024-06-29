package advanced.rest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component                                          // Es un componente Spring
@ApplicationPath("/")                               // Ruta base de la API
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        this.packages("advanced.rest.controllers"); // Paquete donde se encuentran las clases controladoras
    }
} 