package lt.bta.java2.servlets;

import lt.bta.java2.servlets.auth.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@WebServlet("/abc/LoginProcessor")
public class LoginProcessorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");    // jeigu tekstas text/plain
        response.setCharacterEncoding("utf-8");
        response.getWriter().println(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Bandymas</title>\n" +
                        "    <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "            <h1>Labas rytas diena </h1>\n" +
                        "            <form name=\"loginForm\" method=\"get\" action=\"LoginProcessor\">\n" +
                        "                Username:<br>\n" +
                        "                <input type=\"text\" name=\"username\"/> <br/>\n" +
                        "                Password:<br>\n" +
                        "                <input type=\"password\" name=\"password\"/> <br/>\n" +
                        "                <br><br>\n" +
                        "                <input type=\"submit\" value=\"Login\" />\n" +
                        "            </form>\n" +
                        "</body>\n" +
                        "</html>");
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (Objects.equals(username, "admin") && (Objects.equals(password, "admin"))) {
            response.sendRedirect("https://www.google.com");

            User user = new User();
            user.setName("Ona Marija");
            user.setEmail("admin@firma.lt");

            Set<Privilege> right = new HashSet<>();
            right.add(Privilege.HI_GET);
            right.add(Privilege.HI_POST);
            user.setRights(right);

            ServletContext servletContext = request.getServletContext();
            Integer counter = ((Integer) servletContext.getAttribute("counter"));
                    if (counter == null) counter = 1;
                    else counter++;
                    servletContext.setAttribute("counter", counter); // globalus counter



            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            response.sendRedirect("hello?name=" + user.getName());

            //patikrinimas ar user prisilogines
            HttpSession session1 = request.getSession();
            Objects obj = (Objects) session1.getAttribute("user");

//            if (obj == null){
//                response.sendRedirect("view/index.jsp");
//            } else  if (! (obj instanceof User)){
//            } else {
//                //User user1 = (User) obj;
//                if (user.getRights().contains(Privilege.HI_GET))
//                response.getWriter().println("YES:");
//            }


        } else
            //writer.println("<h4>Error ! Login Failed<h4>");
            response.sendRedirect("view/index.jsp");
    }
}


