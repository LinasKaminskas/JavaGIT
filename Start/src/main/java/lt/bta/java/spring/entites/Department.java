package lt.bta.java.spring.entites;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "departments", schema = "employees", catalog = "")
public class Department {
    private String deptNo;
    private String deptName;
    private Collection<DeptEmp> deptEmployee;
    private Collection<DeptManager> deptManager;

    @Id
    @Column(name = "dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptNo, that.deptNo) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, deptName);
    }

    @OneToMany(mappedBy = "department")
    public Collection<DeptEmp> getDeptEmployee() {
        return deptEmployee;
    }

    public void setDeptEmployee(Collection<DeptEmp> deptEmployee) {
        this.deptEmployee = deptEmployee;
    }

    @OneToMany(mappedBy = "department")
    public Collection<DeptManager> getDeptManager() {
        return deptManager;
    }

    public void setDeptManager(Collection<DeptManager> deptManager) {
        this.deptManager = deptManager;
    }
}
