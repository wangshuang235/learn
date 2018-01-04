package fun.wangshuang;

import org.apache.ibatis.annotations.Select;

/**
 * @author cool
 * Date 2018-01-04 17:45
 */
public interface EmployeeMapper {
    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee selectEmployee(int id);
}
