package com.springdemo.controller;

import com.springdemo.dto.BaseResultDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Author: cool
 * @Date: 2018/9/11 16:52
 */
@Controller
@RequestMapping("/test")
public class GetPostFromController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public BaseResultDto get(HttpServletRequest request, @RequestParam String name) {
        String name1 = request.getParameter("name");
        System.out.println(name);
        System.out.println(name1);
        BaseResultDto result = new BaseResultDto();
        result.success();
        return result;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public BaseResultDto post(HttpServletRequest request, @ModelAttribute BaseResultDto baseResultDto) {

        System.out.println(baseResultDto.getResult_message());
        return baseResultDto;
    }

}

