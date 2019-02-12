package lt.bta.java2.servlets.api.i;

import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.SQLException;

public interface ExecuteSQL {

    Response apply(Connection connection)throws SQLException;
}
