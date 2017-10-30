package com.ws;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ShuangWang on 2017/10/25.
 */
@WebServlet(name = "my", urlPatterns = "/me")
public class MyServlet_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("this is me");
        ServletContext context = getServletContext();
        String wang = context.getInitParameter("wang");
        System.out.println(wang);



    }
}
