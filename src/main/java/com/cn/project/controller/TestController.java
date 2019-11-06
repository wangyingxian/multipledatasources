package com.cn.project.controller;

import com.alibaba.fastjson.JSON;
import com.cn.project.service.CityDb1Service;
import com.cn.project.service.CityDb2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author moment
 * @date 2019/11/5 15:45
 * @describe
 */
@Controller
public class TestController {

    @Autowired
    CityDb1Service cityDb1Service;
    @Autowired
    CityDb2Service cityDb2Service;

    @RequestMapping("db1")
    @ResponseBody
    public String testDb1(){
        return JSON.toJSONString(cityDb1Service.getUser(1));
    }


    @RequestMapping("db2")
    @ResponseBody
    public String testDb2(){
        return JSON.toJSONString(cityDb2Service.getUser2());
    }
}
