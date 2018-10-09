package com.springdemo.controller;

/*
 * @Author: cool
 * @Date: 2018/8/10 12:46
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

@Controller
public class OpenidController {

    @RequestMapping("/getopenid")
    public String index(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long timestamp = System.currentTimeMillis();//时间戳
        String url = "http://test.ihxlife.com/weChat/query/openid?timestamp=" + timestamp + "&nonce=42763177826256045130&trade_source=WXTB&data={\"redirectUrl\":\"https://glory-bg-dev.ihxlife.com/glory/querynewprogress\",\"attach\":\"\"}&signature=3EC997A3EAC85C9383E9D94481939FDA";
        getRequestHang(req);
        getHeader(req);
        getInput(req);
        resp.sendRedirect(url);
        return "hello";
    }
    private void getInput(HttpServletRequest request) throws IOException {
        /**
         * 3.3 请求的实体内容
         */
        InputStream in = request.getInputStream(); //得到实体内容
        byte[] buf = new byte[1024];
        int len = 0;
        while(  (len=in.read(buf))!=-1 ){
            String str = new String(buf,0,len);
            System.out.println(str);
        }
    }

    private void getHeader(HttpServletRequest request) {
        /**
         * 3.2 请求头
         */
        String host = request.getHeader("Host"); //根据头名称的到头的内容
        System.out.println(host);

        //遍历所有请求头
        Enumeration<String> enums = request.getHeaderNames(); //得到所有的请求头名称列表
        while(enums.hasMoreElements()){//判断是否有下一个元素
            String headerName = enums.nextElement(); //取出下一个元素
            String headerValue = request.getHeader(headerName);
            System.out.println(headerName+":"+headerValue);
        }
    }

    private void getRequestHang(HttpServletRequest request) {
        /**
         * 3.1 请求行   格式：（GET /day09/hello HTTP/1.1）
         */
        System.out.println("请求方式："+request.getMethod());//请求方式
        System.out.println("URI:"+request.getRequestURI());//请求资源
        System.out.println("URL:"+request.getRequestURL());
        System.out.println("http协议版本："+request.getProtocol());//http协议
    }
}