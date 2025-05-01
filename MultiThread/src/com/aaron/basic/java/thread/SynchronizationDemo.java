package com.aaron.basic.java.thread;

import java.util.Random;

public class SynchronizationDemo {

}

class Executor {

    public static void main(String args[]){

        Runnable r = new Runner();

        new Thread(r).start();

        new Thread(r).start();
    }
}

class ItemInventory{


    public ItemInventory(String name, int currentQuantity){

        this.name =name;
        this.currentQuantity=currentQuantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    private String name ;

    private int currentQuantity;

    public synchronized void  calculateInventory(int usedQuantity){

        if(this.currentQuantity >= usedQuantity){

            try {
               Thread.sleep(1000);
                this.currentQuantity -= usedQuantity;
                System.out.println("\n Order Fulfilled. Current Inventory picture: "+ this.currentQuantity);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }



        }else{
//            System.out.println("\n Inventory cannot be 0. Please order proper quantity. Currently in stock: "+this.currentQuantity );
        }
    }



}

class Runner implements Runnable{

    ItemInventory nikeShoe = new ItemInventory("Nike", 50);


    @Override
    public void run(){

        System.out.println("Address ID:" + nikeShoe);

        while(nikeShoe.getCurrentQuantity() > 0){

            Random randomNum = new Random();
            int orderQuantity = randomNum. nextInt(10);

            System.out.println("\n Ordered Quantity: " + orderQuantity);

            nikeShoe.calculateInventory(orderQuantity);

        }


    }

}

