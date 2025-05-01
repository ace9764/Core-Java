package com.aaron.basic.java.thread;

public class VolatilePractice {

     int counter = 0;


    public static void main(String args[]) throws InterruptedException{

        VolatilePractice obj = new VolatilePractice();

        Thread th1 = new Thread( ()->{

            //for(int i =0; i < 10000; i++)
            obj.incCounter();

        });

        Thread th2 = new Thread( ()->{

            //for(int i =0; i < 10000; i++)
            obj.incCounter();

        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(" \n Counter at the end: "+ obj.counter);

    }

    public synchronized void incCounter(){

        // (this.counter) {
            for (int i = 0; i < 10000; i++)
                counter++;
        //}

    }

}
