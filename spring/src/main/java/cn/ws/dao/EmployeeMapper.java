package cn.ws.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author cool
 * Date 2018-01-04 17:45
 */
public interface EmployeeMapper {
    Employee selectEmployee(int id);
}
