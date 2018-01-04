package cn.itcast.a_hello;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class TestJPA {

    @Test
    public void testHello() {
        Employee emp = new Employee();
        emp.setEmpName("班长667");
        emp.setWorkDate(new Date());
        Employee emp1 = new Employee();
        emp1.setEmpName("班长668");
        emp1.setWorkDate(new Date());

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(emp);
        entityManager.persist(emp1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}