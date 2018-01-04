package cn.itcast.a_hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;

import java.util.Date;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class TestNew {
    SessionFactory sessionFactory;

    @Test
    public void testHello() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Session session = null;
        try {

            Employee emp = new Employee();
            emp.setEmpName("班长666");
            emp.setWorkDate(new Date());

            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(emp);
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }finally {
            session.getTransaction().commit();
            session.close();
        }
    }


}