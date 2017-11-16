import com.learn.test.entity.Person;
import com.learn.test.repositories.PersonRepositiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ShuangWang on 2017/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring-contexts/*.xml")
public abstract class BaseTest {
    @Autowired
    private PersonRepositiry repositiry;

    @Test
    public void test1() {
        Person person = new Person();
        person.setName("王爽");
        person = repositiry.insert(person);
        System.out.println(person.toString());

        //再次merge到ws分支

        //two

        //再次打tag v0.2
    }
}

