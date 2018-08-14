package com.springdemo.controller;

/*
 * @Author: cool
 * @Date: 2018/8/10 12:46
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class OpenidController {

    @RequestMapping("/getopenid")
    public String index(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long timestamp = System.currentTimeMillis();//时间戳
        String url = "http://test.ihxlife.com/weChat/query/openid?timestamp=" + timestamp + "&nonce=42763177826256045130&trade_source=WXTB&data={\"redirectUrl\":\"https://glory-bg-dev.ihxlife.com/glory/querynewprogress\",\"attach\":\"\"}&signature=3EC997A3EAC85C9383E9D94481939FDA";
        resp.sendRedirect(url);
        return "hello";
    }
}