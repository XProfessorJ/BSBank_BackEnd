package com.bs.bsbank.controller;

import com.bs.bsbank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin  //解决跨域问题
@RestController  //直接变成RestfulApi 返回Json数据         @RestController是@ResponseBody和@Controller的组合注解。
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping(value = "/test")
    public String testController(){
        return testService.testService();
    }
}
