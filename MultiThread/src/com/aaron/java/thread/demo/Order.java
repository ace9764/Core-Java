package com.aaron.java.thread.demo;

import java.util.UUID;

public class Order {

    public Order(Food food, String customerName) {

//        UUID uuid = UUID.randomUUID();

        this.orderId = UUID.randomUUID();
        this.food = food;
        this.status= StatusConstants.inProgress;
        this.customerName = customerName;

        currentNumberOfOrders++;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    private UUID orderId;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    private Food food;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String customerName;

    private String status;

    public static final int MAX_NO_OF_ORDERS = 50;

    public static int currentNumberOfOrders ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", food=" + food +
                ", customerName='" + customerName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
