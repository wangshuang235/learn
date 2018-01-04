package cn.itcast.b_crud;

import org.junit.Test;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class TestDao {

    private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    @Test
    public void testHello() {
        System.out.println(employeeDao.getAll());
    }


}
