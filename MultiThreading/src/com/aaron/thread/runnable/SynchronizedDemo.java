package com.aaron.thread.runnable;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{

    //AtomicInteger count = new AtomicInteger();
    int count ;
    Object lock;

    public void increment(){
    //  this.count.getAndIncrement() ;
        count++;
        //count = count + 1;
        //count = 1002+1;
        //count = 1002+1;
    }

    public void decrement(){
    //  this.count.getAndDecrement() ;
        count--;
    }

}

public class SynchronizedDemo {

    public static void main(String args[]) throws InterruptedException{

        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                for(int i =0; i <10000; i++) {
                    counter.increment();
                }

            }
        },"Aaron");

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {

                for(int i =0; i <10000; i++) {
                    counter.decrement();
                }

            }
        },"Indra");

        t1.start();
        t2.start();


        t1.join();
        t2.join();


        System.out.println("Count: " + counter.count);
    }
}
