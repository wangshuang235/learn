package cn.ws.test.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * @Author: cool
 * @Date: 2018/6/11 14:08
 */
public class JdkProxy<T> {
    private T target;

    public JdkProxy(T target) {
        this.target = target;
    }

    public T getProxyInstance() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开启事物");
                Object invoke = method.invoke(target, args);
                System.out.println("提交事务");
                return invoke;
            }
        });
    }
}
