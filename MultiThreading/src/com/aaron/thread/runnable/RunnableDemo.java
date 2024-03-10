package com.aaron.thread.runnable;

import com.aaron.core.java.MultiThreadingDemo;

import java.sql.SQLOutput;

class MyRunnable implements Runnable{

    @Override
    public void run(){

        System.out.println("Thread priorty is: " + Thread.currentThread().getPriority());

        for(int i =0; i < 10; i++){
            System.out.println("Current Thread Iteration: " +i+ " Running Thread is: "+Thread.currentThread().getName()  );
        }

    }
}
public class RunnableDemo {

    public static void main (String args[]){

        // Custom thread implementing Runnable
        MyRunnable mr = new MyRunnable();

        //base thread
        Thread thread1 = new Thread(mr,"Vinod");

        //thread1.start();

        //mr.run();

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Thread priorty is: " + Thread.currentThread().getPriority());
        for(int i = 0; i<10; i++){
            System.out.println("Current Thread Iteration: " +i+ " Running Thread is: "+Thread.currentThread().getName()  );
        }
    }

}
