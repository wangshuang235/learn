package spring_mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @Author: cool
 * @Date: 2018/6/6 23:02
 */
@Controller
@RequestMapping("/demo")
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

}
