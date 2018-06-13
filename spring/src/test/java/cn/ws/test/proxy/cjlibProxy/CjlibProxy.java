package cn.ws.test.proxy.cjlibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
 * @Author: cool
 * @Date: 2018/6/11 14:24
 */
public class CjlibProxy<T> implements MethodInterceptor{

    private T target;

    public CjlibProxy(T target) {
        this.target = target;
    }

    public T getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return (T)en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事物");
        Object invoke = method.invoke(target, objects);
        System.out.println("提交事务");
        return (T)invoke;
    }
}
