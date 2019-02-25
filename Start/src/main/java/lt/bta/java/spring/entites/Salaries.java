package lt.bta.java.spring.entites;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(SalariesPK.class)
public class Salaries {
    private int empNo;
    private int salary;
    private Date fromDate;
    private Date toDate;
    private Employee employee;

    @Id
    @Column(name = "emp_no", updatable = false, insertable = false)
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salaries salaries = (Salaries) o;
        return empNo == salaries.empNo &&
                salary == salaries.salary &&
                Objects.equals(fromDate, salaries.fromDate) &&
                Objects.equals(toDate, salaries.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, salary, fromDate, toDate);
    }

    @ManyToOne
    @JoinColumn(name = "emp_no", referencedColumnName = "emp_no", nullable = false)
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
