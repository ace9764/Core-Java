package com.aaron.basic.java.thread.pool;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {

    private Thread thread = null;
    private BlockingQueue<Runnable> taskQueue = null;

    private Boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue<Runnable> queue){
        taskQueue = queue;
    }

    @Override
    public void run(){

        //Comparator.comparing()

        //this.thread = Thread.currentThread();

        while(!isStopped()){

            try {
                Runnable runnable = taskQueue.take();
                runnable.run();
            }
            catch(Exception e){
                System.out.println("Thread "+ Thread.currentThread().getName() +" attempted to deque. Size of taskQueue is -> " + taskQueue.size() + " You cannot deque from a empty queue! "+ e);
            }
        }

    }


    public synchronized void doStop(){
        isStopped = true;
        System.out.println("Is Stopped? "+ isStopped);
        this.thread.interrupt(); // this is a must to wake them up out of waiting pool or blocking state. Otherwise, it does not get out of while loop trying to wait for its turn
    }

    public synchronized boolean isStopped(){

        return this.isStopped;

    }

}
