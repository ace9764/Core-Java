package com.aaron.basic.java.thread.cas;

import java.util.concurrent.atomic.AtomicLong;

public class OptimisticLockCounter {

    private AtomicLong count = new AtomicLong();

    public void inc(){

        boolean successful = false;

        while (!successful){

            long currentValue = this.count.get();
            long newValue = currentValue +1;

            successful = count.compareAndSet(currentValue, newValue);

        }


    }

}
