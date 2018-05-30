package com.ancrazyking.controller;

import com.ancrazyking.pojo.TbItem;
import com.ancrazyking.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ancrazyking
 * @date 2018/5/30 17:19
 * 商品管理
 **/
@Controller
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem  getItemById(@PathVariable long itemId){
        return itemService.getItemById(itemId);
    }

}
