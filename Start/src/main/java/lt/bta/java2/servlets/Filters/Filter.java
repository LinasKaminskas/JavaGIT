package lt.bta.java2.servlets.Filters;

import lt.bta.java2.servlets.auth.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "Filter", urlPatterns = {"/hi/*"})
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //req.getLocalName();  //toliau neparasyta
        HttpSession session = ((HttpServletRequest) req).getSession();
        Object obj = session.getAttribute("user");
        if (!(obj instanceof User)) {
            req.getRequestDispatcher("view/login.jsp").forward(req, resp);
        } else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
