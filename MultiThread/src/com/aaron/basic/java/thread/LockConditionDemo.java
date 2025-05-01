package com.aaron.basic.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionDemo {

    public static void main(String args[]){

//        Lock lock = new ReentrantLock();


    }

}

class ReentrantLockDemo{

    private long count ;

    private Lock lock = new ReentrantLock() ;

    public void inc(){

        try {
            lock.lock();
            this.count++;
        }
        catch(Exception e){

            System.out.println("Exception occured during increment operations: " + e);
            System.out.println("Exeption Message " + e.getMessage());

        }
        finally {
            lock.unlock();
        }

    }

    public long getCount(){

        try {
            lock.lock();
            return this.count;
        }
        catch(Exception e){
            System.out.println("Exception occured during increment operations: " + e);
            System.out.println("Exeption Message " + e.getMessage());
        }
        finally {
            lock.unlock();
        }

        return this.count;
    }

}

class SynchronizedCounter{

    private long count ;


    public synchronized void incrementCount(){

        this.count++;

    }

    public synchronized long getCount(){

        return this.count;
    }

}


