package com.springdemo.controller;

import com.springdemo.dto.BaseResultDto;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: cool
 * @Date: 2018/9/11 16:52
 */
@RestController
public class GetPostController {

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
    public BaseResultDto post(HttpServletRequest request, BaseResultDto res, @RequestBody BaseResultDto baseResultDto) {
        String name = request.getParameter("name");
        System.out.println(name);
        System.out.println(baseResultDto.getResult_message());
        BaseResultDto result = new BaseResultDto();
        result.success();
        return result;
    }

}

