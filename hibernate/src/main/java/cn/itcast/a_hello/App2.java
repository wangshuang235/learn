package cn.itcast.a_hello;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class App2 {

    private static SessionFactory sf;

    static {
        sf = new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void testQuery() {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("张三");

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //HQL查询,查询全部
        Query q = session.createQuery("from Employee");
        List<Employee> list = q.list();

        System.out.println(list);

        tx.commit();
        session.close();
    }
    @Test
    public void testQBC() {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("张三");

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //HQL查询,查询全部
        Criteria criteria = session.createCriteria(Employee.class);
        //条件
        criteria.add(Restrictions.eq("empId", 1));

        List<Employee> list = criteria.list();
        System.out.println(list);

        tx.commit();
        session.close();
    }

    @Test
    public void testSQL() {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("张三");

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //SQL查询,查询全部
        NativeQuery sqlQuery = session.createSQLQuery("select * from employee").addEntity(Employee.class);


        List<Employee> list = sqlQuery.list();
        System.out.println(list);

        tx.commit();
        session.close();
    }
}
