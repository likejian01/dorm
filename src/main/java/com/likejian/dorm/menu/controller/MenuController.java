package com.likejian.dorm.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 时间：2018/8/11
 * 作者：李科建
 */
@Controller
public class MenuController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/menu/{menu_jsp}")
    public String gotoRealJsp(@PathVariable("menu_jsp") String menu_jsp) {
        return "menu/"+menu_jsp;
    }

}
