package com.aaron.core.java.lambda.streams;

import java.util.Comparator;

public class Order implements Comparator<Order> {

    @Override
    public int compare(Order a, Order b){

        return a.price- b.price;
    }

    public Order(String name, int price){

        this.name = name;
        this.price = price;
    }

    String name ;

    String customerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
