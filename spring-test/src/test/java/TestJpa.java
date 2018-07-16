
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring_mvc.config.RootConfig;
import spring_mvc.dao.SpittleRepository;
import spring_mvc.dao.UserDao;
import spring_mvc.entity.Spittle;
import spring_mvc.entity.User;

import java.util.Date;
import java.util.Optional;

/*
 * @Author: cool
 * @Date: 2018/6/12 13:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TestJpa {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SpittleRepository spittleRepository;

    @Test
    public void testFindOneUser() {
        User user = userDao.findByName("张三");
        Long id = 1111L;
        Assert.assertEquals(id, user.getId());
    }
    @Test
    public void testSaveUser() {
        User user = new User();
        Long id = 1112L;
        user.setId(id);
        user.setName("cool");
        user = userDao.save(user);
    }
    @Test
    public void testFindOne() {
       Spittle spittle = new Spittle("hello111111111", new Date());
        spittle.setId(1111L);
        spittle = spittleRepository.save(spittle);
        /*Long id = 11L;
        Optional<Spittle> optional = spittleRepository.findById(id);
        Spittle spittle1 = optional.get();*/

    }
}
