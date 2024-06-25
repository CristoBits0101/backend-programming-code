package basic.state.sessions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class EjemploServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Obtenemos la sesión
        HttpSession sesion = request.getSession();

        // Obtenemos el dato de la sesión
        String nombre = (String) sesion.getAttribute("nombre");
    }
}
