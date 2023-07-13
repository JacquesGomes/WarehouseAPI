package org.example.service;

import org.example.model.Order;
import org.example.dao.OrderDAO;

import java.util.List;

public class OrderService {
    private final OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public int createOrder(Order order){
        return 1;
    }

    public List<Order> getAllOrders(){
        List<Order> orders = orderDAO.getAllOrders();
        return orders;
    }


}
