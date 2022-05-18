import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyDearServlet" ,urlPatterns = {"/mydear"})
public class MyDearServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name=request.getParameter("name");
    String Class=request.getParameter("Class");
    String id=request.getParameter("id");
        PrintWriter out=response.getWriter();
        out.println("name:"+name);
        out.println("Class:"+Class);
        out.println("id:"+id);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
