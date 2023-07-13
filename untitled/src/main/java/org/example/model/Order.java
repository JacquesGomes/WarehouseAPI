package org.example.model;

public class Order {
    private int orderId;

    public Order(int orderId){
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

