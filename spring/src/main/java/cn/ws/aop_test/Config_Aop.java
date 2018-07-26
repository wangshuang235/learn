package cn.ws.aop_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

/*
 * @Author: cool
 * @Date: 2018/7/26 14:43
 */
@Configuration
@EnableAspectJAutoProxy
public class Config_Aop {
    @Bean
    @Scope("singleton")
    public HttpUtil getHttpUtil() {
        return new HttpUtil();
    }

    @Bean
    public HttpUtilAspect getHttpUtilAspect() {
        return new HttpUtilAspect();
    }
}
