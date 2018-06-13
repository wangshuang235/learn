package cn.ws.test;

import static org.junit.Assert.*;

import cn.ws.entites.Disc;
import cn.ws.entites.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class TestSpring {
    @Autowired
    private Disc cd;

    @Resource(name = "person2")
    private Person person1;

    @Test
    public void cdNotNull() {
        assertNotNull(cd);
    }
    @Test
    public void TestDi() {
        System.out.println(person1);
    }
}
