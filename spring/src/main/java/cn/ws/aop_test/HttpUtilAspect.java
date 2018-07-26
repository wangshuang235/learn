package cn.ws.aop_test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * @Author: cool
 * @Date: 2018/7/26 14:33
 */
@Aspect
public class HttpUtilAspect<T> {

    @Pointcut("execution(* cn.ws.aop_test.*.*(..))")
    public void dodo() {
        System.out.println("dodo");
    }
    @Before("dodo()")
    public void Before() {
        System.out.println("Before");
    }
    @After("dodo()")
    public void After() {
        System.out.println("After");
    }

}
