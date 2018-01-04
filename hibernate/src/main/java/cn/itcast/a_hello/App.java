package cn.itcast.a_hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class App {

    private static SessionFactory sf;

    static {
        sf = new Configuration().configure().buildSessionFactory();
    }
    @Test
    public void testHello() {
        Employee emp = new Employee();
        emp.setEmpName("班长3");
        emp.setWorkDate(new Date());

        //读取配置文件
        Configuration config = new Configuration();
        config.configure();//读取默认hibernate.cfg.xml
        //获取SessionFactory
        SessionFactory sf = config.buildSessionFactory();
        //开启session
        Session session = sf.openSession();
        //开启事物
        Transaction tx = session.beginTransaction();

        session.save(emp);//真正的业务逻辑

        tx.commit();
        session.close();
        sf.close();
    }

    @Test
    public void testSave() {

        Employee emp = new Employee();
        emp.setEmpName("班长2");
        emp.setWorkDate(new Date());

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();
    }
    @Test
    public void testUpdate() {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("张三");

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        //session.update(emp);//更新
        //session.save(emp);//保存
        //session.saveOrUpdate(emp);//保存或更新

        //主键查询
        Employee employee = session.get(Employee.class, 1);
        //session.load(Employee.class, 1);//另一种主键查询
        System.out.println(employee);

        tx.commit();
        session.close();
    }
}
