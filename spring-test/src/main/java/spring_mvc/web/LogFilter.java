package spring_mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/*
 * @Author: cool
 * @Date: 2018/7/26 16:18
 */
public class LogFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(Filter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Thread.currentThread().setName("hahahahahahahahahahhahass");
        long start = System.currentTimeMillis();
        logger.info("开始处理");
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("处理完成"+ (System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {

    }
}
