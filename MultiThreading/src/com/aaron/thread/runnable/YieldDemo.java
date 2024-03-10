package com.aaron.thread.runnable;


class MyRunnableTwo implements Runnable{

    @Override
    public void run(){

        System.out.println("Priorty for this thread: " +Thread.currentThread().getPriority());
        for(int i=0; i < 10; i++){
            System.out.println("Iteration "+ i +"/ Thread Name: " +Thread.currentThread().getName() );
            Thread.yield();
        }
    }
}

class MyRunnableThree implements Runnable{

    @Override
    public void run(){

        System.out.println("Priorty for this thread: " +Thread.currentThread().getPriority());
        for(int i=0; i < 10; i++){
            System.out.println("Iteration "+ i +"/ Thread Name: " +Thread.currentThread().getName() );
            Thread.yield();
        }
    }
}
public class YieldDemo {

    public static void main(String args[]){

        MyRunnableTwo mrTwo = new MyRunnableTwo();

        MyRunnableThree mrThree = new MyRunnableThree();

        Thread thread1 = new Thread(mrTwo,"Mohit");

        Thread thread2 = new Thread(mrThree, "Muthu");

        thread1.start();

        thread2.start();

//        System.out.println("Priorty for this thread: " +Thread.currentThread().getPriority());
//        for(int i=0; i < 10; i++){
//            System.out.println("Iteration "+ i +"/ Thread Name: " +Thread.currentThread().getName() );
//        }


    }
}
