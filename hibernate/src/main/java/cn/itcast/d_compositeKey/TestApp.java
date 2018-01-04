package cn.itcast.d_compositeKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author cool
 * Date 2017-12-27 10:56
 */
public class TestApp {

    private static SessionFactory sf;
    static {
        sf = new Configuration()
                .configure()
                .buildSessionFactory();
    }

    @Test
    public void testHello() {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        CompositeKey keys = new CompositeKey();
        keys.setAddress("北京");
        keys.setUserName("ws");
        User user = new User();
        user.setKeys(keys);
        user.setMsg("hello");

        session.save(user);

        tx.commit();
        session.close();
    }


}