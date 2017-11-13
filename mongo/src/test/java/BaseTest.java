import com.learn.test.entity.Person;
import com.learn.test.repositories.PersonRepositiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by ShuangWang on 2017/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring-contexts/*.xml")
public abstract class BaseTest {
    @Autowired
    private PersonRepositiry repositiry;

    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        person.setName("王爽");
        person = repositiry.insert(person);
        System.out.println(person.toString());
        // 王爽测试合并分支
    }
}

