package fun.wangshuang;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author cool
 * Date 2017-12-27 10:53
 */
@Alias("emp")
public class Employee {
    private int empId;
    private String empName;
    private Date workDate;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", workDate=" + workDate +
                '}';
    }
}
