package cn.ws.h2;

import cn.ws.jpa.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @Author: cool
 * @Date: 2018/6/12 13:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = H2Config.class)
public class TestH2 {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetName() {
        String userName = userDao.searchUserName(1111);
        Assert.assertEquals("张三", userName);

    }

    @Test
    public void testFindOne() {
        User user = userDao.findOne(1111);
        Assert.assertEquals("张三", user.getName());
    }
}
