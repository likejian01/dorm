package com.likejian.dorm.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestResController {

    @RequestMapping("hellojson")
    public Object helloJson(){



        List<Map<String,Object>> dataList=new ArrayList<>();
        for (int i=0;i<20;i++){
            Map<String,Object> data=new HashMap<String,Object>();
            data.put("firstname","张三");
            data.put("lastname","李四");
            data.put("phone","13021932260");
            data.put("email","1028351922@qq.com");
            dataList.add(data);
        }
        Map<String,Object> datas=new HashMap<String,Object>();
        datas.put("rows",dataList);
        datas.put("total",20);
        return datas;
    }
}
