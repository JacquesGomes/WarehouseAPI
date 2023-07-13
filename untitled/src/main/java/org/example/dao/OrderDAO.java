package org.example.dao;

import org.example.model.Order;

import java.util.List;
public interface OrderDAO{
    int saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(int orderId);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
}
