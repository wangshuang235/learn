package com.ws;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {
    public HelloFilter() {
        System.out.println("HelloFilter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter前");
        chain.doFilter(request, response);
        System.out.println("doFilter后");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
