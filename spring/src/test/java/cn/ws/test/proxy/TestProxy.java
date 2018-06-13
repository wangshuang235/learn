package cn.ws.test.proxy;

import cn.ws.test.proxy.cjlibProxy.CjlibProxy;
import cn.ws.test.proxy.jdk_proxy.JdkProxy;
import cn.ws.test.proxy.status_.PersonProxy;
import org.junit.Test;

/*
 * @Author: cool
 * @Date: 2018/6/11 14:05
 */
public class TestProxy {
    @Test
    public void testStatusProxy() {
        PersonDao personDao = new PersonDaoImpl();
        PersonProxy personProxy = new PersonProxy(personDao);
        personProxy.save();
    }

    @Test
    public void testJdkProxy() {
        PersonDao personDao = new PersonDaoImpl();
        PersonDao dao = new JdkProxy<PersonDao>(personDao).getProxyInstance();
        dao.save();
    }

    @Test
    public void testCjlibProxy() {
        PersonDao personDao = new PersonDaoImpl();
        PersonDao dao = new CjlibProxy<PersonDao>(personDao).getProxyInstance();
        dao.save();
    }
}
