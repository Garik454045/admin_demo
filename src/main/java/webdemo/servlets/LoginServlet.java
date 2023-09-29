package webdemo.servlets;

import webdemo.servlets.database.DataSource;
import webdemo.servlets.model.UsernamePassword;
import webdemo.servlets.validators.UsernamePasswordValidator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UsernamePassword usernamePassword = new UsernamePassword(username, password);

        boolean isValid = new UsernamePasswordValidator().isValid(usernamePassword);
        if (isValid) {
            DataSource.instance().setUsernamePassword(usernamePassword);
            resp.sendRedirect("/webDemo/welcome");
        } else {
            throw new RuntimeException("User is not valid:" + usernamePassword);
        }
    }
}
