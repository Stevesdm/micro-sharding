package com.steve.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "order_item")
public class OrderItem {
    @Id
    @Column(name = "order_item_id")
    private Long orderItemId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Integer userId;

    private String status;

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}