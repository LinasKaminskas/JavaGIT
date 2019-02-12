package lt.bta.java2.servlets.api.i;

import lt.bta.java2.servlets.entites.Employee;

import javax.ws.rs.core.Response;

public interface EmployeeService {
    Response addEmployee(Employee e);

    Response deleteEmployee(int id);

    Response getEmployee(long id);

    Response updateEmployee(int id, Employee e);

    Response getAllEmployees(int size, int offset);

    Response getEmployeeTitles(int id);

}


