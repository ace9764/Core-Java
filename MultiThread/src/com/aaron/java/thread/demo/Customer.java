package com.aaron.java.thread.demo;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer implements Runnable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public Customer(String name) {
        this.name = name;
//        this.order = order;
    }


    String name;

    List<Order> listOfOrderFromCustomer = new ArrayList<>();

//    Order order;


    public void order(){

            synchronized (Kitchen.listOfOrders) {
                if (Order.currentNumberOfOrders < Order.MAX_NO_OF_ORDERS) {

                    Random rand = new Random();
                    Cuisine chosenMenu = Menu.menuList.get(rand.nextInt(5));
                    Kitchen.listOfOrders.add(new Order(new Food(chosenMenu.getName(), chosenMenu.getCuisine()), this.name ));
                    listOfOrderFromCustomer.add(Kitchen.listOfOrders.get(Kitchen.listOfOrders.size() - 1));
                    System.out.println("New Order is placed! Customer name " + this.name + " Order Details: " + Kitchen.listOfOrders.get(Kitchen.listOfOrders.size() - 1));

//                  System.out.println("New Order is placed! Thread name " + Thread.currentThread().getName() + " Order Details: " + Kitchen.listOfOrders.get(Kitchen.listOfOrders.size() - 1));

//                    notify();
                } else {
                    System.out.println("We have already received "+ Order.currentNumberOfOrders + " orders. We cannot take any more orders! Sorry. " + Order.currentNumberOfOrders);
                    Thread.yield();
                    //                Thread.currentThread().interrupt();
                }
            }

    }

    @Override
    public void run(){

        while(Kitchen.isKitchenOpen && Order.currentNumberOfOrders < Order.MAX_NO_OF_ORDERS ){

            try {
                Thread.sleep(1000);
                order();
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted while sleeping "+ e);
                Thread.currentThread().interrupt();
            }

        }


    }




}
