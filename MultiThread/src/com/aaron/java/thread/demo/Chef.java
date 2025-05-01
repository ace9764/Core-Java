package com.aaron.java.thread.demo;

import java.util.Iterator;
import java.util.ListIterator;

public class Chef implements Runnable {

    public Chef(String name, String specialty) {

        this.name = name;
        this.specialty = specialty;

        int i = (int) (Math.random() *10) +1;
//        String chefIdString = name + i;
        this.chefId = name + i;

    }

    //we cannot use wait() or notify() on static context
    //You're calling a non-static method such as wait() or notifyAll() from a static method. You cannot do this. Change your get method to this
//    public static Kitchen kitchen = new Kitchen();

//    public void assignKitchen(){
//
//    }

    private String chefId ;

    private String name;

    private String specialty;


    public void cook(){

        synchronized (Kitchen.listOfOrders) {

            if (Kitchen.listOfOrders != null && !Kitchen.listOfOrders.isEmpty() && Order.currentNumberOfOrders > 0) {


                        ListIterator<Order> orderIterator = Kitchen.listOfOrders.listIterator();



                        while (orderIterator.hasNext()) {
//                for (Order order : Kitchen.listOfOrders) {

                            Order order = orderIterator.next();

                            if (order.getFood() != null
                                    && order.getFood().getCuisineType() != null
                                    && order.getFood().getCuisineType().equals(this.specialty)) {

                                orderIterator.remove();
//                        Order.currentNumberOfOrders--;
                                order.setStatus(StatusConstants.finished);
                                System.out.println(" Chef " + this.name + " with ChefId " + this.chefId + " specialized in " + this.specialty + " has fulfilled order id of" + order.getOrderId() + " | Order Status: " + order.getStatus() + " | from customer " + order.getCustomerName() + " |Food name:" + order.getFood().getName());

//                        notify();

                            } else if (order.getFood() != null
                                    && order.getFood().getCuisineType() != null
                                    && !order.getFood().getCuisineType().equals(this.specialty)) {

//                        System.out.println("Customer " + order.getCustomerName() + " has ordered " + order.getFood().getCuisineType() + " cuisine type. ChefID: " + this.chefId + " ChefName: " + this.name + " has different specialty: " + this.specialty);
//
                            }


                        }
//                }

                        if (Kitchen.listOfOrders.isEmpty() && Order.currentNumberOfOrders == Order.MAX_NO_OF_ORDERS) {
                            Kitchen.isKitchenOpen = false;
                        }





            } else {
                System.out.println("There is no order now!");

//                if (Kitchen.listOfOrders.isEmpty() && Order.currentNumberOfOrders == 0) {
//                    Kitchen.isKitchenOpen = false;
//                }
//                try {
//                    wait();
//                }
//                catch(InterruptedException e){
//                    System.out.println("Thread interrupted during waiting: "+ e);
//                }
                Thread.yield();
            }
        }


    }

    @Override
    public void run(){

        while(Kitchen.isKitchenOpen){

            try {
                Thread.sleep(3000);
                cook();
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted while sleeping "+ e);
                Thread.currentThread().interrupt();
            }

        }

    }



}
