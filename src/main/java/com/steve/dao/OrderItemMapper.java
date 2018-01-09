package com.steve.dao;

import com.steve.base.BaseMapper;
import com.steve.entity.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    void createIfNotExistsTable();

    void truncateTable();

    Long insert(OrderItem model);

    List<OrderItem> selectAll();

    void dropTable();
}