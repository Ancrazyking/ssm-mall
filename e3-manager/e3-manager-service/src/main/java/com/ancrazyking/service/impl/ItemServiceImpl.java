package com.ancrazyking.service.impl;

import com.ancrazyking.mapper.TbItemMapper;
import com.ancrazyking.pojo.TbItem;
import com.ancrazyking.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ancrazyking
 * @date 2018/5/30 20:41
 **/
@Service(value = "itemServiceImpl")
public class ItemServiceImpl implements ItemService
{
    @Autowired
    private TbItemMapper tbItemMapper;

    /**
     * 通过商品id获得商品的信息
     * @param itemId
     * @return
     */
    @Override
    public TbItem getItemById(long itemId)
    {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}
