/*
package cn.ws.dao;


import cn.ws.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;
import cn.ws.entites.Person;
import java.io.Serializable;
import java.util.List;

*/
/**
 * Created by wangshuang on 17-7-20.
 *//*

public class PersonDao implements BaseDao<Person> {
    Session session = null;
    Transaction tx = null;
    @Test
    public void test() {
        */
/*Person person = new Person();
        person.setName("ws1");
        save(person);*//*

        */
/*List<Person> personList = getAll(1, 2);
        for (Person p : personList) {
            System.out.println(p.getpId());
        }*//*

        System.out.println(getAll());
    }
    public void save(Person person) {
        try {
            before();
            session.save(person);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }
    public void update(Person person) {
        try {
            before();

            session.update(person);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }
    public Person findById(Serializable id) {
        try {
            before();

            return session.find(Person.class, id);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }

    public List<Person> getAll() {
        try {
            before();
            Query q = session.createQuery("from Person");
            return q.list();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }

    public List<Person> getAll(String name) {
        try {
            before();
            Query q = session.createQuery("from Person where name = ?");
            q.setParameter(0, name);
            return q.list();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }

    public List<Person> getAll(int pageNum, int count) {
        try {
            before();
            Query q = session.createQuery("from Person");
            q.setFirstResult((pageNum-1)*count);
            q.setMaxResults(count);
            return q.list();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            after();
        }
    }
    private void before() {
        session = HibernateUtils.getSession();
        tx = session.beginTransaction();
    }
    private void after() {
        tx.commit();
        session.close();
    }
}
*/
