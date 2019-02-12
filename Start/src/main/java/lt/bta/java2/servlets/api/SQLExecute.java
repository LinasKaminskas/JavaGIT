package lt.bta.java2.servlets.api;


import lt.bta.java2.servlets.api.i.ExecuteSQL;

import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class SQLExecute {

    private  static Logger LOG = Logger.getLogger(SQLExecute.class.getName());


    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    static String user = "root";
    static String password = "mysql";

    public static Response execute(ExecuteSQL action) {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            return Response.serverError().build();
        }

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            //kazka darom ir grazinu Response
            return action.apply(conn);

        } catch (SQLException e) {

            LOG.severe(e.getLocalizedMessage());
            return Response.serverError().build();
        }
    }
}
