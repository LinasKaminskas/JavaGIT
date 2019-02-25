package lt.bta.java.spring.entites;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {
    private int empNo;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private Object gender;
    private LocalDate hireDate;
    private Collection<DeptEmp> deptEmployee;
    private Collection<DeptManager> deptManagers;
    private Collection<Salaries> salaries;
    private Collection<Title> titles;

    @Id
    @Column(name = "emp_no")
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "birth_date")
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "gender", columnDefinition = "Enum ('M, 'F')")
    @Enumerated(EnumType.STRING)
    public Object getGender() {
        return gender;
    }
    @Basic
    @Column(name = "gender", columnDefinition = "Enum ('M, 'F')")
    @Enumerated(EnumType.STRING)
    public void setGender(Object gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "hire_date")
    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNo == employee.empNo &&
                Objects.equals(birthDate, employee.birthDate) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, birthDate, firstName, lastName, gender, hireDate);
    }

    @OneToMany(mappedBy = "employee")
    public Collection<DeptEmp> getDeptEmployee() {
        return deptEmployee;
    }

    public void setDeptEmployee(Collection<DeptEmp> deptEmployee) {
        this.deptEmployee = deptEmployee;
    }

    @OneToMany(mappedBy = "employee")
    public Collection<DeptManager> getDeptManagers() {
        return deptManagers;
    }

    public void setDeptManagers(Collection<DeptManager> deptManagers) {
        this.deptManagers = deptManagers;
    }

    @OneToMany(mappedBy = "employee")
    public Collection<Salaries> getSalaries() {
        return salaries;
    }

    public void setSalaries(Collection<Salaries> salaries) {
        this.salaries = salaries;
    }

    @OneToMany(mappedBy = "employee")
    public Collection<Title> getTitles() {
        return titles;
    }

    public void setTitles(Collection<Title> titles) {
        this.titles = titles;
    }
}
