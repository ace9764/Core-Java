package com.aaron.basic.java.thread;

public class HappensBeforeDemo {

    static int counter;

     boolean isValid = true;

    public static void main(String args[]) throws InterruptedException{

        HappensBeforeDemo obj = new HappensBeforeDemo();

        new Thread(()-> {
            while(obj.isValid){
                    counter++;
            }
            System.out.println("Counter value: " + counter);

        } ).start();

        new Thread(()-> {

            try {
                Thread.sleep(500);
                obj.isValid = false;
            }
            catch(InterruptedException e){
                System.out.println("Thread Interuppted " +e);
                Thread.currentThread().interrupt();
            }
        } ).start();

    }

}

