package com.ancrazyking.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ancrazyking
 * @date 2018/5/30 16:18
 * e3-mall 商城 入口
 **/
@Controller
public class IndexController
{
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }

}
