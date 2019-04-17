import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads")
public class AdsPageServlet extends HttpServlet {

    Ads dao = DaoFactory.getAdsDao();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("ads", dao.all()); // this has to go before dispatch
        request.getRequestDispatcher("/ads/index.jsp").forward(request,response); // this has to go LAST so it can have a response to dispatch
    }



}
//ListAdsDao.generateAds()