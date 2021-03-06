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



    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
