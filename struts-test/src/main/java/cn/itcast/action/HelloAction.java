package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 开发action
 * @author cool
 * Date 2017-12-19 15:48
 */
public class HelloAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("访问到了action,正在处理请求");
        System.out.println("调用service");
        return "success";
    }
}
