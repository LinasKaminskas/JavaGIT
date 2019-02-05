package lt.bta.java2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/EmployeesServlet")
public class EmployeesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        String url = "jdbc:mysql://localhost:3306/employees?useUnicode=yes&characterEncoding=utf-8";
        String user = "root";
        String password = "mysql";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(response.getWriter());
            return;
        }

        try (
                Connection conn = DriverManager.getConnection(url, user, password)
        ) {

            String limitPar = request.getParameter("limit");

            int limit = 10;
            try {
                limit =Integer.valueOf(limitPar);
                limit = limit < 10 ? 10 : limit;
                limit = limit > 100 ? 100 : limit;
            } catch (NumberFormatException e){
            }

            String offsetPar = request.getParameter("offset");

            int offset = 0;
            try {
                offset =Integer.valueOf(limitPar);
                offset = offset < 0 ? 0 : offset;
            } catch (NumberFormatException e){
            }


            //Statement stmt = conn.createStatement();
            response.getWriter().println("YES");

            //sukuriame nauja irasa

            PreparedStatement insertStmt = conn.prepareStatement("INSERT employees(birth_date, first_name, last_name, gender, hire_date) VALUES (?, ?, ?, ?, ?)");
            insertStmt.setDate(1, new Date(1999, 12, 15));
            insertStmt.setString(2, "Žąsė");
            insertStmt.setString(3, "Čiūndra");
            insertStmt.setString(4, "F");
            insertStmt.setDate(5, new Date(2000, 1, 1));

            if (insertStmt.execute()) {
                response.getWriter().println("Inserted...");
            }

            //


            String select = "SELECT* FROM employees ORDER BY emp_no DESC LIMIT ? OFFSET ? ";

            PreparedStatement stmt = conn.prepareStatement(select);
            stmt.setInt(1, limit);
            stmt.setLong(2, offset);

            ResultSet rs = stmt.executeQuery();
            //ResultSet rs = stmt.executeQuery(select);
            while (rs.next()) {
                int empNo = rs.getInt("emp_no");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                response.getWriter().println(empNo + " " + firstName + " " + lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace(response.getWriter()); // automatiskai uzdaro, nereikia close (autoclousebl)
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
