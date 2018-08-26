package com.likejian.dorm.menu.controller;

import com.likejian.dorm.menu.mapper.DormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 时间：2018/8/11
 * 作者：李科建
 */
@RestController
public class MenuResController {

    @Autowired
    private DormMapper dormMapper;

    @RequestMapping("/menudatas/{uniqueId}")
    public Object getDatas(@PathVariable("uniqueId") Integer uniqueId){
        return dormMapper.selectById(1);
    };

    @RequestMapping("/dict/{dictid}")
    public Object getDicts(@PathVariable("dictid") Integer dictid){
        return dormMapper.selectById(1);
    };


}
