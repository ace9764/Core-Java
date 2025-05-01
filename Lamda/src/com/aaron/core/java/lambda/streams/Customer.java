package com.aaron.core.java.lambda.streams;

public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public Order getOrder() {
        return order;
    }
//
    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    Order order;

    String name;

    @Override
    public String toString() {
        return "Customer{" +
                "order=" + order +
                ", name='" + name + '\'' +
                '}';
    }
}
