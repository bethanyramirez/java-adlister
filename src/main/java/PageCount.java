import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/count")
public class PageCount extends HttpServlet {
    int counter = 0;

        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        PrintWriter output = res.getWriter();
        counter++;

        output.println("Page count: " + counter);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String countZero = req.getParameter("count");

        if(countZero.equals("0")) {
            counter = 0;
        }

        PrintWriter output = res.getWriter(); // putting message and transporting it
        output.println("Page count: " + counter);
    }

//    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        String email = req.getParameter("email");
//        PrintWriter output = res.getWriter(); // putting message and transporting it
//        output.println("This is your email:  " + email);
//    }


}
