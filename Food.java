import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get parameters from the request
        String itemName = request.getParameter("itemName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        // Process the order (e.g., store in a database or perform necessary operations)
        
        // For demonstration, just returning a simple response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Order Placed!</h1>");
        out.println("<p>Item: " + itemName + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("</body></html>");
    }
}