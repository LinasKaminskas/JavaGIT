package lt.bta.java2.servlets.api.impl;

import lt.bta.java2.servlets.api.i.EmployeeService;
import lt.bta.java2.servlets.entites.Employee;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    @POST
    @Path("/add")
    public Response addEmployee(Employee e) {
        return null;
    }

    @Override
    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id")int id) {
        return null;
    }

    @Override
    @GET
    @Path("/{id}")
    public Response getEmployee(@PathParam("id") int id) {
        Employee employee = new Employee();
        employee.setEmpNo(123);
        employee.setFirstName("Jonas");
        employee.setBirthDate(LocalDate.of(1999, 12, 31));
        return Response.ok(employee).build(); // paziureti build patterna
    }

    @Override
    @PUT
    @Path("/{id}")
    public Response updateEmployee(@PathParam("id")int id, Employee e) {
        return null;
    }

    @Override
    @GET
    @Path("/list/{offset}/{size}")
    public Employee[] getAllEmployees(@PathParam("size") int size,  @PathParam("offset") int offset) {
        return new Employee[0];
    }
}
