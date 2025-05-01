package com.aaron.basic.java.thread;

public class DeadLockPractice {

    public static void main(String args[]){

        showcaseDeadLock();

    }


    public static void showcaseDeadLock(){

        DeadLockPractice deadLockPractice = new DeadLockPractice();

         new Thread(()->{

             deadLockPractice.method1();

        }, "Thread1").start();


        new Thread(()->{

            deadLockPractice.method2();

        }, "Thread2").start();

    }


    Object a =new Object();
    Object b =new Object();

    public void method1() {

        synchronized (this.a){
            System.out.println("Thread 1 locked object A!") ;

            try {
                Thread.sleep(100);
            }
            catch(InterruptedException a){

            }
            System.out.println("Thread 1 wants to lock object B!") ;
            synchronized (this.b){

                System.out.println("Thread 1 locked object B!") ;
            }

        }

    }


    public void method2() {

        synchronized (this.b){

            System.out.println("Thread 2 locked object B!") ;

            try {
                Thread.sleep(100);
            }
            catch(InterruptedException a){

            }
            System.out.println("Thread 2 wants to lock object A!") ;
            synchronized (this.a){
                System.out.println("Thread 2 locked object A!") ;
            }



        }

    }








}

