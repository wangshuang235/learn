package cn.itcast.b_crud;

import cn.itcast.a_hello.Employee;
import cn.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * @author cool
 * Date 2018-01-02 18:51
 */
public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public void save(Employee emp) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            session.save(emp);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public void update(Employee emp) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            session.update(emp);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
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
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Employee");
            return query.list();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public List<Employee> getAll(String employeeName) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Employee where empName=?");
            query.setParameter(0, employeeName);
            return query.list();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public List<Employee> getAll(int index, int count) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("from Employee");
            query.setFirstResult(index);
            query.setMaxResults(count);
            return query.list();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public void delete(Serializable id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtils.getSession();
            tx = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.delete(employee);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            tx.commit();
            session.close();
        }
    }
}
