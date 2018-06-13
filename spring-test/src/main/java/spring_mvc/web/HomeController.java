package spring_mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring_mvc.dao.UserDao;
import spring_mvc.entity.User;

/*
 * @Author: cool
 * @Date: 2018/6/6 23:02
 */
@Controller
public class HomeController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        User cool1 = userDao.findByName("张三");
        User user = new User(3333L, "cool");
        user = userDao.save(user);
        User cool = userDao.findByName("cool");
        return "home";
    }
}
