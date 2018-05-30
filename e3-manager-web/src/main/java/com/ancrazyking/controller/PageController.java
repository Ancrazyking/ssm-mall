package com.ancrazyking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ancrazyking
 * @date 2018/5/30 17:04
 **/
@Controller
public class PageController
{
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }


}
