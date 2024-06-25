package basic.state.cookies;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class EjemploServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Creamos la cookie
        Cookie cookie = new Cookie("nombre", "Pepe");

        // Establecemos la duración de la cookie
        cookie.setMaxAge(120);

        // Enviamos la cookie
        response.addCookie(cookie);
    }
}
