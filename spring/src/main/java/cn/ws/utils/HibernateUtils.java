package cn.ws.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by wangshuang on 17-7-20.
 */
public class HibernateUtils {
    private static SessionFactory sf;
    static {
        sf = new Configuration().configure("src/hibernate.cfg.xml").buildSessionFactory();
    }

    public static Session getSession() {
        return sf.openSession();
    }
}
