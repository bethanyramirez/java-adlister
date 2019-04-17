import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cats/add")
public class AddCatServlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/addCat.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int age = new Integer(request.getParameter("age"));
        String picture = request.getParameter("picture");

//        dao.addCat(new Cat(name,age,picture));
//        response.sendRedirect("/cats");
    }
}
