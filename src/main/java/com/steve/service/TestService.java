package com.steve.service;

import com.steve.dao.OrderItemMapper;
import com.steve.dao.OrderMapper;
import com.steve.entity.Order;
import com.steve.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/9 下午9:58
 */
@Service
public class TestService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderMapper orderMapper;


    public void demo() {
        orderMapper.createIfNotExistsTable();
        orderItemMapper.createIfNotExistsTable();
        orderMapper.truncateTable();
        orderItemMapper.truncateTable();

        Random random = new Random();
//        List<Long> orderIds = new ArrayList<>(10);
//        System.out.println("1.Insert--------------");
        for (int i = 0; i < 10; i++) {

            int userId = random.nextInt(10);
            Order order = new Order();
            order.setUserId(userId);
            order.setStatus("INSERT_TEST");
            orderMapper.insert(order);
            long orderId = order.getOrderId();
//            orderIds.add(orderId);

            OrderItem item = new OrderItem();
            item.setOrderId(orderId);
            item.setUserId(userId);
            item.setStatus("INSERT_TEST");
            orderItemMapper.insert(item);
        }
        System.out.println(orderItemMapper.selectAll());
        System.out.println("------");
    }
}
