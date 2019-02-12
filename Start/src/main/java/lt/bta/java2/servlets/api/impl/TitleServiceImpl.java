package lt.bta.java2.servlets.api.impl;

import lt.bta.java2.servlets.api.SQLExecute;
import lt.bta.java2.servlets.api.i.TitleService;
import lt.bta.java2.servlets.entites.Employee;
import lt.bta.java2.servlets.entites.Gender;
import lt.bta.java2.servlets.entites.Title;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;


@Path("/title")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TitleServiceImpl implements TitleService {

   // @Override
    @GET
    @Path("/{id}")
    public Response getTitles(@PathParam("id") int id) {

        return SQLExecute.execute(connection -> {

            String select =
                    "SELECT T.*, E.* FROM titles T " +
                            "JOIN employees E ON T.emp_no = E.emp_no " +
                            "WHERE T.emp_no =" + id;

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(select);
            Title title = null;
            if (rs.next()) {
                title = new Title();
                title.setEmpNo(rs.getLong("emp_no"));
                title.setTitle(rs.getString("title"));
                title.setFromDate(LocalDate.parse(rs.getString("from_date")));
                title.setToDate(LocalDate.parse(rs.getString("to_date")));

                Employee employee = new Employee();
                employee.setEmpNo(rs.getLong("emp_no"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setBirthDate(LocalDate.parse(rs.getString("birth_date")));
                employee.setHireDate(LocalDate.parse(rs.getString("hire_date")));
                employee.setGender((Gender.of(rs.getString("gender"))));
                title.setEmployee(employee);
            }

            if (title == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            } else {
                return Response.ok(title).build();
            }
        });
    }

    @Override
    public javax.xml.ws.Response getTitle(int id) {
        return null;
    }

//    @Override
//    public Response getTitle(int id) {
//        return null;
//    }
}