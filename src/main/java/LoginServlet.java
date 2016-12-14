import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by raylinares on 12/14/16.
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/login") // don't forget to add url of page that will be using this servlet
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// handle the post request

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("/profile");      // if username = admin and password = password then direct to profile page
            } else {
                response.sendRedirect("/login"); // if password is wrong, send it back to this view that the name or password was incorrect
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // return the jsp page containing login form
        request.getRequestDispatcher("/login.jsp").forward(request, response); //login path name goes here

    }
}
