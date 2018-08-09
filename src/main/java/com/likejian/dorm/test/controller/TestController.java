package com.likejian.dorm.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hellojsp(){
        return "test";
    }
}
