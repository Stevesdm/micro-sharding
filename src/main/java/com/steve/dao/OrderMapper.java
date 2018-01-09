package com.steve.dao;

import com.steve.base.BaseMapper;
import com.steve.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

    void createIfNotExistsTable();

    void truncateTable();

    Long insert(Order model);

    void dropTable();
}