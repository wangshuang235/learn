package com.ws;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ShuangWang on 2017/10/24.
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        resp.getWriter().write("this is first servlet");
        System.out.println("service");
        System.out.println(config.getServletName());
        System.out.println(config.getInitParameterNames());
        System.out.println(config.getInitParameter("ws"));
        System.out.println(config.getServletContext().toString());

        ServletContext context = getServletContext();
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
