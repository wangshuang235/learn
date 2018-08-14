package cn.ws.test.spring;

import cn.ws.entites.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by ShuangWang on 2017/7/11.
 */
public class DoTest {
    @Test
    public void testIOC() throws Exception {
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Person person = ac.getBean("person1",  Person.class);
        System.out.println(person);
    }
}
