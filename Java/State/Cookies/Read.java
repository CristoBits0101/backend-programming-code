import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class EjemploServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();

        // Recorremos las cookies
        for (Cookie cookie : cookies) 
        {
            // Obtenemos el nombre de la cookie
            String nombre = cookie.getName();

            // Obtenemos el valor de la cookie
            String valor = cookie.getValue();
        }
    }
}
