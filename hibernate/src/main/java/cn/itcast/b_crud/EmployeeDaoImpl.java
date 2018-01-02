package cn.itcast.b_crud;

import cn.itcast.a_hello.Employee;
import cn.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

/**
 * @author cool
 * Date 2018-01-02 18:51
 */
public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public void save(Employee emp) {

    }

    @Override
    public void update(Employee emp) {

    }

    @Override
    public Employee findById(Serializable id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            return session.get(Employee.class, id);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public List<Employee> getAll(String employeeName) {
        return null;
    }

    @Override
    public List<Employee> getAll(int index, int count) {
        return null;
    }
}
