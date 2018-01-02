package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author cool
 * Date 2018-01-02 18:52
 */
public class HibernateUtils {
    private static SessionFactory sf;
    static {
        sf = new Configuration().configure().buildSessionFactory();
    }

    public static Session getSession() {
        return sf.openSession();
    }
}
