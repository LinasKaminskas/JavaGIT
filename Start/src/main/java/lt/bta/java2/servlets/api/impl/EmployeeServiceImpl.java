package lt.bta.java2.servlets.api.impl;

import lt.bta.java2.servlets.api.SQLExecute;
import lt.bta.java2.servlets.api.i.EmployeeService;
import lt.bta.java2.servlets.api.i.ExecuteSQL;
import lt.bta.java2.servlets.entites.Employee;
import lt.bta.java2.servlets.entites.Gender;
import lt.bta.java2.servlets.entites.Title;
import lt.bta.java2.servlets.jpa.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.swing.text.html.parser.Entity;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

//interface ExecuteSQL {
//    Response apply(Connection connection) throws SQLException;
//}

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService {

//    private static Logger LOG = Logger.getLogger(EmployeeServiceImpl.class.getName());
//
//    String driver = "com.mysql.cj.jdbc.Driver";
//    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
//    String user = "root";
//    String password = "mysql";
//
//    private Response execute(ExecuteSQL action) {
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException e) {
//            return Response.serverError().build();
//        }
//
//        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//            // kazka darome ir graziname Response
//            return action.apply(conn);
//        } catch (SQLException e) {
//
//            LOG.severe(e.getLocalizedMessage());
//            return Response.serverError().build();
//        }
//    }

    @Override
    @POST
    @Path("/add")
    public Response addEmployee(Employee e) {
        return SQLExecute.execute(connection -> {
            PreparedStatement insertStmt = connection.prepareStatement("INSERT employees(birth_date, first_name, last_name, gender, hire_date) VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            insertStmt.setDate(1, Date.valueOf(e.getBirthDate()));
            insertStmt.setString(2, e.getFirstName());
            insertStmt.setString(3, e.getLastName());
            insertStmt.setString(4, String.valueOf(e.getGender()));
            insertStmt.setDate(5, Date.valueOf(e.getHireDate()));

            Long id = null;
            insertStmt.execute();
            ResultSet rs = insertStmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getLong(1);
            }

            insertStmt.close();
            return Response.ok(id).build();

        });

    }

    @Override
    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id") int id) {
        return SQLExecute.execute(connection -> {
            String select = "SELECT * FROM employees WHERE emp_no =" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(select);

            Employee employee = null;
            if (rs.next()) {
                employee = new Employee();
                employee.setEmpNo(rs.getLong("emp_no"));
            }

            if (employee == null) {
                stmt.close();
                rs.close();
                return Response.status(Response.Status.NOT_FOUND).build();
            } else {
                String select1 = "DELETE FROM employees WHERE emp_no =" + id;
                Statement stmt1 = connection.createStatement();
                stmt1.execute(select1);
                stmt.close();
                rs.close();
                stmt1.close();

                return Response.ok().build();
            }
        });
    }

    @Override
    @GET
    @Path("/{id}")
    public Response getEmployee(@PathParam("id") long id) {

//        return SQLExecute.execute(connection -> {
//            String select = "SELECT * FROM employees WHERE emp_no =" + id;
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(select);
//            Employee employee = null;
//
//            if (rs.next()) {
//                employee = new Employee();
//                employee.setEmpNo(rs.getLong("emp_no"));
//                employee.setFirstName(rs.getString("first_name"));
//                employee.setLastName(rs.getString("last_name"));
//                employee.setBirthDate(LocalDate.parse(rs.getString("birth_date")));
//                employee.setHireDate(LocalDate.parse(rs.getString("hire_date")));
//                employee.setGender((Gender.of(rs.getString("gender"))));
//
//                //kitas budas aprasyti gender
////                    employee.setGender(Objects.equals(rs.getString("gender"), "M") ?
////                            Gender.M : Objects.equals(rs.getString("gender"), "F") ?
////                            Gender.F : null);
//
//
//            }
//            rs.close();
//            stmt.close();
//
//            if (employee == null) {
//                return Response.status(Response.Status.NOT_FOUND).build();
//            } else {
//                return Response.ok(employee).build();
//            }
//        });
//    }
        EntityManager entityManager = PersistenceUtil.createEntityManager();
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.close();

                    if (employee == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            } else {
                return Response.ok(employee).build();
            }
    }
    @Override
    @PUT
    @Path("/{id}")
    public Response updateEmployee(@PathParam("id") int id, Employee e) {

        return SQLExecute.execute(connection -> {

            String select = "UPDATE employees SET  birth_date = ?, first_name = ?, last_name = ?, gender = ?, hire_date = ? WHERE emp_no =" + id;
            PreparedStatement insertStmt = connection.prepareStatement(select);
            insertStmt.setDate(1, Date.valueOf(e.getBirthDate()));
            insertStmt.setString(2, e.getFirstName());
            insertStmt.setString(3, e.getLastName());
            insertStmt.setString(4, String.valueOf(e.getGender()));
            insertStmt.setDate(5, Date.valueOf(e.getHireDate()));
            insertStmt.execute();
            insertStmt.close();

            return Response.ok().build();
        });
    }

    @Override
    @GET
    @Path("/list/{offset}/{size}")
    public Response getAllEmployees(@PathParam("size") int size, @PathParam("offset") int offset) {
        //return new Employee[0];

        return SQLExecute.execute(connection -> {
            String select = "SELECT * FROM employees ORDER BY emp_no DESC LIMIT ? OFFSET ?";
            PreparedStatement stmt = connection.prepareStatement(select);
            stmt.setInt(1, size);
            stmt.setLong(2, offset);
            ResultSet rs = stmt.executeQuery();
            List<Employee> employees = new ArrayList<>();

            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmpNo(rs.getLong("emp_no"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employees.add(employee);
            }
            rs.close();
            stmt.close();

            return Response.ok(employees).build();
        });


    }

    @Override
    @GET
    @Path("/titles/{id}")
    public Response getEmployeeTitles(@PathParam("id") int id) {
        return SQLExecute.execute(connection -> {
//            String select =  "SELECT E.*, T.* FROM employees E  " +
//                    "JOIN titles T ON E.emp_no = T.emp_no " +
//                    "WHERE E.emp_no =" + id;

            String select = "SELECT E.*, T.* FROM employees E  " +
                    "JOIN titles T ON E.emp_no = T.emp_no " +
                    "WHERE E.emp_no =" + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(select);

            List<Title> titles = new ArrayList<>();
            Employee employee = null;

            while (rs.next()) {
                employee = new Employee();
                employee.setEmpNo(rs.getLong("emp_no"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setBirthDate(LocalDate.parse(rs.getString("birth_date")));
                employee.setHireDate(LocalDate.parse(rs.getString("hire_date")));
                employee.setGender((Gender.of(rs.getString("gender"))));

                Title title = new Title();
                title.setEmpNo(rs.getLong("emp_no"));
                title.setTitle(rs.getString("title"));
                title.setFromDate(LocalDate.parse(rs.getString("from_date")));
                title.setToDate(LocalDate.parse(rs.getString("to_date")));
                titles.add(title);
                employee.setTitles(titles);
            }

            if (employee == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            } else {
                return Response.ok(employee).build();
            }
        });
    }
}

//    @Override
//    public Response getEmployeeTitles(int id) {
//        return null;
//    }

