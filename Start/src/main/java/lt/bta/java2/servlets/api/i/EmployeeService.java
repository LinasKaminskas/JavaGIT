package lt.bta.java2.servlets.api.i;

import lt.bta.java2.servlets.entites.Employee;

import javax.ws.rs.core.Response;

public interface EmployeeService {
    Response addEmployee(Employee e);

    Response deleteEmployee(int id);

    Response getEmployee(int id);

    Response updateEmployee(int id, Employee e);

    Employee[] getAllEmployees(int size, int offset);

}


