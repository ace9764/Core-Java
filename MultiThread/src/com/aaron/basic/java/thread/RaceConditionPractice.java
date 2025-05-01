package com.aaron.basic.java.thread;

import java.util.Random;

public class RaceConditionPractice {
     Double balance;

    public RaceConditionPractice (Double balance){

        this.balance = balance;
    }

    public static void main(String args[]){

        RaceConditionPractice obj1 = new RaceConditionPractice(2000.0);

        Thread th1 = new Thread(()-> {

            obj1.withdrawMoneyFromBank();

        } );

        Thread th2 = new Thread(()-> {

            obj1.withdrawMoneyFromBank();

        } );

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception occured "+ e);
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Deposit completed from bank account! "+ obj1.balance);

    }

    public synchronized void withdrawMoneyFromBank(){

//        synchronized (this.balance) {
            while (balance > 0) {

                Double withDrawl = 200.0;
                System.out.println("Withdrawl amount " + withDrawl);
                balance -= withDrawl;

//            }

        }
    }

    public static double generateRandomDouble(){

        double min = 100.0;
        double max = 300.0;

        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

}
