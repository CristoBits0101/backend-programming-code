package basic.security.validations;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request
{
    public static void main(String[] args) throws Exception
    {
        // Crear un objeto HttpRequest
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost/request.java")).build();

        // Obtener los datos del formulario
        String datosFormulario = request.bodyPublisher().toString();

        // Procesar los datos del formulario
        //

        // Establecer el indicador
        boolean formularioRecibido = true;

        // Mostrar un mensaje
        if (formularioRecibido)
            System.out.println("¡Se recibió el formulario!");
    }
}
