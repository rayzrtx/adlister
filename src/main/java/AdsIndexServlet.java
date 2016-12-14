import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Created by raylinares on 12/14/16.
 */
@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads") //don't forget to add url of page that will be using this servlet
public class AdsIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the list of ads from listAdsDAO
        // make a variable that holds the result of calling all() method on ListAdsDAO

        //send the data into the view
        // set parameter on the response
        Ads adsDao = DaoFactory.getAdsDao();

        //in the view, iterate across the list and output the ads
        List<Ad> ads = adsDao.all();
        request.setAttribute("ads", ads); // set attribute on request object
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);  //ads index path goes here

    }
}
