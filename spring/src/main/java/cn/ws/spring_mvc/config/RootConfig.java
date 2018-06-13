package cn.ws.spring_mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * @Author: cool
 * @Date: 2018/6/6 22:43
 */
@Configuration
@ComponentScan(basePackages = {"cn.ws.spring_mvc"}, excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {

}
