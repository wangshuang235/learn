package spring_mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);



/*    @Autowired
    private UserDao userDao;*/

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {


        return "home";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(Model model) {

        /*User cool1 = userDao.findByName("张三");
        User user = new User(3333L, "cool");
        user = userDao.save(user);*/
/*        User user = userDao.findByName("张三");*/
/*        model.addAttribute(user);*/
        return "home";
    }
}
