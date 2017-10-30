package com.ws;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ShuangWang on 2017/10/24.
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("time")) {
                    resp.getWriter().write("上次访问时间："+c.getValue());
                }
            }
        }

        resp.getWriter().write("\n");
        resp.getWriter().write("this is first servlet");

        /*ServletConfig config = getServletConfig();
        System.out.println("service");
        System.out.println(config.getServletName());
        System.out.println(config.getInitParameterNames());
        System.out.println(config.getInitParameter("ws"));
        System.out.println(config.getServletContext().toString());*/

        /*ServletContext context = getServletContext();
        context.setAttribute("name", "wangshuang");
        System.out.println("保存成功！");*/


        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Cookie cookie = new Cookie("time", format.format(date));
        cookie.setMaxAge(1000);

        resp.addCookie(cookie);

    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }
}
