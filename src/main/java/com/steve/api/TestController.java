package com.steve.api;

import com.steve.dao.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/10 下午4:49
 */
@RestController
public class TestController {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @RequestMapping("/test")
    public List test(){
       return orderItemMapper.selectAll();
    }


}
