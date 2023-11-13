import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Your Java code to fetch menu items and render them in the response
        // You would typically retrieve data from a database or another source here.
        // For simplicity, we'll just render a basic menu item list.
        String menuItems = "1. Pizza<br>2. Burger<br>3. Pasta";
        response.setContentType("text/html");
        response.getWriter().println("<h2>Menu</h2>");
        response.getWriter().println(menuItems);
    }
}