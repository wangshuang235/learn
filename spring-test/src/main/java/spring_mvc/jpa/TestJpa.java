package spring_mvc.jpa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring_mvc.config.JpaConfig;
import spring_mvc.config.RootConfig;
import spring_mvc.dao.UserDao;
import spring_mvc.entity.User;

/*
 * @Author: cool
 * @Date: 2018/6/12 13:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TestJpa {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindOne() {
        User user = userDao.findByName("张三");
        Long id = 1111L;
        Assert.assertEquals(id, user.getId());
    }
}
