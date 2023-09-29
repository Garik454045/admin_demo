package webdemo.servlets;

import webdemo.servlets.database.DataSource;
import webdemo.servlets.model.UsernamePassword;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsernamePassword usernamePassword = DataSource.instance().getUserNamePassword();
        boolean isLoggedIn = usernamePassword != null;

        if (isLoggedIn) {
            req.setAttribute("username", usernamePassword.getUsername());
            req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/webDemo/login");
        }
    }

}
