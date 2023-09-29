package webdemo.servlets.validators;

import webdemo.servlets.model.UsernamePassword;

import javax.servlet.*;
import java.io.IOException;

public class UsernamePasswordValidator implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }

    public boolean isValid(UsernamePassword usernamePassword) {
        return isValidPassword(usernamePassword.getPassword())
                && isValidUsername(usernamePassword.getUsername());
    }

    private boolean isValidPassword(String password) {
        return password != null && !password.isEmpty();
    }

    private boolean isValidUsername(String username) {
        return username != null && !username.isEmpty();
    }
}
